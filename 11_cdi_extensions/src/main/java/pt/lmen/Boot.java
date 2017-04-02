package pt.lmen;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import pt.lmen.beans.ApplicationBean;

public class Boot {

	public static void main(String[] args) {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		ApplicationBean appBean = container.instance().select(ApplicationBean.class).get();
		appBean.doit();
		weld.shutdown();
	}

}
