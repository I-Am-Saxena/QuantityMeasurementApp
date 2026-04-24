public class UseCase4PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}
