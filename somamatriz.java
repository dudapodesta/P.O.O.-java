import java.util.Scanner;
public class SomaMat {

  public static void main(String[] args) {
    int i,j;
    int[][] mat1 = new int[3][3];
    int[][] mat2 = new int[3][3];
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
    // soma as matrizes e guarda em mat1
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++){
          //insira aqui o código para somar as duas matrizes termo a termo

          
       }
    }
    
    // imprime a matriz
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++){
           System.out.print(mat1[i][j]+" ");    
       }
       System.out.print("\n");
    }
    
  }
}
