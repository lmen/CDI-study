package pt.lmen.beans;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class ApplicationDecorator implements IApplication {

	private IApplication delegate;

	@Inject
	public ApplicationDecorator(@Delegate IApplication application) {
		this.delegate = application;
	}

	@Override
	public void doit() {
		System.out.println("Decorator DoInit >> start");
		delegate.doit();
		System.out.println("Decorator DoInit >> end");
	}

}
