package p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E {
public static void main(String[] args) {
	Pattern p=Pattern.compile("\\W");
	Matcher m=p.matcher("a6b Aa2a39 DeEQ!g");
	while(m.find()) {
		System.out.println(m.start()+"...."+m.group());
	}
}
}
