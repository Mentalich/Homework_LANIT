package animals;

import food.*;

public abstract class Carnivorous extends Animal{
    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            setSatiety(satiety+food.getEnergy());
            System.out.println(getSatiety());
        }
        else {
            throw new WrongFoodException(name+" cant eat this food");
        }
    }
}
