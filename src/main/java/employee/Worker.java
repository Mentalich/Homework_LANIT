package employee;

import animals.Animal;
import animals.Voice;
import food.Food;
import food.WrongFoodException;

public class Worker extends Employee{
    public void feed(Animal Animal, Food Food){
        try {
            Animal.eat(Food);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }
    public String getVoice(Voice voice){
        return voice.getVoice();
    }
}