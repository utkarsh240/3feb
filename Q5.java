import java.util.Scanner;

public class Q5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first name: ");
        String firstName = sc.nextLine();
        System.out.println("last name: ");
        String lastName = sc.nextLine();
        System.out.println("Your name is: " + lastName + " " + firstName);
    }
}
