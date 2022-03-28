package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal{
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            setSatiety(satiety+food.getEnergy());
            System.out.println(getSatiety());
        }
        else {
            System.out.println(name+" can't eat this food");
        }
    }
}
