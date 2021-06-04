package BANCO;
import java.util.Scanner;
public class appMain {
    public static void main(String[] args){
    int i=0;  
    Scanner op= new Scanner(System.in);      
    contaBanco p1 = new contaBanco("Bradesco",4002,40028922,"Didicão",'P');
    while (i!=5) {
        System.out.println("Digite:\n 1 para saque\n 2 para depósito \n 3 para imprimir o extrato\n 4 para ver o saldo da conta\n 5 para sair.\n");
        int go= op.nextInt();
        switch (go) {
            case 1:
                System.out.println("Digite o valor a ser sacado!");
                float value=op.nextFloat();
                p1.saque(value);
                break;
        
            case 2:
                System.out.println("Digite o valor a ser depositado!");
                value=op.nextFloat();
                p1.deposito(value);
                break;
            
            case 3:
                p1.imprimirDados();
                break;
            
            case 4:
                System.out.println("O seu saldo é: R$ " + p1.getSaldoConta());
                
                break;
            case 5:
             System.out.println("Encerrando!");
                i=5;
                break;
            default :
                System.out.println("Número invalido!");
                break;
        }
    }
}}
   

 
    
    
    

    