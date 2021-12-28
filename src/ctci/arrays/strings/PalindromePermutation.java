package ctci.arrays.strings;

import java.util.HashMap;

public class PalindromePermutation {
    public static void main(String[] args) {
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        System.out.println(palindromePermutation.isPalindrome("tact coa"));
    }

    private boolean isPalindrome(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: input.toCharArray()){
            if(Character.getNumericValue(c) <= Character.getNumericValue('z') && Character.getNumericValue(c) >= Character.getNumericValue('a'))
            map.put(c, map.get(c) == null ? c: map.get(c) - c);
        }
        int count = 0;
        for(Integer value: map.values()){
            if(value > 0){
                value = 1;
            } else if(value < 0){
                value = -1;
            }
            count += value;
        }

        return count == 0 || count == 1;
    }
}
