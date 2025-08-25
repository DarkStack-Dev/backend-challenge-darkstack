function validarCPF(cpf) {
  // 1. Limpeza: Remove todos os caracteres que não são dígitos
  const cpfLimpo = cpf.replace(/\D/g, '');

  // --- O participante implementa a partir daqui ---

  // 2. TODO: Verificação de Tamanho
  // Verifique se o cpfLimpo tem exatamente 11 dígitos.
  // Se não tiver, retorne false.


  // 3. TODO: Verificação de Dígitos Repetidos
  // Verifique se todos os dígitos são iguais (ex: "11111111111").
  // Dica: Você pode usar um Set ou uma expressão regular para isso.
  // Se forem todos iguais, retorne false.


  // 4. TODO: Cálculo do Primeiro Dígito Verificador
  // Pegue os 9 primeiros dígitos do cpfLimpo.
  // Calcule o primeiro dígito usando o algoritmo fornecido.


  // 5. TODO: Cálculo do Segundo Dígito Verificador
  // Pegue os 10 primeiros dígitos do cpfLimpo (incluindo o primeiro dígito que você calculou).
  // Calcule o segundo dígito usando o algoritmo.


  // 6. TODO: Validação Final
  // Compare os dois dígitos calculados com os dois últimos dígitos do cpfLimpo.
  // Se ambos forem iguais, retorne true. Caso contrário, retorne false.


  // Lembre-se de apagar os comentários e retornar o valor booleano correto.
  return false; // Retorno provisório
}

// --- Área de Testes ---
console.log('--- Testando a Função validarCPF ---');
console.log('CPF "123.456.789-09" (válido):', validarCPF("123.456.789-09"));
console.log('CPF "111.111.111-11" (inválido - repetido):', validarCPF("111.111.111-11"));
console.log('CPF "123.456.789-10" (inválido - dígito incorreto):', validarCPF("123.456.789-10"));
console.log('CPF "12345678909" (válido - sem formatação):', validarCPF("12345678909"));
console.log('CPF "98765432100" (válido):', validarCPF("98765432100"));