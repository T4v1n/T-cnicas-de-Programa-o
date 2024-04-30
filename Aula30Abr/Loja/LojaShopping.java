package Loja;

public class LojaShopping extends Loja{
private String gerente;
private String endereço;

public void LojaShopping(String cnpj, String razãoS, boolean aberta, String gerente, String endereço) {
this.cnpj = cnpj;
this.gerente = gerente;
this.aberta = aberta;
this.gerente = gerente;
this.endereço = endereço;
}

@Override
public String toString() {
	return "cnpj: " + cnpj 
			+ " razãoS: " + razãoS 
			+ " aberta?: " + aberta 
			+ " gerente " + gerente 
			+ " endereço " + endereço;
}
}
