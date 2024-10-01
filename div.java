import java.util.Scanner;
public class Div {

  public static void main(String[] args) {
    int x,y,r1;
    float a,b,r2,r3,r4,r5;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um inteiro: ");

    // metodo le um inteiro
    x = scan.nextInt();
    System.out.print("Digite um inteiro: ");

    // metodo le um inteiro
    y = scan.nextInt();
    System.out.print("Digite um real: ");

    // metodo le um real
    a = scan.nextFloat();
    System.out.print("Digite um real: ");

    // metodo le um real
    b = scan.nextFloat();

    // fecha scanner
    scan.close();
    //faz as divisoes
    r1=x/y;
    r2=x/y;
    r3=a/b;
    r4=a/y;
    r5=x/b;
    // imprime o numero
    System.out.println("A divisão inteiro por inteiro salvo em inteiro é: "+r1);
    System.out.println("A divisão inteiro por inteiro salvo em real é: "+r2);
    System.out.println("A divisão real por real salvo em real é: "+r3);
    System.out.println("A divisão real por inteiro salvo em real é: "+r4);
    System.out.println("A divisão inteiro por real salvo em real é: "+r5);
  }
}
