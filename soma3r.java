import java.util.Scanner;
public class Prova {
  public static void main(String[] args) {
    float x,y,z;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um real: ");
    // metodo le um real
    x = scan.nextFloat();
    System.out.print("Digite um real: ");
    // metodo le um real
    y = scan.nextFloat();
    /*---QUESTÃO 1---
       ESCOLHA O CÓDIGO A SER INSERIDO NESSE ESPAÇO
       PARA QUE SEU PROGRAMA LEIA OUTRO NÚMERO REAL
       NA ENTRADA
    */
    // fecha scanner
    scan.close();
    /*---QUESTÃO 2---
       ESCOLHA O CÓDIGO A SER INSERIDO NESSE ESPAÇO
       PARA QUE SEU PROGRAMA CALCULE A MÉDIA ENTRE OS
       3 NÚMEROS LIDOS NA ENTRADA
    */
    System.out.println("O resultado é: "+x);
  }
}
