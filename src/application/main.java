package application;

import java.util.ArrayList;

import dbadapter.HolidayOffer;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VRApplication vrApplication = VRApplication.getInstance();
		
		ArrayList<HolidayOffer> ho = vrApplication.getAvailableHolidayOffers("01/01/2000", "12/31/2019", "1");
		
		System.out.println("Hello");
		
	}

}
