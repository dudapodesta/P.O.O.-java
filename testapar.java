import java.util.Scanner;
public class Par {
  public static void main(String[] args) {
    int x;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um número natural: ");
    // metodo le um real
    x = scan.nextInt();
    // fecha scanner
    scan.close();
    if(x%2==0){
        System.out.println("É par");
    }
    else{
        System.out.println("É ímpar");
    }
    
  }
}
