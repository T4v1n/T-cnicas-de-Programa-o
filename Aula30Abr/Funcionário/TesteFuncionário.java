package Aula30Abr;

public class TesteFuncion�rio {

	public static void main(String[] args) {
    Programador p = new Programador(5000);
    Designer d = new Designer(500);
    p.reajustar();
    d.reajustar();
    System.out.println("Designer � gay e ganha " + d.sal�rio);
    System.out.println("Programador � based e ganha " + p.sal�rio);
	}
}
