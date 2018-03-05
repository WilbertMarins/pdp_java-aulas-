import java.util.Scanner;
public class Execucao_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "e uma";
		String s2 = new String("string");
		String s3 = s1 + " " + s2 ;
		String s4 = " Exemplo de: " + s2;
		int tam;
		System.out.println(s3);
		System.out.println(s4);
		tam = s4.length();//tamanho da string
		System.out.println(tam);
		System.out.println(s4.toUpperCase());//tudo caixa alta
		
		System.out.println(s1.toUpperCase() + " " + s2.toLowerCase());
		
		s1+=s2;
		
		if(s1.equals(s2)) {//comparacao
			System.out.println("iguais");
		}
		else {
			System.out.println("diferentes");
		}
		
		System.out.println(s2.compareTo(s1));
		
		
		

	}

}
