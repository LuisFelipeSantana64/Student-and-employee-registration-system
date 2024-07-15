//CRIANDO A CLASSE 'ControleSalario'
public class ControleSalario{ 
     
    //CRIANDO UM METODO ESTÁTICO QUE SOMA O ATRIBUTO 'salario' DE TODOS OS OBJETOS, DO VETOR QUE FOI PASSADO POR PARAMETRO - O METODO PODE SER ACESSADO SEM SER PRECISO CRIAR UM OBJETO DA CLASSE 'ControleSalario'  
       public static void somarSalario(Funcionario vetor[]){
          double somaSalario = vetor[0].getSalario();
          for(int i=1; i<vetor.length; i++){
             somaSalario = somaSalario + vetor[i].getSalario();
          }
          System.out.println("\nSoma do salario de todos os funcionario: "+somaSalario);
       }
       
    //CRIANDO UM MÉTODO ESTÁTICO QUE SOMA O 'salarioComBonificao' DE TODOS OS OBJETOS, DO VETOR QUE FOI PASSADO POR PARAMETRO - O METODO PODE SER ACESSADO SEM SER PRECISO CRIAR UM OBJETO DA CLASSE 'ControleSalario'     public static void somarSalario(Funcionario vetor[]){ 
       public static void somarSalarioBonificado(Funcionario vetor[]){
          double somaSalarioBonificado = vetor[0].salarioComBonificacao();
          for(int i=1; i<vetor.length; i++){
             somaSalarioBonificado = somaSalarioBonificado + vetor[i].salarioComBonificacao();
          }
          System.out.println("Soma do salario bonificado de todos os funcionario: "+somaSalarioBonificado);
       }               
    }