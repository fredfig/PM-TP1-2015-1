import java.io.IOException;
import java.util.ArrayList;

public class Executa {

	public static void main(String[] args) {

		leituraEntrada();
		
	}
	
	// Realiza a leitura dos arquivos de entrada
	public static void leituraEntrada() {
		try {
			ArrayList<Pesquisador> leiaP = Entrada.leituraPesquisadoresEntrada();
			ArrayList<VeiculoPublicacao> leiaVP = Entrada.leituraVeiculoPublicacaoEntrada();
			ArrayList<Artigo> leiaA = Entrada.leituraArtigosEntrada(leiaVP);
			Entrada.leituraArtigoPesquisadorEntrada(leiaP, leiaA);
			Entrada.leituraArtigosCitacoesEntrada(leiaA);
			
			for (Pesquisador p: leiaP) {
				//p.imprimePesquisador();
				System.out.println(p.getIdPesquisador()+";"+String.format("%.4f", p.calculaPopularidade()));
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}