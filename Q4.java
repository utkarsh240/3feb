import java.util.Scanner;

public class Q4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        if(rev == num){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
