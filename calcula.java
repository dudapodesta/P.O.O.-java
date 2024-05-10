import java.util.Scanner;
public class Calculadora {

  public static void main(String[] args) {
    float x,y;
    char o;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite uma operação: ");

    // metodo le um inteiro
    x = scan.nextFloat();
    o = scan.next().charAt(0);
    y = scan.nextFloat();

    // fecha scanner
    scan.close();
    switch(o) {
     case '+':
        x+=y;
        System.out.println("O resultado é: "+x);
        break;
     case '-':
        x-=y;
        System.out.println("O resultado é: "+x);
        break;
     case '*':
        x*=y;
        System.out.println("O resultado é: "+x);
        break;
     case '/':
        x=x/y;
        System.out.println("O resultado é: "+x);
        break;
     default:
        System.out.println("Programa não deveria entrar aqui");
    }
  }
}
