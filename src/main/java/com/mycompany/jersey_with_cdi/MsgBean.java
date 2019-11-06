package com.mycompany.jersey_with_cdi;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MsgBean {

	private static final Logger LOGGER = Logger.getLogger(MsgBean.class.getName());

	@PostConstruct
	public void init() {
		LOGGER.info("Init");
	}

	public String get() {
		return "Hello world";
	}

	@PreDestroy
	public void destroy() {
		LOGGER.info("Destroy");
	}
}
