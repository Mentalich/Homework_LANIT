package animals;

import food.*;

public abstract class Carnivorous extends Animal throws WrongFoodException {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
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
