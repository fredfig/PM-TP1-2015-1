import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Entrada {	
	
	public static void main(String[] args) {
		try {
			ArrayList<Pesquisador> leiaP = leituraPesquisadoresEntrada();
			ArrayList<VeiculoPublicacao> leiaVP = leituraVeiculoPublicacaoEntrada();
			ArrayList<Artigo> leiaA = leituraArtigosEntrada(leiaVP);
			leituraArtigoPesquisadorEntrada(leiaP);
			
			for (Pesquisador pesquisador : leiaP) {
				System.out.println(pesquisador.getIdPesquisador());
				System.out.println(pesquisador.artigosPublicados());
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
		
	// Metodo que faz a leitura dos pesquisadores
	// Retorna um array de Pesquisadores
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

	// Metodo que faz a leitura dos veículos de publiação
	// Retorna um array de VeiculoPublicacao
	public static ArrayList<VeiculoPublicacao> leituraVeiculoPublicacaoEntrada() throws IOException {

		ArrayList<VeiculoPublicacao> listaVP = new ArrayList<VeiculoPublicacao>();
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("entrada/veiculos.txt"));
			String read;
			VeiculoPublicacao vp = null;
			System.out.println("Lendo veículos de publicação...");
			while ((read = in.readLine()) != null){
				//System.out.println("Linha: " + read);
				String[] pesq = read.split(";", 2);
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

	// Metodo que faz a leitura dos Artigos
	// Retorna um array de Artigos
	public static ArrayList<Artigo> leituraArtigosEntrada(ArrayList<VeiculoPublicacao> listaVP) throws IOException {

		ArrayList<Artigo> listaA = new ArrayList<Artigo>();
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("entrada/artigos_veiculos.txt"));
			String read;
			Artigo a = null;
			System.out.println("Lendo artigos...");
			System.out.println("Adicionando artigos à veículos de publicação...");
			while ((read = in.readLine()) != null){
				//System.out.println("Linha: " + read);
				String[] pesq = read.split(";", 2);
				// Cria artigo com id único
				a = new Artigo(Integer.parseInt(pesq[0]));
				// Busca veículo de publicação deste artigo
				VeiculoPublicacao v = VeiculoPublicacao.getVeiculo(listaVP, Integer.parseInt(pesq[1]));
				// Adiciona ao veículo de publicação o artigo 
				v.addArtigo(a);
				listaA.add(a);
			}
			in.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		
		return listaA;
		
	}

	// Metodo que faz a leitura dos Artigos relacionado ao pesquisador.
	// Cada artigo indica qual é o autor do artigo e sua ordem de autoria
	// Retorna vazio
	public static void leituraArtigoPesquisadorEntrada(ArrayList<Pesquisador> listaP) throws IOException {

		try {
			BufferedReader in = new BufferedReader(new FileReader("entrada/grafo_artigos_pesquisadores.txt"));
			String read;
			System.out.println("Lendo artigos x pesquisadores...");
			System.out.println("Associando artigos aos pesquisadores considerando ordem de autoria...");
			while ((read = in.readLine()) != null){
				//System.out.println("Linha: " + read);
				String[] pesq = read.split(";", 3);
				// Busca pesquisador que é autor deste artigo
				Pesquisador p = Pesquisador.getPesquisador(listaP, Integer.parseInt(pesq[1]));
				// Adiciona ao veículo de publicação o artigo 
				p.addArtigoAutoria(Integer.parseInt(pesq[0]), Integer.parseInt(pesq[2]));
			
			}
			in.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		
		
	}


}