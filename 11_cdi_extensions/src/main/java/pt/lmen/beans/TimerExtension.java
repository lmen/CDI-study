package pt.lmen.beans;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.AfterDeploymentValidation;
import javax.enterprise.inject.spi.AfterTypeDiscovery;
import javax.enterprise.inject.spi.BeforeBeanDiscovery;
import javax.enterprise.inject.spi.BeforeShutdown;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessAnnotatedType;
import javax.enterprise.inject.spi.ProcessBean;
import javax.enterprise.inject.spi.ProcessBeanAttributes;
import javax.enterprise.inject.spi.ProcessInjectionPoint;
import javax.enterprise.inject.spi.ProcessInjectionTarget;
import javax.enterprise.inject.spi.ProcessObserverMethod;
import javax.enterprise.inject.spi.ProcessProducer;

public class TimerExtension implements Extension {

	public void beforeBeanDiscovery(@Observes BeforeBeanDiscovery payload) {
		System.out.println("Extension:  beforeBEanDiscovery (only one time) ");
	}

	public void afterBeanDiscovery(@Observes AfterBeanDiscovery payload) {
		System.out.println("Extension:  afterBEanDiscovery (only one time) ");
	}

	public void afterTypeDiscovery(@Observes AfterTypeDiscovery payload) {
		System.out.println("Extension:  afterTypeDiscovery (only one time)");
	}

	public void afterDeploymentValidation(@Observes AfterDeploymentValidation payload) {
		System.out.println("Extension:  afterDeploymentValidation (only one time)");
	}

	public void beforeShutdown(@Observes BeforeShutdown payload) {
		System.out.println("Extension:  beforeShutdown (only one time)");
	}

	// Bean discovery events, fired many times

	public <T> void processAnnotatedType(@Observes ProcessAnnotatedType<T> payload) {
		System.out.println(
				"Extension:  processAnnotatedType (one for each java class or interface found on the bean archive with annotations) "
						+ payload.getAnnotatedType());
	}

	public <T, X> void processInjectionPoint(@Observes ProcessInjectionPoint<T, X> payload) {
		System.out.println("Extension:  processInjectionPoint (one for each injection point found) "
				+ payload.getInjectionPoint().getMember());
	}

	public void processInjectionTarget(@Observes ProcessInjectionTarget payload) {
		System.out.println("Extension:  processInjectionTarget (one for each bean capable for an injection point) "
				+ payload.getAnnotatedType());
	}

	public <T> void processBeanAttributes(@Observes ProcessBeanAttributes<T> payload) {
		System.out.println("Extension:  processBeanAttributes (one for each bean found) types:"
				+ payload.getBeanAttributes().getTypes());
	}

	public <T> void processBeans(@Observes ProcessBean<T> payload) {
		System.out.println("Extension:  processBeans (one for each bean, decorator, interceptor found) types:"
				+ payload.getAnnotated().getAnnotations());
	}

	public void processProducer(@Observes ProcessProducer payload) {
		System.out.println("Extension:  processProducer (one for each producer method or field found) types:"
				+ payload.getAnnotatedMember());
	}

	public <T, X> void processObserverMethod(@Observes ProcessObserverMethod<T, X> payload) {
		System.out.println("Extension:  processObserverMethod (one for each observerMethod found) types:"
				+ payload.getAnnotatedMethod());
	}

}
