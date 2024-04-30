package Aula30Abr;

public class Designer extends Funcionário{
	public Designer(double s) {
		this.salário=s;
	}
	
	@Override
	public void reajustar() {
		this.salário*=0.10;
	}
}
