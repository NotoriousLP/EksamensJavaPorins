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
	
	public static void main(String[] args) {
	 Sakums();
	 pirmaisJautajums();
	 otraisJautajums();
	}

}
