package br.com.fiap;

import java.time.LocalDate;

public class Aluno {
    private int rm;
    private String nome;
    private LocalDate dataDeNascimento;

    // Construtor vazio
    public Aluno() {}

    // Construtor com parâmetros
    public Aluno(int rm, String nome, LocalDate dataDeNascimento) {
        this.rm = rm;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    // Getter e Setter para rm
    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        if (rm >= 97001 && rm <= 551999) {
            this.rm = rm;
        } else {
            System.out.println("RM inválido. Deve estar entre 97001 e 551999.");
        }
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para dataDeNascimento
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        // Verifica se a data de nascimento é válida
        LocalDate anoAtual = LocalDate.now();
        if (dataDeNascimento.getYear() >= 1900 && dataDeNascimento.isBefore(anoAtual)) {
            this.dataDeNascimento = dataDeNascimento;
        } else {
            System.out.println("Data de nascimento inválida.");
        }
    }

    // Método para calcular a idade completa
    public String calculaIdadeCompleta(LocalDate dataAtual) {
        int anos = dataAtual.getYear() - dataDeNascimento.getYear();
        int meses = dataAtual.getMonthValue() - dataDeNascimento.getMonthValue();
        int dias = dataAtual.getDayOfMonth() - dataDeNascimento.getDayOfMonth();

        // Correção caso os meses ou dias sejam negativos
        if (meses < 0 || (meses == 0 && dias < 0)) {
            anos--;
            meses += (meses < 0) ? 12 : 0;
        }
        if (dias < 0) {
            LocalDate dataDeNascimentoCorrigida = dataDeNascimento.withDayOfMonth(dataAtual.getDayOfMonth());
            meses--;
            dias = (int) dataDeNascimentoCorrigida.until(dataAtual).getDays();
        }

        return anos + " anos, " + meses + " meses e " + dias + " dias";
    }

}