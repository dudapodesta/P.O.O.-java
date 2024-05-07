import java.util.Scanner;
public class SwitchTeste {

  public static void main(String[] args) {
    int num;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um número natural: ");

    // metodo le um inteiro
    num = scan.nextInt();

    // fecha scanner
    scan.close();
    num = num % 2;
    switch(num) {
     case 1:
        System.out.println("O numero é ímpar");
        break;
     case 0:
        System.out.println("O numero é par");
        break;
     default:
        System.out.println("Programa não deveria entrar aqui");
    }
  }
}


