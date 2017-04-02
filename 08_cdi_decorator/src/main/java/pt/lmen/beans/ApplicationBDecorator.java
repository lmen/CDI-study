package pt.lmen.beans;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
@Priority(10000)
public class ApplicationBDecorator implements IApplication {

	private IApplication delegate;

	public ApplicationBDecorator() {
		// needed for creating a proxy object
	}

	@Inject
	public ApplicationBDecorator(@Delegate IApplication application) {
		this.delegate = application;
	}

	@Override
	public void doit() {
		System.out.println("DecoratorB DoInit >> start");
		delegate.doit();
		System.out.println("DecoratorB DoInit >> end");
	}

}
