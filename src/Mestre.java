public class Mestre extends Pesquisador {

	private int numGradOrient;

	public Mestre(int id, int horasIC, int horasED,int alunosGrad) {
		super(id,horasIC,horasED);
		this.setGradOrient(alunosGrad);
	}
	
	@Override
	public void imprimePesquisador(){
		super.imprimePesquisador();
		System.out.println(numGradOrient);
	}

	public void setGradOrient(int orient) {
		this.numGradOrient = orient;
	}
	
	public int getGradOrient(){
		return this.numGradOrient;
	}
}