package Week1.JavaFundamentals.Zookeeper;

public class Gorilla extends Mammal {
    
    public void throwSomething(){
        this.energyLevel -= 5;
        System.out.println("The gorilla threw something");
    }

    public void eatBanana(){
        this.energyLevel += 10;
        System.out.println("The gorilla ate a banana");
    }

    public void climb(){
        this.energyLevel -= 10;
        System.out.println("The gorilla climbed!");
    }
}

