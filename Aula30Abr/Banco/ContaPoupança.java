package Banco;

public class ContaPoupança implements Conta{
private double saldo;
	@Override
	public boolean depositar(double valor) {
		saldo = valor + valor * 0.005;
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
