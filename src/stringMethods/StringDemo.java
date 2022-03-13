package stringMethods;

public class StringDemo {
	public static void main(String[] args) {
		String str="Rani";
		String str1="Rani";
		String str2="rani";
		String str3=new String("Rani");
		System.out.println(str);
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		System.out.println(str1==str3);
		System.out.println(str==str2);
	}

}
