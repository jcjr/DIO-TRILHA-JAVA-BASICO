import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Conta conta = new Conta();

        System.out.println("Bem-vindo ao Bytebank!");

        System.out.print("Digite a agência: ");
        conta.setAgencia(sc.next());

        System.out.print("Digite o número da conta: ");
        conta.setNumeroConta(sc.nextInt());

        System.out.print("Digite o nome do cliente: ");
        conta.setNomeCliente(sc.next());
        
        System.out.print("Digite o saldo da conta: ");
        conta.setSaldo(sc.nextDouble());

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + conta.getAgencia() + ", conta " + conta.getNumeroConta() + 
                            " e seu saldo R$ " + conta.getSaldo() + " já está disponível para saque");
    }
}
