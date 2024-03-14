import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text you wish to check");
        String userInput = scanner.next();



        int i = 0;
        int j = userInput.length() -1;
        boolean isPalindrome = true;

        while (i<j){
            if(userInput.charAt(i) != userInput.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }


    }
}