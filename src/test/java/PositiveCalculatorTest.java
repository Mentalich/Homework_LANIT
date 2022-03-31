import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {
    // todo: @DataProvider for positiveData
    // todo: positive test
    @DataProvider(name = "DataInput")
    public Object[][]DataProviderInput(){
        return new Object[][]{
                {"+","2","2","4.0"},
                {"+","2","3","5.0"},
                {"+","5","5","10.0"},
                {"-","-3","-3","0.0"},
                {"+","-3","-3","-6.0"},
                {"/","-3","-3","1.0"},
                {"*","-4","-5","20.0"},
        };
    }
    @Test(dataProvider = "DataInput")
    public void executeNegTest(String[] params){
        String Result = params[3];
        Assert.assertEquals(Calculator.execute(params),Result);
    }
}
