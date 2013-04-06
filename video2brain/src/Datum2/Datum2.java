package Datum2;
public class Datum2 {

    public static void main(String[] args) {
        Datum sastanak = new Datum(29,2, 2012);

 
//        sastanak.dan++;
        sastanak.sljedeciDan();
        System.out.println("Meeting will be on "
                + sastanak.getDan() + "/"
                + sastanak.getMj() + "/"
                + sastanak.getGod());
        
        Datum betterMeetingDate = new Datum(29,2, 2012);
        betterMeetingDate.sljedeciDan();
        System.out.println("Better meeting will be on "+betterMeetingDate);
//                + betterMeetingDate.dan + "/"
//                + betterMeetingDate.mj + "/"
//                + betterMeetingDate.god);
    }
}
