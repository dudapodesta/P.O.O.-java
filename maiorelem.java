import java.util.Scanner;
public class LerVec {
  public static void main(String[] args) {    
    int num,i,maior;
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
    // encontra o maior
    maior = vec[0];
    for(i=1;i<15;i++)
    {
       if(vec[i]>maior){
          maior = vec[i];
       }    
    }
    System.out.println("O maior elemento do vetor é: "+maior);   
  }
}
