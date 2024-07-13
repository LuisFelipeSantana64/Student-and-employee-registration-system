
//CRIANDO A CLASSE 'Funcionario'
public class Funcionario extends Pessoa{ //A CLASSE 'Funcionario' ESTENDE A CLASSE 'Pessoa', JA QUE FUNCIONÁRIO É UMA PESSOA
   private String registro;
   private double salario;
  
//METODO CONSTRUTOR - INICIA OS VALORES DOS ATRIBUTOS DO OBJETO CRIADO
   public Funcionario(String nome, String telefone, Data dataNascimento, String registro, double salario){
      super(nome, telefone, dataNascimento);
      this.registro = registro;
      this.salario = salario;
   }
  
   public Funcionario(String nome,  Data dataNascimento, String registro, double salario){ //SOBRECARGA DO METODO CONTRUTOR
      super(nome, dataNascimento);
      this.registro = registro;
      this.salario = salario;
   }

  
//CRIANDO OS METODOS GET E SET, JA QUE OS ATRIBUITOS DA CLASSE SÃO PRIVADOS
   public void setRegistro(String registro){
      this.registro = registro;
   }
   public String getRegistro(){
      return this.registro;
   }
   
   
   public void setSalario(double salario){
      this.salario = salario;
   }
   public final double getSalario(){
      return this.salario;
   }
   
//FUNÇÃO TO STRING - POR MEIO DELE PODEMOS APENAS ESCREVER O NOME DO OBJETO CRIADO DENTRO DE UM "SYSTEM.OUT.PRINTLN", E IRÀ  MOSTRAR TODOS OS ATRIBUTOS DO OBJETO
   public String toString(){
      String aux;
      aux = super.toString()+"\nRegistro:: "+registro+"\nSalario: "+salario;
      return aux; 
   }
  
//FUNCAO BONIFICAR - RETORNA O VALOR DE 10% DO SALARIO DO OBJETO
   public double bonificar(){
      return salario * 0.10;
   } 
  
//FUNÇÃO SALARIO COM BONIFICAÇÃO - RETORNA O VALOR DO SALARIO + O BONUS DE 10% DO SALARIO 
   public double salarioComBonificacao(){
      return salario + salario * 0.10;
   }
}
