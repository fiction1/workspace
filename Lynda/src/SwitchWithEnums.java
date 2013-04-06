
public class SwitchWithEnums {

	public static void main(String[] args) {

	//	int month = 1;
		Mjesec mjesec =Mjesec.VELJACA;
		switch(mjesec) {
		case SIJECANJ:
			System.out.println("The month is January");
			break;
		case VELJACA:
			System.out.println("The month is February");
			break;
		case OZUJAK:
			System.out.println("The month is March");
		}

	}

}
