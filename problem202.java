/******************************************************************************

       Write a program that checks whether an integer is a palindrome. 
       For example, 121 is a palindrome, as well as 888. 678 is not a palindrome. 
       Do not convert the integer into a string.
*******************************************************************************/

public class Main
{
    //checks if an integer is a palindrome by reversing the number and comparing it to the original
    
    public static boolean isPalindrome(int a){
        
        //neg numbers cannot be palindromes since "-" is not a digit
        if (a<0){
            return false;
        }
        
        int reversedNum = 0;
        int origNum = a;
        while (a>0){
            int lastDigit = a%10;
            reversedNum = reversedNum*10 + lastDigit;
            a/=10;
        }
        return origNum == reversedNum;
    }
	public static void main(String[] args) {
		System.out.println(isPalindrome(57));
		System.out.println(isPalindrome(979));
		System.out.println(isPalindrome(-43));
		System.out.println(isPalindrome(38462384));
		System.out.println(isPalindrome(357484753));
	}
}
