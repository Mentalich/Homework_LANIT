import animals.Kotik;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Application {

    public static void main(String[] args) {
        //Создаем два экземпляра котиков
        Kotik Kotik1 = new Kotik();
        Kotik Kotik2 = new Kotik("Tishka", "Loud", 3, 5);
        //Выводим день из жизни дефолтного котика, через лист, чтобы красиво
        List<String> day = Arrays.asList(Kotik1.liveAnotherDay());
        day.forEach(System.out::println);
        //Выводим имя и вес котика Тишки
        System.out.println("Cat's name is " + Kotik2.getName() + ", and he weights " + Kotik2.getWeight() + " kilos");
        //Выводим сравнение голосов котиков
        switch (String.valueOf(compareVoice(Kotik1,Kotik2))){
            case "false":
                System.out.println("Cats sound different");
                break;
            case "true":
                System.out.println("Cats sound same");
                break;
        }
        //Выводим количество котиков
        System.out.println(Kotik.getCount());
    }
    //метод сравнения голоса котиков
    public static boolean compareVoice(Kotik Q, Kotik W){
        return Objects.equals(Q.getVoice(), W.getVoice());
    }
}
