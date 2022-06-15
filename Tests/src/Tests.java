import javax.swing.JOptionPane;

public class Tests {
	static int punkti = 0; //Mainīgais, kas skaitīs pareizās atbildes
	static String atbilde; //Mainīgais, kuru es izmantošu metodēs
	static String[] nepareizasAtbildes = {" "," "," "," "," "," "," "," "," "," "}; //Tukšs masīvs ar garumu 10, izmantošu rezultātam
	public static void Sakums() {
		JOptionPane.showMessageDialog(null, "Šis ir elektroniskais tests par Viendimensiju masīviem programmēšanas valodā Java\nTests satur 10 jautājumus, katram jautājumam 4 atbilžu varianti, no kuriem pareizi ir 2 vai 3 atbilžu varianti.");
	}
	public static void pirmaisJautajums() {
		do{
		atbilde = JOptionPane.showInputDialog("1. Kuri no tiem ir pareizi uzrakstīta masīva sintakse"
				+ "\na)int[] A"
				+ "\nb)int []A"
				+ "\nc)[]int A"
				+ "\nd)int A[]"
				+ "\n2 vai 3 atbildes var būt pareizas"
				+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas tad: a;b"
				+ "\nAtbildes liekat alfabētu secībā!");
		atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		 //While cikls, lai nevar ievadīt neko nepareizu
		if(atbilde.equals("a;b;d")) punkti++; //ja atbilde sakrīt ar to kas ir ierakstīts, tad pienāk punkts
		else nepareizasAtbildes[0] = "1."; // ja nē, tad masīvā pieraksta "1." un tā pie katras metodes.
	}
	public static void otraisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("2. Ar kādiem veidiem var izdrukāt masīvus?"
					+ "\na)for each"
					+ "\nb)do while cikls"
					+ "\nc)while cikls"
					+ "\nd)for cikls"
					+ "\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas atbildes tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
			atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		if(atbilde.equals("a;d")) punkti++;
		else nepareizasAtbildes[1] = "2.";
	}
	public static void tresaisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("3. Kādas ir masīvu priekšrocības?"
					+ "\na)Nav lieluma ierobežojuma"
					+ "\nb)Brīvķluve"
					+ "\nc)Koda optimizācija"
					+ "\nd)Masīva lielums nav fiksēts"
					+ "\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas atbildes tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
			atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		if(atbilde.equals("b;c")) punkti++;
		else nepareizasAtbildes[2] = "3.";
	}
	public static void ceturtaisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("4.Ja ir dots masīvs A[5], atbildiet, kuri pēc elementu indeksiem nav pareizi"
					+ "\na)0;1;2;3;4"
					+ "\nb)0;2;4;6;8"
					+ "\nc)1;2;3;4;5"
					+ "\nd)4;3;2;1;0"
					+"\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas atbildes tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
			atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		if(atbilde.equals("b;c;d")) punkti++;
		else nepareizasAtbildes[3] = "4.";
	}
	public static void piektaisJautajums() {
		do {
		atbilde = JOptionPane.showInputDialog("5.Kādas bija viendimensiju masīva kārtošana iebūvētas funkcijas, lai var izdukāt augošā secībā un dilstošā secībā"
					+ "\na)Arrays.sort(masivs);"
					+ "\nb)Collections.reverseOrder(masivs)"
					+ "\nc)Sort.arrays(masivs);"
					+ "\nd)Arrays.sort(masivs, Collections.reverseOrder())"
					+"\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas atbildes tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
		atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		if(atbilde.equals("a;d")) punkti++;
		else nepareizasAtbildes[4] = "5.";
	}
	public static void sestaisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("6.Kura ir pareiza deklerēta masīva sintakse?"
					+ "\na)int[] a = new int[10];"
					+ "\nb)[]int a = {5,10,20,21};"
					+ "\nc)int[] a = new double[14];"
					+ "\nd)int a[] = {15,20,30,40};"
					+"\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas atbildes tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
			atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		if(atbilde.equals("a;d")) punkti++;
		else nepareizasAtbildes[5] = "6.";
	}
	public static void septitaisJautajums() {
		do {
		atbilde = JOptionPane.showInputDialog("7.Kā lineārā un binārā meklēšana meklē vērtības, kuru vēlies atrast"
				+ "\na)Salīdzinot pirmo elementu ar meklējamo vērtību, ja nav tad turpina pie otrā."
				+ "\nb)Sāk meklēt ciparu, kuru vēlaties no elementu beigām līdz elementu sākumam."
				+ "\nc)Masīvs tiek sadalīts uz pusēm lai var sākt meklēt vērtības, kuras vēlaties."
				+ "\nd)Masīvs tiek šķērsots secīgi un tiek pārbaudīts katrs elements."
				+"\n2 vai 3 atbildes var būt pareizas"
				+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas atbildes tad: a;b"
				+ "\nAtbildes liekat alfabētu secībā!");
		atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		if(atbilde.equals("a;c")) punkti++;
		else nepareizasAtbildes[6] = "7.";
	}
	public static void astotaisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("8.Ir dots masīvs int A = {15,15,30,45,60,15}, kurā elementā atrodas skaitlis 15"
					+ "\na)Skaitlis 15 atrodas 6 elementā"
					+ "\nb)Skaitlis 15 atrodas 1 elementā"
					+ "\nc)Skaitlis 15 atrodas 0 elementā"
					+ "\nd)Skaitlis 15 atrodas 5 elementā"
					+ "\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas atbildes tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
			atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		if(atbilde.equals("b;c;d")) punkti++;
		else nepareizasAtbildes[7] = "8.";
	}
	public static void devitaisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("9.Kā selection sort un bubble sort kārto masīvus?"
					+ "\na)Atrodot mazāko skaitli masīva un ieliekot to pirmā vietā un tā tālāk."
					+ "\nb)Salīdzinot pirmo elementu ar otro un tā tālāk."
					+ "\nc)Sadaliet masīvu mazākos apakšblokos, līdz tiek iegūti elementu pāri, un pēc tam apvienojiet tos tā, lai tie būtu sakārtoti."
					+ "\nd)Izmanto iebūvēto funkciju."
					+ "\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas atbildes tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
			atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		if(atbilde.equals("a;b")) punkti++;
		else nepareizasAtbildes[8] = "9.";
	}
	public static void desmitaisJautajums() {
		do {
			atbilde = JOptionPane.showInputDialog("10.Kā tu vari aprēķināt masīva vidējo un masīva summu"
					+ "\na)Izmantojot mainīgos int sum un double vid un double n, kurš ir masivs.length un for ciklu"
					+ "\nb)Izmantojot mainīgos int sum un double vid un double n, kurš ir masivs.length un for each"
					+ "\nc)Izmantojot mainīgos int sum un double vid un double n, kurš ir masivs.length un bez cikla"
					+ "\nd)Izmantojot mainīgos int sum un double vid un double n, kurš ir masivs.length un while ciklu"
					+ "\n2 vai 3 atbildes var būt pareizas"
					+ "\nJums atbildes ir jāieraksta šādi: a;b;c, ja divas atbildes tad: a;b"
					+ "\nAtbildes liekat alfabētu secībā!");
			atbilde = atbilde.toLowerCase();
		}while(!atbilde.equals("a;b") && !atbilde.equals("a;c") && !atbilde.equals("a;d") &&  !atbilde.equals("b;c") &&  !atbilde.equals("b;d") &&  !atbilde.equals("c;d") 
				&&  !atbilde.equals("a;b;c") &&  !atbilde.equals("a;b;d") &&  !atbilde.equals("b;c;d") && !atbilde.equals("a;c;d"));
		if(atbilde.equals("a;b")) punkti++;
		else nepareizasAtbildes[9] = "10.";
	}
	public static void rezultats() {
		if(punkti == 0) {
			JOptionPane.showMessageDialog(null, "Tu atbildēji pareizi uz nevienu jautājumu no 10 jautājumiem."
					+"\nJautājumi, kuri nebija pareizi: ");
		}else if(punkti == 10) { //Ja viss ir atbildēts pareizi, tad izvadīs ziņojumu, kad viss ir atbildēts pareizi.
			JOptionPane.showMessageDialog(null, "Tu atbildēji pareizi uz visiem jautājumiem  "+punkti+" no 10");
	
	     }else if(punkti == 1) { //Ja tikai viens jautājums pareizs tad izvadīs ziņojumu, ka esi atbildēji pareizi tikai uz vienu jautājumu, šis ir ielikts galotnes dēļ
			JOptionPane.showMessageDialog(null, "Tu atbildēji pareizi tikai "+punkti+" jautājumu no 10 jautājumiem."
					+"\nJautājumi, kuri nebija pareizi: ");
		}else{ //Ja vairāk par viens, tad izvadīs tādu pašu atbildi, tikai galotni samainīta.
			JOptionPane.showMessageDialog(null, "Tu atbildēji pareizi "+punkti+" jautājumus no 10 jautājumiem"
					+"\nJautājumi, kuri nebija pareizi: ");
		}
		//Ja punkti nav 10, tad izies cauri switch konstrukcijai
		if(punkti!=10) {
		for(int i=0; i<nepareizasAtbildes.length; i++) {
			switch(nepareizasAtbildes[i]) {
			//Switchā tagad skatīsies, kur ir "1." vai "2." utt. un izdrukās nepareizo jautājumu sarakstu.
			case "1.": JOptionPane.showMessageDialog(null, "1. Kuri no tiem ir pareizi uzrakstīta masīva sintakse"
					+ "\na)int[] A"
					+ "\nb)int []A"
					+ "\nc)[]int A"
					+ "\nd)int A[]"); break;
			case "2.": JOptionPane.showMessageDialog(null, "2. Ar kādiem veidiem var izdrukāt masīvus?"
					+ "\na)for each"
					+ "\nb)do while cikls"
					+ "\nc)while cikls"
					+ "\nd)for cikls"); break;
			case "3.": JOptionPane.showMessageDialog(null, "3. Kādas ir masīvu priekšrocības?"
					+ "\na)Nav lieluma ierobežojuma"
					+ "\nb)Brīvķluve"
					+ "\nc)Koda optimizācija"
					+ "\nd)Masīva lielums nav fiksēts"); break;
			case "4.": JOptionPane.showMessageDialog(null, "4.Ja ir dots masīvs A[5], atbildiet, kuri pēc elementu indeksiem nav pareizi"
					+ "\na)0;1;2;3;4"
					+ "\nb)0;2;4;6;8"
					+"\nc)1;2;3;4;5"
					+ "\nd)4;3;2;1;0"); break;
			case "5.": JOptionPane.showMessageDialog(null, "5.Kādas bija viendimensiju masīva kārtošana iebūvētas funkcijas, lai var izdukāt augošā secībā un dilstošā secībā"
					+ "\na)Arrays.sort(masivs);"
					+ "\nb)Collections.reverseOrder(masivs)"
					+ "\nc)Sort.arrays(masivs);"
					+ "\nd)Arrays.sort(masivs, Collections.reverseOrder())"); break;
			case "6.": JOptionPane.showMessageDialog(null, "6.Kura ir pareiza deklerēta masīva sintakse?"
					+ "\na)int[] a = new int[10];"
					+ "\nb)[]int a = {5,10,20,21};"
					+ "\nc)int[] a = new double[14];"
					+ "\nd)int a[] = {15,20,30,40};"); break;
			case "7.": JOptionPane.showMessageDialog(null, "7.Kā lineārā un binārā meklēšana meklē vērtības, kuru vēlies atrast"
					+ "\na)Salīdzinot pirmo elementu ar meklējamo vērtību, ja nav tad turpina pie otrā."
					+ "\nb)Sāk meklēt ciparu, kuru vēlaties no elementu beigām līdz elementu sākumam."
					+ "\nc)Masīvs tiek sadalīts uz pusēm lai var sākt meklēt vērtības, kuras vēlaties."
					+ "\nd)Masīvs tiek šķērsots secīgi un tiek pārbaudīts katrs elements."); break;
			case "8.": JOptionPane.showMessageDialog(null, "8.Ir dots masīvs int A = {15,15,30,45,60,15}, kurā elementā atrodas skaitlis 15"
					+ "\na)Skaitlis 15 atrodas 6 elementā"
					+ "\nb)Skaitlis 15 atrodas 1 elementā"
					+ "\nc)Skaitlis 15 atrodas 0 elementā"
					+ "\nd)Skaitlis 15 atrodas 5 elementā"); break;
			case "9.": JOptionPane.showMessageDialog(null, "9.Kā selection sort un bubble sort kārto masīvus?"
					+ "\na)Atrodot mazāko skaitli masīva un ieliekot to pirmā vietā un tā tālāk."
					+ "\nb)Salīdzinot pirmo elementu ar otro un tā tālāk."
					+ "\nc)Sadaliet masīvu mazākos apakšblokos, līdz tiek iegūti elementu pāri, un pēc tam apvienojiet tos tā, lai tie būtu sakārtoti."
					+ "\nd)Izmanto iebūvēto funkciju."); break;
			case "10.": JOptionPane.showMessageDialog(null, "10.Kā tu vari aprēķināt masīva vidējo un masīva summu"
					+ "\na)Izmantojot mainīgos int sum un double vid un double n, kurš ir masivs.length un for ciklu"
					+ "\nb)Izmantojot mainīgos int sum un double vid un double n, kurš ir masivs.length un for each"
					+ "\nc)Izmantojot mainīgos int sum un double vid un double n, kurš ir masivs.length un bez cikla"
					+ "\nd)Izmantojot mainīgos int sum un double vid un double n, kurš ir masivs.length un while ciklu"); break;
			}
		}
	 }
	}
	
	public static void main(String[] args) {
	 Sakums();
	 pirmaisJautajums();
	 otraisJautajums();
	 tresaisJautajums();
	 ceturtaisJautajums();
	 piektaisJautajums();
	 sestaisJautajums();
	 septitaisJautajums();
	 astotaisJautajums();
	 devitaisJautajums();
	 desmitaisJautajums();
	 rezultats();
	}

}
