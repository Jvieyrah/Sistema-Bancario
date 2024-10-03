package com.trybe.contabancaria;

/**
 * Classe Cliente.
 **/

public class Cliente {
  /**
   * Atributos.
   **/
  private String nome;
  private String cpf;

  /**
   * Métodos.
   **/
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  /**
   * valida cpf.
   *
   */
  public void setCpf(String cpf) {
    boolean isValid = ValidaCpf.validarCpf(cpf);
    if (isValid) {
      this.cpf = cpf;
    } else {
      this.cpf = null;
    }
  }

  public String getCpf() {
    return this.cpf;
  }

}
