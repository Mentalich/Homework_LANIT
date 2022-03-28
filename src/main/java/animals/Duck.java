package animals;

public class Duck extends Herbivore implements Run, Swim, Fly, Voice{
    //construct
    public Duck(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }
    public Duck(){
        setName("Duck");
        setVoice("quack");
        setSatiety(4);
        setWeight(2);
        count++;
    }

    @Override
    public String getVoice() {
        return voice;
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
    @Override
    public boolean swim() {
        if (satiety<=0){
            return false;
        }
        else{
            System.out.println(name+" swims in a lake");
            satiety--;
            return true;}
    }

    @Override
    public boolean run() {
        if (satiety<=0){
            return false;
        }
        else{
            System.out.println(name+" runs around the shore");
            satiety--;
            return true;}
    }
}
