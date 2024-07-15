
//CRIANDO A CLASSE 'Chefe'
public class Chefe extends Funcionario{ //A CLASSE 'Chefe' ESTENDE A CLASSE 'Funcionario', JA QUE CHEFE TAMBÉM É UM FUNCIONARIO
   private String cargo;
      
//CRIANDO OS METODOS GET E SET, JA QUE OS ATRIBUITOS DA CLASSE SÃO PRIVADOS
   public void setCargo(String cargo){
      this.cargo = cargo;
   }
   public String getCargo(){
      return this.cargo;
   }
         
//METODO CONSTRUTOR - INICIA OS VALORES DOS ATRIBUTOS DO OBJETO CRIADO
   public Chefe(String nome, String telefone, Data dataNascimento, String registro, double salario, String cargo){
      super(nome, telefone, dataNascimento, registro, salario);
      this.cargo = cargo;
   }
   
   public Chefe(String nome, Data dataNascimento, String registro, double salario, String cargo){ //SOBRECARGA DO METODO CONTRUTOR
      super(nome, dataNascimento, registro, salario);
      this.cargo = cargo;
   }
       
//FUNCAO BONIFICAR - RETORNA O VALOR DE 20% DO SALARIO DO OBJETO
   public double bonificar(){
      return super.getSalario() * 0.2;
   }
  
//FUNÇÃO SALARIO COM BONIFICAÇÃO - RETORNA O VALOR DO SALARIO + O BONUS DE 20% DO SALARIO 
   public double salarioComBonificacao(){
      double soma;
      soma = getSalario() + getSalario() * 0.2;
      return soma;
   }

//FUNÇÃO TO STRING - POR MEIO DELE PODEMOS APENAS ESCREVER O NOME DO OBJETO CRIADO DENTRO DE UM "SYSTEM.OUT.PRINTLN", E IRÀ  MOSTRAR TODOS OS ATRIBUTOS DO OBJETO
   public String toString(){
      String temp;
      temp = super.toString()+"\nCargo: "+ this.cargo;
      return temp;
   }
}

