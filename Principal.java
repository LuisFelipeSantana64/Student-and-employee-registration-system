
//CRIANDO A CLASSE 'Principal' CLASSE QUE SERÁ TESTADA TODAS AS CLASSES E SEUS RESPECTIVOS METODOS E FUNÇOES
public class Principal{
    public static void main(String args[]){ 
    
       Data Nascimento[] = new Data[4]; //É CRIADO 4 OBJETOS DA CLASSE 'Data', CADA DATA SERÁ USADA COMO PARAMETRO
       Nascimento[0] = new Data(16, 02, 2005);
       Nascimento[1] = new Data(01, 03, 2004);
       Nascimento[2] = new Data(11, 12, 2008);
       Nascimento[3] = new Data (11, 01, 1988);
       
       Aluno aluno1 = new Aluno("Felipe", Nascimento[0], "23011557"); //CRIO UM OBJETO DA CLASSE 'Aluno'
       aluno1.matricular(2);
       System.out.println ("\nCarga horaria semanal de "+aluno1.getNome()+": "+aluno1.cargaSemanal()); 
       
       Funcionario funcionarios[] = new Funcionario[3]; //É CRIADO 3 OBJETOS DA CLASSE 'Funcionario'
       funcionarios[0] = new Funcionario("Aline", Nascimento[1], "66778", 1000); 
       funcionarios[1] = new Professor("Igor", Nascimento[2], "13666", 5000, 25); //GRAÇAS AO POLIMORFISMO POSSO DEFINIR O 'Funcionario[1], SENDO DA CLASSE 'Professor', JA QUE PROFESSOR É UM FUNCIONARIO, ENTÃO INICIA SEUS ATRIBUTOS COM O CONSTRUTOR DE 'Professor'
       funcionarios[2] = new Chefe("Simon", "42991444", Nascimento[3], "22222", 2000, "Chefe geral");//GRAÇAS AO POLIMORFISMO POSSO DEFINIR O 'Funcionario[2], SENDO DA CLASSE 'Chefe', JA QUE CHEFE É UM FUNCIONARIO, ENTÃO INICIA SEUS ATRIBUTOS COM O CONSTRUTOR DE 'Chefe'
 
       
       for(int i = 0 ; i<funcionarios.length ; i++ ){ //LOOP PARA MOSTRAR NA TELA TODAS OS ATRIBUTOS DE CADA 'Funcionarios[]'
          System.out.println(funcionarios[i]);
       }
 //CHAMANDO OS METODOS PARA SOMAR TODOS OS 'salario' e 'salarioComBonificacao', DE 'funcionarios[]'
       ControleSalario.somarSalario(funcionarios); 
       ControleSalario.somarSalarioBonificado(funcionarios);    
    }
 }
 