import java.util.Scanner;

public class MediaNotas{
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.println("Bem-vindo, por favor digite a quantidade de alunos em sua sala: ");
    int alunos = a.nextInt();
    int cont = 0;
    for(int b = 0; b<alunos; b++){
      System.out.println("Informe a nota do " +(b+1)+ "° aluno: ");
      int nota = a.nextInt();
      cont += nota;
    }
    float media = cont / alunos;
    System.out.print("A média final é de " +media);
    
  }
}