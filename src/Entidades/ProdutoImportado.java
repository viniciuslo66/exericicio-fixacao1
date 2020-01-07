package Entidades;

public class ProdutoImportado extends Produtos {
	private Double taxaAlfandega;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	@Override
	public String tagDePreco() {
		return nome + " $ " + String.format("%.2f", preco) + String.format(" (Taxa Alfândega: $ %.2f", taxaAlfandega) + ")";
	}
}
