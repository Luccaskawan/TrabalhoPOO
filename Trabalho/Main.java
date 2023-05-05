//faca todo os imports necessarios
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

//importe as classes necessarias
import Class.Ganho;
import Class.Gasto;
import Teste.TestGasto;

public class Main
{
	public static void main(String[] args) throws ParseException {
		List<Ganho> listaGanhos = new ArrayList<>();
		List<Gasto> listaGastos = new ArrayList<>();

		boolean continuar = true;
		do {
			//Iniciadores
			Scanner in = new Scanner(System.in);
			GestaoFinanceira inicial = new GestaoFinanceira();
			System.out.println(inicial.Menu());

			int opcaoCoonsulta = in.nextInt();
			if (opcaoCoonsulta == 6){
				continuar = false;
			}
//Opcoes de 1 a 5 dentro de um if
			if (opcaoCoonsulta == 1){
//Opcao de gasto
				System.out.println(inicial.AdicionaGasto());
				Scanner in2 = new Scanner(System.in);
				int opcaoGasto = in2.nextInt();
				Enum<TestGasto> tipoGasto = GestaoFinanceira.tipoGasto(opcaoGasto);
				System.out.println("Informe a data: ");
				String data = in2.next();
//Data formatada
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				Date dataFormatada = formatter.parse(data);
				Calendar dataCalendar = Calendar.getInstance();
				dataCalendar.setTime(dataFormatada);
				System.out.println("Informe o valor: ");
				double valor = in2.nextDouble();
				System.out.println(inicial.FormaPagamento());
				int opcaoFormaPagamento = in2.nextInt();
				String formaPagamento = GestaoFinanceira.FormaPagamento(opcaoFormaPagamento);
				Gasto gasto = new Gasto(valor, dataCalendar, tipoGasto, formaPagamento);
				System.out.println(gasto.toString());
				listaGastos.add(gasto);
			}
//Opcao de ganho
			if (opcaoCoonsulta == 2){
				Scanner in3 = new Scanner(System.in);
				GestaoFinanceira inicial2 = new GestaoFinanceira();
				System.out.println(inicial2.adicionaGanho());
				System.out.println("Nome do ganho: ");
				String nome = in3.next();
				System.out.println("Valor: ");
				double valorGanho = in3.nextDouble();

				Ganho ganho = new Ganho(nome, valorGanho);
				System.out.println(ganho.toString());
				listaGanhos.add(ganho);
			}
//Opcao de relatorio de gastos
			if (opcaoCoonsulta == 3){
				StringBuilder body = new StringBuilder();
				System.out.println("Carregando...");
				System.out.println("\n\n Lista de gastos ");
				for (int x = 0; x < listaGastos.size(); x++){

					body.append("\n\nGasto nº "+ (x+1));
					body.append("\nValor: "+ listaGastos.get(x).getValor());
					body.append("\nData: "+ listaGastos.get(x).getData());
					body.append("\nTipo de gasto: "+ listaGastos.get(x).getTipoDeGasto());
					body.append("\nForma de pagamento: "+ listaGastos.get(x).getFormaDePagamento());
				}
				System.out.println(body.toString());
			}
//Opcao de relatorio de ganhos
			if(opcaoCoonsulta == 4){
				StringBuilder body = new StringBuilder();
				System.out.println("\n\n Lista de ganhos ");
				for (int x = 0; x < listaGanhos.size(); x++){

					body.append("\n\nGanho nº "+ (x+1));
					body.append("\nNome: "+ listaGanhos.get(x).getNome());
					body.append("\nValor: "+ listaGanhos.get(x).getValor());
				}
			}
//Opcao de relatorio mensal
			if (opcaoCoonsulta == 5) {
				System.out.println("Informe o mês: ");
				Scanner in4 = new Scanner(System.in);
				int mes = 0;
				mes = in4.nextInt();
				Calendar calendarioJava = Calendar.getInstance();
				calendarioJava.set(Calendar.MONTH, mes-1);
				StringBuilder body = new StringBuilder();
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println("\n\n Lista de gastos do mes selecionado ");
				for (int x = 0; x < listaGastos.size(); x++){
					if (listaGastos.get(x).getData().get(Calendar.MONTH) == calendarioJava.get(Calendar.MONTH)){
						String data = formatter.format(listaGastos.get(x).getData().getTime());
						body.append("\n\nGasto nº "+ (x+1));
						body.append("\nValor: "+ listaGastos.get(x).getValor());
						body.append("\nData: "+ data);
						body.append("\nTipo de gasto: "+ listaGastos.get(x).getTipoDeGasto());
						body.append("\nForma de pagamento: "+ listaGastos.get(x).getFormaDePagamento());
					}
				}
				System.out.println(body.toString());
			}
		} while (continuar);

		System.out.println("VALEUUUUUU");
	}
}
