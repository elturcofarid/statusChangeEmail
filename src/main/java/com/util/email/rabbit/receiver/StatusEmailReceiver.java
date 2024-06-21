package com.util.email.rabbit.receiver;

import com.google.gson.Gson;
import com.util.email.model.DataRequest;
import com.util.email.postmark.EmailPostmarkPort;
import com.util.email.postmark.EmailPostmarkService;
import com.util.email.service.ChangeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StatusEmailReceiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(StatusEmailReceiver.class);

	@Autowired
	private Gson gson;

	@Autowired
	private EmailPostmarkPort emailScm;

	@Autowired
	private ChangeService changeService;

	@RabbitListener(queues = "${queue.status.email}")
	public void receive(String in) {
		try {

			DataRequest data = gson.fromJson(in, DataRequest.class);

			System.out.println(gson.toJson(data));

			System.out.println(changeService.changeStatus(emailScm.getStatusEmail("isisisisis")));

		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error("ocurrio un error recibiendo el mensaje inicial");
		}

	}
}
