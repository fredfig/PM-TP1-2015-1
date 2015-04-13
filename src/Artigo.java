public class Artigo { 

	private int idArtigo;
	private int numCitacao;
	
	private Pesquisador[] pesquisadores;
	
	public Artigo (int id){
		this.idArtigo = id;
	}
	
	public int getIdArtigo(){
		return this.idArtigo;
	}
}