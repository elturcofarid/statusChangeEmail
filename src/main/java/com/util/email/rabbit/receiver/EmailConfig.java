package com.util.email.rabbit.receiver;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@Component("statusEmail")
public class EmailConfig {

    @Bean
    public StatusEmailReceiver receive() {
	return new StatusEmailReceiver();
    }

	}