import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int parametroUm = sc.nextInt();
        int parametroDois = sc.nextInt();

        try{
            System.out.println("A contagem de " + parametroUm + " até " + parametroDois + " é: " + contar(parametroUm, parametroDois));
        } catch (ParametrosInvalidosException e){
            System.out.println("O primeiro número deve ser menor que o segundo");
            System.out.println("Fim do programa");
            e.printStackTrace();
        }


    }

    public static class ParametrosInvalidosException extends Exception{

    }

    public static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;

        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosException();

        return contagem;
    }


}