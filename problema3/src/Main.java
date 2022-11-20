import java.util.*;


public class Main {
    private static Scanner input;

    public static void main(String[] args) {

  System.out.print("Introduceti numarul de elemente n= ");
    input=new

    Scanner(System.in);

    int n, nr = 0, nr1=0;
    n=input.nextInt();
    int v[] = new int[n];
        for(
    int i = 0;
    i<n;i++)

    {
        System.out.println("v[" + i + "]= ");
        v[i] = input.nextInt();
    }
       for(
    int i = 0;
    i<n;i++)

    {
        if (v[i] > 0) {
            nr++;
        } else nr1++;
    }
       System.out.println("Numere pozitive ="+nr );
    System.out.println("Numere negative= "+nr1);
}}