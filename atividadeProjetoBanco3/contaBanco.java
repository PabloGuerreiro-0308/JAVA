package BANCO2;

public class contaBanco{
        private String numeroConta;
        private String nomeTitular;
        private char tipo;
        private float saldo;
        private float limite;
    
    public contaBanco(String numeroConta, String nomeTitular, char tipo){
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

    String exibirDados(){
    
    return " \n Numero da conta: " + numeroConta + " | Nome do titular: " + nomeTitular + "\n Tipo da conta: " + tipo + "| Saldo: " + saldo;
    
    
    }}