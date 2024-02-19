public class ConcatofNumber {
public static void main(String[] args) {
	String s="a3b2c4d1";
	String res="";
	
	for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		 if(ch>='0' &&ch<='9') {
	  for(char c='1';c<=ch;c++) {
		  res=res+s.charAt(i-1);
		  
	  }
		 }
	}
	System.out.println(res);
}
}