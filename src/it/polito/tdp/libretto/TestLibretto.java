package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto libr=new Libretto();
		
		libr.add(new Voti(30, "Analisi 1",LocalDate.of(2017, 1, 15)));
		libr.add(new Voti(21, "Analisi 2",LocalDate.of(2018, 1, 25)));
		libr.add(new Voti(25, "Fisica 1",LocalDate.of(2017, 6, 10)));
		libr.add(new Voti(28, "Fisica 2",LocalDate.of(2018, 9, 3)));
		libr.add(new Voti(18, "Geometria",LocalDate.of(2017, 9, 1)));
		libr.add(new Voti(20, "Economia",LocalDate.of(2018, 1, 28)));
		libr.add(new Voti(25, "Ricerca Operativa",LocalDate.of(2018, 6, 5)));
		libr.add(new Voti(24, "Complementi di Economia",LocalDate.of(2018, 2, 15)));
		libr.add(new Voti(25, "Logistica",LocalDate.of(2019, 2, 1)));
		libr.add(new Voti(27, "Programmazione a Oggetti",LocalDate.of(2019, 1, 25)));
		
		List<Voti> venticinque = libr.CercaVoti(25);
		System.out.println(venticinque);

	}

}
