/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vencimentos;

/**
 *
 * @author Duarte Nuno Amorim <1130674@isep.ipp.pt> 
 */
public class TesteVencimentos {
    
    public static void main(String[] args) {
        
        //1. Crie 3 objetos, um para cada tipo de trabalhador:
        
        //1a. Objeto tp, do tipo TrabPeca, de nome Jorge Silva que produziu 20 peças do tipo 1 e 30 do tipo 2;
        TrabPeca tp = new TrabPeca("Jorge Silva", 20, 30);
        //1b. Objeto tc, do tipo TrabCom, de nome Susana Ferreira, com o salário base de 500,00 € e uma comissão de 6% sobre as vendas efetuadas que totalizaram o valor de 1500,00 €;
        TrabCom tc = new TrabCom("Susana Ferreira", 500, 1500, 6);
        //1c. Objeto th, do tipo TrabHora, de nome Carlos Miguel, que ganha por hora 3,50 € e com um total de horas de trabalho igual a 160.
        TrabHora th = new TrabHora("Carlos Miguel", 160, 3.5f);

        //2. Crie um contentor de objetos para guardar os objetos existentes. Este contentor deve ser um array do tipo Object com comprimento 10.
        Object[] trabs = new Object[10];

        //3. Guarde os objetos existentes no contentor. 
        trabs[0]=tp;
        trabs[1]=tc;
        trabs[2]=th;
        
        //4.Programe as seguintes listagens independentes, obtidas através do varrimento do contentor com uma instrução for tradicional:
        
        //4a. Listagem das representações textuais dos trabalhadores;
        System.out.println("\n--- Listagem de Trabalhadores: ---");
        for(int i=0; i<trabs.length; i++) {
            if(trabs[i]!=null) {
                Trabalhador t = (Trabalhador) trabs[i];
                System.out.printf("Nome: %s  Vencimento: %.2f €%n", t.getNome(), t.vencimento());
            }
        }
        
        //4b. Listagem das representações textuais apenas dos trabalhadores à hora;
        System.out.println("\n--- Listagem de Trabalhadores à Hora: ---");
        for(int i=0; i<trabs.length; i++) {
            if(trabs[i] instanceof TrabHora) {
                   System.out.println(trabs[i].toString());
            }
        }
        
        //4c. Listagem dos nomes dos trabalhadores existentes, acompanhadas dos respetivos vencimentos.
        System.out.println("\n--- Listagem de Trabalhadores Nome e Vencimento: ---");
        for(int i=0; i<trabs.length; i++) {
            if(trabs[i]!=null) {
                System.out.printf("Nome: %s  Vencimento: %.2f €%n", ((Trabalhador) trabs[i]).getNome(), ((Trabalhador) trabs[i]).vencimento());
            }
        }
        
        //5. Substitua o tipo Object do array pelo tipo Trabalhador (é o tipo mais genérico da hierarquia de classes).
        Trabalhador[] trab = new Trabalhador[10];
        trab[0]=tp;
        trab[1]=tc;
        trab[2]=th;
        
        //6. Simplifique o código das listagens.
        
        //6a. Listagem das representações textuais dos trabalhadores;
        System.out.println("\n--- Listagem de Trabalhadores: ---");
        for(int i=0; i<trab.length; i++) {
            if(trab[i]!=null) {
                System.out.printf("Nome: %s  Vencimento: %.2f €%n", trab[i].getNome(), trab[i].vencimento());
            }
        }
        
        //6b. Listagem das representações textuais apenas dos trabalhadores à hora;
        System.out.println("\n--- Listagem de Trabalhadores à Hora: ---");
        for(int i=0; i<trab.length; i++) {
            if(trab[i] instanceof TrabHora) {
                   System.out.println(trab[i].toString());
            }
        }
        
        //6c. Listagem dos nomes dos trabalhadores existentes, acompanhadas dos respetivos vencimentos.
        System.out.println("\n--- Listagem de Trabalhadores Nome e Vencimento: ---");
        for(int i=0; i<trab.length; i++) {
            if(trab[i]!=null) {
                System.out.printf("Nome: %s  Vencimento: %.2f €%n", trab[i].getNome(), trab[i].vencimento());
            }
        }
            
        //7. Crie uma instância clone da instância tp.
        TrabPeca tpc = new TrabPeca(tp);        
        
        //8. Compare esta nova instância com a instância original tp, usando o método equals. 
        System.out.printf("%nOs objectos:%n%s%ne%n%s%nsão %s.%n", tpc, tp, (tpc.equals(tp) ? "iguais" : "diferentes"));
    } 

}
