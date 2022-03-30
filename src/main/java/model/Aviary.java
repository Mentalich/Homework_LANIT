package model;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary<>{
    Size size;
    private Map<String, Animal> Aviary = new HashMap<>(6);

    public Aviary(Size size) {
        this.size = size;
    }

    public void addAnimal(Animal animal){
        if (animal.getSize()==size){Aviary.put(animal.getName(), animal);}
        else throw new WrongSizeException("Animal is wrongly sized");
    }
    public void getAnimal(String name){
        Aviary.get(name);
    }
    public void removeAnimal(String name){
        Aviary.remove(name);
    }




}
