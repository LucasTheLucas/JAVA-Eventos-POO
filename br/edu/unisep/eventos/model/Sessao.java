package br.edu.unisep.eventos.model;

import java.util.ArrayList;

public class Sessao {
    private int id;
    private String hora;
    private int duracao;
    private Palestrante palestrante;
    private ArrayList<Inscricao> inscricao = new ArrayList<>();

    public Sessao(int id, String hora, int Duracao, Palestrante palestrante)
    {
        this.id = id;
        this.hora = hora;
        this.duracao = Duracao;
        this.palestrante = palestrante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    public Inscricao getInscricao(int Id) {
        return inscricao.get(Id);
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao.add(inscricao);
    }

    @Override
    public String toString()
    {
        String nomes = "";
        for (int i = 0; i < inscricao.size(); i++) {
            nomes += inscricao.get(i).getId()+ " - " + inscricao.get(i).getParticipante().getNome()+" - "+ inscricao.get(i).getParticipante().getDataDeNascimento() +"\n";
        }
        return this.id+ " - Palestra com: " + this.palestrante.getNome() + "\nInscritos:\n" + nomes;
    }
}
