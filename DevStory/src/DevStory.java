import java.util.Scanner;

public class DevStory {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        exibirCabecalho();

        double totalBruto = 0;
        double totalDesconto = 0;

        // Escolha do tipo de cliente
        System.out.println("TIPO DE CLIENTE");
        System.out.println("1 - Comum");
        System.out.println("2 - VIP");
        System.out.println("3 - Funcionario");
        System.out.print("Escolha: ");

        int tipoCliente = scanner.nextInt();

        // Processamento dos 3 produtos
        for (int i = 1; i <= 3; i++) {

            System.out.println();
            System.out.println("----- PRODUTO " + i + " -----");

            System.out.print("PRECO: ");
            double preco = scanner.nextDouble();

            System.out.print("QUANTIDADE: ");
            int quantidade = scanner.nextInt();

            double subtotal = calcularSubtotal(preco, quantidade);

            double desconto = calcularDesconto(subtotal, tipoCliente);

            totalBruto = totalBruto + subtotal;
            totalDesconto = totalDesconto + desconto;
        }

        // Valor depois dos descontos
        double valorComDesconto = totalBruto - totalDesconto;

        // Imposto de 5%
        double imposto = calcularImposto(valorComDesconto);

        // Valor final
        double valorFinal = valorComDesconto + imposto;

        // Exibe o comprovante
        exibirComprovante(
                totalBruto,
                totalDesconto,
                imposto,
                valorFinal
        );
    }

    // Módulo 1 - Cabeçalho
    static void exibirCabecalho() {

        System.out.println("-----------------------");
        System.out.println("       DevStory        ");
        System.out.println("    GESTAO E VENDAS    ");
        System.out.println("-----------------------");
    }

    // Módulo 2 - Calcula subtotal
    static double calcularSubtotal(double preco, int quantidade) {

        return preco * quantidade;
    }

    // Módulo 3 - Calcula desconto
    static double calcularDesconto(double subtotal, int tipoCliente) {

        double desconto;

        if (tipoCliente == 1) {
            desconto = subtotal * 0.0;

        } else if (tipoCliente == 2) {
            desconto = subtotal * 0.10;

        } else if (tipoCliente == 3) {
            desconto = subtotal * 0.15;

        } else {
            desconto = 0;
        }

        return desconto;
    }

    // Módulo 4 - Calcula imposto
    static double calcularImposto(double valorComDesconto) {

        return valorComDesconto * 0.05;
    }

    // Módulo 5 - Exibe comprovante
    static void exibirComprovante(
            double totalBruto,
            double totalDesconto,
            double totalImposto,
            double valorFinal) {

        System.out.println();
        System.out.println("-----------------------");
        System.out.println("      COMPROVANTE      ");
        System.out.println("-----------------------");

        System.out.println("Total bruto: " + totalBruto);
        System.out.println("Desconto: " + totalDesconto);
        System.out.println("Imposto: " + totalImposto);
        System.out.println("Valor final: " + valorFinal);

        System.out.println("-----------------------");
    }
}