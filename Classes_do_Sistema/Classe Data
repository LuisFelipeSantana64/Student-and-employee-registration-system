//CRIANDO A CLASSE 'Data'
public class Data{ 
   private int dia;
   private int mes;
   private int ano;  
   
//CRIANDO OS METODOS GET E SET, JÁ QUE OS ATRIBUITOS DA CLASSE SÃO PRIVADOS
   public void setDia(int dia){
      if(dia > 0 && dia < 32 )
         this.dia = dia;
       else System.out.println("\nO dia precisa ser entre 1 e 31");
   }
    public int getDia(){
      return this.dia;
   } 
   
   
   public void  setMes( int mes){
      if(mes > 0 && mes < 13)
         this.mes = mes;
      else System.out.println("\nO mes precisa ser entre 1 e 12");
   }  
   public int getMes(){
      return this.mes;
   }
   
  
   public void setAno(int ano){
      if(ano > 1950)
         this.ano = ano;
      else System.out.println("\nO ano precisa ser apartir de 2024");
   }
   public int getAno(){
      return this.ano;
   }
   
//FUNÇAO TO STRING - POR MEIO DELE PODEMOS APENAS ESCREVER O NOME DO OBJETO CRIADO DENTRO DE UM "SYSTEM.OUT.PRINTLN", E IRÀ  MOSTRAR TODOS OS ATRIBUTOS DA CLASSE
   public String toString(){
      String inform;
      inform = +dia+"/"+mes+"/"+ano;     
      return inform;    
   }
   
//METODO CONSTRUTOR - INICIA OS VALORES DOS ATRIBUTOS DO OBJETO CRIADO
   public Data(int dia, int mes, int ano){
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
   }
}   