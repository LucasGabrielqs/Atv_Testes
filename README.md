# Validação de Identificadores — Testes Automatizados (Java + GitHub Actions)

## Descrição do Problema

O objetivo deste projeto é implementar e testar uma função que **valida identificadores** de acordo com regras específicas.  
Um identificador é considerado **válido** se:

1. Começa com uma **letra (maiúscula ou minúscula)**  
2. É seguido apenas por letras ou números  
3. Possui **entre 1 e 6 caracteres**

A classe `Identifier` contém o método `validateIdentifier(String s)` responsável por aplicar essas regras.  
A classe `Main` e/ou `IdentifierTest` executa os testes para verificar o comportamento esperado.

---

## Explicação — Classes de Equivalência e Valores Limite

Para garantir que a função de validação foi devidamente testada, foram definidas **classes de equivalência** (conjuntos de entradas que devem produzir o mesmo resultado) e **valores-limite** (entradas próximas aos limites de validade).

| Tipo de Classe | Descrição | Exemplo | Resultado Esperado |
|----------------|------------|----------|--------------------|
| CE1 | Identificador com apenas letras (válido) | `abcde` | ✅ Válido |
| CE2 | Identificador com letras e números (válido) | `a1234` | ✅ Válido |
| CE3 | Começa com número (inválido) | `123456` | ❌ Inválido |
| CE4 | Contém caracteres inválidos | `a1c@e` | ❌ Inválido |
| CE5 | Mais de 6 caracteres | `abcdefg` | ❌ Inválido |
| CE6 | Vazio | `""` | ❌ Inválido |

### Valores-Limite Considerados

| Caso | Descrição | Exemplo | Resultado Esperado |
|------|------------|----------|--------------------|
| VL1 | Tamanho mínimo (1 caractere válido) | `a` | ✅ Válido |
| VL2 | Tamanho máximo (6 caracteres válidos) | `abcdef` | ✅ Válido |
| VL3 | Excede limite (7 caracteres) | `abcdefg` | ❌ Inválido |

---

## Tabela de Casos de Teste

| ID | Entrada | Motivo | Esperado | Resultado |
|----|----------|---------|-----------|------------|
| CT01 | `abcde` | Somente letras | ✅ Válido | ✅ |
| CT02 | `abcdef` | Tamanho máximo | ✅ Válido | ✅ |
| CT03 | `a1234` | Letra inicial + números | ✅ Válido | ✅ |
| CT04 | `a1cde` | Caracter misto válido | ✅ Válido | ✅ |
| CT05 | `123456` | Inicia com número | ❌ Inválido | ✅ |
| CT06 | `abcdefg` | Excede tamanho | ❌ Inválido | ✅ |
| CT07 | `a1c@e` | Contém símbolo | ❌ Inválido | ✅ |

---

## Instruções para Executar os Testes Localmente

### Pré-requisitos
- **Java 25** instalado  
- **Maven** instalado (para execução simplificada dos testes)

---

### Executar com Maven

Dentro da pasta `Atv/`:

```bash
mvn test
