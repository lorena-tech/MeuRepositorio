import java.util.Random;
import java.util.Scanner;

class CalcularHoras{
    public static void main(String[] args) {
      
      //cria um objeto que sera utilizado para criar o id de consulta
      Random consulta = new Random();
      
     //garante que todos os numeros de consulta serao positivos
     int protocolo = consulta.nextInt(1000)*1234;
     
     //pede ao usuario o valor de horas trabalhadas na semana
     
     System.out.println("VERIFICAR VALORES A RECEBER");
     System.out.println("---------------------");
     System.out.println("Digite o valor de horas trabalhadas durante a semana");
     
     Scanner horas = new Scanner(System.in);
     
     String horasTrabalhadas = horas.next();
     
     //cálculo do valor a receber
     int ValorAReceber;
     
     if (horasTrabalhadas<=40){
         
     }
     else{
         
     }
     
     //exibe o protocolo e o valor a receber
       System.out.println("\n Por favor, anote o seu protocolo "+protocolo);
      }
    }
