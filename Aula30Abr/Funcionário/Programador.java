package Aula30Abr;

public class Programador extends Funcionário{
	public Programador(double s) {
		this.salário=s;
	}

	@Override
	public void reajustar() {
		this.salário*=0.20;
	}
}
