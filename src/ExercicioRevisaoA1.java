
import java.util.Scanner;
public class ExercicioRevisaoA1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double desconto, PrecoFinal, Preco;
        System.out.println("Digite o preco do produto");
        Preco = leia.nextDouble();
        desconto = Preco * 0.15;
        PrecoFinal = Preco - desconto;

        System.out.println("Desconto: " + desconto);
        System.out.println("Preco Final: " + PrecoFinal);


    }
}