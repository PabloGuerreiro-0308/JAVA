package BANCO;

import java.io.PrintStream;

public class contaBanco {
    String nomeBanco;
    int numeroAgencia;
    int numeroConta;
    String nomeTitular;
    char tipo;
    float saldo;
    float limite;

    void saque(float valor) {

        if (valor > limite) {
            System.out.println("\nO valor de saque é maior do que o limite!\n");

        } else {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("\nOperação realizada com sucesso!\n");
                ;
            } else {
                System.out.println("\nVocê não possui saldo suficiente!\n");
            }

        }

    }

    void deposito(float valorDeposito) {
        saldo += valorDeposito;
        System.out.println("\nOperação realizada com sucesso!\n");

    }

   PrintStream imprimirDados(){
     return System.out.printf("\n========EXTRATO BANCÁRIO======== \nNome do Banco: %s \nNumero da agencia: %d \nNumero da Conta: %d \nNome do Titular: %s \nTipo de conta: %c \nSaldo da conta: %.2f R$ ", nomeBanco,numeroAgencia,numeroConta,nomeTitular,tipo,saldo);
       


}
}