import java.util.Scanner;
public class SomaR {
  public static void main(String[] args) {
    float x,y;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um real: ");
    // metodo le um real
    x = scan.nextFloat();
    System.out.print("Digite um real: ");
    // metodo le um real
    y = scan.nextFloat();
    // fecha scanner
    scan.close();
    if(x>y){
        System.out.println("O maior é: "+x);
    }
    else if(y>x){
        System.out.println("O maior é: "+y);
    }
    else{
      System.out.println("São iguais");
    }
    
  }
}
