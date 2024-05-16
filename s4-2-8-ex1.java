import java.util.Scanner;
public class Digito {
  public static void main(String[] args) {
    float y;
    int x,a,b,c,d;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um inteiro: ");
    // metodo le um real
    y = scan.nextFloat();
    // fecha scanner
    scan.close();
    //faz y=y*10000
    y=y*10000;
    //converte float para menor inteiro
    x=(int)Math.floor(y);
    //Calcula digito dos décimos de milésimos
    a=x%10;
    /*só funciona para x inteiro dessa forma
     para x real ver digitos.java*/
    //atualiza x
    x=x/10;
    //calcula digito dos milésimos
    b=x%10;
    //atualiza x
    x=x/10;
    //calcula digito dos centésimos
    c=x%10;
    //atualiza x
    x=x/10;
    //calcula digito dos décimos
    d=x%10;
    //imprime resultados:
    System.out.println("Dígito dos décimos: " +d);
    System.out.println("Dígito dos centésimos: " +c);
    System.out.println("Dígito dos milésimos: " +b);
    System.out.println("Dígito dos décimos de milésimos: " +a);
    
    
  }
}
