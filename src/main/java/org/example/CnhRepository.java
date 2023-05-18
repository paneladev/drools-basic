package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CnhRepository {
    public static List<Cnh> getCnhs() {

        Cnh cnh1 = new Cnh();
        cnh1.setNumero("CNH-50");
        cnh1.setNome("RENAN");
        cnh1.setPontos(0);
        cnh1.setDataExpiracao(LocalDate.of(2021, Month.MAY, 30));

        Cnh cnh2 = new Cnh();
        cnh2.setNumero("CNH-60");
        cnh2.setNome("JOAO");
        cnh2.setPontos(25);
        cnh2.setDataExpiracao(LocalDate.of(2025, Month.MAY, 30));

        Cnh cnh3 = new Cnh();
        cnh3.setNumero("CNH-70");
        cnh3.setNome("MARIA");
        cnh3.setPontos(10);
        cnh3.setDataExpiracao(LocalDate.of(2025, Month.MAY, 30));

        Cnh cnh4 = new Cnh();
        cnh4.setNumero("CNH-80");
        cnh4.setNome("TERESA");
        cnh4.setPontos(15);
        cnh4.setDataExpiracao(LocalDate.of(2025, Month.APRIL, 30));

        return new ArrayList<>(Arrays.asList(cnh1, cnh2, cnh3, cnh4));
    }
}