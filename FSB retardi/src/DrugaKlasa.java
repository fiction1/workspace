
public class DrugaKlasa {
	private String imePastete;

	public  void setIme(String ime) {
		imePastete=ime;
	}
	public String getIme(){
		return imePastete;
	}
	
	public void saying(){
		System.out.printf("Tvoja prva pa�teta je %s", getIme());
	}
	
}
