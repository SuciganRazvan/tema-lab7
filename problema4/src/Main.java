import java.util.*;



public class Main {
    private static Scanner input;
    public static void main(String[] args) {
        int n,m,v,nr=0;
        input=new Scanner(System.in);
        System.out.print("introduceti numarul de lini(n)= ");
        n= input.nextInt();
        System.out.print("introduceti numarul de coloane m= ");
        m=input.nextInt();
        System.out.print("Introduceti o valoarea");
        v=input.nextInt();

        int a[][]=new int[n][m];
        int i,j;
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
            {
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j]= input.nextInt();
            }
      for(i=0;i<n;i++)
      for(j=0;j<n;j++)
      {
          if(a[i][j]==v)
          {
              nr++;
          }
      }
            System.out.println(" de cate ori  apare  valoarea= "+nr);
    }
}