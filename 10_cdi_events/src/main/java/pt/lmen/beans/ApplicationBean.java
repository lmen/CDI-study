package pt.lmen.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@ApplicationScoped
public class ApplicationBean {

	@Inject
	@DoIt
	Event<DoItInfo> event;

	public void doit() {

		System.out.println("BEFORE BENFICA!!");

		DoItInfo eventObject = new DoItInfo();
		eventObject.setMessage("DOIT BENFICA!!!!");

		event.fire(eventObject);

		System.out.println("AFTER BENFICA!!");
	}

}
