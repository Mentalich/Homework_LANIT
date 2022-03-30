package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary<Type extends Animal>{
    private Size size;
    private HashMap<String, Type> aviaryMap = new HashMap<>(6);

    public Aviary(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void addAnimal(Type animal){
        if (animal.getSize()==size){
            aviaryMap.put(animal.getName(), animal);}
        else throw new WrongSizeException("Animal is wrongly sized");
    }
    public Type getAnimal(String name){
        return aviaryMap.get(name);
    }
    public boolean removeAnimal(String name){
        aviaryMap.remove(name);
        return true;
    }




}
