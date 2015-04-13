import java.util.ArrayList;
import java.util.Hashtable;

public class Pesquisador { 

	private static int numPesquisadores = 0;
	
	private int idPesquisador;
	private int horaIniciacaoCientifica = 0;
	private int horaEstagioDocencia = 0;
	
	private Hashtable<Integer, Integer> artigoAutoria;
    
	public Pesquisador(int id, int horasIC, int horasED) {
		artigoAutoria = new Hashtable<Integer, Integer>();
		numPesquisadores++;
		this.idPesquisador = id;
		this.setHoraIniciacaoCientifica(horasIC);
		this.setHoraEstagioDocencia(horasED); 
		
	}
	
	public void imprimePesquisador(){
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
	
	public void addArtigoAutoria(int idArtigo, int ordemAutoria){
		artigoAutoria.put(idArtigo, ordemAutoria);
	}

	public void imprimeArtigoAutoria(){
		for (Integer artigo : artigoAutoria.keySet()) {
			System.out.println(artigo + " " + artigoAutoria.get(artigo));
		}
	}
	
	public int artigosPublicados(){
		return artigoAutoria.size();
	}
	
	// Retorna o pesquisador com um id espec’fico a partir de um array de pesquisadores
	public static Pesquisador getPesquisador(ArrayList<Pesquisador> listaP, int idPesquisador){
		Pesquisador pesquisador = null;
		for (Pesquisador p : listaP) {
			if (p.getIdPesquisador()==idPesquisador){
				pesquisador = p;
			}
		}
		return pesquisador;
	}
	
}