import re

def validar_cpf(cpf: str) -> bool:
    # 1. Limpeza: Remove todos os caracteres que não são dígitos
    cpf_limpo = re.sub(r'\D', '', cpf)

    # --- O participante implementa a partir daqui ---

    # 2. TODO: Verificação de Tamanho
    # Verifique se o cpf_limpo tem exatamente 11 dígitos.
    # Se não tiver, retorne False.


    # 3. TODO: Verificação de Dígitos Repetidos
    # Verifique se todos os dígitos são iguais (ex: "11111111111").
    # Dica: Você pode usar len(set(cpf_limpo)) == 1 para isso.
    # Se forem todos iguais, retorne False.


    # 4. TODO: Cálculo do Primeiro Dígito Verificador
    # Pegue os 9 primeiros dígitos do cpf_limpo.
    # Calcule o primeiro dígito usando o algoritmo fornecido.


    # 5. TODO: Cálculo do Segundo Dígito Verificador
    # Pegue os 10 primeiros dígitos do cpf_limpo (incluindo o primeiro dígito que você calculou).
    # Calcule o segundo dígito usando o algoritmo.


    # 6. TODO: Validação Final
    # Compare os dois dígitos calculados com os dois últimos dígitos do cpf_limpo.
    # Se ambos forem iguais, retorne True. Caso contrário, retorne False.


    # Lembre-se de apagar os comentários e retornar o valor booleano correto.
    return False # Retorno provisório

# --- Área de Testes ---
if __name__ == "__main__":
    print('--- Testando a Função validar_cpf ---')
    print('CPF "123.456.789-09" (válido):', validar_cpf("123.456.789-09"))
    print('CPF "111.111.111-11" (inválido - repetido):', validar_cpf("111.111.111-11"))
    print('CPF "123.456.789-10" (inválido - dígito incorreto):', validar_cpf("123.456.789-10"))
    print('CPF "12345678909" (válido - sem formatação):', validar_cpf("12345678909"))
    print('CPF "98765432100" (válido):', validar_cpf("98765432100"))