package Loja;

public abstract class Loja {
protected String cnpj;
protected String raz�oS;
protected boolean aberta;

public void Loja(String cnpj, String raz�oS, boolean aberta) {
this.cnpj = cnpj;
this.raz�oS = raz�oS;
this.aberta = false;
}

public String toString() {
	return "cnpj: " + cnpj + " raz�oS: " + raz�oS + " aberta?: " + aberta;
}
}
