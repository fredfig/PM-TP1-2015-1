import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Saida {

	// Metodo que faz a escrita do arquivo de popularidade dos pesquisadores
	public static void escrevePopularidadePesquisador(ArrayList<Pesquisador> leiaP) throws IOException {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("saida/popularidade_pesquisador.txt"));
			System.out.println("Escrevendo popularidade_pesquisador.txt...");
			for (Pesquisador p: leiaP) {
				out.write(p.getIdPesquisador()+";"+String.format("%.4f", p.calculaPopularidade())+"\n");
			}
			out.close();
		} catch(IOException e) {
			System.out.println(e);
		}
				
	}
		
	// Metodo que faz a escrita do arquivo de fator de impacto dos veiculos de publicacao
	public static void escreveFatorImpacto(ArrayList<Pesquisador> leiaP) throws IOException {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("saida/fatorImpacto_veiculo.txt"));
			System.out.println("Escrevendo fatorImpacto_veiculo.txt...");
			//for (Pesquisador p: leiaP) {
				//out.write(p.getIdPesquisador()+";"+String.format("%.4f", p.calculaPopularidade())+"\n");
			//}
			out.close();
		} catch(IOException e) {
			System.out.println(e);
		}
				
	}
	
}
