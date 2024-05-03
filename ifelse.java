import java.util.Scanner;

public class Ifelse {

  public static void main(String[] args) {
    int x,y,z;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    // metodo le um inteiro
    System.out.print("Digite um inteiro: ");
    x = scan.nextInt();

    // metodo le um inteiro
    System.out.print("Digite um inteiro: ");
    y = scan.nextInt();

    // metodo le um inteiro
    System.out.print("Digite um inteiro: ");
    z = scan.nextInt();
    
    // fecha scanner
    scan.close();

    if (x>y && x>z) {
  	System.out.println("O primeiro é maior dos três");
	}  
    else if (x>y || x>z){
	System.out.println("O primeiro é maior que um dos dois apenas");
	} 
    else{
	System.out.println("O primeiro é menor que todos");
        }
 
   }  
}


