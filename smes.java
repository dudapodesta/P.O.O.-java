import java.util.Scanner;
public class SwitchMes {
 public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  System.out.println("Digite o número referente ao mês desejado");
  int numero = entrada.nextInt();
   switch (numero) {
     case 1:
       System.out.println("O mês é Janeiro!");
       break;
     case 2:
       System.out.println("O mês é Fevereiro!");
       break;
     case 3:
       System.out.println("O mês é Março!");
       break;
     case 4:
       System.out.println("O mês é Abril!");
       break;
     case 5:
       System.out.println("O mês é Maio!");
       break;
     case 6:
       System.out.println("O mês é Junho!");
       break;
     case 7:
       System.out.println("O mês é Julho!");
       break;
     case 8:
       System.out.println("O mês é Agosto!");
       break;
     case 9:
       System.out.println("O mês é Setembro!");
       break;
     case 10:
       System.out.println("O mês é Outubro!");
       break;
     case 11:
       System.out.println("O mês é Novembro!");
       break;
     case 12:
       System.out.println("O mês é Dezembro!");
       break;
     default:
       System.out.println("Não existe um mês correspondente ao número escolhido! Digite um número entre 1 a 12.");
    }
  }
}

