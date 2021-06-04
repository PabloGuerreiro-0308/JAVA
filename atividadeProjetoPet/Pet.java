package PETSHOP;
public class Pet{

private String nome;
private String raça;
private int idade;
private double peso;
private char sexo;
public static final String raças[] = {"Vira-Lata","Labrador","Pastor Alemão", "São Bernardo"};

public Pet(String nome, int idade, double peso, char sexo, int raça){

this.nome = nome;
this.idade = idade;
this.peso=peso;
this.raça = raças[raça];
this.sexo = sexo; 
}
public String getInfoPet(){

return "\n Nome: " + nome +"\n Raça: " + raça + "\n Idade: " + idade + "\n Peso: " + peso + "\n Sexo: " + sexo;



}
}