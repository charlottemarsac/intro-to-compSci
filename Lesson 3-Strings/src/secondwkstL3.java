//charlotteMarsac
public class secondwkstL3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3-6-19

		System.out.println("a\\b\\c\\\"d\"");
		
		System.out.println("\\t is a tab, \\n is a new line, \\\" prints a \"quote\"");
		
		System.out.println("\"line one\"");
		System.out.println("\\line         two\\");
		
		System.out.println("\\\\denotes a single line comment");
		System.out.println("\\*denotes a multiline comment*\\");
		
		System.out.println("\"\\\\\"\\\"\"");
		System.out.println("        \\\"\\\"\"\\");
		System.out.println("\\\"\"\"\"\\");
		
	
		String w6 ="Birthday";
		System.out.println(w6.toUpperCase());
		
		String w7 ="it's my party";
		System.out.println(w7.substring(0,8) + "\"" + w7.substring(8,13).toUpperCase() + "\"");
		
		String w8 ="whose a whats it";
		System.out.println(w8.substring(0,5).toUpperCase());
		System.out.println(w8.substring(14,15) + w8.substring(3,4) + " " + w8.substring(8,12));
		
		String w9 ="Every Way The Wind Blows";
		System.out.println(w9.substring(0,5).toLowerCase() + " " + w9.substring(6,9).toUpperCase() + " " + 
		w9.substring(10,13).toLowerCase() + " " + "\\" + w9.substring(14,18).toUpperCase() + "\\" + " " + 
		w9.substring(19,24).toLowerCase() + " " + "4");
	
		String w10 ="Peter Piper Picked A Peck Of Pickled Peppers";
		System.out.print(w10.substring(19,20).toUpperCase() + " " + w10.substring(21,37).toLowerCase());
		System.out.print("             ");
		System.out.print(w10.substring(37,44).toLowerCase() + " " + w10.substring(0,5) + " " + w10.substring(6,11) + " ");
		System.out.print("             ");
		System.out.println(w10.substring(12,18).toLowerCase());
		
		String w11 ="word has 4 letters";
		int w =9;
		System.out.println("\"" + w11.substring(9,10) + "\"" + " " + w11.substring(11,18) + " " + w11.substring(5,8) + " " + "\""
		+ w + "\"" + " " + w11.substring(11,18));
		
		String w12 ="if SUBSTRING is used";
		int q =9;
		System.out.println(w12.substring(3,12).toLowerCase() + " " + w12.substring(13,15) + " " + q );
		
		String w13 ="Jim, Jacky, Johnny, Jill";
		int a =3; int b =4; int c =5; int d =6;
		System.out.println(w13.substring(0,3).toLowerCase() + "\\" + a );
		System.out.println(w13.substring(5,10).toUpperCase() + "\\" + c);
		System.out.println(w13.substring(12,18).toLowerCase() + "\\" + d);
		System.out.println(w13.substring(20,24).toUpperCase() + "\\" + b);
		
	}

}
