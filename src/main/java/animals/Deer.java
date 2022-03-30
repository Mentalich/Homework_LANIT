package animals;

import model.Size;

public class Deer extends Herbivore implements Run, Voice{
    public Deer(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }
    public Deer(){
        setName("Bambi");
        setVoice("singing disney songs");
        setSatiety(6);
        setWeight(20);
        count++;
    }

    @Override
    public Size getSize() {
        return Size.LARGE;
    }

    @Override
    public String getVoice() {
        return null;
    }

    @Override
    public boolean run(){
        if (satiety<=0){
            return false;
        }
        else{
            System.out.println(name+" was chilling");
            satiety--;
            return true;}
    }

}
