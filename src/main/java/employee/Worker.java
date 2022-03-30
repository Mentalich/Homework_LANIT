package employee;

import animals.Animal;
import animals.Voice;
import food.Food;
import food.WrongFoodException;

public class Worker extends Employee{
    public void feed(Animal Animal, Food Food) throws WrongFoodException {
        Animal.eat(Food);
    }
    public String getVoice(Voice voice){
        return voice.getVoice();
    }
}
