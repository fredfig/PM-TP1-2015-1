import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Saida {

	// Metodo que faz a escrita do arquivo de popularidade dos pesquisadores
	public static void escrevePopularidadePesquisador(ArrayList<Pesquisador> listaPesquisadores) throws IOException {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("saida/popularidade_pesquisador.txt"));
			System.out.println("Escrevendo popularidade_pesquisador.txt...");
			for (Pesquisador p: listaPesquisadores) {
				out.write(p.getIdPesquisador()+";"+String.format("%.4f", p.calculaPopularidade())+"\n");
			}
			out.close();
		} catch(IOException e) {
			System.out.println(e);
		}
				
	}
		
	// Metodo que faz a escrita do arquivo de fator de impacto dos veiculos de publicacao
	public static void escreveFatorImpacto(ArrayList<VeiculoPublicacao> listaVeiculosPublicacao) throws IOException {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("saida/fatorImpacto_veiculo.txt"));
			System.out.println("Escrevendo fatorImpacto_veiculo.txt...");
			for (VeiculoPublicacao vp: listaVeiculosPublicacao) {
				out.write(vp.getId()+";"+String.format("%.4f", vp.calculaFatorImpacto())+"\n");
			}
			out.close();
		} catch(IOException e) {
			System.out.println(e);
		}
				
	}
	
	// Metodo que faz a escrita do arquivo de qualidade dos artigos
	public static void escrevePontuacaoArtigo(ArrayList<Artigo> listaArtigos, ArrayList<VeiculoPublicacao> listaVeiculosPublicacao) throws IOException {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("saida/pontuacao_artigo.txt"));
			System.out.println("Escrevendo pontuacao_artigo.txt...");
			for (Artigo artigo: listaArtigos) {
				out.write(artigo.getIdArtigo()+";"+String.format("%.4f", artigo.calculaPontuacaoArtigo(listaVeiculosPublicacao))+"\n");
			}
			out.close();
		} catch(IOException e) {
			System.out.println(e);
		}
				
	}
	
}
