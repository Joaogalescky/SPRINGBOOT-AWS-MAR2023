package aplicacao;

public class ProgramaForEach {
	
	public static void main (String[] args) {
		
		String[] vetor = new String[] {"Maria", "Bob", "Carlos"};
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("--------------------");
		for (String obj : vetor) { //obj é apenas um "apelido" no for each
			System.out.println(obj);
		}
	}
}
