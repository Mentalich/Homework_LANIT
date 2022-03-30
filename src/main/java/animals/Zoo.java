import animals.*;
import employee.Worker;
import food.Meat;
import food.Grass;
import model.Aviary;
import model.Size;

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

        /*Walker.getVoice(kotik);
        //Walker.getVoice(fish); //работает как надо
        Walker.feed(kotik, meat);
        Walker.feed(kotik, grass);
        Walker.feed(deer, meat);
        Walker.feed(deer, grass);*///Second homework, employee check
        /*Swim[] pond=createPond();
        for (int i = 0; i < 6; i++) {
            pond[i].swim();
        }*///second homework, createPond check and output

        Aviary carnivorousAviary = new Aviary(Size.SMALL);
        Aviary herbivoreAviary = new Aviary(Size.MEDIUM);
        fillCarnivorousAviary(carnivorousAviary);
        private static Carnivorous getCarnivorous(String name){
            carnivorousAviary.getAnimal(name);
        }
        getCarnivorous("Tuna");
    }

    private static Carnivorous getCarnivorous(String name) {
        return null;
    }

    /*private static Swim[] createPond() {
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
    }*///second homework,createPond method

    private static void fillCarnivorousAviary(Aviary aviary) {
        for (int i=0;i<6;i++){
            switch ((int)(Math.random()*3)){
                case 0:
                    aviary.addAnimal(new Tuna());
                    break;
                case 1:
                    aviary.addAnimal(new Kotik());
                    break;
                case 2:
                    aviary.addAnimal(new Eagle());
                    break;
            }
        }
    }
    private static void fillHerbivoreAviary(Aviary aviary){for (int i=0;i<6;i++){
        switch ((int)(Math.random()*3)){
            case 0:
                aviary.addAnimal(new Fish());
                break;
            case 1:
                aviary.addAnimal(new Duck());
                break;
            case 2:
                aviary.addAnimal(new Deer());
                break;
        }
    }}

    private static Herbivore getHerbivore(String name){
        return null;
    }


}
