package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal{
    @Override
    public void eat (Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            setSatiety(satiety+food.getEnergy());
            System.out.println(getSatiety());
        }
        else {
                throw new WrongFoodException(name+" cant eat this food");
        }
    }
}
