package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public int add(String str) {
		if(isBlank(str)) {
			return 0;
		}
		return sum(toInts(split(str)));
	}

	private boolean isBlank(String str) {
		return "".equals(str) || str == null;
	}

	private String[] split(String str) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);
		if(m.find()) {
			String customDelimeter = m.group(1);
			return m.group(2).split(customDelimeter);
		}
		
		return str.split(",|:");
	}

	private int sum(int[] num) {
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		return sum;
	}

	private int[] toInts(String[] str) {
		int[] num = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			num[i] = Integer.parseInt(str[i]);
			if(num[i] < 0) {
				throw new RuntimeException();
			}
		}
		return num;
	}

}
