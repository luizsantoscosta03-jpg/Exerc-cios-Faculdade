import java.util.Scanner;
public class EXERCICIO4WHILE {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua senha");
        int numero = leitor.nextInt();
        while (numero != 2025) {
            System.out.println("Acesso Negado");
            System.out.println("Digite novamente");
            numero = leitor.nextInt();

        }
        System.out.println("Acesso Liberado");
    }
}


