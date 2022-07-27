package com.bridgelabz;

import java.util.ArrayList;

public class HotelSetup {
    ArrayList<Hotel> myHotelList = new ArrayList();
    public void addHotel(){
        Hotel Hampi = new Hotel("Hampi",110,80,90,80,3);
        Hotel Prince = new Hotel("Prince",150,110,50,50,4);
        Hotel KrishnaPalace =new Hotel("KrishnaPalace",220,100,150,40,5);

        myHotelList.add(Hampi);
        myHotelList.add(Prince);
        myHotelList.add(KrishnaPalace);
        System.out.println(myHotelList);
    }
}
