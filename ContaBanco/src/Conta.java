public class Conta {

      private String agencia; // Atributo privad
      private int numeroConta; 
      private String nomeCliente;
      private double saldo;

      public Conta() {
         // Construtor padrão
      }
   
      public Conta(String agencia, String nomeCliente, int numeroConta, double saldo) {
         this.agencia = agencia;
         this.nomeCliente = nomeCliente;
         this.numeroConta = numeroConta;
         this.saldo = saldo;
      }

      public String getAgencia() {
         return agencia;
      }

      public void setAgencia(String agencia) {
         this.agencia = agencia;
      }

      public void setNumeroConta(int numeroConta) {
         this.numeroConta = numeroConta;
      }
   
      public int getNumeroConta() {
         return numeroConta;
      }

      public String getNomeCliente() {
         return nomeCliente;
      }

      public void setNomeCliente(String nomeCliente) {
         this.nomeCliente = nomeCliente;
      }
      
      public double getSaldo() {
         return saldo;
      }

      public void setSaldo(double saldo) {
         this.saldo = saldo;
      }
}
