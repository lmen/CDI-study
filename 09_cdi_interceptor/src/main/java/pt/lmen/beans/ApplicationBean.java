package pt.lmen.beans;

import java.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@CompleteLog(logReturn = true)
public class ApplicationBean {

	public LocalDate doit(String param) {
		System.out.println("BENFICA!!" + param);
		return LocalDate.now();
	}

	public void oi() {
	}

}
