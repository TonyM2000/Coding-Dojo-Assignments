package Week1.JavaFundamentals.Zookeeper;
class Test {

    public static void main(String[] args) {
        Gorilla g = new Gorilla();
        g.throwSomething();
        g.throwSomething();
        g.throwSomething();
        g.eatBanana();
        g.eatBanana();
        g.climb();
        Bat b = new Bat();
        b.attackTown();
        b.attackTown();
        b.attackTown();
        b.eatHumans();
        b.eatHumans();
        b.fly();
        b.fly();

        g.displayEnergyLevel();
        b.displayEnergyLevel();
    }

}