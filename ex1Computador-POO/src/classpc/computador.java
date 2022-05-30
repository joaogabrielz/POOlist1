/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classpc;


/**
 *
 * @author zacar
 */
public class computador {
   
  //caracteristicas - atributos / variaveis  . instancia
    public String tipo; //tipo mesa, notebook...
    public String processador; //intel ou amd e geração
    public double precoProcessador;
    public double precoMemoriaRam;
    public double precoHD;
    public double precoMonitor;
   
   //comportamento - metodos/funcoes - getters e setters
    
    //Getters
    public String getTipo(){
        
     return tipo;
    }
    public String getProcessador(){
    
     return processador;
    }
    public double getPrecoProcessador(){
        
     return precoProcessador;
    }
    public double getPrecoMemoriaRam(){
        
     return precoMemoriaRam;
    }
    public double getPrecoHD(){
    
     return precoHD;
    }
    public double getPrecoMonitor(){
    
     return precoMonitor;
    }
    
    
    //Setters
    public void setTipo(String tipoP){
    
       tipo = tipoP;
    }
    public void setTipo(){
    
       tipo = Input.readString("Digite um Novo tipo de PC: ");
    }
    
    public void setProcessador(String processadorP){
    
       processador = processadorP;
    }
    public void setProcessador(){
    
       processador = Input.readString("Digite um novo Processador: ");
    }
    
    
    public void setPrecoProcessador(double precoProcessadorP){
    
       precoProcessador = precoProcessadorP;
    }
    public void setPrecoMemoriaRam(double precoMemoriaRamP){
    
       precoMemoriaRam = precoMemoriaRamP;
    }
    public void setPrecoHD(double PrecoHDP){
    
       precoHD = PrecoHDP;
    }
    public void setPrecoMonitor(double precoMonitorP){
    
       precoMonitor = precoMonitorP;
    }
    
    //Metodo/Funcao
    public void calculaPreco(){
     
      double precoTotal = precoProcessador + precoMemoriaRam + precoHD + precoMonitor;
      System.out.println("Preco total é: "+ precoTotal);
    }
     public void mostraConfig(){
    
      System.out.println("-Objeto do tipo COMPUTADOR criado-");
      System.out.println("Tipo de Computador: "+ tipo);
      System.out.println("Processador: "+ processador);
    }
    
    
    //construtor padrao (sem param)
    public computador(){   
        tipo = Input.readString("Digite o tipo do pc Desktop, Notebook: ");
        processador = Input.readString("Marca Processador Intel ou Amd e Geração: ");
        
        precoProcessador = Input.readDouble("Preco Processador: ");
        precoMemoriaRam = Input.readDouble("Preco Memoria RAM: ");
        precoHD = Input.readDouble("Preco HD: ");
        precoMonitor = Input.readDouble("Preco Monitor: ");
    }
    
    //construtor (COM PARAMETROS)
    public computador(String tipoP, String processadorP, double PrecoprocessadorP, double PrecoMemoriaRamP, double precoHDP, double precoMonitorP){   
        tipo = tipoP;
        processador = processadorP;
        precoProcessador = PrecoprocessadorP;
        precoMemoriaRam = PrecoMemoriaRamP;
        precoHD = precoHDP;
        precoMonitor = precoMonitorP;
    }

    public static void main(String[] args) {
        
        
        
      //Cria uma variavel de Referencia
        computador meupc; 
        
 //Cria um Objeto do Tipo Computador - //Este chama seu construtor() Padrao                                  
      meupc = new computador(); //Se houver somente o construtor com parametros sera necessario passar parametros
                               //caso nao tenha nenhum um sem parametros é inserido aotomaticamento na classe
    
      //Metodos/Funcoes para mostrar
        meupc.mostraConfig(); 
        meupc.calculaPreco();
  System.out.println("---------------------------------");       
      System.out.println(">  Mudando configs do MESMO pc [PC1] -");
      //Usando setters pedindo valor por input
        meupc.setTipo();
        meupc.setProcessador();
        
      System.out.println("-[    Precos agora definidos via parametro..   ]");
        //Precos Desfinidos via Parametro nos setters
        meupc.setPrecoProcessador(1000);
        meupc.setPrecoMemoriaRam(50);
        meupc.setPrecoHD(50);
        meupc.setPrecoMonitor(20.2);
       //Metodos/Funcoes para mostrar
        meupc.mostraConfig();
        meupc.calculaPreco();
        
 //------------------------------------------------------------------------------------
   System.out.println("---------------------------------");
     System.out.println(">  CRIANDO OBJETVO  [PC2] COM MESMOS VALOR apontanod [PC1] ^ ");
     
     //Cria uma variavel de Referencia
       computador meupc2;
       
      //Meupc2 aponta pra pc1 anteriormente criado
        meupc2 = meupc; //OU seja Ao mudar um Sobrescreve O Outro!
        
      //Metodos/Funcoes para mostrar
        meupc2.mostraConfig();
        meupc.calculaPreco();
 
 //------------------------------------------------------------------------------------               
     //setando novo tipo de Processador
      System.out.println(">        Mudando Processador [PC 2] ");
        meupc2.setProcessador();
        meupc2.mostraConfig();
         meupc.calculaPreco();
         
//------------------------------------------------------------------------------------      
    System.out.println("---------------------------------");
      
      System.out.println(">     Vizualizando Processador [PC 1] Novamente .. ");
      System.out.println(">  Foi sobrescrito .. ");
        meupc.mostraConfig();
        meupc.calculaPreco();
//------------------------------------------------------------------------------------     
   System.out.println("---------------------------------");
    System.out.println(">    CRIANDO UM NOVO OBJETOV DO TIPO Computador [PC3] ");
     //Cria uma variavel de Referencia
        computador meupczao;
        
        meupczao = new computador("DESKTOP", "RYZEN 7", 6000.00, 3000.00, 1000.00, 50.2);
        
        meupczao.mostraConfig();
        meupczao.calculaPreco();
        
          
        
    }
    
}
