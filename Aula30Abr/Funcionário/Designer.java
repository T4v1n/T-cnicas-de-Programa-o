package Aula30Abr;

public class Designer extends Funcion�rio{
	public Designer(double s) {
		this.sal�rio=s;
	}
	
	@Override
	public void reajustar() {
		this.sal�rio*=0.10;
	}
}
