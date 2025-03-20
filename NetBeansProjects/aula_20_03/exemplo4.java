package aula_20_03;

public class exemplo4 {
    public static void main(String[] args){
        int[] valores = {1, 67, 45, 5, 43};
        try{
        valores[5] = 14;
        } catch (Exception e){
            System.out.println("erro "+ e.getMessage());
        }
    }
}
