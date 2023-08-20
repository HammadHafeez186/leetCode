public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 343;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        char character;
        String reverse = new String();
        String number = Integer.toString(x);
        for (int i=0;i<number.length();i++){
            character = number.charAt(i);
            reverse = character + reverse;
        }
        if(number.equals(reverse)){
            return true;
        }
        else
            return false;


    }
}
