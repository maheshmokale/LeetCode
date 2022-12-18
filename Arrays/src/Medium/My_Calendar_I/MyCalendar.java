package Medium.My_Calendar_I;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class MyCalendar {
    ArrayList<Map<String,Integer>> bookings=null;
    public MyCalendar() {
        bookings=new ArrayList<>();

    }
    
    public boolean book(int start, int end) {
        if(!bookings.isEmpty()) {
            for (Map<String, Integer> booked : bookings) {
                if (booked.get("Start")<start && start<booked.get("End")) {
                    return false;
                }
                if (booked.get("Start")<end && end<booked.get("End")) {
                    return false;
                }
                if(start<=booked.get("Start") &&end>=booked.get("End")){
                    return false;
                }
            }
        }
        Map<String,Integer> booking=new HashMap<>();
        booking.put("Start",start);
        booking.put("End",end);
        bookings.add(booking);
        return true;
    }

    public static void main(String[] args){
        MyCalendar myCalendar = new MyCalendar();
      /*  System.out.println(myCalendar.book(10,20));
        System.out.println(myCalendar.book(15,25));
        System.out.println(myCalendar.book(20,30));

        System.out.println(myCalendar.book(25,32));
        System.out.println(myCalendar.book(26,35));
        System.out.println(myCalendar.book(19,25));*/

        System.out.println(myCalendar.book(5,15));
        System.out.println(myCalendar.book(15,25));
        System.out.println(myCalendar.book(5,30));



    }
}
