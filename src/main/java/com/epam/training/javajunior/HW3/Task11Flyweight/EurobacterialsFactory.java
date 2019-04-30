package com.epam.training.javajunior.HW3.Task11Flyweight;

import java.util.HashMap;
import java.util.Map;

public class EurobacterialsFactory {
    private Map<String, Bacteria> bacterias = new HashMap<>();

    public EurobacterialsFactory() {
        bacterias.put("Bacillus", new Bacillus("Bacillus", 0.1));
        bacterias.put("Clostridium", new Clostridium("Clostridium", 0.2));
        bacterias.put("Desulfotomaculum", new Desulfotomaculum("Desulfotomaculum", 0.3));
    }

    public Bacteria createBacteris(BacteriaType type) {
        switch (type) {
            case Bacillus:
                return this.bacterias.get(BacteriaType.Bacillus.toString());
            case Clostridium:
                return this.bacterias.get(BacteriaType.Clostridium.toString());
            case Desulfotomaculum:
                return this.bacterias.get(BacteriaType.Desulfotomaculum.toString());
        }
        return this.bacterias.get(BacteriaType.Bacillus.toString());
    }
}
