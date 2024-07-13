//CRIANDO A CLASSE 'Aluno'
public class Aluno extends Pessoa{ //A CLASSE 'Aluno' ESTENDE A CLASSE 'Pessoa', JA QUE ALUNO É UMA PESSOA
   private String ra;
   private int disciplinas;
   private boolean matricula;

//METODO CONSTRUTOR - INICIA OS VALORES DOS ATRIBUTOS DO OBJETO CRIADO
   public Aluno(String nome, Data dataNascimento, String telefone, String ra){
      super(nome, telefone, dataNascimento);
      this.ra = ra;
   }
    
   public Aluno(String nome, Data dataNascimento, String ra){ //SOBRECARGA DO METODO CONTRUTOR
      super(nome, dataNascimento);
      this.ra = ra;
      
   }

//CRIANDO OS METODOS GET E SET, JA QUE OS ATRIBUITOS DA CLASSE SÃO PRIVADOS
   public void setRa( String ra){
      this.ra = ra;
   }
   public String getRa(){
      return this.ra;
   }
   
   public void setDisciplinas(int disciplinas){
      if (disciplinas < 0)
         System.out.println("Informe pelo menos uma materia");          
      else this.disciplinas = disciplinas;
   }
   public int getDisciplinas(){
      return this.disciplinas;
   }

//METODO MATRICULAR - QUANDO O OBJETO É CRIADO E OS ATRIBUTOS SÃO INICIADO(NO METODO CONSTRUTOR), A ' matricula' NÃO INICA COMO TRUE. ESSE MÉTODO SERVE PARA MATRICULAR
   public void matricular(int disciplinas){
      matricula = true;
      this.disciplinas = disciplinas;
   }
   
//FUNÇÃO DEFINIR - RETORNA CARGA SEMANAL DE ACORDO COM QUANTAS DISCIPLINAS O OBJETO TERÁ
   public double cargaSemanal(){
      double cargaHoraria_Semanal;
      cargaHoraria_Semanal = disciplinas * 4;  
      return cargaHoraria_Semanal;
   }
   
//FUNÇÃO TO STRING - POR MEIO DELE PODEMOS APENAS ESCREVER O NOME DO OBJETO CRIADO DENTRO DE UM "SYSTEM.OUT.PRINTLN", E IRÀ  MOSTRAR TODOS OS ATRIBUTOS DO OBJETO
   public String toString(){
        String aux;
        if(matricula == true){
           aux = "\nAluno está matriculado!\n Numeros disciplinas: "+disciplinas;
        }
        else 
        {
           aux = "\nAluno nao está matriculado!\n";
        }
           aux = aux + super.toString()+"\nRA: "+ra;   
           return aux;
   }
}