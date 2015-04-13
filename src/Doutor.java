public class Doutor extends Pesquisador {

	private int numGradOrient;
	private int numMestreOrient;
	private int numDoutorOrient;
	

	public Doutor(int id, int horasIC, int horasED, int alunosGrad, int alunosMestre, int alunosDoutor) {
		super(id,horasIC,horasED);
		this.setGradOrient(alunosGrad);
		this.setMestOrient(alunosMestre);
		this.setDoutOrient(alunosDoutor);
	}

	@Override
	public void imprimePesquisador(){
		super.imprimePesquisador();
		System.out.println(numGradOrient);
		System.out.println(numMestreOrient);
		System.out.println(numDoutorOrient);
	}

	public void setGradOrient(int orient) {	
		this.numGradOrient = orient;
	}
	public void setMestOrient(int orient) {	
		this.numMestreOrient = orient;
	}
	public void setDoutOrient(int orient) {	
		this.numDoutorOrient = orient;
	}
	
	public int getGradOrient() {	
		return this.numGradOrient;
	}
	public int getMestOrient() {	
		return this.numMestreOrient;
	}
	public int getDoutOrient() {	
		return this.numDoutorOrient;
	}
	
	
}