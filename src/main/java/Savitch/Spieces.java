package Savitch;

import java.io.Serializable;

public class Spieces implements Serializable{

    private String name;
    private int population;
    private double growthRate;

    public Spieces()    {

        name = null;
        population = 0;
        growthRate = 0;
    }

    public Spieces(String initialName, int iinitialPopulation,double initalGrowthRate)  {

    }
}
