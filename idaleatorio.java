import java.util.Random;

class CalcularHoras{
    public static void main(String[] args) {
      
      //cria um objeto que sera utilizado para criar o id de consulta
      Random consulta = new Random();
      
     //garante que todos os numeros de consulta serao positivos
     int protocolo = consulta.nextInt(1000)*1234;
     
     //pede ao usuário o valor de horas trabalhadas na semana
            
       System.out.println("Por favor, anote o seu protocolo "+protocolo);
      }
    }
