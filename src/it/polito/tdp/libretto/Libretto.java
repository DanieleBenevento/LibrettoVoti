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
	
	public List<Voti> CercaVoti(int punti){
		List<Voti> result= new ArrayList<Voti>();
		
		for(Voti v: voti) {
			if(v.getPunti()== punti) {
				result.add(v);
			}
		}
		return result;
	}
	
}
