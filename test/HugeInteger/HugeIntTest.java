package HugeInteger;

import HugeInteger.Exceptions.InvalidDigit;
import HugeInteger.Exceptions.InvalidLength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntTest {
    private HugeInt huge;

    @BeforeEach
    void setUp() {
        huge = new HugeInt();
    }
    @Test
    void testThatHugeIntCanHold40Elements() {
        String freshElement = "2417890745362543213425637890498476534243";
        assertTrue(huge.validateArrayMustNotExceed40Digits(freshElement));
        String freshElement2 = "24178907453625432134";
        assertTrue(huge.validateArrayMustNotExceed40Digits(freshElement2));
        String freshElement3 = "24178";
        assertTrue(huge.validateArrayMustNotExceed40Digits(freshElement3));
    }

    @Test
    void testThatAnArrayOf40DigitsCanBeChangedBackToString(){
        int[] newArr = {2, 4, 1, 7, 8, 9, 0, 7, 4, 5, 3, 6, 2, 5, 4, 3, 2, 1, 3, 4, 2, 5, 6, 3, 7, 8, 9, 0, 4, 9, 8, 4, 7, 6, 5, 3, 4, 2, 4, 3};
        String freshElement = "2417890745362543213425637890498476534243";
        String result = huge.toString(newArr);
        assertEquals(freshElement, result);
    }

    @Test
    void testThatAnArrayOf40DigitsCanBeChangedBackToString2(){
        int[] newArr = {2, 4, 1, 7, 8, 9, 0, 7, 4, 5, 3, 6, 2, 5, 4, 3, 2, 1, 3, 4, 2, 5, 6, 3, 7, 8, 9, 0, 4, 9, 8, 4, 7, 6, 5, 3, 4, 2, 4, 3};
        String freshElement = "2417890745362543213425637890498476534243";
        String result = huge.anotherStr(newArr);
        assertEquals(freshElement, result);
    }
    @Test
    void testThatErrorMessageWillBeThrownWhenElementsIsGreaterOrLessThan40(){
        String freshElement = "241789074536254321342563789049847653424365755841";
        assertThrows(InvalidLength.class, () -> huge.validateArrayMustNotExceed40Digits(freshElement));
    }
    @Test
    void testThatErrorMessageWillBeThrownWhenElementsContainStrings(){
        String freshElement = "2417890745362543213425637890498476kk4243";
        assertThrows(InvalidDigit.class, () -> huge.validateElementDoesNotContainString(freshElement));
        String secondElement = "241789074536254321JAMES37890498476114243";
        assertThrows(InvalidDigit.class, () -> huge.validateElementDoesNotContainString(secondElement));
    }

    @Test
    void parseStringToIntArray(){
        testThatHugeIntCanHold40Elements();
        String freshElement = "2417890745362543213425637890498476534243";
        int[] hugeInt = huge.parse(freshElement);
        for(int i = 0; i < freshElement.length(); i++){
            assertEquals(hugeInt[i], huge.getElement()[i]);
        }
    }

    @Test
    void testThatWeCanAddTwoHugeIntElement(){
       String firstTest = "6937";
       String secondTest = "668788";
       HugeInt huge1 = new HugeInt(firstTest);
       HugeInt huge2 = new HugeInt(secondTest);
       HugeInt result = huge1.add(huge2);
       huge1.add(huge2);
       int[] newArr = {13, 6, 2, 4, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
       assertEquals(Arrays.toString(newArr), Arrays.toString(result.getElement()));
    }

    @Test
    void testThatWeCanSubtractTwoHugeIntElement(){
        String firstString = "6937";
        String secondString = "7687";
        HugeInt huge1 = new HugeInt(firstString);
        HugeInt huge2 = new HugeInt(secondString);
        HugeInt result = huge1.subtract(huge2);
        int[] check = result.getElement();
        int[] newArr = {-1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals(Arrays.toString(newArr), Arrays.toString(check));
    }
    

}