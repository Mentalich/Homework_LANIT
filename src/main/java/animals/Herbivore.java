package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal{
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            setSatiety(satiety+food.getEnergy());
            System.out.println(getSatiety());
        }
        else {
            System.out.println(name+" can't eat this food");
        }
    }
}
