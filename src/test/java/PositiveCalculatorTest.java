import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {
    // todo: @DataProvider for positiveData
    // todo: positive test
    @DataProvider(name = "positiveData")
    public Object[][] positiveData(){
        return new Object[][]{
                {"+","2","2",4.0},
                {"+","2","3",5.0},
                {"+","5","5",10.0},
                {"-","-3","-3",0.0},
                {"+","-3","-3",-6.0},
                {"/","-3","-3",1.0},
                {"*","-4","-5",20.0},
                {"/", "25","4", 6.25},
                {"/", "25","-4",-6.25},
                {"*", "25","0.2",5.0},
                {"-", "2.0","1.1", 0.9},
                {"+", Integer.MAX_VALUE,"0", Double.valueOf(Integer.MAX_VALUE)},
                {"+", Integer.MIN_VALUE,"0", Double.valueOf(Integer.MIN_VALUE)}
                
        };
    }
    @Test(dataProvider = "positiveData")
    public void positiveTest(String param, String value1, String value2, double result){
        String[] input = {param, value1, value2};
        Assert.assertEquals(Calculator.execute(input),String.valueOf(result));
    }
}
