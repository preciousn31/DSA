package string;

import java.util.HashSet;

public class LengthOfLongestSubString {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        //abc, dvdf, abcabcbb,
        String subString = "";
        String longest = "";
        for(int i=0; i < s.length(); i++) {
            String current = String.valueOf(s.charAt(i));
            if(subString.contains(current)){
                subString = subString.substring(subString.indexOf(current) + 1);
            }
            subString += current;

            if(subString.length() > longest.length()){
                longest = subString;
            }
        }
        return longest.length();
    }

    public int slidingWindowLengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max =0;
        HashSet<Character> hashSet = new HashSet<>();
        while(b_pointer < s.length()){
            if(!hashSet.contains(s.charAt(b_pointer))){
                hashSet.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubString().lengthOfLongestSubstring("_8afg8h *"));
        System.out.println(new LengthOfLongestSubString().slidingWindowLengthOfLongestSubstring("_8afg8h *"));
    }
}
