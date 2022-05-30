/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3clientebanco.poo;


public class Cliente {
    
    public String nome;
    public int cpf;
    public String endereco;
    public int telefone;
    public String profissao;
    public int anoCad;
    
      
  //Getters
    public String getNome(){
    return this.nome;
    }
    public int getCpf(){
    return this.cpf;
    }
    public String getEndereco(){
    return this.endereco;
    }
    public int getTelefone(){
    return this.telefone;
    }
    public String getProfissao(){
    return this.profissao;
    }
    public int getAnoCad(){
    return this.anoCad;
    }
    
  //Setters
    public void setNome(String nomev){
    this.nome = nomev;
    }
    public void setCpf(int cpfv){
    this.cpf = cpfv;
    }
    public void setEndereco(String enderecov){
    this.endereco = enderecov;
    }
    public void setTelefone(int telefonev){
    this.telefone = telefonev;
    }
    public void setProfissao(String profissaov){
    this.profissao = profissaov;
    }
    public void setAnocad(int anocadv){
    this.anoCad = anocadv;
    }
    
   //constuctor
    public Cliente(String nomev, int cpfv, String enderecov, int telefonev, String profissaov, int anocadv){
     System.out.println("> Objeto Criado <");
    this.nome = nomev;
    this.cpf = cpfv;
    this.endereco = enderecov;
    this.telefone = telefonev;
    this.profissao = profissaov;
    this.anoCad = anocadv;  
    }
    
    public Cliente(){
     System.out.println("> Objeto Criado <");
        
    this.nome = Input.readString("Nome Cliente: ");
    this.cpf = Input.readInt("CPF: ");
    this.endereco = Input.readString("endereco: ");
    this.telefone = Input.readInt("Telefone: ");
    this.profissao = Input.readString("Profissao: ");
    this.anoCad = Input.readInt("Ano Cadastro: ");
    }
    
    public void imprimeCliente(){
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Profissao: " + this.profissao);
        System.out.println("Ano Cadastro: " + this.anoCad);
    }
    
    public void ImprimeCliPorParam(int cpf){
     System.out.println("--------------------");
     System.out.println("Nome: " + this.nome);
     System.out.println("CPF: " + cpf);
    }
    
    public void consultaPorAno(int ano){
      if(this.getAnoCad() == ano){
          System.out.println("--------------------");
          System.out.println("Cliente: " + this.getNome());
          System.out.println("Ano: " + this.getAnoCad());
      }
    }
}
