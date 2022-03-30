package animals;

import model.Size;

public class Tuna extends Carnivorous implements Swim{
    public Tuna(String name, int satiety, int weight) {
        this.name=name;
        this.satiety=satiety;
        this.weight=weight;
        count++;
    }
    public Tuna(){
        setName("Tuna");
        setSatiety(3);
        setWeight(1);
        count++;
    }
    public Tuna(String name){
        this.name = name;
        count++;
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }

    @Override
    public boolean swim() {
        if (satiety <= 0) {
            return false;
        } else {
            System.out.println(getName() + " swims in a water");
            satiety--;
            return true;
        }
    }
}
