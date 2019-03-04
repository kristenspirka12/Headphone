package Car;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Omanik {
	private String eesnimi;
	private String perekonnanimi;
	private Isikukood isikukood;
	private LocalDate juhiloaKp;

	public Omanik(String eesnimi, String perekonnanimi, Isikukood isikukood, LocalDate juhiloaKp) {
		this.eesnimi = eesnimi;
		this.perekonnanimi = perekonnanimi;
		this.isikukood = isikukood;
		this.juhiloaKp = juhiloaKp;
	}
	
	public String annaAutojuhiStaaz() {
		LocalDate today = LocalDate.now();
		Period p = Period.between(juhiloaKp, today);
		long p2 = ChronoUnit.DAYS.between(juhiloaKp, today);

		return this.eesnimi + " is " + p.getYears() + " years, " + p.getMonths() + 
				" months, and " + p.getDays() + " days old. (" + p2
				+ " days total)";
	}
	
	@Override
	public String toString() {
		return "Omanik [eesnimi=" + eesnimi + ", perekonnanimi="
				+ perekonnanimi + ", isikukood=" + isikukood + ", juhiluba="
				+ juhiloaKp + "]";
	}

}
