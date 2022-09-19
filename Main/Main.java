package Main;

import Modelos .*;

public class Main {
    public static void main(String[] args) {

        Ambiente ambiente = new Ambiente(3);


        Baleia baleia1 = new Baleia("Tanque","Fizz","Baleia Branco","Macho",3);
        Coruja coruja1 = new Coruja("Aviario","Vadrios","Coruja","Macho",2);
        Lobo lobo1 = new Lobo("Jaula","Fenrir","Lobo ","Macho",12,"Mediano");

        ambiente.setListaAnimais(0,"jaula",lobo1);
        ambiente.setListaAnimais(1,"Tanque",baleia1);
        ambiente.setListaAnimais(2,"Aviario",coruja1);

        Zoologico meuZoologico = new Zoologico("Zoologico de Arkan",ambiente);

        System.out.println("\n" + meuZoologico.getAmbiente());
    }


}