package com.trybe.contapoupanca;

/**
 * Método principal.
 */
public class ContaPoupanca {
  private double saldo;
  private String titularConta;

  public ContaPoupanca(String titularConta, double saldo) {
    this.saldo = saldo;
    this.titularConta = titularConta;
  }

  void depositar(double entry) {
    saldo = saldo + entry;
  }

  void sacar(double entry) {
    saldo = saldo - entry;
  }

  double mostrarSaldo() {
    return saldo;
  }

  String mostrarTitularConta() {
    return titularConta;
  }

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    ContaPoupanca objTeste = new ContaPoupanca("Carla Pereira", 5000);
    System.out.println("Saldo: " + objTeste.mostrarSaldo());
    System.out.println("Titular da Conta: " + objTeste.mostrarTitularConta());
  }

}

