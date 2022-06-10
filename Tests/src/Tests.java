import javax.swing.JOptionPane;

public class Tests {
	static int punkti = 0;
	static String atbilde;
	public static void Sakums() {
		JOptionPane.showMessageDialog(null, "Šis ir elektroniskais tests par Viendimensiju masīviem programmēšanas valodā Java\nTests satur 10 jautājumus, katram jautājumam 4 atbilžu varianti, no kuriem pareizi ir 2 vai 3 atbilžu varianti.");
	}
	public static void pirmaisJautajums() {
		do{
		atbilde = JOptionPane.showInputDialog("1. Kuri no tiem ir pareizi uzrakstīta masīva sintakse\na) int[] A\nb) int []A\nc) []int A\nd) int A[]\n 2 vai 3 atbildes var būt pareizas\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas tad: a;b\nAtbildes liekat alfabētu secībā!");
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d"));
		if(atbilde.equals("a;b;d")) punkti++;
	}
	public static void otraisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("2. Ar kādiem veidiem var izdrukāt masīvus?\na) for each\nb)do while cikls\nc) while cikls\nd)for cikls\n 2 vai 3 atbildes var būt pareizas\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas tad: a;b\nAtbildes liekat alfabētu secībā!");
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d"));
		if(atbilde.equals("a;d")) punkti++;
	}
	public static void tresaisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("3. Kādas ir masīvu priekšrocības?\na)Nav lieluma ierobežojuma\nb)Brīvķluve\nc)Koda optimizācija\nd)Masīva lielums nav fiksēts\n2 vai 3 atbildes var būt pareizas\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas tad: a;b\nAtbildes liekat alfabētu secībā!");
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d"));
		if(atbilde.equals("b;c")) punkti++;
	}
	public static void ceturtaisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("Ja ir dots masīvs A[5], atbildiet, kuri pēc elementu indeksiem nav pareizi"
					+ "\na)0;1;2;3;4"
					+ "\nb)0;2;4;6;8"
					+"\nc)1;2;3;4;5"
					+ "\nd)4;3;2;1;0"
					+"\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d"));
		if(atbilde.equals("b;c;d")) punkti++;
	}
	public static void piektaisJautajums() {
		do {
		atbilde = JOptionPane.showInputDialog("Kādas bija viendimensiju masīva kārtošana iebūvētas funkcijas, lai var izdukāt augošā secībā un dilstošā secībā"
					+ "\na)Arrays.sort(masivs);"
					+ "\nb)Collections.reverseOrder(masivs)"
					+ "\nc)Sort.arrays(masivs);"
					+ "\nd)Arrays.sort(masivs, Collections.reverseOrder())"
					+"\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d"));
		if(atbilde.equals("a;d")) punkti++;
	}
	
	
	public static void main(String[] args) {
	 Sakums();
	 pirmaisJautajums();
	 otraisJautajums();
	 tresaisJautajums();
	 ceturtaisJautajums();
	 piektaisJautajums();
	}

}
