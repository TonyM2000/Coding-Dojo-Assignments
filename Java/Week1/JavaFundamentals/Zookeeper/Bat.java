package Week1.JavaFundamentals.Zookeeper;

public class Bat extends Mammal {
    
    public Bat() {
        this.setEnergyLevel(300);
    }
    public void attackTown(){
        this.energyLevel -= 100;
        System.out.println("Krshshshhshs AHHHHHHHHH HELP IM ON FIRE");
    }
    public void fly(){
        this.energyLevel -= 50;
        System.out.println("Fwoosh");
    }
    public void eatHumans(){
        this.energyLevel += 25;
    }


}