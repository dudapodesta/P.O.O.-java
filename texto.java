import java.util.Scanner;
public class Texto {
  public static void main(String[] args) {
    String x;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um texto: ");
    // metodo le um real
    x = scan.nextLine();
    // fecha scanner
    scan.close();
    //imprime texto exatamente como foi digitado
    System.out.println("Texto: " +x);
    //imprime texto em letra MAIÚSCULA
    System.out.println("Texto: " +x.toUpperCase());
    //imprime texto em letra minúscula
    System.out.println("Texto: " +x.toLowerCase());
  }
}
