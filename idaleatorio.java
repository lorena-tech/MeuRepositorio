import java.util.Random;

class CalcularHoras{
    public static void main(String[] args) {
      
      //cria um objeto que sera utilizado para criar o id de consulta
      Random consulta = new Random();
      
     //garante que todos os numeros de consulta serao positivos
      for (int i = 0; i < 1; i++) {
            int protocolo = consulta.nextInt(1000)*1234;
            
            System.out.println("Por favor, anote o seu protocolo "+protocolo);
      }
    }
}
