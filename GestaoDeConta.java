public class GestaoDeConta {
  public static void main(String[] args) {
    class Conta {

        double saldo;
      	String titular;
	      int numero;
	      String agencia;
	      String dataDeAbertura;


        void saca(double valor) {
            this.saldo = saldo + valor;
        }

        void deposita(double valor) {
            this.saldo = valor + saldo;
        }

        double calculaRendimento() {
            double rendimento = saldo * 0.1;
          return rendimento;
        }
    }

    Conta icaro = new Conta();
    icaro.agencia = "Inter";
    icaro.saldo = 300;
    icaro.dataDeAbertura = "15/06/2022";
    icaro.titular = "Icaro";
    icaro.deposita(3000);
    icaro.calculaRendimento();
    System.out.println(icaro.calculaRendimento());
    
    System.out.println(icaro.saldo);

  }
}