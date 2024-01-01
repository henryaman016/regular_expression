package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
public static void main(String[] args) {
	Pattern p=Pattern.compile("[a-z]");
	Matcher m= p.matcher("a6b@#$9Dcdefx");
	while(m.find()) {
		System.out.println(m.start()+"...."+m.group());
	}
}
}
