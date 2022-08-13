package application;

public class Program {

	public static void main(String[] args) {

		String[]  nomes = {"CARLOS", "EDUARDO", "DA", "COSTA", "XAVIER"};
		
		System.out.println(convertName(nomes));

	}
	
	public static String convertName(String[] s) {
		String nomeCompleto = s[0];
		for (int i = 1; i < s.length ; i++ ) {
			nomeCompleto += " " + s[i];
		}
		return nomeCompleto;
	}

}
