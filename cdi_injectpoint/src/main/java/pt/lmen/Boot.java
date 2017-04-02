package pt.lmen;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import pt.lmen.beans.Main;

public class Boot {

	public static void main(String[] args) {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		container.instance().select(Main.class).get();
		weld.shutdown();
	}

}
