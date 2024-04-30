package Aula30Abr;

public class TesteFuncionário {

	public static void main(String[] args) {
    Programador p = new Programador(5000);
    Designer d = new Designer(500);
    p.reajustar();
    d.reajustar();
    System.out.println("Designer é gay e ganha " + d.salário);
    System.out.println("Programador é based e ganha " + p.salário);
	}
}
