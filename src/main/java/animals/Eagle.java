package animals;

public class Eagle extends Carnivorous implements Fly,Voice{
    public Eagle(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }
    public Eagle(){
        setName("Eagle");
        setVoice("Screeching");
        setSatiety(4);
        setWeight(3);
        count++;
    }

    @Override
    public String getVoice() {
        return null;
    }
    @Override
    public boolean fly() {
        if (satiety<=0){
            return false;
        }
        else{
            System.out.println(getName()+" flies in the sky");
            satiety--;
            return true;}
    }
}
