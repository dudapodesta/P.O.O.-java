import java.util.Scanner;
public class Prova {
  public static void main(String[] args) {
    float x,y,z,soma;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um real: ");

    // metodo le um real
    x = scan.nextFloat();
    System.out.print("Digite um real: ");

    // metodo le um real
    y = scan.nextFloat();
    System.out.print("Digite um real: ");

    // metodo le um real
    z = scan.nextFloat();
    

    // fecha scanner
    scan.close();
    //soma os três reais
    soma = x + y + z;

    // imprime o numero
    System.out.println("A soma é: "+soma);
  }
}
