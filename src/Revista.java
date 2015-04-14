public class Revista extends VeiculoPublicacao {

	public Revista(int id) {
		super(id);
	}
	
	// Calcula o fator de impacto da revista
	@Override
	public double calculaFatorImpacto() {
		double fatorImpacto = 0.0;
		fatorImpacto = super.calculaFatorImpacto() + 2;
		return fatorImpacto;
	}
	
}