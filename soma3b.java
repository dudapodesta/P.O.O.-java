/*Soma 3 números reais usando Big Decimal*/
import java.math.BigDecimal;  
import java.util.Scanner;
public class SomaBD {

  public static void main(String[] args) {
    BigDecimal x,y,z;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um real: ");

    // metodo le um Big Decimal
    x = scan.nextBigDecimal();
    System.out.print("Digite um real: ");

    // metodo le um Big Decimal
    y = scan.nextBigDecimal();
    System.out.print("Digite um real: ");

    // metodo le um Big Decimal
    z = scan.nextBigDecimal();
    

    // fecha scanner
    scan.close();
    //soma os três BigDecimal
    x = x.add(y);
    x = x.add(z);
    /*para produto use:
    x = x.multiply(y);
    */
    // imprime o numero
    System.out.println("A soma é: "+x);
  }
}
