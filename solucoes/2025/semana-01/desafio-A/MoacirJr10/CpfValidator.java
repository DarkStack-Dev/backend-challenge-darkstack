public class CpfValidator {

    public static boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("\\D", "");
        if (cpf.length() != 11 || cpf.chars().distinct().count() == 1) {
            return false;
        }
        int soma = 0;
        int peso = 10;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * peso--;
        }
        int resto = soma % 11;
        int digitoVerificador1 = (resto < 2) ? 0 : 11 - resto;

        if (digitoVerificador1 != (cpf.charAt(9) - '0')) {
            return false;
        }
        soma = 0;
        peso = 11;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * peso--;
        }
        resto = soma % 11;
        int digitoVerificador2 = (resto < 2) ? 0 : 11 - resto;

        if (digitoVerificador2 != (cpf.charAt(10) - '0')) {
            return false;
        }

        return true;
    }
}