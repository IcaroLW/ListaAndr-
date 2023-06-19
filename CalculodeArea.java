import java.util.Scanner;

class CalculodeArea {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.println("Insira a altura da parede: ");
    int hp = a.nextInt();
    System.out.println("Insira a largura da parede: ");
    int lp = a.nextInt();
    System.out.println("Insira a altura dos tijolos: ");
    int ha = a.nextInt();
    System.out.println("Insira a largura dos tijolos: ");
    int la = a.nextInt();
    int areaParede = hp * lp;
    int areaTijolo = ha * la;
    int areaDefinitivaTijolo = ha * la;
    
    System.out.println("parede = "+ areaParede+ " e tijolo = " +areaTijolo);



    while(areaTijolo < areaParede){
      areaTijolo = areaTijolo + areaDefinitivaTijolo;
    }
    System.out.print("os tijolos estão cobrindo uma área de " +areaTijolo);
  }
}