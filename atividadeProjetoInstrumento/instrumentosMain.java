package atividadeInstrumento;

import java.util.Scanner;

public class instrumentosMain {
       

    public static void main(String[] args) {

         int i = 0;
         int o = 0;
        Scanner c = new Scanner(System.in);
        while (o != 1){

     System.out.println(
                "------------Escolha o instrumento ------------ \n Digite 1 para violão \n Digite 2 para flauta \n Digite 3 para o tambor! \n Digite qualquer outra coisa para sair!");
        int x = c.nextInt();
        if (x == 1) {
            while (i != 1) {

                violao instrumento1 = new violao();
                System.out.println(" Digite 1 para escolher tocar uma música com o violão! \n Digite 2 para afinar o instrumento! \n Digite 3 para sair!");    
                Scanner cc = new Scanner (System.in);
                int y = cc.nextInt();
                if (y == 1){
                     Scanner ccc = new Scanner (System.in);
                        System.out.println("Escolha a música! ");
                        String musica = ccc.nextLine();
                        System.out.println(instrumento1.tocar(musica));

                } else if(y == 2){

                        System.out.println(instrumento1.afinar());

                } else{


                            System.out.println("Encerrando");
                             i = 1;   
                             o = 1;
                }

            }
            
    } else if (x == 2){   
            while (i != 1) {
                flauta instrumento2 = new flauta();

                System.out.println(" Digite 1 para escolher tocar uma música com a flauta! \n Digite 2 para afinar o instrumento! \n Digite 3 para sair!");    
                Scanner cc = new Scanner (System.in);
                int y = cc.nextInt();
                if (y == 1){
                     Scanner ccc = new Scanner (System.in);
                        System.out.println("Escolha a música! ");
                        String musica = ccc.nextLine();
                        System.out.println(instrumento2.tocar(musica));

                } else if(y == 2){

                        System.out.println(instrumento2.afinar());

                } else{


                            System.out.println("Encerrando");
                             i = 1;   
                             o = 1;

                } 


    }
}else if(x == 3){
    while (i != 1) {

        percussao instrumento3 = new percussao();
        System.out.println(" Digite 1 para escolher tocar uma música com o tambor! \n Digite 2 para afinar o instrumento! \n Digite 3 para sair!");    
        Scanner cc = new Scanner (System.in);
        int y = cc.nextInt();
        if (y == 1){
             Scanner ccc = new Scanner (System.in);
                System.out.println("Escolha a música! ");
                String musica = ccc.nextLine();
                System.out.println(instrumento3.tocar(musica));

        } else if(y == 2){

                System.out.println(instrumento3.afinar());

        } else{


                    System.out.println("Encerrando");
                     i = 1;   
                     o = 1;   
        }

    }




 } else {

 System.out.println("Encerrando!");
 o = 1;

 }





        }
   





}
}
