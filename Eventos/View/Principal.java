package Eventos.View;
import Eventos.Model.*;

import javax.swing.*;
import java.util.ArrayList;


public class Principal {
    private static ArrayList<Evento> eventos = new ArrayList<>();
    public static void main(String [] args)
    {
        Evento evento1 = new Evento("Programação 101","Um evento de programação","19:00","22:30",1);
        Evento evento2 = new Evento("Programação 404","Um evento de programação","19:00","22:30",2);

        Participante lucas = new Participante(1,"05/07/2004","Lucas","l@gmail.com","46999329498","12740874901");
        Participante Novaes = new Participante(2,"05/07/2004","Novaes","novaes@gmail.com","46999329498","12740874901");
        Participante Dias = new Participante(3,"05/07/2004","Dias","dias@gmail.com","46999329498","12740874901");

        Inscricao lucasInscricao = new Inscricao(1,"11/09/2024",lucas);
        Inscricao novaesInscricao = new Inscricao(2,"11/09/2024",Novaes);
        Inscricao diasInscricao = new Inscricao(3,"11/09/2024",Dias);

        Palestrante ariel = new Palestrante(1,"01/01/1980","Ariel","Ariel@gmail.com","4699900000","POO","00000000000");

        Sessao sessao1 = new Sessao(1,"19:00",210,ariel);
        sessao1.setInscricao(lucasInscricao);
        sessao1.setInscricao(novaesInscricao);
        sessao1.setInscricao(diasInscricao);

        evento1.setSessao(sessao1);
        evento2.setSessao(sessao1);

        eventos.add(evento1);
        eventos.add(evento2);

        //Concatena tudo em uma só mensagem!
        String completo = "";

        for (int i = 0; i < eventos.size(); i++)
        {
            completo += eventos.get(i).toString();
        }
        JOptionPane.showMessageDialog(null,completo);
    }
}
