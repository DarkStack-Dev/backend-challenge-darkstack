public class ValidadorCPF {

    public static boolean validar(String cpf) {
        // 1. Limpeza: Remove todos os caracteres que não são dígitos
        String cpfLimpo = cpf.replaceAll("\\D", "");

        // --- O participante implementa a partir daqui ---

        // 2. TODO: Verificação de Tamanho
        // Verifique se cpfLimpo tem exatamente 11 caracteres.
        // Se não tiver, retorne false.


        // 3. TODO: Verificação de Dígitos Repetidos
        // Verifique se todos os dígitos são iguais (ex: "11111111111").
        // Dica: Você pode usar uma expressão regular como cpfLimpo.matches("(\\d)\\1{10}")
        // Se forem todos iguais, retorne false.


        // 4. TODO: Cálculo do Primeiro Dígito Verificador
        // Pegue os 9 primeiros dígitos de cpfLimpo.
        // Calcule o primeiro dígito usando o algoritmo. Lembre-se de converter char para int.


        // 5. TODO: Cálculo do Segundo Dígito Verificador
        // Pegue os 10 primeiros dígitos de cpfLimpo.
        // Calcule o segundo dígito usando o algoritmo.


        // 6. TODO: Validação Final
        // Compare os dois dígitos calculados com os dois últimos dígitos de cpfLimpo.
        // Se ambos forem iguais, retorne true. Caso contrário, retorne false.


        // Lembre-se de apagar os comentários e retornar o valor booleano correto.
        return false; // Retorno provisório
    }

    // --- Área de Testes ---
    public static void main(String[] args) {
        System.out.println("--- Testando a Função validar ---");
        System.out.println("CPF \"123.456.789-09\" (válido): " + validar("123.456.789-09"));
        System.out.println("CPF \"111.111.111-11\" (inválido - repetido): " + validar("111.111.111-11"));
        System.out.println("CPF \"123.456.789-10\" (inválido - dígito incorreto): " + validar("123.456.789-10"));
        System.out.println("CPF \"12345678909\" (válido - sem formatação): " + validar("12345678909"));
        System.out.println("CPF \"98765432100\" (válido): " + validar("98765432100"));
    }
}