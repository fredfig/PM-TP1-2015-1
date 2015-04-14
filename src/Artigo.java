import java.util.ArrayList;

public class Artigo { 

	private int idArtigo;
	private int numCitacao = 0;
	
	public Artigo (int id) {
		this.idArtigo = id;
	}
	
	public int getIdArtigo() {
		return this.idArtigo;
	}
	
	public int getCitacoes() {
		return this.numCitacao;
	}
	
	public void addCitacao() {
		this.numCitacao++;
	}

	// Retorna o artigo com um id espec’fico a partir de um array de artigos
	public static Artigo getArtigo(ArrayList<Artigo> listaA, int idArtigo){
		Artigo artigo = null;
		for (Artigo a : listaA) {
			if (a.getIdArtigo()==idArtigo){
				artigo = a;
			}
		}
		return artigo;
	}
	
}