package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        boolean isAnagram = true;
        char sChar[] = s.toCharArray();
        char tChar[] = t.toCharArray();

        Map<Character, Integer> sMap = new HashMap<>();
        for(char c : sChar) sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        for(char c : tChar) {
            int count = sMap.getOrDefault(c, 0);
            if (count == 0) return false;
            else sMap.put(c, count - 1);
        }

        return true;
        /* working code
        Map<Character, Integer> sMap = new HashMap<>();
         Map<Character, Integer> tMap = new HashMap<>();
        for(int i=0; i < sChar.length; i++){
            if(sMap.containsKey(sChar[i])){
                sMap.put(sChar[i], sMap.get(sChar[i]) + 1);
            } else{
                sMap.put(sChar[i], 1);
            }

        }
        for(int i=0; i < tChar.length; i++){
              if(!sMap.containsKey(tChar[i])) return false;
              sMap.put(tChar[i], sMap.get(tChar[i]) - 1);
        }
        for(Integer integer: sMap.values()){
            if(integer != null && integer > 0){
                return false;
            }
        }
        return isAnagram;*/
        /*Time limit exceeded
        for(int i=0; i < sChar.length;i++){
            for(int j=0; j < tChar.length; j++){
                if(sChar[i] != tChar[j]){
                    isAnagram = false;
                } else {
                    isAnagram = true;
                    tChar[j] = Character.MIN_VALUE;
                    break;
                }
            }
            if(!isAnagram){
                return isAnagram;
            }
        }
      return isAnagram;*/

    }
}
