package animals;

interface Animal    {
    static final int LEGS = 12;

    void eat();
    void travel();
    String pee();
    int numOfLegs();
}