import java.util.Scanner;
public class PA {

  public static void main(String[] args) {
    int i,n;
    float a1,r,an;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Entre com o primeiro termo da PA: ");
    a1 = scan.nextFloat();
    System.out.print("Entre com a razão da PA: ");
    r = scan.nextFloat();  
    System.out.print("Entre com a quantidade de termos desejada: ");
    n = scan.nextInt();  
    // fecha scanner
    scan.close();
    System.out.print(a1);
    for(i=2;i<=n;i++)
    {
       an=a1+(i-1)*r;
       System.out.print(","+an);    
    }
    System.out.print("\n");
       
  }
}
