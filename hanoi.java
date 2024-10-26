import java.util.Scanner;
public class TorresdeHanoi {
  //i é variável global para contar os passos
  public static int i=0;
  //metodo (funcao) Hanoi
  static void Hanoi(int n, char origem, char destino, char auxiliar){
     if(n==1){
        i++;
        System.out.println("Passo "+i+": mova disco 1 de "+origem+" para "+destino);
     }
     //recursão
     else{
       Hanoi(n-1,origem,auxiliar,destino);
       i++;
       System.out.println("Passo "+i+": mova disco "+n+" de "+origem+" para "+destino);
       Hanoi(n-1,auxiliar,destino,origem);
     }
}
  //metodo (funcao) principal
  public static void main(String[] args) {
    int x;
    char o,a,d;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    // metodo le um inteiro
    System.out.print("Digite a quantidade de peças: ");
    x = scan.nextInt();

    // fecha scanner
    scan.close();

    //Haste origem
    o = 'A';
    //Haste auxiliar
    a = 'B';
    //Haste destino/final
    d = 'C';
    //chama o metodo Hanoi
    TorresdeHanoi.Hanoi(x,o,d,a);
  
   }  
}


