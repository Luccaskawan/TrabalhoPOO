package Class;

import java.util.Calendar;
import Teste.TestGasto;

//Class Gasto
public class Gasto
{
	private Long codigo;
	private String nome;
	private double valor;
	private Calendar data;
	private Enum<TestGasto> tipoDeGasto;
	private String formaDePagamento;

	public Gasto(double valor, Calendar data,Enum<TestGasto> tipoDeGasto, String formaDePagamento)
	{

		this.valor = valor;
		this.data = data;
		this.tipoDeGasto = tipoDeGasto;
		this.formaDePagamento = formaDePagamento;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Long getCodigo()
	{
		return codigo;
	}

	public void setCodigo(Long codigo)
	{
		this.codigo = codigo;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public double getValor()
	{
		return valor;
	}

	public void setValor(double valor)
	{
		this.valor = valor;
	}

	public Calendar getData()
	{
		return data;
	}

	public void setData(Calendar data)
	{
		this.data = data;
	}
	public Enum<Teste.TestGasto> getTipoDeGasto()
	{
		return tipoDeGasto;
	}

	public void setTipoDeGasto(Enum<Teste.TestGasto> tipoDeGasto)
	{
		this.tipoDeGasto = tipoDeGasto;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("\n\n\n");
		builder.append("Gasto cadastrado!");
		builder.append("\nValor: " +getValor());
		builder.append("\nData: " +getData());
		builder.append("\nTipo de Gasto: " +getTipoDeGasto());
		builder.append("\nForma de Pagamento: " +getFormaDePagamento());
		builder.append("\n\n");
		return builder.toString();
	}
}
