package Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App3 {

	public static void main(String[] args) {
		Auto car1 = new Auto(Automark.BMW, new Mudel("M4", LocalDate.parse("2017-03-10"), Mudeliliik.KUPEE), "555 BMW",  LocalDate.parse("2017-04-10"));
		Omanik felix = new Omanik("Felix", "Kasepuu", new Isikukood("36102038888",Riigikood.EE), LocalDate.parse("2014-10-22"));
		car1.addOmanikud(felix);
		System.out.println(car1);
		System.out.println(felix.annaAutojuhiStaaz());
	}

}
