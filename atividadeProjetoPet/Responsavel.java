package PETSHOP;

import java.util.ArrayList;

public class Responsavel {

private String cpf;
private String nome;
private int Idade;
private ArrayList<Pet> petsAdotados;

public Responsavel(String cpf, String nome, int idade) {

    this.cpf = cpf;
    this.nome = nome;
    this.Idade = idade;

    petsAdotados = new ArrayList<>();
}
public boolean adotarPet(Pet pet) {

    if (Idade >= 18) {
        petsAdotados.add(pet);
    return true;
} else {
    return false;
}





}
String listarPets(){

    String listarPets="";

for (Pet pet : petsAdotados) {
   listarPets += pet.getInfoPet();
}
return listarPets;

}
String getInfoResponsavel(){

return "\n Nome:" + nome + "\n Idade: " + Idade + "\n CPF: " +cpf; 







}








}










