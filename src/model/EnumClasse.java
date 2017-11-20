package model;

public enum EnumClasse {
	
	GIGANTE("Gigante"), CAVALEIRO("Cavaleiro"), ARQUEIRA("Arqueira"),BRUXO("Bruxo"),DUENDE("Duende");

	public String classe;

	EnumClasse(String classe) {
		this.classe = classe;
	}
	
	public String getClasse(){
		return classe;
	}
	
	public static String getByInt(int classe){
		switch (classe) {
		case 1:
			return EnumClasse.GIGANTE.getClasse();
		case 2:
			return EnumClasse.CAVALEIRO.getClasse();
		case 3:
			return EnumClasse.ARQUEIRA.getClasse();
		case 4:
			return EnumClasse.BRUXO.getClasse();
		case 5:
			return EnumClasse.DUENDE.getClasse();

		default:
			return "ERRO";
		}
	}
	
}
