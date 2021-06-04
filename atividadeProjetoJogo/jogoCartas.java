package projetoJogo;

import java.util.ArrayList;



public class jogoCartas extends jogo {
    private int qtdJogadores = 4;
    private ArrayList<String> deck;
    public jogoCartas(String nome, float precoUnitario, int clasEtaria,  ArrayList<String> deck,int qtdJogadores) {
        super(nome, precoUnitario, clasEtaria);
        this.qtdJogadores = 4;
        this.deck = deck;

    }
    public  String getDeck() {
        String decks="Deck: ";
        for (String dec : deck) {
            decks += dec + "; ";
        }
            return decks;
    }
   
    @Override
    public String toString() {
        
        return super.toString() + "| Quantidade de jogadores: "+ qtdJogadores;
    }








}
    
    

 

  
    

