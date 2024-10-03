package com.trybe.contabancaria;

/**
 * Classe ValidaCpf.
 **/

public class ValidaCpf {
  /**
   * Métodos.
   **/
  public static boolean validarCpf(String cpf) {
    String trimmed = cpf.replaceAll("[.,-]", " ").trim();
    if (trimmed.length() != 11) {
      return false;
    }
    int soma1 = 0;

    for (int i = 0; i < 9; i++) {
      int conta = Integer.parseInt(String.valueOf(trimmed.charAt(i))) * (10 - i);
      soma1 += conta;
    }

    int resto1 = soma1 % 11;
    int digito1 = (resto1 < 2) ? 0 : (11 - resto1);

    int soma2 = 0;
    for (int i = 0; i < 10; i++) {
      int conta = Integer.parseInt(String.valueOf(trimmed.charAt(i))) * (11 - i);
      soma2 += conta;
    }
    int resto2 = soma2 % 11;
    int digito2 = (resto2 < 2) ? 0 : (11 - resto2);

    return Integer.parseInt(String.valueOf(trimmed.charAt(9))) == digito1
        && Integer.parseInt(String.valueOf(trimmed.charAt(10))) == digito2;
  }
}
