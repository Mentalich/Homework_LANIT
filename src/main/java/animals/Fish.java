package animals;

import model.Size;

public class Fish extends Herbivore implements Swim {
    public Fish(String name, int satiety, int weight) {
        this.name=name;
        this.satiety=satiety;
        this.weight=weight;
        count++;
    }
    public Fish(){
        setName("Koi");
        setSatiety(3);
        setWeight(1);
        count++;
    }
    public Fish(String name){
        this.name = name;
        count++;
    }

    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }

    @Override
    public boolean swim() {
        if (satiety <= 0) {
            return false;
        } else {
            System.out.println(getName() + " swims in a pond");
            satiety--;
            return true;
        }
    }
}
