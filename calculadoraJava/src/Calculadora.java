import java.util.Scanner; //AQUI FAÇO A IMPORTAÇÃO DO SCANNER

public class Calculadora {
    public static void main(String[] args) {
        int escolha;
        int num1, num2;
        double resultado; //AQUI DECLARO AS VARIÁVEIS VAZIAS QUE VÃO RECEBER VALORES DEPOIS

        Scanner input = new Scanner(System.in); 

        while (true) {
            System.out.println("=== Bem-vindo à Calculadora ===");
            System.out.println("1- SOMAR");
            System.out.println("2- SUBTRAIR");
            System.out.println("3- DIVIDIR");
            System.out.println("4- MULTIPLICAR");
            System.out.println("5- SAIR");
            System.out.print("Faça sua escolha: ");

            //ACIMA É O MENU DE ESCOLHAS DA CALCULADORA

            
            escolha = input.nextInt(); // AQUI RECEBO O NÚMERO COLOCADO PELO USUARIO 

            
            if (escolha == 5) {
                System.out.println("Obrigado por usar a calculadora. Até a próxima!");
                break;
            } //AQUI CONFIRO SE O NÚMERO COLOCADO FOR 5 ELE VAI SAIR DA CALCULADORA

            
            if (escolha < 1 || escolha > 5) {
                System.out.println("Opção inválida! Tente novamente.\n");
                continue;
            } //AQUI SE A ESCOLA FOR MENOR QUE 1 OU MAIOR QUE 5 VAI DAR INVÁLIDO

           // SE FEITO A ESCOLHA CERTA VAI COMEÇAR A ETAPA DE COLOCAR OS NÚMEROS PARA AS OPERAÇÕES
            System.out.print("Digite o primeiro número: ");
            num1 = input.nextInt();

            System.out.print("Digite o segundo número: ");
            num2 = input.nextInt();

            //O SWITCH ARMAZENA E ORGANIZA AS ESCOLHAS QUE SÓ VÃO SER CHAMADAS DE ACORDO COM O USUARIO, 
            //CASO ELE ESCOLHA 1 O CASE 1 VAI SER EXECUTADO, CASO ESCOLHA O 2 O CASE 2 VAI SER EXECUTADO E ASSIM VAI
            switch (escolha) {
                case 1: 
                    resultado = num1 + num2;
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3: 
                    if (num2 != 0) {
                        resultado = (double) num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                case 4: 
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println(); 
        }

        input.close(); 
    }
}
