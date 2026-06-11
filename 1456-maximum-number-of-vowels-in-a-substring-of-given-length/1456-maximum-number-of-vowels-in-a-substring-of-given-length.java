import java.util.Set;

public class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        
        int currentVowels = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentVowels++;
            }
        }
        
        int maxVowels = currentVowels;
        for (int i = k; i < s.length(); i++) {
        
            if (vowels.contains(s.charAt(i))) {
                currentVowels++;
            }
            if (vowels.contains(s.charAt(i - k))) {
                currentVowels--;
            }
            maxVowels = Math.max(maxVowels, currentVowels); 
            if (maxVowels == k) {
                return maxVowels;
            }
        }
        
        return maxVowels;
    }
}
