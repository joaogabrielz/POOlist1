/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2codigopostal.poo;


public class codigoPostal {

 //caracteristicas - atributos / variaveis  . instancia
    public int indicativo;
    public int extensao;
    public String rua;
    
 // getters e setters
    //getters
    public int getIndicativo(){
     return this.indicativo;
    }
    public void setIndicativo(){
     this.indicativo = Input.readInt("Digite o Indicativo os 5 Primeiros Numeros: ");
    }
    
    public int getExtensao(){
     return this.extensao;
    }
    public void setExtensao(){ 
     this.extensao = Input.readInt("Digite a Extensao os 3 Ultimos Numeros: ");
    }
    
    public String getRua(){
     return this.rua;
    }
    public void setRua(){
     this.rua = Input.readString("Digite a Rua: ");
    }
   
   
   //Setters por param
    public void setIndicativo(int indicativov){
     this.indicativo = indicativov;
    }
    public void setExtensao(int extensaov){
     this.extensao = extensaov;
    }
    public void setRua(String ruav){
     this.rua = ruav;
    }
    
  // Metodos/Funcoes Comportamentos
    public void info(){    
        
        if(this.indicativo == 0 && this.extensao == 0 && this.rua == ""){
          System.out.println("!CEP: Indisponível");
        }
        else if(this.extensao == 0){;
          System.out.println("!CEP: "+ this.indicativo + " -0- " + this.rua);
        }
        else{
          System.out.println("CEP: "+ this.indicativo + "-" + this.extensao + " " + this.rua);
        }
     
    }
    
    //Construtor
    public codigoPostal(){
        this.indicativo = Input.readInt("Digite o Indicativo os 5 Primeiros Numeros: ");
        this.extensao = Input.readInt("Digite a Extensao os 3 Ultimos Numeros: ");
        this.rua = Input.readString("Digite a Rua: ");

    }
   //Construtor com Params.
    public codigoPostal(int indicativov, int extensaov, String ruav){      
        this.indicativo = indicativov;
        this.extensao = extensaov;
        this.rua = ruav;
    }
     
    
    public static void main(String[] args) {
      
        codigoPostal meuCodigotst;
        
        System.out.println("> Criando Obj1 codigo.. ");
        meuCodigotst = new codigoPostal(); //Ja chama construtor!
        meuCodigotst.info();
        
        System.out.println("> Sobrescrevendo obj1.. [com 0 e ' '] ");
        meuCodigotst.setIndicativo(0);
        meuCodigotst.setExtensao(0); //com zero na frente aparece outro numero ou o corta
        meuCodigotst.setRua("");
        meuCodigotst.info();
        
        System.out.println("> Criando Novo Objeto2 recebendo o antigo obj1");
        codigoPostal meuCodigo2 = meuCodigotst; // >>> NAO chama o construtor!
        meuCodigotst.setIndicativo(11111);
        meuCodigotst.setExtensao(222);
        meuCodigo2.setRua();
        meuCodigo2.info();
        
        System.out.println("> Remostrando Codigo obj1 antigo..");
         meuCodigotst.info();
         
         
       System.out.println(">Criando Objeto3  ");
         codigoPostal endereco3; 
         endereco3 = new codigoPostal(9999, 190 , "AUTOMATICO"); //chamao construtor
         endereco3.info();
         System.out.println("Sobrecrevendo rua: ");
         endereco3.setRua();
         endereco3.info();
    }
    
}
