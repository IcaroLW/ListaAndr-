import java.util.Scanner;

class ContadorParEImpar {
  public static void main(String[] args) {
    System.out.println("Bem-vindo. Por favor, digite 15 números: ");
    Scanner a = new Scanner(System.in);

    int par = 0;
    int impar = 0;
    for(int b = 0; b <15; b++){
      int num = a.nextInt();
      if(num % 2 == 0){
        par++;
      }
      else{
        impar++;
      }
    }
    System.out.println("O número de pares é de " +par+ " e o de ímpares é de " +impar);
  }
}