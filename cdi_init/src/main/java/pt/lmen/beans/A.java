package pt.lmen.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class A {
	private B b;

	@Inject
	private C c;
	private D d;

	// mandatory to enable the creation of a proxy as it is an applicationScoped
	// bean
	public A() {

	}

	@Inject
	private A(B b) {
		this.b = b;
		System.out.println("[constructor from A] b:" + (b != null) + " c: " + (c != null) + " d: " + (d != null));
	}

	@Inject
	public void initMethod(D d) {
		this.d = d;
		System.out.println("[initMethod from A] b:" + (b != null) + " c: " + (c != null) + " d: " + (d != null));
	}

	public void ss() {
		System.out.println("dd");
	}
}
