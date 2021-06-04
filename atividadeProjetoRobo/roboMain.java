package atividadeRobo;

import java.util.Scanner;

public class roboMain {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i <= 3){
                System.out.println(" Digite 1 para escolher o robô médico. \n Digite 2 para escolher o robô arqueológo \n Digite 3 para sair!");
                int x = sc.nextInt();
                switch(x){
                    case 1: 
                    roboMedico bot1 = new roboMedico();
                      System.out.println(bot1.iniciar());
                    System.out.println("O que devo fazer? \n Digite 1 para realizar corte \n Digite 2 para realizar costura  \n Digite 3 para recarregar! \n Digite 4 para desligar");    
                    int y = sc.nextInt();
                    if (y == 1) {
                            Scanner sc2 = new Scanner(System.in);
                            System.out.println("Qual orgão irei cortar?");
                            String orgao = sc2.nextLine();
                             System.out.println(bot1.cortar(orgao));
                              
                     } else if (y == 2){
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("Qual orgão irei costurar?");
                        String orgao = sc2.nextLine();
                        System.out.println( bot1.costurar(orgao));
                       

                     } else if (y == 3){
                            System.out.println(bot1.recarregar());
                        
                     } else {
                        System.out.println(bot1.desligar());
                        
                     }
                                
                    break;
                    case 2:
                     roboArquelogo bot2 = new roboArquelogo();
                     Scanner sc3 = new Scanner(System.in);
                        System.out.println(bot2.iniciar());
                        System.out.println("O que devo fazer? \n Digite 1 para cavar \n Digite 2 para recarregar  \n Digite 3 para desligar!");
                        int z = sc3.nextInt();
                        if (z == 1){
                                Scanner sc4 = new Scanner(System.in);
                                    System.out.println("Digite o local que irei realizar o serviço!"); 
                                    String local = sc4.nextLine();
                                    System.out.println(bot2.cavar(local));
                                    
                                
                        } else if(i == 2){
                            System.out.println(bot2.recarregar());

                                }else {

                                        System.out.println(bot2.desligar());

                                }
                                break;

                    case 3:             
            
                       System.out.println("Saindo!");         
            
                                i = 4;
            
                        break;
            
                    default:
                    
                    System.out.println("Selecione uma opção válida!");

                                break;

                            }

        }

     }

 }



