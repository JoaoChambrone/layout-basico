package br.com.fiap;

import java.time.LocalDate;
import java.util.Scanner;

public class UsaAluno {
    public static void main(String[] args) {
        // Obtendo a data atual
        LocalDate dataAtual = LocalDate.now();

        // Instanciando quatro objetos da classe Aluno
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3, aluno4;

        // Definindo valores para os atributos de cada objeto
        aluno1.setRm(123456);
        aluno1.setNome("João");
        aluno1.setDataDeNascimento(LocalDate.of(1990, 5, 15));

        aluno2.setRm(789012);
        aluno2.setNome("Maria");
        aluno2.setDataDeNascimento(LocalDate.of(1995, 10, 25));

        Scanner scanner = new Scanner(System.in);

        // Para os outros dois alunos, solicitamos entrada do usuário
        aluno3 = new Aluno();
        System.out.print("Digite o RM do aluno 3: ");
        int rmAluno3 = scanner.nextInt();
        aluno3.setRm(rmAluno3);
        scanner.nextLine(); // Consumindo a quebra de linha após o próximoInt
        System.out.print("Digite o nome do aluno 3: ");
        String nomeAluno3 = scanner.nextLine();
        aluno3.setNome(nomeAluno3);
        System.out.print("Digite a data de nascimento do aluno 3 (AAAA-MM-DD): ");
        LocalDate dataNascimentoAluno3 = parseData(scanner.nextLine());
        aluno3.setDataDeNascimento(dataNascimentoAluno3);

        aluno4 = new Aluno();
        System.out.print("Digite o RM do aluno 4: ");
        int rmAluno4 = scanner.nextInt();
        aluno4.setRm(rmAluno4);
        scanner.nextLine(); // Consumindo a quebra de linha após o próximoInt
        System.out.print("Digite o nome do aluno 4: ");
        String nomeAluno4 = scanner.nextLine();
        aluno4.setNome(nomeAluno4);
        System.out.print("Digite a data de nascimento do aluno 4 (AAAA-MM-DD): ");
        LocalDate dataNascimentoAluno4 = parseData(scanner.nextLine());
        aluno4.setDataDeNascimento(dataNascimentoAluno4);

        scanner.close();

        // Exibindo os detalhes de cada aluno
        System.out.println("\nDetalhes dos alunos:");

        exibirDetalhes(aluno1, dataAtual);
        exibirDetalhes(aluno2, dataAtual);
        exibirDetalhes(aluno3, dataAtual);
        exibirDetalhes(aluno4, dataAtual);
    }

    // Método auxiliar para exibir os detalhes de um aluno
    private static void exibirDetalhes(Aluno aluno, LocalDate dataAtual) {
        System.out.println("RM: " + aluno.getRm());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.calculaIdadeCompleta(dataAtual));
        System.out.println();
    }

    // Método auxiliar para analisar a data no formato AAAA-MM-DD
    private static LocalDate parseData(String data) {
        String[] partes = data.split("/");
        return LocalDate.of(Integer.parseInt(partes[0]), Integer.parseInt(partes[1]), Integer.parseInt(partes[2]));
    }
}
