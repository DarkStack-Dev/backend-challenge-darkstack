public class Main {
    public static void main(String[] args) {
        System.out.println(CpfValidator.validarCPF("123.456.789-09"));
        System.out.println(CpfValidator.validarCPF("12345678909"));
        System.out.println(CpfValidator.validarCPF("111.111.111-11"));
        System.out.println(CpfValidator.validarCPF("123.456.789-10"));
    }
}