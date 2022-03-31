import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {
    // todo: @DataProvider for negativeData
    // todo: negative test
    @DataProvider(name = "NegativeDataProvider")
    public Object[][] NegativeDataProvider(){
        return new Object[][]{
                {"_","-4","-5","20.0"},
                {"*","100000000000000000000000000","-5","20.0"}
        };
    }
    @Test(dataProvider = "NegativeDataProvider")
    public void executeNegTest(String[] params){
        Assert.assertEquals(Calculator.execute(params), new CalculatorException());
    }

}
