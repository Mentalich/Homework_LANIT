import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {
    // todo: @DataProvider for negativeData
    // todo: negative test
    @DataProvider(name = "negativeTest")
    public Object[][] negativeData(){
        return new Object[][]{
                {"_","-4","-5"},
                {"*","100000000000000000000000000","-5"},
                {"+","1","1"},
                {null, null, null}

        };
    }
    @Test(dataProvider = "negativeData")
    public void negativeTest(String[] params){
        Assert.assertEquals(Calculator.execute(params), new CalculatorException());
    }

}
