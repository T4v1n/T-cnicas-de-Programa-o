package Loja;

public class LojaShopping extends Loja{
private String gerente;
private String endere�o;

public void LojaShopping(String cnpj, String raz�oS, boolean aberta, String gerente, String endere�o) {
this.cnpj = cnpj;
this.gerente = gerente;
this.aberta = aberta;
this.gerente = gerente;
this.endere�o = endere�o;
}

@Override
public String toString() {
	return "cnpj: " + cnpj 
			+ " raz�oS: " + raz�oS 
			+ " aberta?: " + aberta 
			+ " gerente " + gerente 
			+ " endere�o " + endere�o;
}
}
