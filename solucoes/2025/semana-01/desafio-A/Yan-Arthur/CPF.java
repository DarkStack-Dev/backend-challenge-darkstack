package Desafios.Cpf;

import java.util.Scanner;

public class CPF {

    private Scanner input = new Scanner(System.in);
    private String cpfDigitado = "";
    private String cpfValido = "";

    private int somaTotal = 0;
    private int primeiroDigito = 0;
    private int segundoDigito = 0;

    public CPF() {
    }

    public void inputCPF() {

        System.out.print("Digite o CPF: ");
        cpfDigitado = input.nextLine();

        cpfDigitado = cpfDigitado.replace(".", "");
        cpfDigitado = cpfDigitado.replace("-", "");

        if (cpfDigitado.equals("11111111111") || cpfDigitado.equals("22222222222") ||
                cpfDigitado.equals("33333333333") || cpfDigitado.equals("44444444444") || cpfDigitado.equals("55555555555")
                || cpfDigitado.equals("66666666666") || cpfDigitado.equals("77777777777") || cpfDigitado.equals("88888888888")
                || cpfDigitado.equals("99999999999") || (cpfDigitado.length() != 11 && cpfDigitado.length() != 14)) {
            System.out.println("CPF invalido");
        } else {
            primeiroDigito();
            segundoDigito();
            validacaoDoCPF();
        }

    }


    public void primeiroDigito() {

        somaTotal = 0;

        int i = 0;
        int j = 10;

        while (i < 9) {
            somaTotal += (Integer.parseInt((cpfDigitado.charAt(i) + "")) * j);
            i++;
            j--;
        }
        int resto = (somaTotal % 11);

        if (resto < 2) {
            primeiroDigito = 0;
        } else {
            primeiroDigito = 11 - resto;
        }
        cpfValido = cpfDigitado.substring(0, 9) + primeiroDigito;
    }

    public void segundoDigito() {
        somaTotal = 0;

        int i = 0;
        int j = 11;

        while (i < 10) {
            somaTotal += (Integer.parseInt((cpfDigitado.charAt(i) + "")) * j);
            i++;
            j--;
        }
        int resto = (somaTotal % 11);

        if (resto < 2) {
            segundoDigito = 0;
        } else {
            segundoDigito = 11 - resto;
        }
        cpfValido += segundoDigito;
    }

    public void validacaoDoCPF() {
        if (cpfDigitado.equals(cpfValido)) {
            System.out.println("O CPF: " + cpfDigitado + " é válido");
        } else {
            System.out.println("CPF inválido");
            System.out.println("CPF com os digitos corretos: " + cpfValido);
        }
    }
}
