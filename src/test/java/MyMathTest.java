import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyMathTest {

    @DataProvider
    public Object[][] positiveTest() {
        return new Object[][]{
                //addition
                {19.0, -23.5, 1, -4.5},
                //subtraction
                {999.0, -957.5, 2, 1956.5},
                //multiplication
                {3.0, -1.5, 3, -4.5},
                //division
                {30.0, -7.5, 4, -4.0},
                //Wrong option
                {42.0, 42.0, 42, "There is no such option"}
        };
    }

    @Test(dataProvider = "positiveTest")
    public void myMathPositiveTest(Object one, Object two, int operation, Object result) {
        Assert.assertEquals(result, Calculator.makeCalc(one, two, operation), "Results are not equal!!!");
    }

    @DataProvider
    public Object[][] negativeTest() {
        return new Object[][]{
                //addition
                {-19.0, 23.99, 1, -42.0},
                //subtraction
                {100.0, 58.0, 2, Double.MAX_VALUE},
                //multiplication
                {Math.PI, 2.71, 3, 8.5094},
                //division
                {4.0, 0.1, 4, 2.0},
                //Wrong option
                {42.0, 42.0, 4, 42.0}
        };
    }

    @Test(dataProvider = "negativeTest")
    public void myMathNegativeTest(Object one, Object two, int operation, Object result) {
        Assert.assertNotEquals(result, Calculator.makeCalc(one, two, operation), "Results are equal!!!");
    }
}