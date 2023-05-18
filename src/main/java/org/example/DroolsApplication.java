package org.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.List;

public class DroolsApplication {
    public static void main(String[] args) {
        KieContainer kieContainer = KieServices.Factory.get().getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("session");

        List<Cnh> cnhList = CnhRepository.getCnhs();

        cnhList.forEach(cnh -> kieSession.insert(cnh));

        kieSession.fireAllRules();

        System.out.println("DEPOIS DROOLS");
        cnhList.forEach(cnh -> System.out.println(cnh + " Status: " + cnh.getStatus() + " - Causa: " + cnh.getCausa()));

    }
}
