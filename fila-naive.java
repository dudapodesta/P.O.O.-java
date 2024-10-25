import java.util.Scanner;
import java.io.IOException;
public class Fila {

  public static void main(String[] args) throws IOException {
    int num,fim,inicio,i;
    int[] vec = new int[100];
    char op;
    boolean flag;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    flag=true;
    inicio = 0;
    fim = 0;
    while(flag){
       op = (char)System.in.read();
       switch(op){ 
          //enfilera
          case 'e':
             vec[fim] = scan.nextInt();
             fim++;
             break;
          //desenfilera
          case 'd':
             if(fim==inicio){ 
                System.out.println("Fila vazia");
             }
             else{   
                System.out.println("Sai da fila: "+vec[inicio]);
                inicio++;
             }
             break;
          //imprime:
          case 'i':
             if(fim==inicio){ 
                System.out.println("Fila vazia");
             }
             else{  
                System.out.println("Fila:"); 
                for(i=inicio;i<fim;i++){
                   System.out.print(vec[i]+" ");
                }
               System.out.print("\n");
             }
             
             break;
          //fim
          case 'f':
              flag=false;
              break;
          
          //espaço 'extra'
          case '\n':
              break;
          //espaço 'extra'
          case '\r':
              break;
          
          //erro
          default:
              System.out.println("Comando inválido ");
       }
    }
    // fecha scanner
    scan.close();
    
    }
}


