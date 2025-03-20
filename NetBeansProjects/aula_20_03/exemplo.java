package aula_20_03;

public class exemplo {    
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int[] vetor1 = {1, 65, 100, 201};
        String[] nome = new String[4];
        String[] sobreNome = {" Silva", " Carmino", " Genuino", " Andrade"};
        vetor[0] = 19;
        vetor[4] = 28;
        nome[0] = "Maria";
        nome[1] = "José";
        nome[2] = "Isabella";
        nome[3] = "Samuel";

        System.out.println("Hoje o " + nome[3] + sobreNome[3] + " faz " + vetor[0]+ " anos! Feliz aniversário meu amor!" + " obrigada pelos nossos " + vetor1[3] + " dias!!");

        System.out.println("Tamanho " + vetor1.length);
        System.out.println("elemento " + vetor1[0]);
    }
}
