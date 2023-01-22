import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basicPay = sc.nextDouble();
        double hra,da;
        if(basicPay<= 5000){
            hra = 20*basicPay/100;
            da = 30*basicPay/100;
            System.out.println("Gross pay ="+(basicPay+hra+da));
        }else{
            hra = 10*basicPay/100;
            da = 20*basicPay/100;
            System.out.println("Gross pay ="+(basicPay+hra+da));

        }
    }
}
