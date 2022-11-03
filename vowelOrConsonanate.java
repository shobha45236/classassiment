package javaproject;

public class vowelOrConsonanate {

	public static void main(String[] args) {
	
		
	char ch='A';
	if ((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o'||ch=='O')||(ch=='u'||ch=='U'))
		System.out. println(ch+ " is vowel");
	//
	else if((ch>=48)&&(ch<=57))
		System.out.println(ch+ "is number");
	//
	else
		System.out.println(ch+ "is consonant");
//	char ch='a';
	int unicode=ch;
	System.out.println("unicode of a is :"+unicode);
	}

}
//A=65 B=65 c=45
//a=