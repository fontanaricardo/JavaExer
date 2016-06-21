
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Crie uma função que receba os dois vetores abaixo
		 * e retorne um inteiro com número de vezes que uma ocorrência 
		 * se repete nos dois vetores
		 */
		
		String[] array1 = { "2", "4", "6", "8", "10", "12", "14" };
		String[] array2 = { "3", "6", "9", "12", "14", "16", "18"};
		
		int i = 0;
		
		for (String s1 : array1) {
			for (String s2 : array2) {
				if(s1.equals(s2)){
					i = i + 1;
				}
			}
		}
		
		System.out.println(i);
	}

}
