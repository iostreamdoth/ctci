package chap1;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strtocheck = "helaoi";
		implementationwithoutds(strtocheck);
		System.out.println(isUniqueChars(strtocheck));

	}

	//My implementation
	public static void implementationwithoutds(String strtocheck) {
		strtocheck = strtocheck.toLowerCase();
		String strTemp = "";
		boolean isvalid = true;
		for (int i = 0; i < strtocheck.length() - 1; i++) {
			String c = "" + strtocheck.charAt(i);
			// int ch = Integer.parseInt(c);
			strTemp = strtocheck.substring(i + 1, strtocheck.length() - 1);
			if (isvalid == true && strTemp.contains(c)) {
				isvalid = false;
				break;
			}
		}
		System.out.println(isvalid);
	}

	
	public static boolean isUniqueChars(String str) {
		if (str.length() > 26) {
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);

			System.out.println("checker after: " + checker);
		}
		return true;
	}

}
