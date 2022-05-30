/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3clientebanco.poo;

/**
 *
 * @author zacar
 */
public class ClienteBanco {

    
    public static void main(String[] args) {           
//        Cliente joao = new Cliente(); //ERRO ARMAZENAR INT MAIS DE 9 DIGITOS
//        joao.imprimeCli();
        
          Cliente c[] = new Cliente[2];  
          
          System.out.println("> Criando Objetos");     
          for (int i = 0; i < 2; i++) {
            System.out.println(" - Objeto > " + (i) );
            c[i] = new Cliente();
          }
             
          for (int i = 0; i < 2; i++) {
              System.out.println("Imprimindo especificos..");
              if(c[i].anoCad == 2022){
                  c[i].imprimeCliente();
              }
            
           }
          
//         System.out.println("> Mostrando Objetos Criados..");
//          for (int i = 0; i < 2; i++) {
//            System.out.println(" - Objeto > " + (i));
//            c[i].imprimeCliente();
//          }
    }
    
}
