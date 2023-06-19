import java.util.Scanner;

class Boletim {
  public static void main(String[] args) {
    System.out.println("Olá, seja bem vindo. Por favor insira seu nome aqui: ");
    Scanner a = new Scanner(System.in);
    int[] notas = new int[5];
    String nome = a.next();
    System.out.println("Por favor, agora me informe suas notas, " + nome);
    for(int b = 1; b <= 5; b++){
      System.out.println("Me informe por gentileza sua " + b + "° nota: ");
      int resposta = a.nextInt();
      notas[b-1] = resposta;
    }
    int resultado = (notas[0] + notas[1] +notas[2] +notas[3] +notas[4]);
    if(resultado >= 60){
      System.out.print("Sua nota final foi "+resultado+". Você foi aprovado.");
    }
    else if(resultado < 40){
      System.out.print("Sua nota final foi " +resultado+ ". Você foi reprovado...");
    }
    else{
      System.out.print("Sua nota final foi " +resultado+ ". Você está de recuperação");
    }
  
  }
}