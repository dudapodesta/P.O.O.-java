import java.util.Scanner;
import java.io.IOException;
public class Pilha {

  public static void main(String[] args) throws IOException {
    int num,topo,fundo,i;
    int[] vec = new int[100];
    char op;
    boolean flag;
    //abre o scanner
    Scanner scan = new Scanner(System.in);
    flag=true;
    topo = 0;
    fundo = 0;
    while(flag){
       op = (char)System.in.read();
       switch(op){ 
          //empilha
          case 'e':
             vec[topo] = scan.nextInt();
             topo++;
             break;
          //desempilha
          case 'd':
             if(topo==fundo){ 
                System.out.println("Pilha vazia");
             }
             else{   
                System.out.println("Elemento desempilhado: "+vec[topo-1]);
                topo--;
             }
             break;
          //imprime:
          case 'i':
             if(topo==fundo){ 
                System.out.println("Pilha vazia");
             }
             else{  
                System.out.println("Pilha:"); 
                for(i=topo-1;i>=fundo;i--){
                   System.out.println(vec[i]);
                }
             }
             
             break;
          //fim
          case 'f':
              flag=false;
              break;
          
          //espaço 'extra
          case '\n':
              break;
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


