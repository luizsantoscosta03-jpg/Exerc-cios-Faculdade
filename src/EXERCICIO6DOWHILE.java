import java.util.Scanner;
public class EXERCICIO6DOWHILE {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String resposta;
        do {
            System.out.println("deseja registrar outro pedido");
            System.out.println("Digite S para sim ou N para nao");

            resposta = leitor.nextLine();
        } while (resposta.equalsIgnoreCase("S"));

    }
}


