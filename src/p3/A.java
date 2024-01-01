package p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
public static void main(String[] args) {
	int count=0;
	Pattern p=Pattern.compile("\\s");
	Matcher m=p.matcher("1jkabcd");
	while(m.find()) {
		count++;
//		System.out.println(count);
	}if(count!=0) {
		System.out.println("Error");
	}else {
		System.out.println("Input Accepted");
	}
}
}
