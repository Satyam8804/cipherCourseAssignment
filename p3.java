import java.util.Random;
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomNum = rnd.nextInt(20);

        for (int i = 0; i < 6; i++)
         {
            System.out.println("Guess the Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>randomNum){
            System.out.println("You guess is too high  !!");
        }else if(n<randomNum){
            System.out.println("You guess is too low !!");
        }else{
            System.out.println("you win !!");
            break;
        }
        }
        
    }
}
