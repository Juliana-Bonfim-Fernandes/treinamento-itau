package br.com.letscode.turmaitau.ordemalfabetica;

import java.util.ArrayList;
import java.util.List;

public class OrdemAlfabeticaMain {

    public static void main(String[] args) {

        List<String> listaPalavras = new ArrayList<String>();

        listaPalavras.add("acbda");
        listaPalavras.add("fasdlkh");
        listaPalavras.add("poiwqd");
        listaPalavras.add("zxcqwtop");
        listaPalavras.add("qfgophl");

        List<String> listaCadeiaAlfabetica = new ArrayList<String>();

        Solucao ordena = new Solucao();

        for (int i = 0; i < listaPalavras.size(); i++) {
            listaCadeiaAlfabetica.add(ordena.encontraCadeia(listaPalavras.get(i)));
        }

        int indexMaiorSubString = listaCadeiaAlfabetica.get(0).length();
        for (int j = 1; j < listaCadeiaAlfabetica.size(); j++) {
            if (listaCadeiaAlfabetica.get(j).length() > indexMaiorSubString) {
                indexMaiorSubString = j;
            }
        }

        System.out.println(listaCadeiaAlfabetica.get(indexMaiorSubString));

    }
}
