package pt.lmen.beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import pt.lmen.beans.ServiceConfigAnnotation.ID;

@Dependent
public class Main {

	@Inject
	@ServiceConfigAnnotation(id = ID.ONE)
	private Service service;

	@Inject
	@ServiceConfigAnnotation(id = ID.TWO)
	private Service service2;

	@PostConstruct
	public void run() {

		service.doService();

		service2.doService();

	}

}
