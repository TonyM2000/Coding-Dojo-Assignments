package Week1.JavaFundamentals.Zookeeper;

public class Mammal {
    protected int energyLevel = 100;

    public int displayEnergyLevel() {
        System.out.println(this.energyLevel);
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    

}
