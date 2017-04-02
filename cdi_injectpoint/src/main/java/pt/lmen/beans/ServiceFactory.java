package pt.lmen.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import pt.lmen.beans.ServiceConfigAnnotation.ID;

@ApplicationScoped
public class ServiceFactory {

	@Produces
	@ServiceConfigAnnotation
	private Service produce(Logger logger, InjectionPoint injectionPoint) {

		// Field field = (Field) injectionPoint.getMember();
		// ServiceConfigAnotation annotation =
		// field.getAnnotation(ServiceConfigAnotation.class);
		// String id = annotation.id();

		ID id = ((pt.lmen.beans.ServiceConfigAnnotation) injectionPoint.getQualifiers().iterator().next()).id();

		return new ServiceImpl(id.calcPath().toString(), logger);
	}

}
