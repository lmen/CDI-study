package pt.lmen.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class B {

	@Inject
	A a;

	public void action() {
		a.doAction();
	}

}
