import animals.Kotik;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        //Создаем два экземпляра котиков
        Kotik Tom = new Kotik();
        Kotik Tishka = new Kotik("Tishka", "Loud", 3, 5);
        //Выводим день из жизни дефолтного котика, через лист, чтобы красиво
        List<String> day = Arrays.asList(Tom.liveAnotherDay());
        day.forEach(System.out::println);
        //Выводим имя и вес котика Тишки
        System.out.println("Cat's name is " + Tishka.getName() + ", and he weights " + Tishka.getWeight() + " kilos");
        //Выводим сравнение голосов котиков
        System.out.println(compareVoice(Tom,Tishka));
        //Выводим количество котиков
        System.out.println(Tishka.getCount());
    }
    //метод сравнения голоса котиков
    public static boolean compareVoice(Kotik Q, Kotik W){
        return Q.getVoice()==W.getVoice();
    }
}
