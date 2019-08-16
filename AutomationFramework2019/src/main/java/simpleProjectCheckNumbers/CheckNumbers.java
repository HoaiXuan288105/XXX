package simpleProjectCheckNumbers;

import org.apache.commons.lang3.StringUtils;

public class CheckNumbers {
	public void test () {
		String text1  = "0123test";
		String text2  = "456";
		
		boolean results1 = StringUtils.isNumeric(text1);
		boolean results2 = StringUtils.isNumeric(text2);
		
		System.out.println(text1 + "is a numeric " + results1);
		System.out.println(text2 + "is a numeric " + results2);
		
		
	}
	
}
