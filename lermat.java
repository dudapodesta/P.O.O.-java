import java.util.Scanner;
public class LerMat {

  public static void main(String[] args) {
    int i,j;
    int[][] mat = new int[2][4];
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    System.out.print("Entre com uma matriz de inteiros de tamanho 2x4: ");
    //i linhas
    for(i=0;i<2;i++)
    {
        //j colunas
        for(j=0;j<4;j++){
           mat[i][j] = scan.nextInt();    
       }
    }
    // fecha scanner
    scan.close();
    // imprime a matriz
    for(i=0;i<2;i++)
    {
        for(j=0;j<4;j++){
           System.out.print(mat[i][j]+" ");    
       }
       System.out.print("\n");
    }
    
  }
}
