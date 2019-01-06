package string;

import java.util.ArrayList;
import java.util.List;

public class TestString {
	
	public static List<Integer> findNum(String str) {
		char[] strChar = str.toCharArray();
		List<Integer> list = new ArrayList<>();
		boolean find = false;
		
		int i = 0, j = 0;
		for (int index = 0; index < strChar.length; index++) {
			char c = strChar[index];
			if (find) {
				if (c < '0' || c > '9') {
					j = index;
					int num = Integer.parseInt(str.substring(i, j));
					list.add(num);
					find = false;
				} else if (index < strChar.length - 1){
					continue;
				} else {
					j = index + 1;
					int num = Integer.parseInt(str.substring(i, j));
					list.add(num);
					find = false;
					break;
				}
			} else {
				if (c >= '0' && c <= '9') {
					i = index; find = true;
				} else {
					continue;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String strData = "sa1, 12,xx sa n 123";
		for (int n : findNum(strData)) {
			System.out.println(n);
		}
	}

}
