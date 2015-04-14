package redeSocialPesquisadores;

import java.util.ArrayList;

public class Artigo { 

	private int idArtigo;
	private int numCitacao = 0;
	private int idVeiculoPublicacao;
	
	public Artigo (int id) {
		this.idArtigo = id;
	}
	
	public int getIdArtigo() {
		return this.idArtigo;
	}

	public int getIdVP() {
		return this.idVeiculoPublicacao;
	}
	
	public int getCitacoes() {
		return this.numCitacao;
	}
	
	public void addCitacao() {
		this.numCitacao++;
	}
	
	public void setIdVP(int idVP) {
		this.idVeiculoPublicacao = idVP;
	}

	// Retorna o artigo com um id espec’fico a partir de um array de artigos
	public static Artigo getArtigo(ArrayList<Artigo> listaA, int idArtigo) {
		Artigo artigo = null;
		for (Artigo a : listaA) {
			if (a.getIdArtigo() == idArtigo) {
				artigo = a;
			}
		}
		return artigo;
	}
	
	// Calcula a pontuacao do artigo
	public double calculaPontuacaoArtigo(ArrayList<VeiculoPublicacao> listaVeiculosPublicacao) {
		double pontuacaoArtigo = 0.0;
		pontuacaoArtigo = (double)VeiculoPublicacao.getVeiculo(listaVeiculosPublicacao, this.getIdVP()).calculaFatorImpacto() * (double)getCitacoes();
		return pontuacaoArtigo;
	}
	
}