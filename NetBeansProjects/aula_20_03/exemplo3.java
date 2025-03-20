package aula_20_03;

public class exemplo3 {
    public static void main(String[] args){
        String[] nomes = {"josé", "Maria", "Isabella"};
        int[] numeros = {1, 45, 23, 8, 32};
        for(String nome: nomes){
            System.out.println("nome: " + nome);
        }
        for (int numero: numeros){
            System.out.println("numero: " + numero);
        }
    }
}
