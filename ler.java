import java.util.Scanner;
public class Ler {

  public static void main(String[] args) {
    int num;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um inteiro: ");

    // metodo le um inteiro
    num = scan.nextInt();

    // fecha scanner
    scan.close();

    // imprime o numero
    System.out.println("O numero digitado foi: "+num);
  }
}
