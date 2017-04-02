package pt.lmen.beans;

import javax.enterprise.inject.Vetoed;

@Vetoed
public class A {

	private String prefix;

	public A() {
	}

	public A(String prefix) {
		super();
		this.prefix = prefix;
	}

	public void doAction() {
		System.out.println("A prefix: " + prefix);
	}

	public void cleanup(String prefix) {
		System.out.println("cleaning up.. " + prefix);
	}
}
