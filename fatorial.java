import java.util.Scanner;
public class Fatorial {

  public static void main(String[] args) {
    int n,i,f;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Entre com o valor (inteiro) para n: ");
    n= scan.nextInt();
    // fecha scanner
    scan.close();
    //deve-se inicializar a variável f
    //f vale 1 inicialmente pois é o elemento neutro da multiplicação
    f=1;
    // calcula o fatorial
    for(i=1;i<=n;i++)
    {
       //equivalente a f=f*i;
       f*=i;    
    }
    // imprime o resultado
    System.out.println("O fatorial de n é: "+f);
    
  }
}
