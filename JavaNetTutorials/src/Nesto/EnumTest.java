package Nesto;

public class EnumTest {
    Dani dan;
    
    public EnumTest(Dani dan) {
        this.dan = dan;
    }
    
    public void tellItLikeItIs() {
        switch (dan) {
            case PONEDJELJAK:
                System.out.println("Mondays are bad.");
                break;
                    
            case PETAK:
                System.out.println("Fridays are better.");
                break;
                         
            case SUBOTA: case NEDJELJA:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Dani.PONEDJELJAK);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Dani.SRIJEDA);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Dani.PETAK);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Dani.SUBOTA);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Dani.NEDJELJA);
        seventhDay.tellItLikeItIs();
  
    }
}