package aula07.parte03_Adapter_SistemaEstoque;

import aula07.parte01_Adaptee_SistemaEstoque.SistemaEstoqueAdaptee;

public class Adapter_SistemaEstoque_IBM_Adaptee_ implements IAdapter_SistemaEstoque__{
	private SistemaEstoqueAdaptee sistemaEstoqueAdaptee;
	
	public Adapter_SistemaEstoque_IBM_Adaptee_() {
		sistemaEstoqueAdaptee = new SistemaEstoqueAdaptee("IBM");
	}

	@Override
	public void diminuirItem() {
		sistemaEstoqueAdaptee.diminuirEstoque();
	}

	@Override
	public void atualizarItem() {
		sistemaEstoqueAdaptee.atualizacaoEstoque();
	}
	
	

}
