package Eventos.Model;

import java.util.Date;

public class Inscricao {
    private int id;
    private String dataDeInscricao;
    private Participante participante;

    public Inscricao(int id, String dataDeInscricao, Participante participante)
    {
        this.id = id;
        this.dataDeInscricao = dataDeInscricao;
        this.participante = participante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataDeInscricao() {
        return dataDeInscricao;
    }

    public void setDataDeInscricao(String dataDeInscricao) {
        this.dataDeInscricao = dataDeInscricao;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }
}
