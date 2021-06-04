package BANCO;
public class appMain {
    public static void main(String[] args){
        contaBanco p1= new contaBanco();
        p1.nomeBanco="Bradesco";
        p1.numeroAgencia=4002;
        p1.numeroConta=400289222;
        p1.nomeTitular="Didicão";
        p1.tipo='P';
        p1.saldo = 5000;
        p1.limite=6000;
        p1.imprimirDados();
        p1.saque(192.0f);
        p1.imprimirDados();
        p1.deposito(4000f);
        p1.imprimirDados();
    }      
   
}
   

 
    
    
    

    