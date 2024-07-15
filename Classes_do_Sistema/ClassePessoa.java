//CRIANDO A CLASSE 'Pessoa'
public class Pessoa{
   private String nome;
   private String telefone;
   private Data dataNascimento; //USANDO COMPOSIÇÃO, JA QUE O ATRIBUTO 'dataNascimento' É DO TIPO DATA
   
//METODO CONSTRUTOR - INICIA OS VALORES DOS ATRIBUTOS DO OBJETO CRIADO
   public Pessoa(String nome, String telefone, Data dataNascimento){
      this.nome = nome;
      this.telefone = telefone;
      this.dataNascimento = dataNascimento;
   }
   
   public Pessoa(String nome, Data dataNascimento){ //SOBRECARGA DO METODO CONTRUTOR
      this.telefone = "Sem atribuicao";
      this.nome = nome;
      this.dataNascimento = dataNascimento;
   }


//CRIANDO OS METODOS GET E SET, JA QUE OS ATRIBUITOS DA CLASSE SÃO PRIVADOS
   public void setNome(String nome){
      this.nome = nome;
   }
   public String getNome(){
      return this.nome;
   }
      
     
   public void setTelefone(String telefone){
      this.telefone = telefone;
   }
   public String getTelefone(){
      return this.telefone;
   } 


   public void setDataNascimento(Data DataNascimento){
      this.dataNascimento = dataNascimento;
   }

//FUNÇÃO TO STRING - POR MEIO DELE PODEMOS APENAS ESCREVER O NOME DO OBJETO CRIADO DENTRO DE UM "SYSTEM.OUT.PRINTLN", E IRÀ  MOSTRAR TODOS OS ATRIBUTOS DA CLASSE     
    public String toString(){
      return "\nNome: "+nome+"\nTelefone: "+telefone+"\nData nascimento: "+dataNascimento;
    }
}