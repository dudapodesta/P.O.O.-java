import java.util.Scanner;
public class DetMat {

  public static void main(String[] args) {
    int i,j,det;
    int[][] a = new int[3][3];
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Entre com uma matriz de inteiros de tamanho 3x3: ");
    //i linhas
    for(i=0;i<3;i++)
    {
        //j colunas
        for(j=0;j<3;j++){
           a[i][j] = scan.nextInt();    
       }
    }
    // fecha scanner
    scan.close();
    //insira aqui o cálculo do determinante
    
    
    System.out.println("O determinante é: "+det);
  }
  
}
