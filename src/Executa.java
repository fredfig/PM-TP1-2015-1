import java.io.IOException;
import java.util.ArrayList;

public class Executa {

	public static void main(String[] args) {
	
		try {
			// Realiza a leitura dos arquivos de entrada
			ArrayList<Pesquisador> listaPesquisadores = Entrada.leituraPesquisadoresEntrada();
			ArrayList<VeiculoPublicacao> listaVeiculosPublicacao = Entrada.leituraVeiculoPublicacaoEntrada();
			ArrayList<Artigo> listaArtigos = Entrada.leituraArtigosEntrada(listaVeiculosPublicacao);
			Entrada.leituraArtigoPesquisadorEntrada(listaPesquisadores, listaArtigos);
			Entrada.leituraArtigosCitacoesEntrada(listaArtigos);
			
			// Realiza a escrita dos arquivos com os resultados
			Saida.escrevePopularidadePesquisador(listaPesquisadores);
			Saida.escreveFatorImpacto(listaVeiculosPublicacao);
			Saida.escrevePontuacaoArtigo(listaArtigos, listaVeiculosPublicacao);
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	

}