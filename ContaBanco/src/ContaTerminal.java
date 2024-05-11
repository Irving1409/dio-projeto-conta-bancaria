import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Conta Bancária</h1>
 * O Programa solicita as informações ao usuário e retorna o que foi fornecido no terminal
 * É um programa simples para prática do curso de Java
 * 
 * @author Irving Caetano
 * @version 1.0
 * @since 10/05/2024
 */

public class ContaTerminal {
    /**
     * 
     * @param args é passado os argumentos no terminal , Nome , Segundo Nome , Agência , Número da Conta
     * @throws Exception
     * @return é retornado no teminal uma menssagem com os dados fornecido no terminal , juntamente com o saldo da conta para saque!
     */
     public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner

        //Exibir as menssagens para o usuário

        // Obter pelo scanner os valores digitados no terminal

        //Exibir a menssagem da conta criada.
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("\n|--------------------|");
            System.out.println("|Sistema Bancário 1.0|");
            System.out.println("|--------------------|\n");
            
            System.out.println("DIGITE SEU PRIMEIRO NOME: ");
            String nome = scanner.next();

            System.out.println("DIGITE SEU SEGUNDO NOME: ");
            String segundoNome = scanner.next();
            
            System.out.println("DIGITE O NÚMERO DA SUA AGÊNCIA: ");
            String numeroAgencia = scanner.next();

            System.out.println("DIGITE NÚMERO DA SUA CONTA: ");
            int numeroConta = scanner.nextInt();
            float saldo = (float) 2000.84;
            System.out.println("\n");

            System.out.println("Olá  " + nome + " " + segundoNome + " obrigado por criar uma conta em nosso banco, sua agência é  " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " reais já está disponível para saque");
        }
    }
}
