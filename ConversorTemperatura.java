import java.util.Scanner;

public class ConversorTemperatura{
  public static void main(String[] args) {
    System.out.println("Por favor, digite uma temperatura em Celsius: ");
    Scanner a = new Scanner(System.in);
    int temp = a.nextInt();
    System.out.println("A temperatura digitada foi de " +temp+ "°, deseja convertê-la para Fahrenheit? [S/N]");
    String opcao = a.next();
    int faren = (temp * 9/5) + 32;
    if(opcao.equals("S")){
      System.out.print("A temperatura em F° é de " +faren+ "°F.");
    }
    else{
      System.out.println("Beleza, obrigado por usar!");
    }
    
  }
}