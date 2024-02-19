public class Comparemethod {
public static void main(String[] args) {
	String s="Abcdefgh";
	for(int i=0;i<s.length();i++) {
	int count=0;
	for(int j=1;j<=i;j++) {
		if(i%j==0) {
			count++;	
		}
	}
	if(count==2) {
		System.out.print(s.charAt(i));
	}
	
	}