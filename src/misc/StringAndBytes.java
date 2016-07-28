package misc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StringAndBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lstStr = new ArrayList<String>();
		lstStr.add("0");
		lstStr.add("0");
		lstStr.add("1");
		lstStr.add("0");
		lstStr.add("0");
		lstStr.add("1");
		lstStr.add("0");
		lstStr.add("1");
		lstStr.add("0");
		lstStr.add("1");
		lstStr.add("0");
		lstStr.add("1");
		lstStr.add("1");
		lstStr.add("1");
		lstStr.add("0");
		lstStr.add("1");
		lstStr.add("0");
		lstStr.add("1");
		lstStr.add("0");
		lstStr.add("1");
		lstStr.add("0");
		lstStr.add("1");
		lstStr.add("1");
		lstStr.add("0");
		
		String str = lstStr.toString().replaceAll("\\, ", "");
		str = "00000000" + str.substring(1, str.length() - 1);
		System.out.println(str);
		Integer v = Integer.parseInt(str,2);
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
	    
	    try {
	    	ObjectOutput out = new ObjectOutputStream(bos);
			out.writeInt(v);
			out.close();
			//Converted
			byte[] int_bytes = bos.toByteArray();
		    bos.close();
		    
		    System.out.println(int_bytes[0]);
		    System.out.println(int_bytes[1]);
		    System.out.println(int_bytes[2]);
		    System.out.println(int_bytes[3]);
		    

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		
		

	}

}
