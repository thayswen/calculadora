package operacao;

import java.util.Scanner;

public class InterfaceCalculadora {

	private static Scanner insere, inserir;

	public static void main(String[] args) {

		Calculo c = new Calculo();

		int opcao = 5;
		int num1;
		int num2;
		int operacao;

		inserir = new Scanner(System.in);
		System.out.println("--Escolha uma opção--");
		System.out.println("1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		System.out.println("0- Sair");
		System.out.println("Operação: ");

		opcao = inserir.nextInt();

		while (opcao != 0) {


			/*if (!opcaoEscolhidaExiste(opcao)) {
				continue;
			}*/
			insere = new Scanner(System.in);

			System.out.println("Favor informe o primeiro número: ");
			num1 = insere.nextInt();
			System.out.println("Favor informe o segundo número: ");
			num2 = insere.nextInt();

			if (!validarDadosDaEntrada(opcao, num1, num2)) {
				continue;
			}

		
		if (opcao == 0) {
			System.out.println("Bye bye!");
			break;
			
		}else if (opcao == 1) {
			operacao = c.soma(num1, num2);
			System.out.println("\nO resultado da soma é: \n" + operacao);
			break;

		} else if (opcao == 2) {
			operacao = c.sub(num1, num2);
			System.out.printf("\nO resultado da subtração é: \n" + operacao);
			break;
		} else if (opcao == 3) {
			operacao = c.mult(num1, num2);
			System.out.printf("\nO resultado da multiplicação é: \n" + operacao);
			break;
		} else if (opcao == 4) {
			operacao = c.div(num1, num2);
			System.out.printf("\nO resultado da divisão é: \n" + operacao);
			break;
		} else {
			System.out.println("????");
			break;
		}
	}
}

	
	private static boolean validarDadosDaEntrada(int opcao, int num1, int num2) {
		boolean retorno = true;
		if (opcao == 4 & num2 == 0) {
			System.out.println("CALMAI: Esse divisor não pode ser zero.\n");
			retorno = false;
		}
		return retorno;
	}

	private static boolean opcaoEscolhidaExiste(int opcao) {
		boolean retorno = true;
		if (opcao > 4) {
			System.out.println("ATENÇÃO: Opção escolhida não existe.\n");
			retorno = false;
		}
		return retorno;
	}

}
	
	
