package Aula30Abr;

public class Programador extends Funcion�rio{
	public Programador(double s) {
		this.sal�rio=s;
	}

	@Override
	public void reajustar() {
		this.sal�rio*=0.20;
	}
}
