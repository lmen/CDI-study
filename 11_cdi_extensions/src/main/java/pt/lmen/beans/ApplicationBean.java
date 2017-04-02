package pt.lmen.beans;

import java.lang.reflect.Type;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;

@ApplicationScoped
public class ApplicationBean {

	@Inject
	private BeanManager beanManager;

	public void doit() {

		System.out.println("BENFICA!!");

		Type Type = ApplicationBean.class;
		BeanManager beanManager2 = CDI.current().getBeanManager();
		Set<Bean<?>> beans = beanManager2.getBeans(Type);
		beans.forEach(a -> {
			System.out.println(a.getScope());
		});

	}

}
