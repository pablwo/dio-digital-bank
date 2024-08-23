public class Main {

  public static void main(String[] args) {
    Banco banco = new Banco("Banco do Pablwo");
    Cliente cliente01 = new Cliente("pablwo");
    Cliente cliente02 = new Cliente("mattheus");

    Conta cc = new ContaCorrente(cliente01);
    Conta cp = new ContaPoupanca(cliente02);

    banco.adicionarConta(cc);
    banco.adicionarConta(cp);

    cc.depositar(2000);
    cc.imprimirExtrato();
    cp.imprimirExtrato();

    cc.transferir(1000, cp);
    cc.imprimirExtrato();
    cp.imprimirExtrato();

    banco.listarContas();
  }
}
