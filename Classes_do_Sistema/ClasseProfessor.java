
//CRIANDO A CLASSE 'Professor'
public class Professor extends Funcionario{ //A CLASSE 'Professor' ESTENDE A CLASSE 'Funcionario', JA QUE PROFESSOR É UM FUNCIONARIO
   private int horasAula;
   
//CRIANDO OS METODOS GET E SET, JA QUE OS ATRIBUITOS DA CLASSE SÃO PRIVADOS
   public void setHorasAula(int horasAula){
      this.horasAula = horasAula;
   }
   public int getHorasAula(){
      return horasAula;
   }

//METODO CONSTRUTOR - INICIA OS VALORES DOS ATRIBUTOS DO OBJETO CRIADO
   public Professor(String nome, String telefone, Data dataNascimento, String registro, double salario, int horasAula){
      super(nome, telefone, dataNascimento, registro, salario);
      this.horasAula = horasAula;
   }
   
   public Professor(String nome, Data dataNascimento, String registro, double salario, int horasAula){ //SOBRECARGA DO METODO CONTRUTOR
      super(nome, dataNascimento, registro, salario);
      this.horasAula = horasAula;
   }
   
//FUNCAO BONIFICAR - RETORNA O VALOR DE (10 x 'horasAula') DO OBJETO
   public double bonificar(){
      return 10 * horasAula;
   }

//FUNÇÃO SALARIO COM BONIFICAÇÃO - RETORNA O VALOR DO SALARIO + (10 x 'horasAula') DO OBJETO
   public double salarioComBonificacao(){
      return getSalario() + 10 * horasAula;
   }
   
//FUNÇÃO TO STRING - POR MEIO DELE PODEMOS APENAS ESCREVER O NOME DO OBJETO CRIADO DENTRO DE UM "SYSTEM.OUT.PRINTLN", E IRÀ  MOSTRAR TODOS OS ATRIBUTOS DO OBJETO
   public String toString(){
      return super.toString()+"\nHoras aula:"+horasAula;
   }
}
