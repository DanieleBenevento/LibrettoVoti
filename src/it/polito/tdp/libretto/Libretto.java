package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voti> voti;
	
	public Libretto() {
		voti= new ArrayList<Voti>();
		
	}
	
	public void add(Voti v) {
		voti.add(v);
	}
}
