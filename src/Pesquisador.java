public class Pesquisador { 

	private static int numPesquisadores = 0;
	
	private int idPesquisador;
	private int horaIniciacaoCientifica = 0;
	private int horaEstagioDocencia = 0;
	
	private Artigo[] artigos;
	
	public Pesquisador(int id, int horasIC, int horasED) {
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
	
}