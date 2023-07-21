package placement;

public class Character {
	public static void main(String args[]) {
	char s='K';
	char arr[]= {'a','A','e','E','i','I','o','O','u','U'};
	 if((s>='A'&&s<'Z')||(s>='a'&&s<='z')) {
		 System.out.println("It is an alphabet");
		 for(int i=0;i<arr.length;i++) {
			 if(s==arr[i]) {
				 System.out.println("It is a vowel");
			 }
			 
		 }
		 System.out.println("It is a consonant");
	 }
	 
	 

}
}