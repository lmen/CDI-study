package pt.lmen;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import pt.lmen.beans.A;

public class Boot {

	public static void main(String[] args) {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		A a = container.instance().select(A.class).get();
		// only when an method is called are the bean initialized
		a.ss();
	}

}
