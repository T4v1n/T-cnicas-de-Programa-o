package Loja;

public abstract class Loja {
protected String cnpj;
protected String razãoS;
protected boolean aberta;

public void Loja(String cnpj, String razãoS, boolean aberta) {
this.cnpj = cnpj;
this.razãoS = razãoS;
this.aberta = false;
}

public String toString() {
	return "cnpj: " + cnpj + " razãoS: " + razãoS + " aberta?: " + aberta;
}
}
