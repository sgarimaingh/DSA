package Recursion;

import java.util.*;

public class PalindomicPermutations {

    private String s = "aabbc";

    public void allPalindomes(){
        List<String> res = new ArrayList<>();
        generatePermutations(s.toCharArray(), 0, res);
        Collections.sort(res);
        for(int i =0;i<res.size();i++){
            System.out.println(res.get(i) + " ");
        }

    }

    private void generatePermutations(char[] chars, int index, List<String> res){
        if(chars.length==index){
            if(isPalindrome(chars)){
                res.add(String.valueOf(chars));
            }
            return;
        }

        Set<Character> used = new HashSet<>();
        for(int i = index; i<chars.length;i++){
            if(!used.contains(chars[i])){
                used.add(chars[i]);
                swap(chars,i,index);
                generatePermutations(chars, index+1, res);
                swap(chars, i, index);
            }
        }
    }

    private void swap(char[] chars, int i, int index){
        char temp = chars[i];
        chars[i] = chars[index];
        chars[index] = temp;
    }

    private boolean isPalindrome(char[] chars){
        int start = 0;
        int end = chars.length-1;
        while(start<end){
            if(chars[start]!=chars[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
