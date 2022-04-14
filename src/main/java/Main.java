import model.Calculator;
import model.CalculatorException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] params = readParams();
        System.out.println(Calculator.execute(params));
    }

    private static String[] readParams() {
        Scanner in = new Scanner(System.in);
        int inputToken=3;
        String[] input=new String[inputToken];
        for (int i=0;i<inputToken;i++){
            input[i]=in.next();
        }
        return input;
    }
}
