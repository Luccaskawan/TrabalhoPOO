import Teste.TestGasto;

// Classe responsável por exibir as telas do sistema
public class GestaoFinanceira
{
	public String Menu(){

		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" GESTÃO FINANCEIRA ");
		bodybuilder.append("\n1 - Adicionar gasto");
		bodybuilder.append("\n2 - Adicionar ganho");
		bodybuilder.append("\n3 - Relatorio de gastos");
		bodybuilder.append("\n4 - Relatorio de ganhos");
		bodybuilder.append("\n5 - Relatorio mensal");
		bodybuilder.append("\n6 - Sair");
		bodybuilder.append("\n");
		bodybuilder.append("\nSelecione uma opção: ");

		return  bodybuilder.toString();
	}

	public String AdicionaGasto() {

		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" ADICIONAR GASTO ");
		bodybuilder.append("\n1 - Habilitação");
		bodybuilder.append("\n2 - Entreterimento");
		bodybuilder.append("\n3 - Alimentação");
		bodybuilder.append("\n4 - Transporte");
		bodybuilder.append("\nSelecione o tipo de gasto: ");
		return bodybuilder.toString();
	}

	public String FormaPagamento() {
		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" FORMA DE PAGAMENTO ");
		bodybuilder.append("\n1 - Cheque");
		bodybuilder.append("\n2 - Pix");
		bodybuilder.append("\n3 - Débito");

		return bodybuilder.toString();

	}
	public String adicionaGanho() {
		StringBuilder bodybuilder = new StringBuilder();
		bodybuilder.append(" ADICIONAR GANHO ");

		return bodybuilder.toString();
	}

	public String mostraGastos() {
		return "s";
	}

	public static String FormaPagamento(int numero){
		try {
			if (numero == 1) {
				return "Cheque";
			} else if (numero == 2) {
				return "Pix";
			} else if (numero == 3) {
				return "Débito";
			} else {
				return "Forma de pagamento inválida";
			}
		} catch (Exception e) {
			return "Forma de pagamento inválida";
		}
	}

	public static Enum<TestGasto> tipoGasto(int numero) {
		if (numero > 0 && numero < 10) {
			switch (numero) {
//Case 1 a 4 com o mesmo nome de variável
				case 1:
					return TestGasto.HABILITACAO;
				case 2:
					return TestGasto.ENTRETERIMENTO;
				case 3:
					return TestGasto.ALIMENTACAO;
				case 4:
					return TestGasto.TRANSPORTE;
				default:
					break;
			}
		} else {
			return null;
		}
		return null;
	}
}
