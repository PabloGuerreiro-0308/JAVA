package PETSHOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Appmain {
    public static void main(String[] args) {
     int i=0;
     Pet c1 = new Pet("Agostinho", 1 , 8.2 ,'M', 0);
     Pet c2 = new Pet("Lineu" , 1 , 10.0 , 'M', 1);
     Pet c3 = new Pet("Nenê", 1, 9.3, 'F', 2);
     Pet c4 = new Pet("Bebel",1, 9.1,'F',3);
     ArrayList<Pet> petsParaAdoçao = new ArrayList<>(); 
        petsParaAdoçao.add(c1);
        petsParaAdoçao.add(c2);
        petsParaAdoçao.add(c3);
        petsParaAdoçao.add(c4);
    Scanner sc = new Scanner(System.in);
    Responsavel r = new Responsavel("777.666.777-66","Didico",18); 
    while ( i != 4) {
        System.out.println("\n ====== ADOÇÃO DE PETS ====== \n O que deseja fazer? \n 1 - Adotar pet \n 2 Listar pets adotados \n 3 - Listar pets restantes \n 4 - Sair ");
            int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                Appmain.realizarAdocao(r, petsParaAdoçao, sc);
                break;
            case 2:
                Appmain.listarPetsAdotados(r);
                break;
            case 3:
                Appmain.listarPetsRestantes(petsParaAdoçao);
                break;
            case 4:
                System.out.println("Encerrando!");
                i=4;
                break;
            default:
                break;
        }
    }
}

private static void realizarAdocao(Responsavel r, ArrayList<Pet> petsParaAdocao, Scanner sc) {
    System.out.println("Informe qual pet deseja adotar ou pressione 0 para voltar: ");
    for (int i = 1; i <= petsParaAdocao.size(); i++) {
        System.out.println(i + " - " + petsParaAdocao.get(i-1).getInfoPet());
    }
    int numeroPet = sc.nextInt();
    if (numeroPet == 0) {
        return;
    }
    Pet candidato = petsParaAdocao.get(numeroPet-1);
    if (r.adotarPet(candidato)) {
        petsParaAdocao.remove(candidato);
        System.out.println("Pet " + numeroPet + " adotado com sucesso por:\n" + r.getInfoResponsavel());
    }
}

private static void listarPetsAdotados(Responsavel r) {
    System.out.println("\nPets adotados até o momento: ");
    System.out.println(r.listarPets());
}

private static void listarPetsRestantes(ArrayList<Pet> petsParaAdocao) {
    System.out.println("\nPets restantes para adoção: ");
    for (Pet p : petsParaAdocao) {
        System.out.println(p.getInfoPet());
    }
}





































}