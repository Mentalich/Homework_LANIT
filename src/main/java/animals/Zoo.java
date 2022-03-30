import animals.*;
import employee.Worker;
import food.Meat;
import food.Grass;
import model.Aviary;
import model.Size;

import java.util.Random;

public class Zoo {
    private static Aviary<Carnivorous> carnivorousAviary = new Aviary(Size.SMALL);
    private static Aviary<Herbivore> herbivoreAviary = new Aviary(Size.MEDIUM);
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

        fillCarnivorousAviary(carnivorousAviary);
        fillHerbivoreAviary(herbivoreAviary);
        //getHerbivore("Tuna");
        //getCarnivorous("Kotik");
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
        switch (aviary.getSize()){
            case SMALL:
                for (int i=0;i<6;i++){aviary.addAnimal(new Kotik(getRandomName()));}
                break;
            case MEDIUM:
                for (int i=0;i<6;i++){aviary.addAnimal(new Tuna(getRandomName()));}
                break;
            case LARGE:
                for (int i=0;i<6;i++){aviary.addAnimal(new Deer(getRandomName()));}
                break;
        }
    }
    private static void fillHerbivoreAviary(Aviary aviary){
        switch (aviary.getSize()){
            case SMALL:
                for (int i=0;i<6;i++){aviary.addAnimal(new Duck(getRandomName()));}
                break;
            case MEDIUM:
                for (int i=0;i<6;i++){aviary.addAnimal(new Fish(getRandomName()));}
                break;
            case LARGE:
                for (int i=0;i<6;i++){aviary.addAnimal(new Deer(getRandomName()));}
                break;
        }
    }
    private static Herbivore getHerbivore(String name){
        return herbivoreAviary.getAnimal(name);
    }
    private static Carnivorous getCarnivorous(String name){
        return carnivorousAviary.getAnimal(name);
    }
    private static String getRandomName(){
        Random random=new Random();
        return String.valueOf(random.nextInt(50));
    }
}
