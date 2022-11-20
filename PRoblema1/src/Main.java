
import java.util.*;

public class Main {
    private static Scanner input;
    public static void main(String[] args) {
     int n;
     System.out.print("Introduceti numarul de elemente n=  ");
     input=new Scanner(System.in);
     n=input.nextInt();
     int v[]=new int[n];
     int i;
     for(i=0;i<n;i++)
     {
         System.out.print("V["+i+"]=");
         v[i]=input.nextInt();
     }
     int min=v[0];
     for(i=0;i<n;i++)
     {
         if(min>v[i])
             min=v[i];
     }
        System.out.println("Valoare minima este= "+min);
    }
}