import java.util.Scanner;

import Exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o numero inicial: ");
        int primeiroNum = sc.nextInt();
        sc.nextLine();
        System.out.print("digite o numero final: ");
        int segundoNum = sc.nextInt();
        sc.nextLine();

        try {
            calculaValor(primeiroNum, segundoNum);

        } catch (ParametrosInvalidosException e) {
            System.out.println();
            System.out.println("Parametros inseridos são invalidos: " + e.getMessage());
        }
        sc.close();
    }

    public static void calculaValor(int primeiroNum, int segundoNum) throws ParametrosInvalidosException {
        if (primeiroNum > segundoNum) {
            throw new ParametrosInvalidosException("Valor inicial é maior que o final");
        }
        int calculaNum = segundoNum - primeiroNum;
        for (int i = 1; i <= calculaNum; i++) {
            System.out.println("Imprimindo o numero " + i);
        }

    }
}
