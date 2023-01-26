import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.xml.validation.Schema;

public class a1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i =0;i<n;i++) {
        arr[i] = sc.nextInt();
    }
    List<Integer> newList = new ArrayList<>();

    for (int i = 0; i <arr.length; i++) {

       if(arr[i] !=0){
        int num = arr[i];
        newList.add(num) ;
       }    
    }
    int[] newArr = new int[n];
    for (int i = 0; i <newList.size(); i++) {
        newArr[i] = newList.get(i);
     }
    
        for (int k : newArr) {
            System.out.print(k+" ");
        }
    }
    
}
    
