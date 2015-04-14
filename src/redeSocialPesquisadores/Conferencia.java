package redeSocialPesquisadores;
public class Conferencia extends VeiculoPublicacao {

	public Conferencia(int id) {
		super(id);
	}
	
	// Calcula o fator de impacto da conferencia
	@Override
	public double calculaFatorImpacto() {
		double fatorImpacto = 0.0;
		fatorImpacto = super.calculaFatorImpacto() + 1;
		return fatorImpacto;
	}
	
}