import java.util.Scanner;
public class LerVec {

  public static void main(String[] args) {
    int num,i;
    int[] vec = new int[15];
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Entre com um vetor de inteiros de tamanho 15: ");
    for(i=0;i<15;i++)
    {
       vec[i] = scan.nextInt();    
    }
    // fecha scanner
    scan.close();
    
    // imprime o vetor
    for(i=0;i<15;i++)
    {
       System.out.println(vec[i]);    
    }
    
    
  }
}
