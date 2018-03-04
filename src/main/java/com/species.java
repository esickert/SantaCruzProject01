package com;


import org.junit.Test;   //?????????

import java.io.Serializable;

class Species implements Serializable{

    private String name;
    private int population;
    private double growthRate;

    public Species()    {

        name = null;
        population = 0;
        growthRate = 0;
    }
@Test
    public Species(String initialName, int initialPopulation, double initialGrowthRate) {

    name = initialName;
    if (initialPopulation >= 0)
        population = initialPopulation;
//       population = initialPopulation;
    else {
        System.out.println("ERROR-negative population");
        System.exit(0);
    }
    growthRate = initialGrowthRate;
    }

    @Override
    public String toString() {
        return ("Name = " + name + "\n" +
                "Population = " + population + "\n" +
                "Growth rate = " + growthRate + "%");
    }





}

