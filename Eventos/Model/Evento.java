package Eventos.Model;

import java.util.ArrayList;
import java.util.Date;

public class Evento
{
    private String nomeDoEvento;
    private String descricao;
    private String horaDoInicio;
    private String horaDoFim;
    private int id;
    private ArrayList<Sessao> sessao = new ArrayList<>();


    public Evento(String nomeDoEvento, String descricao, String dataInicio, String dataFim, int id)
    {
        this.nomeDoEvento = nomeDoEvento;
        this.descricao = descricao;
        this.horaDoInicio = dataInicio;
        this.horaDoFim = dataFim;
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
        return horaDoInicio;
    }

    public void setDataDoInicio(String dataDoInicio) {
        this.horaDoInicio = dataDoInicio;
    }

    public String getDataDoFim() {
        return horaDoFim;
    }

    public void setDataDoFim(String dataDoFim) {
        this.horaDoFim = dataDoFim;
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
    {   String texto = "---------------------------\n" + this.id + " - " + this.nomeDoEvento + " - (" + this.horaDoInicio + " - " + this.horaDoFim + ")\nDescrição: " + this.descricao + "\n\n";
        for (int i = 0; i < sessao.size(); i++)
        {
            texto += "Sessão número: "+ (i+1) + "\n" + sessao.get(i).toString() + "\n";
        }
        return texto;
    }
}
