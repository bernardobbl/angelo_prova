OBS:Quando for rodar o test professor ele vai dar rodar,mas vai dar um aviso que a versão do mockito que eu usei no exercício estará em breve fora de funcionamento. Porém tirando esse fator está tudo ok!




A função validar_cpf verifica se um CPF fornecido é válido de acordo com as regras brasileiras, que incluem a verificação de dois dígitos verificadores. O processo funciona da seguinte forma:

Remoção de caracteres não numéricos: Primeiro, a função elimina qualquer caractere não numérico (como pontos e traços) do CPF.

Validação de CPF com números repetidos: CPF com números repetidos, como "111.111.111-11" ou "222.222.222-22", são considerados inválidos.

Cálculo dos dígitos verificadores:

O primeiro dígito verificador é calculado com base nos 9 primeiros números do CPF, usando um cálculo com pesos específicos.

O segundo dígito verificador é calculado usando os 9 números originais mais o primeiro dígito verificador já calculado, também com pesos específicos.

Verificação de validade: Por fim, a função compara os dígitos verificadores calculados com os dois dígitos verificadores fornecidos no CPF. Se ambos forem iguais, o CPF é considerado válido, caso contrário, é inválido.

Essa abordagem garante que o CPF segue as regras de validação do número, tornando-o confiável para ser usado em sistemas que exigem validação de documentos.

