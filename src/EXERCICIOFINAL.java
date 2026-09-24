import java.util.Scanner;
public class EXERCICIOFINAL {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double venda;
        double total = 0;
        int quantidade = 0;
        System.out.println("VALORES DAS VENDAS");
        venda = leitor.nextDouble();
        while (venda != 0) {
            total = total + venda;
            quantidade = quantidade + 1;
            venda = leitor.nextDouble();
        }
        System.out.println("TOTAL Arrecadado: " + total);
        System.out.println("QUANTIDADE de VENDAS:" + quantidade);


        double media;
        media = total / quantidade;
        System.out.println("Media das vendas: " + media);


    }
}