package stringMethods;

public class ReplaceMethod {
	public static void main(String[] args) {
		String str="Ra1n2i456789";
		String output=str.replace("1","").replace("2","").replace("4","");
		System.out.println(output);
		
		str=str.replaceAll("[0-9]", "");
		System.out.println(str);
		
		String str1="rAN890i1234";
		String ou=str1.replaceAll("[^\\d]","");  //to remove all non numeric characters
		System.out.println(ou);
		
		String str2="r12ani4567@!.123";
		str2=str2.replaceAll("[a-z0-9]"," ");
		System.out.println(str2);
		
	
	}

}
