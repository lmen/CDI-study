package pt.lmen.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.util.Nonbinding;

@ApplicationScoped
public class ObserverBean {
	@Nonbinding
	public void obj(@Observes @DoIt DoItInfo doItInfo) {
		System.out.println("ObserverBean :" + doItInfo.getMessage());
	}

}
