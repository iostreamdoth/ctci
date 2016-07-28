package chap1;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "thisisaonethatwholezimba";
		removeduplicatechar3(str.toCharArray());
	}

	// With Explanations
	public static void removeduplicatechar3(char[] str) {
		if (str == null) // To check empty strin test condition
			return;
		int len = str.length;
		if (len < 2) // To check only one element condition
			return;

		int tail = 1; // This position of tail of non repeating values
		for (int i = 1; i < len; i++) {
			System.out.println(i + " : " + String.valueOf(str));
			int j;
			for (j = 0; j < tail; j++) {
				if (str[i] == str[j])
					break;
			}
			System.out.println(i + " : " + j + " : " + tail);
			if (j == tail) {
				str[tail] = str[i];
				tail++;
			}
		}
		str[tail] = 0;
		System.out.println(String.valueOf(str));
	}

	public static void removeduplicatechar2(char[] str) {
		if (str == null)
			return;
		int len = str.length;
		if (len < 2)
			return;

		int tail = 1;
		
		for (int i = 0; i < len; i++) {
			int j;
			for (j = 0; j < tail; j++) {
				//v = j;
				if (str[i] == str[j]) {
					break;
				}
			}
			if (j == tail) {
				str[tail] = str[i];
				tail++;
			}

		}
		str[tail] = 0;
		System.out.println(String.valueOf(str));
	}

	public static void removeduplicatechar(char[] str) {
		int len = str.length;
		int len2 = str.length;
		int r = 0;
		boolean startreplace = false;
		for (int i = 0; i < len - 1; i++) {
			startreplace = false;
			System.out.println(String.valueOf(str));
			for (int j = i + 1; j < len; j++) {
				if (str[j] == str[i] && !startreplace) {
					startreplace = true;
					len2--;
				}
				if (startreplace && j + 1 < len) {
					if (str[j] == str[i]) {
						str[j] = str[j + 1];
						if (j + 2 < len)
							str[j + 1] = str[j + 2];
					}
					str[j] = str[j + 1];
				}
			}
			str[len2] = 0;

		}
		System.out.println(String.valueOf(str));
	}

}
