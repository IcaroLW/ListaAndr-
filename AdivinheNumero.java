import java.util.Scanner;
import java.util.Random;

public class AdivinheNumero {
  public static void main(String[] args) {
    System.out.println("Eu irei gerar um número aleatório de 1 a 100 e você tem de adivinhar... Não se preocupe, irei dizer se seu palpite é maior ou menor caso erre.");
    Random rand = new Random();
    Scanner a = new Scanner(System.in);
    int numeroGerado = rand.nextInt(1,101);
    System.out.println("========");
    System.out.println("Digite seu palpite: ");
    while(true){
      int resposta = a.nextInt();
      if(resposta > numeroGerado){
        System.out.println("Seu palpite foi maior do que o número que eu gerei.");
      }
      else if(resposta < numeroGerado){
        System.out.println("Seu palpite foi menor que o número que eu gerei.");
      }
      else{
        System.out.println("PARABÉNS! VOCÊ ACERTOU!!!");
          break;
      }
    }
    
  }
}