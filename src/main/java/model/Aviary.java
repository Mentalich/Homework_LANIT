package model;

import animals.Animal;
import animals.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class Aviary<Animals>{
    private Size size;
    private Map<String, Animal> Aviary = new HashMap<>(6);
    private Animal animal;

    public Aviary(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void addAnimal(Animal animal){
        if (animal.getSize()==size){Aviary.put(animal.getName(), animal);}
        else throw new WrongSizeException("Animal is wrongly sized");
    }
    public Animal getAnimal(String name){
        return Aviary.get(name);
    }
    public void removeAnimal(String name){
        Aviary.remove(name);
    }




}
