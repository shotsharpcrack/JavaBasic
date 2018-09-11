package stringBuilders;

public class TestStrings {

	public static void main(String[] args) {
		String s = new String("abc");
		String s1 = s;
		s += "d";
		String s2 = s;
		
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("------------------------");
		
		StringBuilder sb = new StringBuilder("xyz");
		StringBuilder sb2 = sb.append("d");
		System.out.println(sb == sb2);
		System.out.println(sb);
		
		sb.append("a").append("d").append("bb");
		System.out.println("------------------------");
		
		StringBuffer sbf = new StringBuffer("xyz");
		StringBuffer sbf2 = sbf.append("d");
		System.out.println(sbf == sbf2);
		System.out.println(sbf);
		
		sbf.append("a").append("d").append("bb");
		
		Object[] a = new Object[2];
		while(true) {
			Object[] o = new Object[2];
			o[0] = a;
			o[1] = 999999999;
			a = o;
		}
	}
}
