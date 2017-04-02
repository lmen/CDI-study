package pt.lmen.beans;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Logger {

	public void log(String l) {
		System.out.println(l);
	}
}
