package BANCO2;

import java.util.Scanner;

public class AppMain {

public static void main(final String[] args) {
    contaBanco cb1= new contaBanco("141414-1", "Seu Madruga", 'P');
    cb1.deposito(500.0f);
    cb1.saque(300.0f);
    
    contaBanco cb2= new contaBanco("717171-7", "Dona Clotilde", 'C');
    cb2.deposito(1500.0f);

    agencia ag= new agencia(12345, "Tangamandápio");
    ag.adicionarConta(cb1);
    ag.adicionarConta(cb2);
    System.out.println(ag.listarContas());
   









}}