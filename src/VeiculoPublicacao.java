import java.util.ArrayList;

public class VeiculoPublicacao { 

	private int idVeiculoPublicacao;
	//private double fatorDeImpacto;
	private ArrayList<Artigo> artigos;
	
	public VeiculoPublicacao(int id) {
		artigos = new ArrayList<Artigo>();
		this.idVeiculoPublicacao = id;
	}
	
	public int getId() {
		return this.idVeiculoPublicacao;
	}
	
	public void imprimeVeiculoPublicacao() {
		System.out.println(this.idVeiculoPublicacao);
		this.imprimeArtigos();
	}
	
	public void addArtigo(Artigo a) {
		this.artigos.add(a);
	}
	
	// Retorna o ve’culo com um id espec’fico a partir de um array de ve’culos
	public static VeiculoPublicacao getVeiculo(ArrayList<VeiculoPublicacao> vp, int idVeiculo) {
		VeiculoPublicacao veiculo = null;
		for (VeiculoPublicacao veiculoPublicacao : vp) {
			if (veiculoPublicacao.getId()==idVeiculo) {
				veiculo = veiculoPublicacao;
			}
		}
		return veiculo;
	}
	
	public void imprimeArtigos() {
		for (Artigo a : artigos) {
			System.out.println(a.getIdArtigo());
		}
	}
	
	// Calcula o fator de impacto do veiculo de publicacao
	public double calculaFatorImpacto() {
		double fatorImpacto = 0.0;
		fatorImpacto = (double)calculaCitacoes() / (double)artigos.size();
		return fatorImpacto;
	}
	
	// Calcula o somatorio do numero de citacoes de cada artigo presente em cada veiculo de publicacao
	public int calculaCitacoes() {
		int citacoes = 0;
		for (Artigo a : artigos) {
			citacoes += a.getCitacoes();
		}
		return citacoes;
	}
	
}