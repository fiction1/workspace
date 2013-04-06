import java.util.Scanner;

public class Student {
	private String idBroj;
	private String ime;
	private String programStudija;
	private int godina;
	private String imeMentora;
	private double bodovi;
	private boolean jeUpisan;

	public void upisi() {
		jeUpisan = true;
	}

	public void ispisi() {
		jeUpisan = false;
	}

	public boolean jeliUpisan() {
		return jeUpisan;
	}

	public void setProgramStudija(String p) {
		programStudija = p;
	}

	public void povecajGodinu() {
		godina++;
	}

	public String getIme() {
		return ime;
	}

	public void promjeniMentora(String m) { //
		imeMentora = m; //
	} //

	public void dodajBod(int br) { //
		double n = (double) br * 0.5;
		bodovi += n;
	}

	public void prikaz() {
		System.out.println("Student ID: " + idBroj);
		System.out.println("Ime: " + ime);
		System.out.println("Program studija: " + programStudija);
		System.out.println("Godina: " + godina);

		System.out.println("Ime mentora: " + imeMentora); //
		System.out.println("Broj bodova: " + bodovi); //

		if (jeUpisan) {
			System.out.println("nije upisan");
		} else {
			System.out.println("upisan je");
		}

	}

	public void edit(Scanner in) {
		String odgovor = in.nextLine();
		if (!odgovor.equals("")) {
			idBroj = odgovor;
		}
		System.out.println("Ime (" + ime + ") ");
		odgovor = in.nextLine();
		if (!odgovor.equals("")) {
			ime = odgovor;
		}

		System.out.println("Program studija(" + programStudija + ")");
		odgovor = in.nextLine();
		if (!odgovor.equals("")) {
			if (odgovor.equals("Elektrotehnika")
					|| odgovor.equals("Ra�unarstvo")
					|| odgovor.equals("Strojarstvo")
					|| odgovor.equals("Brodogradnja")) {
				programStudija = odgovor;
			} else {
				System.out.println("Nepoznat program studija");
			}
		}

		System.out.println("Godina (" + godina + ")");
		odgovor = in.nextLine();
		if (!odgovor.equals("")) {
			godina = Integer.parseInt(odgovor);
		}
		if (jeUpisan) {
			System.out.println("Upisan? (da)");
		} else {
			System.out.println("Upisan? (ne)");
		}
		
		odgovor = in.nextLine();
		if (!odgovor.equals("")) {
			if (odgovor.equals("da")) {
				jeUpisan = true;
			} else if (odgovor.equals("ne")) {
				jeUpisan = false;
			} else {
				System.out.println("Odgovor nije razumljiv.");
			}
		}

	}

	public Student(String id, String im, String p, String imm) {
		idBroj = id;
		ime = im;
		programStudija = p;
		godina = 1;

		imeMentora = imm; //
		bodovi = 0.0; //
	}
}
