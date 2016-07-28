package chap1;

public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replacespaces("this is the world of sparta");
	}

	public static void replacespaces(String str) {
		int len = str.length();
		char[] chars = str.toCharArray();
		System.out.println(String.valueOf(chars));
		int spacecount = 0;
		for (int i = 0; i < len; i++) {
			if (chars[i] == ' ') {
				spacecount++;
			}
		}
		int newLength = len + (2 * spacecount) ;
		char[] chars2 = new char[newLength + 1];
		//System.out.println("This sd");
		chars2[newLength] = '\0';
		for (int i = len - 1; i >= 0; i--) {
			//System.out.println("This is : " + newLength);
			if (chars[i] == ' ') {
				chars2[newLength - 1] = '0';
				chars2[newLength - 2] = '2';
				chars2[newLength - 3] = '%';
				newLength -= 3;
			} else {
				chars2[newLength - 1] = chars[i];
				newLength -= 1;
			}

		}
		System.out.println(String.valueOf(chars2));
	}

}
