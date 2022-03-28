import animals.*;
import employee.Worker;
import food.Meat;
import food.Grass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.DoubleToIntFunction;

public class Zoo {
    public static void main(String[] args) {
        Kotik kotik = new Kotik();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Eagle eagle = new Eagle();
        Deer deer = new Deer();
        Worker Walker = new Worker();

        Meat meat = new Meat();
        Grass grass = new Grass();

        Walker.getVoice(kotik);
        //Walker.getVoice(fish); //работает как надо
        Walker.feed(kotik, meat);
        Walker.feed(kotik, grass);
        Walker.feed(deer, meat);
        Walker.feed(deer, grass);
        Swim[] pond=createPond();
        for (int i = 0; i < 6; i++) {
            pond[i].swim();
        }

    }

    public static Swim[] createPond() {
        Swim[] pond = new Swim[6];
        Random random=new Random();
        for (int counter=0;counter<6;counter++){
            switch ((int) (Math.random() * 2)){
                case 0:
                    pond[counter] = new Fish();
                    break;
                case 1:
                    pond[counter] = new Tuna();
                    break;
            }
        }
        return pond;
    }
}
