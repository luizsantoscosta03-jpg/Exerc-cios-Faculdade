public class ExercicioFixacao {

    String nome;
    int idade;

    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {

        ExercicioFixacao pessoa = new ExercicioFixacao();

        pessoa.nome = "João";
        pessoa.idade = 20;

        pessoa.apresentar();

        cars carro = new cars();

        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.ano = 2022;

        carro.exibirDados();

        Livro livro = new Livro();

        livro.titulo = "O Senhor dos Anéis";
        livro.autor = "J.R.R. Tolkien";

        livro.mostrarLivro();

        Aluno aluno = new Aluno();

        aluno.nome = "Maria";
        aluno.nota1 = 8;
        aluno.nota2 = 6;

        aluno.calcularMedia();
    }
}
class cars {
    String marca;
    String modelo;
    int ano;
    void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

}
class  Livro {

String titulo;
String autor;

void mostrarLivro() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
}
}
class Aluno {

    String nome;
    double nota1;
    double nota2;

    void calcularMedia() {
        double media = (nota1 + nota2) / 2;
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
    }
}