package br.edu.unisep.eventos.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Participante {
    private int id;
    private Date dataDeNascimento;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    public Participante(int id, Date dataDeNascimento, String nome, String email, String telefone, String cpf)
    {
        this.id = id;
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataDeNascimento() {
        SimpleDateFormat dataSimple = new SimpleDateFormat("dd/MM/yyyy");
        return dataSimple.format(this.dataDeNascimento);
    }

    public void setDataDeNascimento(Date dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}


