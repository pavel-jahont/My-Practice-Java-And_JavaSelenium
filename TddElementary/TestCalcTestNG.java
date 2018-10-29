package TddElementary;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCalcTestNG {

    @DataProvider
    public Object[][] testGetSum(){
        return new Object[][]
                {{1, 2, 3},
                 {3, 6, 9},
                 {10, 15, 25}};
    }

    @DataProvider
    public Object[][] testSubtraction(){
        return new Object[][]
                {{1, 2, -1},
                 {3, 6, -3},
                 {10, 15, -5}};
    }

    @Test(dataProvider = "testGetSum")
    public void getSum(int a, int b, int c){
        Calc calc = new Calc();
        int res = calc.Addition(a, b);
        Assert.assertEquals(c, res);
    }

    @Test(dataProvider = "testSubtraction")
    public void Subtraction(int a, int b, int c){
        Calc calc = new Calc();
        int res = calc.Subtraction(a, b);
        Assert.assertEquals(c, res);
    }
}
