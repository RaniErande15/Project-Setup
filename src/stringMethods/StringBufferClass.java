package stringMethods;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Rani");
		sb.append("Erande");
		System.out.println(sb);
		
		String s="Rani";
		s.concat("Erande");
		System.out.println(s);
		
		StringBuilder s1=new StringBuilder("Rani");
		s1.append("Erande");
		System.out.println(s1);
	}
}
