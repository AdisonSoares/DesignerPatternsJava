package aula02.parte07_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicaoDelegacao;

/**
 * @Classe criada para implementar uma caracteristica solida
 * de Borda.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTEFACE.
 * 
 * @autor Adison
 */
public class BordaSolida extends Borda{
	
	public BordaSolida() {
		
	}
	
	public BordaSolida(Container container) {
		super.setContainer(container);
	}

	@Override
	public void gerarBorda() {
		getContainer().exibir();
		System.out.println("Contem uma borda solida ao redor");
		getContainer().fecharContainer();
		
	}

}
