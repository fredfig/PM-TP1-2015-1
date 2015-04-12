public class Pesquisador { 

	private static int numPesquisadores = 0;
	
	private int idPesquisador;
	private int horaIniciacaoCientifica = 0;
	private int horaEstagioDocencia = 0;
	
	private Artigo[] artigos;
	
	public Pesquisador() {
		
		numPesquisadores++;
		this.idPesquisador = numPesquisadores; 
		
	}
	
	public void adicionaHoraIniciacaoCientifica(int horas) {
		
		this.horaIniciacaoCientifica += horas;
		
	}
	
	public void adicionaHoraEstagioDocencia(int horas) {
		
		this.horaEstagioDocencia += horas;
		
	}
	
}