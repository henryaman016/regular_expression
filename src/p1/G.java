package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class G {
public static void main(String[] args) {
	Pattern p=Pattern.compile("[0-9]{3}");
	Matcher m= p.matcher("9470416546");
	while(m.find()) {
		System.out.println(m.start()+"...."+m.group());
	}
}
}
