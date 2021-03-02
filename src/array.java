import java.util.Scanner;
public class array {
    public static void main(String[] args)
    {
        int m;int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the lenght of array:");
        m= s.nextInt();
        n= s.nextInt();
        int A[][]=new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(A[i][j]);
                 s.nextInt();
                s.nextInt();
            }
        }
    }
}
