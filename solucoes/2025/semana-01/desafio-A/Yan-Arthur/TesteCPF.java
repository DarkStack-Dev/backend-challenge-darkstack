package Desafios.Cpf;

public class TesteCPF {
    public static void main(String[] args) {


        CPF cpf = new CPF();

        try {
            cpf.inputCPF();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
