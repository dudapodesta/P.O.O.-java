import java.util.Scanner;
//import java.util.Random;
public class Piramide {

  public static void main(String[] args) {
    int num,i,j;
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um inteiro: ");
    num = scan.nextInt();
    scan.close();
    for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
  }
}
