package BANCO;

import java.io.PrintStream;

public class contaBanco {
    String nomeBanco;
    int numeroAgencia;
    int numeroConta;
    private String nomeTitular;
    private char tipo;
    private float saldo;
    private float limite;

public contaBanco(String nomeBanco, int numeroAgencia,int numeroConta,String nomeTitular, char tipo){
this.nomeBanco= nomeBanco;
this.numeroAgencia= numeroAgencia;
this.numeroConta=numeroConta;
this.nomeTitular= nomeTitular;
this.saldo= 0.0f;
this.limite=500.0f;
this.tipo= tipo;
}



    void saque(float valor) {

        if (valor > limite) {
            System.out.println("\nO valor de saque é maior do que o limite!\n");

        } else {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("\nOperação realizada com sucesso!\n");
                System.out.printf("Seu novo saldo é: %.2f R$\n",saldo);
                ;
            } else {
                System.out.println("\nVocê não possui saldo suficiente!\n");
            }

        }

    }

    void deposito(float valorDeposito) {
        saldo += valorDeposito;
        System.out.println("\nOperação realizada com sucesso!\n");
        System.out.printf("Seu novo saldo é: %.2f R$\n",saldo);

    }

   PrintStream imprimirDados(){
     return System.out.printf("\n========EXTRATO BANCÁRIO======== \nNome do Banco: %s \nNumero da agencia: %d \nNumero da Conta: %d \nNome do Titular: %s \nTipo de conta: %c \nSaldo da conta: %.2f R$\n ================================\n ", nomeBanco,numeroAgencia,numeroConta,nomeTitular,tipo,saldo);
       


}

      public float  getSaldoConta(){
                return this.saldo;
        }

}