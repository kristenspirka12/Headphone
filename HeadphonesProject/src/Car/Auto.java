package Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Auto {
	private Automark automark;
	private Mudel mudel;
	private String numbrimärk;
	private LocalDate arvelevõtt;
	private List<Omanik> omanikud;
	
	
	public Auto(Automark automark, Mudel mudel, String numbrimärk, LocalDate arvelevõtt) {
		this.automark = automark;
		this.mudel = mudel;
		this.numbrimärk = numbrimärk;
		this.arvelevõtt = arvelevõtt;
		this.omanikud = new ArrayList<>();
	}

	/**
	 * @return the automark
	 */
	public Automark getAutomark() {
		return automark;
	}

	/**
	 * @param automark the automark to set
	 */
	public void setAutomark(Automark automark) {
		this.automark = automark;
	}

	/**
	 * @return the mudel
	 */
	public Mudel getMudel() {
		return mudel;
	}

	/**
	 * @param mudel the mudel to set
	 */
	public void setMudel(Mudel mudel) {
		this.mudel = mudel;
	}

	/**
	 * @return the numbrimärk
	 */
	public String getNumbrimärk() {
		return numbrimärk;
	}

	/**
	 * @return the arvelevõtt
	 */
	public LocalDate getArvelevõtt() {
		return arvelevõtt;
	}

	/**
	 * @param arvelevõtt the arvelevõtt to set
	 */
	public void setArvelevõtt(LocalDate arvelevõtt) {
		this.arvelevõtt = arvelevõtt;
	}

	/**
	 * @return the omanikud
	 */
	public List<Omanik> getOmanikud() {
		return omanikud;
	}

	/**
	 * @param omanikud the omanikud to set
	 */
	public void setOmanikud(List<Omanik> omanikud) {
		this.omanikud = omanikud;
	}

	/**
	 * @param numbrimärk the numbrimärk to set
	 */
	public void setNumbrimärk(String numbrimärk) {
		this.numbrimärk = numbrimärk;
	}
	
	public void addOmanikud(Omanik omanik) {
		this.omanikud.add(omanik);
	}

	
	@Override
	public String toString() {
		return "Auto [automark=" + automark + ", mudel=" + mudel
				+ ", numbrimärk=" + numbrimärk + ", arvelevõtt=" + arvelevõtt
				+ ", omanikud=" + omanikud + "]";
	}
	

}

