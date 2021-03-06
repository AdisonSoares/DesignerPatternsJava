package aula01.parte01_DBImplementacao;
//Pattern atual Singleton.

/**
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para IMPLEMENTAÇÃO.
 */
public class Teste_Conexao01 {
	public static void main(String[] args) {
		
		Sala_Service sala = new Sala_Service();
		sala.SalaVerification();
		System.out.println();
		
		
		Relatorio_Reserva relatorio = new Relatorio_Reserva();
		relatorio.GeracaoDeRelatorio();
		System.out.println();
		 
		Servico_De_Reserva reserva = new Servico_De_Reserva();
		reserva.CriarReserva();
		System.out.println();
	}
}
