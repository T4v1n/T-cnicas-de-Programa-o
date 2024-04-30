package Banco;

public class ContaCorrente implements Conta{
	private double saldo;
	
	 public ContaCorrente(double saldoInicial) {
        this.saldo = saldo;
    }

	public boolean depositar(double valor) {
		if (valor > 0){
			this.saldo += valor;
		}
		return false;
	}

	@Override
	public boolean sacar(double valor) {
		if (valor > 0) {
			this.saldo -= valor;
		}
		return false;
	}

	@Override
	public double getSaldo() {
		return 0;
	}
}
