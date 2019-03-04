package Car;

import java.time.LocalDate;

public class Mudel {
	private String nimetus;
	private LocalDate tootmisperiood;
	private Mudeliliik mudeliliik;
	
	public Mudel(String nimetus, LocalDate tootmisperiood, Mudeliliik mudeliliik) {
		this.nimetus = nimetus;
		this.tootmisperiood = tootmisperiood;
		this.mudeliliik = mudeliliik;
	}

	@Override
	public String toString() {
		return "Mudel [nimetus=" + nimetus + ", tootmisperiood="
				+ tootmisperiood + ", mudeliliik=" + mudeliliik + "]";
	}
	
	
	
}
