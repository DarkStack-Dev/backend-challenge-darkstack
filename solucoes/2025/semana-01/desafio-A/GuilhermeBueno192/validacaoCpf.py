import re

def calculo_digito(cpf: str, quantidade_de_digitos: int) -> int:
    soma_produtos = 0
    for i in range(quantidade_de_digitos):
        soma_produtos += int(cpf[i]) * ( (quantidade_de_digitos+1) - i )
    digito = 11 - (soma_produtos % 11)
    digito = digito if digito < 10 else 0
    return digito

def validar_cpf(cpf: str) -> bool:
    cpf_limpo = re.sub(r'\D', '', cpf)
    
    if  len(cpf_limpo) != 11 or len(set(cpf_limpo)) == 1:
        return False
    
    primeiro_digito = calculo_digito(cpf_limpo, 9)
    segundo_digito = calculo_digito(cpf_limpo, 10)
    
    if primeiro_digito == int(cpf_limpo[-2]) and segundo_digito == int(cpf_limpo[-1]):
        return True
    else:
        return False 


if __name__ == "__main__":
    print('--- Testando a Função validar_cpf ---')
    print('CPF "123.456.789-09" (válido):', validar_cpf("123.456.789-09"))
    print('CPF "111.111.111-11" (inválido - repetido):', validar_cpf("111.111.111-11"))
    print('CPF "123.456.789-10" (inválido - dígito incorreto):', validar_cpf("123.456.789-10"))
    print('CPF "12345678909" (válido - sem formatação):', validar_cpf("12345678909"))
    print('CPF "98765432100" (válido):', validar_cpf("98765432100"))