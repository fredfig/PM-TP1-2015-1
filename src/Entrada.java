import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Entrada {
	
	// Cria a lista de Pesquisadores - em construcao -
	ArrayList<Pesquisador> listaPesquisadores = new ArrayList<Pesquisador>();
	
	public static void main(String[] args) {
		
		try {
			String[] leia = leituraArquivoEntrada("pesquisadores.txt");
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
	
	// Metodo que faz a leitura de qualquer arquivo de entrada.
	// Retorna um array de Strings com cada linha do arquivo de entrada.
	public static String[] leituraArquivoEntrada(String arquivoEntrada) throws IOException {
		
		String[] linhas = null;
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("entrada/" + arquivoEntrada));
			String read;
			while ((read = in.readLine()) != null)
				System.out.println("Linha: " + read);
			in.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		
		return linhas;
		
	}
	
}