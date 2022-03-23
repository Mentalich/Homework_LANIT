package animals;

public class Kotik {
    //I set defaults, just in case
    private String name = "Tom";
    private String voice = "Mute";
    private int satiety = 5;
    private int weight = 4; //in kilos, I gueeeessss?

    private static int count=0; //определяем счётчик

    //первый конструктор
    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }
    //второй, пустой конструктор
    public Kotik(){count++;}
    /*Геттеры, по заданию было указано вывести в консоль
    количество котиков, поэтому я добавила ещё и геттер для счётчика */
    public String getName() {
        return name;
    }
    public String getVoice() {
        return voice;
    }
    public int getSatiety() {
        return satiety;
    }
    public int getWeight() {
        return weight;
    }
    public int getCount(){
        return count;
        }
    //сеттеры
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
    //вводим константу количества методов
    private static final int METHODS = 5;
    //сами методы
    public boolean play(){
        if (satiety<=0){
            return false;
        }
        else{
            System.out.println(name+" had fun playing with a toy mouse");
            satiety--;
            return true;}
    }
    public boolean sleep(){
        if (satiety<=0){
            return false;
        }
        else{
            System.out.println(name+" slept for some time");
            satiety--;
            return true;}
    }
    public boolean wash(){
        if (satiety<=0){
            return false;
        }
        else{
            System.out.println(name+" was cleaning its fur");
            satiety--;
            return true;}
    }
    public boolean walk(){
        if (satiety<=0){
            return false;
        }
        else{
            System.out.println(name+" was running around the house");
            satiety--;
            return true;}
    }
    public boolean hunt(){
        if (satiety<=0){
            return false;
        }
        else{
            System.out.println(name+" was hunting outdoors");
            satiety--;
            return true;}
    }
    //создаём метод "еда" и его перегрузки
    public void eat(int FoodValue){
        satiety=satiety+FoodValue;
    }
    public void eat(int FoodValue,String FoodName){
        System.out.println(name+" ate "+FoodName+", restoring "+FoodValue+" satiety");
        satiety=satiety+FoodValue;
    }
    public void eat(){
        eat(4,"Canned food");
    }

    //день из жизни котика
    public String[] liveAnotherDay(){
        String[] day= new String[24];
        for (int counter=0;counter<24;counter++){
            //кейс, случайно определяющий, чем котик занимается каждый час
            switch ((int) (Math.random() * METHODS) + 1){
                case 1:
                if (play()){
                    day[counter]=counter+" - played";}
                else {
                    eat();
                    day[counter]=counter+" - ate";}
                break;
                case 2:
                    if (sleep()){
                        day[counter]=counter+" - slept";}
                    else {
                        eat();
                        day[counter]=counter+" - ate";}
                break;
                case 3:
                    if (wash()){
                        day[counter]=counter+" - washed";}
                    else {
                        eat();
                        day[counter]=counter+" - ate";}
                break;
                case 4:
                    if (walk()){
                        day[counter]=counter+" - walked";}
                    else {
                        eat();
                        day[counter]=counter+" - ate";}
                break;
                case 5:
                    if (hunt()){
                        day[counter]=counter+" - hunted";}
                    else {
                        eat();
                        day[counter]=counter+" - ate";}
                break;
                default:
                    throw new IllegalStateException("Unexpected value: " + (int) (Math.random() * METHODS) + 1);
            }
        }
        return day;//возвращает массив строк, все как в ТЗ
    }
}
