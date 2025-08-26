package Lista1;

import java.util.Scanner;

public class arquivoJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA ===");
        System.out.println("Digite a operação desejada:");
        System.out.println("1. Adição");
        System.out.println("2. Multiplicação");
        System.out.println("3. Divisão");
        System.out.print("Digite sua escolha (1-3): ");
        
        int escolha = scanner.nextInt();
        
        if (escolha < 1 || escolha > 3) {
            System.out.println("Escolha inválida! Por favor, digite um número entre 1 e 3.");
            scanner.close();
            return;
        }
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        String operacao = "";
        String simbolo = "";
        
        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                operacao = "Adição";
                simbolo = "+";
                break;
            case 2:
                resultado = num1 * num2;
                operacao = "Multiplicação";
                simbolo = "*";
                break;
            case 3:
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                    scanner.close();
                    return;
                }
                resultado = num1 / num2;
                operacao = "Divisão";
                simbolo = "/";
                break;
        }
        
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Operação: " + operacao);
        System.out.println(num1 + " " + simbolo + " " + num2 + " = " + resultado);
        
        scanner.close();
    }
}

