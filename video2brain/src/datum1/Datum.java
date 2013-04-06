package datum1;

public class Datum {
	private int dan;
	private int mj;
	private int god;
	
	public Datum (){
		
	}
	public Datum(int dan, int mj, int god){
		this.dan=dan;
		this.mj=mj;
		this.god=god;
	}
	
	public int getDan() {
		return dan;
	}
	
	public int getMj() {
		return mj;
	}
	
	public int getGod() {
		return god;
	}
	
	public boolean prijestupnaGodina(int god){
		return(((god%4)==0)&&((god%100)!=0))||((god%400)==0);
	}
	
	public int danaUMjesecu(int mj, int god){
		int rez;
		switch(mj){
		case 4:
		case 6:
		case 9:
		case 11:
			rez= 30;
			break;
		case 2:
			if(prijestupnaGodina(god)){
				rez=29;
			}else {
				rez=28;
			}
			break;
		default:
				rez=31;
		}
		return rez;
	}
	
	public void sljedeciDan(){
		int brojacDana=danaUMjesecu(this.mj, this.god);
		this.dan++;
		if (this.dan>brojacDana){
			this.dan=1;
			this.mj++;
			if (this.mj>12){
				this.mj=1;
				this.god++;
			}
		}
	}
}
