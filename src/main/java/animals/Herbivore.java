package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal{
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            setSatiety(satiety+food.getEnergy());
            System.out.println(getSatiety());
        }
        else {
            try {
                throw new WrongFoodException(name+" cant eat this food");
            } catch (WrongFoodException e) {
                e.printStackTrace();
            }
        }
    }
}
