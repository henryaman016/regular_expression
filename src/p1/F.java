package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F {
public static void main(String[] args) {
	Pattern p=Pattern.compile("[^a-zA-Z0-9]");
	Matcher m= p.matcher("a6b@#$9Dc8d1x7");
	while(m.find()) {
		System.out.println(m.start()+"...."+m.group());
	}
}
}
