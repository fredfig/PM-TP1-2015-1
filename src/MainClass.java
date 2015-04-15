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
			ArrayList<Pesquisador> listaPesquisadores = Entrada.leituraPesquisadoresEntrada(args[0]);
			ArrayList<VeiculoPublicacao> listaVeiculosPublicacao = Entrada.leituraVeiculoPublicacaoEntrada(args[1]);
			ArrayList<Artigo> listaArtigos = Entrada.leituraArtigosEntrada(listaVeiculosPublicacao, args[2]);
			Entrada.leituraArtigoPesquisadorEntrada(listaPesquisadores, listaArtigos, args[3]);
			Entrada.leituraArtigosCitacoesEntrada(listaArtigos, args[4]);
			
			// Realiza a escrita dos arquivos com os resultados
			Saida.escrevePopularidadePesquisador(listaPesquisadores, args[5]);
			Saida.escreveFatorImpacto(listaVeiculosPublicacao, args[6]);
			Saida.escrevePontuacaoArtigo(listaArtigos, listaVeiculosPublicacao, args[7]);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}