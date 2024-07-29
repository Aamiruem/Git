package Git.two.Javacode;
class L7_3StringBufferAndStringBuilder {
	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer("Kamran");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("Hussain");
		System.out.println(sb);
		
		String str=sb.toString();
		System.out.println(str);
		
		sb.deleteCharAt(2);
		sb.insert(0,"Java");
		sb.insert(6,"java");
		sb.setLength(30);
		sb.ensureCapacity(100);
		
		System.out.println(sb);
	
	}
}
