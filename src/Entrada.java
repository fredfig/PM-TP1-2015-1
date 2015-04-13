import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Entrada {
	
	
	public static void main(String[] args) {
		
		try {
			ArrayList<Pesquisador> leia = leituraPesquisadoresEntrada();
			for (Pesquisador pesquisador : leia) {
				pesquisador.imprimePesquisador();
			}
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
		
	// Metodo que faz a leitura dos pesquisadores e retorna um array de Pesquisadores
	public static ArrayList<Pesquisador> leituraPesquisadoresEntrada() throws IOException {

		// Cria a lista de Pesquisadores - em construcao -
		ArrayList<Pesquisador> listaPesquisadores = new ArrayList<Pesquisador>();
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("entrada/pesquisadores.txt"));
			String read;
			Pesquisador p = null;
			
			while ((read = in.readLine()) != null){
				System.out.println("Linha: " + read);
				String[] pesq = read.split(";", 7);
				if(pesq[1].compareTo("G")==0){
					p = new Graduado(Integer.parseInt(pesq[0]),
											  Integer.parseInt(pesq[2]),
											  Integer.parseInt(pesq[3]));
				}
				else if(pesq[1].compareTo("M")==0){
					p = new Mestre(Integer.parseInt(pesq[0]),
										  Integer.parseInt(pesq[2]),
										  Integer.parseInt(pesq[3]),
										  Integer.parseInt(pesq[4]));
				}
				else if(pesq[1].compareTo("D")==0){
					p = new Doutor(Integer.parseInt(pesq[0]),
										  Integer.parseInt(pesq[2]),
										  Integer.parseInt(pesq[3]),
										  Integer.parseInt(pesq[4]),
										  Integer.parseInt(pesq[5]),
										  Integer.parseInt(pesq[6]));
				}
				listaPesquisadores.add(p);
			}
			in.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		
		return listaPesquisadores;
		
	}
	
}