
public class Student {
	private String idBroj;
	private String ime;
	private String programStudija;
	private int godina;
	
	public void setProgramStudija(String p){
		programStudija=p;
	}
	
	public void povecajGodinu(){
		godina++;
	}
	
	public String getIme(){
		return ime;
	}
	
	public void prikaz(){
		System.out.println("Student ID: "+idBroj);
		System.out.println("Ime: "+ime);
		System.out.println("Program studija: "+programStudija);
		System.out.println("Godina: "+godina);
	}
	
	public Student (String id,String im, String p){
		idBroj=id;
		ime=im;
		programStudija=p;
		godina=1;
	}
}
