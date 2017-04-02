package pt.lmen.beans;

public class ServiceImpl implements Service {

	private String id;
	private Logger logger;

	public ServiceImpl(String id, Logger logger) {
		super();
		this.id = id;
		this.logger = logger;
	}

	public void doService() {
		logger.log("DoService " + id);
	}

}
