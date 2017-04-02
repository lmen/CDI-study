package pt.lmen.beans;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class B {

	public void doit() {
		System.out.println("Bean B");
	}

}
