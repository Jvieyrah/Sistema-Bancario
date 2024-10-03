package com.trybe.contabancaria;

/**
 * Classe ContaBancaria.
 **/

public class ContaBancaria {
  /**
   * Atributos.
   **/
  private Cliente cliente;
  private int saldo;

  /**
   * Métodos.
   **/
  public ContaBancaria() {
    super();
    this.cliente = new Cliente();
    this.saldo = 0;
  }

  public void setNomeCliente(String nome) {
    this.cliente.setNome(nome);
  }

  public String getNomeCliente() {
    return this.cliente.getNome();
  }

  public void setCpfCliente(String cpf) {
    this.cliente.setCpf(cpf);
  }

  public String getCpfCliente() {
    return this.cliente.getCpf();
  }

  /**
   * Métodos.
   **/
  public int depositar(int valor) {
    this.saldo += valor;
    return this.saldo;
  }

  /**
   * Métodos.
   **/
  public int sacar(int valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor;
    }
    return this.saldo;
  }

  public int verSaldo() {
    return this.saldo;
  }
}
