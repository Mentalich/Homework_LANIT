import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {
    // todo: @DataProvider for negativeData
    // todo: negative test
    @DataProvider(name = "negativeData")
    public Object[][] negativeData(){
        return new Object[][]{
                {"_","-4","-5"},//out of bounds symbol
                {"*","10000000","-50000"},//out of bounds number
                {"*","25000000","20000"},
                {"*","250000000000000000000000000","20000"},
                {"/", "5","0"},//divide on zero
                {"+","one","two"},
                {"","",""}
        };
    }
    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)
    public void negativeTest(String q, String w, String e){
        String[] params = {q,w,e};
        Calculator.execute(params);
    }
}
