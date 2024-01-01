package p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {

Pattern p=Pattern.compile("\\S");
Matcher m=p.matcher("a6b @#%9D e!536");
while(m.find()) {
	System.out.println(m.start()+"...."+m.group());
}
}
}
