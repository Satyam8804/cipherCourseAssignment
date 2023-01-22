import java.util.Scanner;

public class p1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any Number : ");
    int num= sc.nextInt();
    if(num>0){
        System.out.println("+Ve");
    }else if(num ==0){
        System.out.println("Neutral");
    }else{
        System.out.println("-Ve");
    }
}
    
}