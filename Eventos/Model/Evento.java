package Eventos.Model;

import java.util.ArrayList;
import java.util.Date;

public class Evento
{
    private String nomeDoEvento;
    private String descricao;
    private String dataDoInicio;
    private String dataDoFim;
    private int id;
    private ArrayList<Sessao> sessao = new ArrayList<>();


    public Evento(String nomeDoEvento, String descricao, String dataInicio, String dataFim, int id)
    {
        this.nomeDoEvento = nomeDoEvento;
        this.descricao = descricao;
        this.dataDoInicio = dataInicio;
        this.dataDoFim = dataFim;
        this.id = id;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataDoInicio() {
        return dataDoInicio;
    }

    public void setDataDoInicio(String dataDoInicio) {
        this.dataDoInicio = dataDoInicio;
    }

    public String getDataDoFim() {
        return dataDoFim;
    }

    public void setDataDoFim(String dataDoFim) {
        this.dataDoFim = dataDoFim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSessao(Sessao sessao)
    {
        this.sessao.add(sessao);
    }

    @Override
    public String toString()
    {
        return this.id + " - " + this.nomeDoEvento + " - (" + this.dataDoInicio + " - " + this.dataDoFim + ")\nDescrição: " + this.descricao + "\n" + sessao.toString();
    }
}
