package convertertest;
import converter.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BaseConverterTest {
    @Test
    public void givenNumberShouldBeAConvertOrNot() {
        BaseConverter.main(new String[] {"--base","8","123"});
    }
    @Test
    public void theListShouldBeAGiveProductBothLists(){
        List<Integer> digitsList = Arrays.asList(3,4,5);
        List<Integer> powersList = Arrays.asList(2,5,10);
        List<Integer> expected = Arrays.asList(6,20,50);
        assertEquals(expected, GetProduct.getProduct(digitsList,powersList));
    }
    @Test
    public void theListShouldBeAGiveSumOfList(){
        List<Integer> product = Arrays.asList(6,20,50);
        assertEquals(76, SumOfList.sumOfList(product));
    }
    @Test
    public void theListShouldBeASplitTheNumbersAndGiveLIstOfNUmbers(){
        List<Integer> actual = Arrays.asList(3,2,1);
        assertEquals(actual, GetDigits.getDigits("123"));
    }
    @Test
    public void theListShouldBeGivePowersOfEight(){
        List<Integer> expected = Arrays.asList(1,8,64);
        assertEquals(expected, GetPowers.getPowers(3,8));
    }
}
