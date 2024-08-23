import java.util.Scanner;
public class Tabuada {

  public static void main(String[] args) {
    int i,j,p;
    for(i=1;i<=10;i++)
        {
            for(j=i;j<=10;j++)
            {
                p=i*j;
                System.out.println(i+"X"+j+"="+p);
            }
            System.out.print("\n");
        }
  }
}



