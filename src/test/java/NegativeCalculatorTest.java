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
                {"*","100000000000000000000000000","-5"},//out of bounds number
                {"/", "5","0"}//divide on zero
        };
    }

    @DataProvider(name = "nullData")
    public Object[]nullData(){
        return new Object[]{null,null,null};
    }

    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)
    public void negativeTest(String[] params){
        Calculator.execute(params);
    }

    @Test(dataProvider = "nullData", expectedExceptions = NullPointerException.class)
    public void nullTest(String[] params){
        Calculator.execute(params);
    }
}
