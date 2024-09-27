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
    //calculo do determinante
    det = a[0][0]*a[1][1]*a[2][2]+a[1][0]*a[2][1]*a[0][2]+a[2][0]*a[0][1]*a[1][2];
    det = det - (a[0][2]*a[1][1]*a[2][0]+a[1][2]*a[2][1]*a[0][0]+a[2][2]*a[0][1]*a[1][0]);
    
    System.out.println("O determinante é: "+det);
  }
  
}
