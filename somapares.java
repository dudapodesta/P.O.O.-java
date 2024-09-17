import java.util.Scanner;
public class LerVec {
  public static void main(String[] args) {
    int num,i,soma;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Entre com um inteiro: ");
    num = scan.nextInt();
    // fecha scanner
    scan.close();
    soma = 0;
    for(i=2;i<=num;i=i+2)
    {
       soma = soma + i;
    }
    System.out.println("A soma dos pares menores que n é: "+soma);   
  }
}
