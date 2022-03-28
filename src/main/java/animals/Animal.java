package animals;

import food.Food;

public abstract class Animal{
    String name = "Chimera";
    String voice;
    int satiety = 5;
    int weight = 4; //in kilos, I gueeeessss?
    static int count=0;
//Constructor
    public Animal(){
        count++;
    }
//Getters
    public String getName() {
        return name;
    }
    public int getSatiety() {
        return satiety;
    }
    public int getWeight() {
        return weight;
    }
    public static int getCount(){
        return count;
    }
//Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
//
    public abstract void eat(Food food);
}
