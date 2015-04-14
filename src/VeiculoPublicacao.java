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
	
}