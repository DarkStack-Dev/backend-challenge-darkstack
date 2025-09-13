public class ValidarCpf {
    



public static boolean validarCpf (String cpf){

String cpfLimpo = cpf.replaceAll("[.-]", "");

if (cpfLimpo.length() !=11) {
    
    return false;
}
if (cpfLimpo.matches("(\\d)\\1{10}")) {
    return false;}

int peso =10;
int soma =0;

for (int i =0; i< 9; i++){

int digito = Character.getNumericValue(cpfLimpo.charAt(i));
    
    soma +=digito*peso;
    peso--;


}

int resto = soma%11;
int primeiroDigitoVerificador = (resto < 2) ? 0 : (11 - resto);
int primeiroDigitoOriginal = Character.getNumericValue(cpfLimpo.charAt(9));


if (primeiroDigitoVerificador != primeiroDigitoOriginal) {

    return false;
    
}

 
     soma=0;
     peso=11;

     for(int i =0; i < 10; i++ ){

                        //char digito = cpfLimpo.charAt(i);
                       int digito = Character.getNumericValue(cpfLimpo.charAt(i));
                      
                       soma += digito*peso;

                        peso--;     
                    
                }

  resto = soma % 11;
  int segundoDigitoVerificador = (resto < 2) ? 0 : (11 - resto);
int segundoDigitoOriginal = Character.getNumericValue(cpfLimpo.charAt(10));
                

                

 if (  segundoDigitoVerificador != segundoDigitoOriginal) {
                
                
                return false;



            } 
                return true;
            



/* 
 if (resto < 2 ) {

            int cpfDigito =cpfLimpo.charAt(9);

            cpfDigito = 0;

            return true;
            
           }else{

               int cpfDigito =cpfLimpo.charAt(9);

               cpfDigito = 11 - resto;

               return true;

           } 
          
*/
           


}


public static void main(String[] args) {
    
String cpf="19958970783";

ValidarCpf teste = new ValidarCpf();

System.out.println(teste.validarCpf(cpf));

}

}
