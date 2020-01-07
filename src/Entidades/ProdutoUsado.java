package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produtos {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date diaFabricacao;

	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date diaFabricacao) {
		super(nome, preco);
		this.diaFabricacao = diaFabricacao;
	}

	public Date getDiaFabricacao() {
		return diaFabricacao;
	}

	public void setDiaFabricacao(Date diaFabricacao) {
		this.diaFabricacao = diaFabricacao;
	}

	@Override
	public String tagDePreco() {
		return nome + " (usado) $ " + String.format("%.2f", preco) + " (Dia de fabricação: " + sdf.format(diaFabricacao)
				+ ")";
	}

}
