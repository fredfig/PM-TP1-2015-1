import java.io.IOException;
import java.util.ArrayList;

public class Executa {

	public static void main(String[] args) {
	
		try {
			// Realiza a leitura dos arquivos de entrada
			ArrayList<Pesquisador> leiaP = Entrada.leituraPesquisadoresEntrada();
			ArrayList<VeiculoPublicacao> leiaVP = Entrada.leituraVeiculoPublicacaoEntrada();
			ArrayList<Artigo> leiaA = Entrada.leituraArtigosEntrada(leiaVP);
			Entrada.leituraArtigoPesquisadorEntrada(leiaP, leiaA);
			Entrada.leituraArtigosCitacoesEntrada(leiaA);
			
			// Realiza a escrita dos arquivos com os resultados
			Saida.escrevePopularidadePesquisador(leiaP);
			//Saida.escreveFatorImpacto();
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	

}