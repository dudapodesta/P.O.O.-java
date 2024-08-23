import java.util.Scanner;
public class LerMat {

  public static void main(String[] args) {
    int i,j;
    int[][] mat1 = new int[3][3];
    int[][] mat2 = new int[3][3];
    int[][] matR = new int[3][3];
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Entre com uma matriz de inteiros de tamanho 3x3: ");
    //i linhas
    for(i=0;i<3;i++)
    {
        //j colunas
        for(j=0;j<3;j++){
           mat1[i][j] = scan.nextInt();    
       }
    }
    System.out.print("Entre com uma matriz de inteiros de tamanho 3x3: ");
    //i linhas
    for(i=0;i<3;i++)
    {
        //j colunas
        for(j=0;j<3;j++){
           mat2[i][j] = scan.nextInt();    
       }
    }
    // fecha scanner
    scan.close();
    // faz o produto das matrizes e guarda em matR
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++){
           matR[i][j]=mat1[i][0]*mat2[0][j]+mat1[i][1]*mat2[1][j]+mat1[i][2]*mat2[2][j];    
       }
    }
    
    // imprime a matriz
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++){
           System.out.print(matR[i][j]+" ");    
       }
       System.out.print("\n");
    }
    
  }
}