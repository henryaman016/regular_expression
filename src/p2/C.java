package p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C {
public static void main(String[] args) {
	Pattern p=Pattern.compile("\\d");
	Matcher m= p.matcher("a6b@ #$9Dc 8d1x7");
	while(m.find()) {
		System.out.println(m.start()+"...."+m.group());
	}
}
}
