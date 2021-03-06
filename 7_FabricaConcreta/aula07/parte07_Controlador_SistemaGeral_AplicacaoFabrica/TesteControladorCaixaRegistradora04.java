package aula07.parte07_Controlador_SistemaGeral_AplicacaoFabrica;

public class TesteControladorCaixaRegistradora04 {
	public static void testeSistemaCaixaControlador() {
	
		Controlador_CaixaRegistradora controladorSistemaCaixaRegistradora;
		controladorSistemaCaixaRegistradora = new Controlador_CaixaRegistradora();
		
		System.out.println("Testando a integração do sistema estoque ItauTec");
		controladorSistemaCaixaRegistradora.criacaoAdapterSistemaCaixaRegistradoraEstoque("ItauTec");
		controladorSistemaCaixaRegistradora.diminuirEstoque();
		
		
		System.out.println("Testando a integração do sistema estoque IBM");
		controladorSistemaCaixaRegistradora.criacaoAdapterSistemaCaixaRegistradoraEstoque("IBM");
		controladorSistemaCaixaRegistradora.diminuirEstoque();
		
		System.out.println("Testando a integração do sistema contabil ItauTec");
		controladorSistemaCaixaRegistradora.criacaoAdapterSistemaCaixaRegistradoraContabil("ItauTec");
		controladorSistemaCaixaRegistradora.registroVendaSistemaContabil();
		
		
		System.out.println("Testando a integração do sistema contabil IBM");
		controladorSistemaCaixaRegistradora.criacaoAdapterSistemaCaixaRegistradoraContabil("IBM");
		controladorSistemaCaixaRegistradora.registroVendaSistemaContabil();
	}
	
	public static void main(String[] args) {
		testeSistemaCaixaControlador();
	}
}
















