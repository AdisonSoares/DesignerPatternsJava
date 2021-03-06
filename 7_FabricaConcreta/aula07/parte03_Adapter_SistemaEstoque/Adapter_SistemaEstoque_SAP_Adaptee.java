package aula07.parte03_Adapter_SistemaEstoque;

import aula07.parte01_Adaptee_SistemaEstoque.SistemaEstoqueAdaptee;

public class Adapter_SistemaEstoque_SAP_Adaptee implements IAdapter_SistemaEstoque{
	private SistemaEstoqueAdaptee sistemaEstoqueAdaptee;
	
	public Adapter_SistemaEstoque_SAP_Adaptee() {
		sistemaEstoqueAdaptee = new SistemaEstoqueAdaptee("SAP");
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
