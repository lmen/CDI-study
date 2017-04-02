package pt.lmen.beans;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApplicationBean implements IApplication {

	// @Inject
	// ApplicationDecorator app;

	public void doit() {
		System.out.println("BENFICA2!!");
	}

}
