 import java.util.Scanner;

public class ExercicioPresencial {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int senha;

        do {
            System.out.println("Digite sua senha!");
            senha = leia.nextInt();
            if (senha != 1234) {
                System.out.println("Acesso negado");
            }
        } while (senha != 1234);

        System.out.println("Acesso liberado");
    }
}














