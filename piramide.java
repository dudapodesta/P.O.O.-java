import java.util.Scanner;
import java.util.Random;
public class Pira {

  public static void main(String[] args) {
    int num,i,j;
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um inteiro: ");
    num = scan.nextInt();
    scan.close();
    for(i=0;i<num;i++)
        {
            for(j=0;j<=i;j++)
            {
                Random n = new Random();
                System.out.print(n.nextInt(10));
            }
            System.out.print("\n");
        }
  }
}
