import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//

		System.out.println("Koji je ID broj Studenta?");
		String i = in.next();

		System.out.println("Koje je ime studenta?");
		String n = in.next();

		System.out.println("Koji je program studija?");
		String d = in.next();

		System.out.println("Ime mentora?");
		String m = in.next();

		System.out.println("Broj položenih ispita?");
		int br = in.nextInt();

		Student st = new Student(i, n, d,m);

		st.povecajGodinu();

		st.setProgramStudija("smetlar");
		System.out.println();
		st.dodajBod(br);
		st.prikaz();

		
		
		System.out.println();
		System.out.println("Editiraj podatke studenta.");
		st.edit(in);
		System.out.println();
		System.out.println("Student podaci:");
		st.prikaz();
	}

}
