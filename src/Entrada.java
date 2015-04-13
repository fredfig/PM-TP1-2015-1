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
			ArrayList<VeiculoPublicacao> leiaVP = leituraVeiculoPublicacaoEntrada();
			for (VeiculoPublicacao vp : leiaVP) {
				vp.imprimeVeiculoPublicacao();
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

		ArrayList<Pesquisador> listaPesquisadores = new ArrayList<Pesquisador>();
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("entrada/pesquisadores.txt"));
			String read;
			Pesquisador p = null;
			System.out.println("Lendo pesquisadores...");
			while ((read = in.readLine()) != null){
				//System.out.println("Linha: " + read);
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

	// Metodo que faz a leitura dos ve�culos de publia��o e retorna um array de VeiculoPublicacao
	public static ArrayList<VeiculoPublicacao> leituraVeiculoPublicacaoEntrada() throws IOException {

		ArrayList<VeiculoPublicacao> listaVP = new ArrayList<VeiculoPublicacao>();
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("entrada/veiculos.txt"));
			String read;
			VeiculoPublicacao vp = null;
			System.out.println("Lendo ve�culos de publica��o...");
			while ((read = in.readLine()) != null){
				System.out.println("Linha: " + read);
				String[] pesq = read.split(";", 7);
				if(pesq[1].compareTo("R")==0){
					vp = new Revista(Integer.parseInt(pesq[0]));
				}
				else if(pesq[1].compareTo("C")==0){
					vp = new Conferencia(Integer.parseInt(pesq[0]));
				}
				listaVP.add(vp);
			}
			in.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		
		return listaVP;
		
	}
}