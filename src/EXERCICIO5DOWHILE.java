import java.util.Scanner;
public class EXERCICIO5DOWHILE {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int opcao;
        do {
           System.out.println("Bem vindo ao Banco XXX");
            System.out.println(" 1 - Ver saldo");
            System.out.println(" 2 - Fazer deposito");
            System.out.println(" 3 - Sair");
            opcao = leitor.nextInt();
        }while (opcao != 3);
        System.out.println(" Obrigado(a), Volte sempre (= ");
        }
    }

