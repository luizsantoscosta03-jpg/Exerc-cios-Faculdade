import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Leia a nota
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        // 2. Verifique se o aluno foi aprovado
        if (nota >= 60) {
            System.out.println("Aprovado");
        } else {
            // 3. Caso não tenha sido aprovado, informe se ficou em recuperação ou reprovado
            if (nota >= 40) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }

        scanner.close();
    }
}
