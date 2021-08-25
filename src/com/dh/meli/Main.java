package com.dh.meli;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Roupa> roupasNobre = new ArrayList<>();
        List<Roupa> roupasPedro = new ArrayList<>();

        roupasNobre.add(new Roupa("Nike", "Calção"));
        roupasNobre.add(new Roupa("Nike", "camiseta"));

        roupasPedro.add(new Roupa("umbro", "jaqueta"));
        roupasPedro.add(new Roupa("umbro", "calça"));

        GuardaRoupa guardaRoupa = new GuardaRoupa();

        guardaRoupa.guardarRoupas(roupasNobre);
        guardaRoupa.guardarRoupas(roupasPedro);

        guardaRoupa.mostrarRoupas();

        guardaRoupa.devolverRoupas(1);

        System.out.println("****************Depois de Remover***************");

        guardaRoupa.mostrarRoupas();




    }
}
