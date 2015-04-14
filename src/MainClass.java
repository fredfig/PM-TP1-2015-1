import io.Entrada;
import io.Saida;

import java.io.IOException;
import java.util.ArrayList;

import redeSocialPesquisadores.Artigo;
import redeSocialPesquisadores.Pesquisador;
import redeSocialPesquisadores.VeiculoPublicacao;

public class MainClass {

	public static void main(String[] args) throws IOException {
	
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