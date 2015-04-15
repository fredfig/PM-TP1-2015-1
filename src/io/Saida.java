package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import redeSocialPesquisadores.Artigo;
import redeSocialPesquisadores.Pesquisador;
import redeSocialPesquisadores.VeiculoPublicacao;

public class Saida {

	// Metodo que faz a escrita do arquivo de popularidade dos pesquisadores
	public static void escrevePopularidadePesquisador(ArrayList<Pesquisador> listaPesquisadores, String nomeArquivoEntrada) throws IOException {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(nomeArquivoEntrada));
			System.out.println("Escrevendo popularidade dos pesquisadores.");
			for (Pesquisador p: listaPesquisadores) {
				out.write(p.getIdPesquisador()+";"+String.format(Locale.US, "%.4f", p.calculaPopularidade())+"\n");
			}
			out.close();
		} catch(IOException e) {
			System.out.println(e);
		}
				
	}
		
	// Metodo que faz a escrita do arquivo de fator de impacto dos veiculos de publicacao
	public static void escreveFatorImpacto(ArrayList<VeiculoPublicacao> listaVeiculosPublicacao, String nomeArquivoEntrada) throws IOException {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(nomeArquivoEntrada));
			System.out.println("Escrevendo fator de impacto dos veiculos.");
			for (VeiculoPublicacao vp: listaVeiculosPublicacao) {
				out.write(vp.getId()+";"+String.format(Locale.US, "%.4f", vp.calculaFatorImpacto())+"\n");
			}
			out.close();
		} catch(IOException e) {
			System.out.println(e);
		}
				
	}
	
	// Metodo que faz a escrita do arquivo de qualidade dos artigos
	public static void escrevePontuacaoArtigo(ArrayList<Artigo> listaArtigos, ArrayList<VeiculoPublicacao> listaVeiculosPublicacao, String nomeArquivoEntrada) throws IOException {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(nomeArquivoEntrada));
			System.out.println("Escrevendo pontuacao dos artigos.");
			for (Artigo artigo: listaArtigos) {
				out.write(artigo.getIdArtigo()+";"+String.format(Locale.US, "%.4f", artigo.calculaPontuacaoArtigo(listaVeiculosPublicacao))+"\n");
			}
			out.close();
		} catch(IOException e) {
			System.out.println(e);
		}
				
	}
	
}
