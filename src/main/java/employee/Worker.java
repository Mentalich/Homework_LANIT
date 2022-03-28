package employee;

import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker extends Employee{
    public void feed(Animal Animal, Food Food){
        Animal.eat(Food);
    }
    public String getVoice(Voice voice){
        return voice.getVoice();
    }
}
