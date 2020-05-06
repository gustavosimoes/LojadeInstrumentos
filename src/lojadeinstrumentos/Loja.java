package lojadeinstrumentos;

import java.util.ArrayList;

public class Loja {

    public ArrayList<Berimbau> berimbaus;
    public ArrayList<ViolaCaipira> violas;
    public ArrayList<Violao> violoes;
    public ArrayList<Violino> violinos;

    public Loja() {
        this.berimbaus = new ArrayList<>();
        this.violas = new ArrayList<>();
        this.violoes = new ArrayList<>();
        this.violinos = new ArrayList<>();
    }

    public void mostraInstrumentos() {

        System.out.println("Berimbaus: " + Berimbau.getNumeroInstrumentos());
        if (!berimbaus.isEmpty()) {
            for (int i = 0; i < berimbaus.size(); i++) {
                System.out.println(berimbaus.get(i).toString());
            }
        }

        System.out.println("Violas Caipiras: " + ViolaCaipira.getNumeroInstrumentos());
        if (!violas.isEmpty()) {
            for (int i = 0; i < violas.size(); i++) {
                System.out.println(violas.get(i).toString());
            }
        }

        System.out.println("Violões: " + Violao.getNumeroInstrumentos());
        if (!violoes.isEmpty()) {
            for (int i = 0; i < violoes.size(); i++) {
                System.out.println(violoes.get(i).toString());
            }
        }

        System.out.println("Violinos: " + Violino.getNumeroInstrumentos());
        if (!violinos.isEmpty()) {
            for (int i = 0; i < violinos.size(); i++) {
                System.out.println(violinos.get(i).toString());
            }
        }
    }
}
