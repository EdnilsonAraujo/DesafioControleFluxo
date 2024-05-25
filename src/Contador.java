import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            
            contar(parametroUm, parametroDois);
            
        } catch (parametrosInvalidosException e) {
            System.out.print(e.getMessage());
        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws parametrosInvalidosException {
        if (parametroUm > parametroDois) throw new parametrosInvalidosException("Parâmetros inválidos");
        int contagem = parametroDois - parametroUm;

        for (int i = 0; i < contagem; i++) {
            System.out.println(i);
        }
    }



}
