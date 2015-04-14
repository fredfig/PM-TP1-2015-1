import java.util.ArrayList;
import java.util.Hashtable;

public class Pesquisador { 

	private int idPesquisador;
	private int horaIniciacaoCientifica = 0;
	private int horaEstagioDocencia = 0;
	
	private Hashtable<Integer, Integer> artigoAutoria;
	private ArrayList<Artigo> listaArtigos;
    
	public Pesquisador(int id, int horasIC, int horasED) {
		listaArtigos = new ArrayList<Artigo>();
		artigoAutoria = new Hashtable<Integer, Integer>();
		this.idPesquisador = id;
		this.setHoraIniciacaoCientifica(horasIC);
		this.setHoraEstagioDocencia(horasED); 
	}
	
	public void imprimePesquisador() {
		System.out.println(idPesquisador);
		System.out.println(horaIniciacaoCientifica);
		System.out.println(horaEstagioDocencia);
	}
	
	public void setHoraIniciacaoCientifica(int horas) {
		this.horaIniciacaoCientifica = horas;
	}
	
	public void setHoraEstagioDocencia(int horas) {
		this.horaEstagioDocencia = horas;
	}

	public int getIdPesquisador(){
		return this.idPesquisador;
	}
	
	public int getHorasIC(){
		return this.horaIniciacaoCientifica;
	}
	
	public int getHorasED(){
		return this.horaEstagioDocencia;
	}
	
	public void addArtigo(Artigo a){
		this.listaArtigos.add(a);
	}
	
	public void addArtigoAutoria(int idArtigo, int ordemAutoria) {
		this.artigoAutoria.put(idArtigo, ordemAutoria);
	}

	public void imprimeArtigoAutoria() {
		for (Integer artigo : this.artigoAutoria.keySet()) {
			System.out.println(artigo + " " + this.artigoAutoria.get(artigo));
		}
	}
	
	public int artigosPublicados() {
		return listaArtigos.size();
	}
	
	// Retorna o pesquisador com um id específico a partir de um array de pesquisadores
	public static Pesquisador getPesquisador(ArrayList<Pesquisador> listaP, int idPesquisador) {
		Pesquisador pesquisador = null;
		for (Pesquisador p : listaP) {
			if (p.getIdPesquisador() == idPesquisador){
				pesquisador = p;
			}
		}
		return pesquisador;
	}
	
	// Calcular peso de importância do pesquisador
	// Na documentação é referenciado como w(p)
	public double calculaPesoImportancia() {
		double pesoImportancia = 0.0;
		for (Integer artigo : artigoAutoria.keySet()) {
			pesoImportancia += 1/(double)artigoAutoria.get(artigo);
		}
		return pesoImportancia;
	}
	
	// Calcula o número de vezes que os artigos do pesquisador foram citados
	public int totalCitacoes(){
		int citacoes = 0;
		for (Artigo a : this.listaArtigos) {
			citacoes += a.getCitacoes();
		}
		return citacoes;
	}
	
	// Calcula popularidade do pesquisador
	public double calculaPopularidade() {
		double popularidade = 0.0;
		popularidade = calculaPesoImportancia() + (double)totalCitacoes() + (double)artigosPublicados();
		return popularidade;
	}
	
}