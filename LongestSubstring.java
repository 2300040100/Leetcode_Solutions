import java.util.HashSet;
import java.util.Scanner;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0; // Edge case: empty string
        
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine(); // User input
        
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring(input);

        System.out.println(result);
        
        scanner.close();
    }
}
 
