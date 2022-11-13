package HugeInteger;

import HugeInteger.Exceptions.InvalidDigit;
import HugeInteger.Exceptions.InvalidLength;

import java.util.Arrays;

public class HugeInt {
    private final int[] element = new int[40];

    public HugeInt(){}
    public HugeInt(String element){
        validateArrayMustNotExceed40Digits(element);
        validateElementDoesNotContainString(element);
        parse(element);
    }

    public String anotherStr(int[] arr){
        String value = "";
        for(int i = 0; i < arr.length; i++){
            value += arr[i];
        }
        return value;
    }

    public String toString(int[] arr){
        StringBuilder result= new StringBuilder();
        for (int j : arr) {
            result.append(j);
        }
        return result.toString();
    }

    public HugeInt subtract(HugeInt hugeInt){
        int diff;
        int carry;
        int[] firstHugeInt = this.getElement();
        int[] secondHugeInt = hugeInt.getElement();
        HugeInt thirdInt = new HugeInt();
        int[] hugeResult = thirdInt.getElement();
        int newLength = element.length - 1;
        for(int i = newLength; i >= 0; i--){
            if(i == 0){
                diff = firstHugeInt[i] - secondHugeInt[i];
                hugeResult[i] = diff;
            }
            else if(firstHugeInt[i] >= secondHugeInt[i]){
                diff = firstHugeInt[i] - secondHugeInt[i];
                hugeResult[i] = diff;
            }
            else{
                    carry = firstHugeInt[i] + 10;
                    diff = carry - secondHugeInt[i];
                    hugeResult[i] = diff;
                    firstHugeInt[i - 1] -= 1;
                }
            }
        return thirdInt;
    }

    public HugeInt add(HugeInt hugeInt){
        int sum;
        int carry = 0;
        int remainder;
        int[] firstHugeInt = this.getElement();
        int[] secondHugeInt = hugeInt.getElement();

        HugeInt resultHolder = new HugeInt();
        int[] result = resultHolder.getElement();
        int newLength = element.length - 1;
        for(int i = newLength; i >= 0; i--){
            sum = firstHugeInt[i] + secondHugeInt[i] + carry;
            if(i == 0){
                result[i] = sum;
            }else{
                remainder = sum % 10;
                carry = sum / 10;
                result[i] += remainder;
            }
        }
        return resultHolder;
    }

    public int[] parse(String elements){
        String result = "";
        for(int i = 0; i < elements.length(); i++){
            char eachCharacter = elements.charAt(i);
            result = String.valueOf(eachCharacter);
            element[i] += Integer.parseInt(result);
        }
        return element;
    }

    public int[] getElement() {
        return element;
    }

    public boolean validateArrayMustNotExceed40Digits(String element) {
        boolean exactElement = element.length() <= 40;
        if(!exactElement) throw new InvalidLength("Elements can't be more than 40");
        return true;
    }
    public void validateElementDoesNotContainString(String elements){
        for(int i = 0; i < elements.length(); i++){
            char check = elements.charAt(i);
            if(!Character.isDigit(check)) throw  new InvalidDigit("Only digit is acceptable");
        }
    }

    @Override
    public String toString() {
        return "HugeInt{" +
                "element=" + Arrays.toString(element) +
                '}';
    }
}
