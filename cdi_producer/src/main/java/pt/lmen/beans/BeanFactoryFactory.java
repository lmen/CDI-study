package pt.lmen.beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class BeanFactoryFactory {

	public BeanFactoryFactory() {
		System.out.println("creating an instance of BeanFactoryFactory");
	}

	@Produces
	String prefix = "Another prefix";

	@PostConstruct
	private void init() {
		System.out.println("init");
		prefix = " Second prefix";
	}

	@Produces
	@ApplicationScoped
	public A create(String prefix) {
		return new A(prefix);
	}

	public void cleanup(@Disposes A a, String prefix) {
		a.cleanup(prefix);
	}

}
