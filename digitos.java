import java.util.Scanner;
public class Digito {
  public static void main(String[] args) {
    int x,a,b,c;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um inteiro: ");
    // metodo le um real
    x = scan.nextInt();
    // fecha scanner
    scan.close();
    //Calcula digito da unidade
    a=x%10;
    /*só funciona para x inteiro dessa forma
     para x real ver digitos.java*/
    //atualiza x
    x=x/10;
    //calcula digito da dezena
    b=x%10;
    //atualiza x
    x=x/10;
    //calcula digito da centena
    c=x%10;
    //imprime resultados:
    System.out.println("Dígito da unidade: " +a);
    System.out.println("Dígito da dezena: " +b);
    System.out.println("Dígito da centena: " +c);
    
    
  }
}
