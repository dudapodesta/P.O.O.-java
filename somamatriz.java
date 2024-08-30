import java.util.Scanner;
public class LerMat {

  public static void main(String[] args) {
    int i,j;
    int[][] mat1 = new int[2][4];
    int[][] mat2 = new int[2][4];
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Entre com uma matriz de inteiros de tamanho 2x4: ");
    //i linhas
    for(i=0;i<2;i++)
    {
        //j colunas
        for(j=0;j<4;j++){
           mat1[i][j] = scan.nextInt();    
       }
    }
    System.out.print("Entre com uma matriz de inteiros de tamanho 2x4: ");
    //i linhas
    for(i=0;i<2;i++)
    {
        //j colunas
        for(j=0;j<4;j++){
           mat2[i][j] = scan.nextInt();    
       }
    }
    // fecha scanner
    scan.close();
    // soma as matrizes e guarda em mat1
    for(i=0;i<2;i++)
    {
        for(j=0;j<4;j++){
           mat1[i][j]+=mat2[i][j];    
       }
    }
    
    // imprime a matriz
    for(i=0;i<2;i++)
    {
        for(j=0;j<4;j++){
           System.out.print(mat1[i][j]+" ");    
       }
       System.out.print("\n");
    }
    
  }
}
