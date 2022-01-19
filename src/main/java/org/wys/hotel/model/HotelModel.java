package org.wys.hotel.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wys.hotel.service.HotelService;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;



public class HotelModel {

	
	private int count;
	HotelService hotelService;
	private AnnotationConfigApplicationContext appContext;
	@Init
	private void init() {
		appContext = new AnnotationConfigApplicationContext();
        appContext.scan("org.wys.hotel");
        appContext.refresh();
        hotelService = (HotelService) appContext.getBean("hotelService");
	}
	
	@Command
	@NotifyChange("count")
	public void cmd() {
		++count;
	}

	public int getCount() {
		return count;
	}
}
