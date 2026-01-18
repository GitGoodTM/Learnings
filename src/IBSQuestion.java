//public class IBSQuestion {
//    public static void main(String[] args){
//        String name = "Seena Susan George";
//        for(int i=0; i<name.length(); i++){
//            if(name.indexOf(name.charAt(i))==){
//
//            }
//        }
//        name.indexOf("");
//    }
//}
import java.util.HashSet;
import java.util.Set;

public class IBSQuestion {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // If character already exists, shrink window from the left
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            // Add current character
            seen.add(s.charAt(right));
            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input1 = "abcabcbb";
        String input2 = "bbbbb";
        String input3 = "pwwkew";

        System.out.println("Input: " + input1 + " → " + lengthOfLongestSubstring(input1)); // 3
        System.out.println("Input: " + input2 + " → " + lengthOfLongestSubstring(input2)); // 1
        System.out.println("Input: " + input3 + " → " + lengthOfLongestSubstring(input3)); // 3
    }
}
