import java.util.Scanner;
public class Fib {

  public static void main(String[] args) {
    int i,n,fn,f1,f2;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Entre com um inteiro maior que 2: ");
    n = scan.nextInt();    
    // fecha scanner
    scan.close();
    f1=1;
    f2=1;
    System.out.print("1, 1");
    for(i=3;i<=n;i++)
    {
       fn=f1+f2;
       System.out.print(", "+fn);
       f1=f2;
       f2=fn;    
    }
    System.out.print("\n");
       
  }
}
