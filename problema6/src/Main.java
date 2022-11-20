import java.util.*;



public class Main {
    private static Scanner input;
    public static void main(String[] args) {
        int n, m, nr = 0;
        input = new Scanner(System.in);
        System.out.print("introduceti numarul de lini(n)= ");
        n = input.nextInt();
        System.out.print("introduceti numarul de coloane m= ");
        m = input.nextInt();
        int a[][] = new int[n][m];
        int i, j;
        for (i = 0; i < n; i++)
            for(j=0;j<n;j++)
            {
        {
                System.out.print("a["+i+"]["+j+"]= ");

                a[i][j] = input.nextInt();
            }
        }
        int v[]=new int[n];
        int elemente,location=0,c,d=0;
        for(i=0;i<n;i++)
        {
            elemente = 0;
            for (j = 0; j < n; j++) {
                if (a[i][j] != 0) {

                    elemente++;
                }
                v[i]=elemente;
            }}
        for(c=0;c<n;c++)
        {
            if(v[c]>v[location])
            {
                location = c;
            }
        }

        System.out.println("Linia este " + (location+1)+ " care elemente nenule sunt " + v[location]);



    }}
