import java.util.Scanner;
public class Soma {

  public static void main(String[] args) {
    int x,y;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um inteiro: ");

    // metodo le um inteiro
    x = scan.nextInt();
    System.out.print("Digite um inteiro: ");

    // metodo le um inteiro
    y = scan.nextInt();

    // fecha scanner
    scan.close();
    //soma os dois inteiros
    //equivalente a x = x+y
    x+=y;

    // imprime o numero
    System.out.println("A soma é: "+x);
  }
}
