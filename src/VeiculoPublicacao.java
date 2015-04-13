public class VeiculoPublicacao { 

	private int idVeiculoPublicacao;
	
	public VeiculoPublicacao(int id){
		this.idVeiculoPublicacao = id;
	}
	
	public int getId(){
		return this.idVeiculoPublicacao;
	}
	
	public void imprimeVeiculoPublicacao(){
		System.out.println(this.idVeiculoPublicacao);
	}
	
}