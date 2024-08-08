import java.util.Scanner;
public class While {
    public static void main(String args[]) {
        int x,i;
        //abre o scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com um inteiro: ");
        x = scan.nextInt();
        // fecha scanner
        scan.close();
        i=0;
        while (i<x) {
            System.out.println(i);
            i++;
        }
    }
} 



