public class Graduado extends Pesquisador {

	public Graduado(int id, int horasIC, int horasED) {
		super(id,horasIC,horasED);
	}

	// Calcula popularidade do graduado
	@Override
	public double calculaPopularidade() {
		double popularidade = 0.0;
		
		popularidade = super.calculaPopularidade() 
					 + (double)getHorasIC() 
					 + (double)getHorasED();
		
		return popularidade;
	
	}
	
}