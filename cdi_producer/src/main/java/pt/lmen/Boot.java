package pt.lmen;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import pt.lmen.beans.B;

public class Boot {

	public static void main(String[] args) {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		B appBean = container.instance().select(B.class).get();
		appBean.action();
		weld.shutdown();
	}

}
