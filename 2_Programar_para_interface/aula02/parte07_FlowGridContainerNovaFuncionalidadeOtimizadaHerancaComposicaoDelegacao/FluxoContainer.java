package aula02.parte07_FlowGridContainerNovaFuncionalidadeOtimizadaHerancaComposicaoDelegacao;
import java.util.ArrayList;
import java.util.List;

/**
 * @FlowContainer
 * (Fluxo Container) - Agrupa os componentes da esquerda 
 * para direita, em forma de linha por meio de uma List.
 * 
 * @Implementação da classe 
 * Container para adicionar, remover e exibir a lista.
 * 
 * @PrincípioDeFavorecimentoDaComposiçãoSobreHerança
 * Principio de designer simples, outros tipos de designes
 * se baseiam nela para confecção do arranjo entre as classes envolvidas
 * do designer em específico, nesse exemplo se programa para INTEFACE.
 */
public class FluxoContainer extends Container{
	protected List<Component> elementos;

	/**
	 * Ao instanciar o construtor a lista é inicializada.
	 */
	public FluxoContainer() {
		elementos = new ArrayList<Component>();
	}
	
	
	@Override
	public void addComponent(Component component) {
		elementos.add(component);
	}

	@Override
	public void remComponent(Component component) {
		elementos.remove(component);
	}

	@Override
	public void exibir() {
		System.out.println("Container utilizado - Fluxo Container");
		System.out.println("Elementos presentes nesse container:");
		System.out.println(elementos.toString());
	}
}


