import java.math.BigDecimal;
import java.util.*;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        BigDecimal saldo = new BigDecimal(0.00);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        String codigoAgencia = scanner.next();

        System.out.println("Por favor, digite um código de conta: ");
        int contaCorrente = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor do seu deposito inicial: ");
        BigDecimal deposito = scanner.nextBigDecimal();
        saldo = saldo.add(deposito);

       System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + codigoAgencia + ", conta " + contaCorrente + " e seu saldo de " + saldo + " já está disponível para saque.");
        
    }
}


