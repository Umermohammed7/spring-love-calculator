package com.seleniumexpress.lc.config;

import java.util.Properties;

import javax.validation.Validator;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.seleniumexpress.lc.converter.CreditCardConverter;
import com.seleniumexpress.lc.formatter.AmountFormatter;
import com.seleniumexpress.lc.formatter.CreditCardFormatter;
import com.seleniumexpress.lc.formatter.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.seleniumexpress.lc" })
@PropertySource("classpath:email.properties")
public class LoveCalculatorAppConfig implements WebMvcConfigurer {

	@Autowired
	private Environment env;
	private Logger logger = Logger.getLogger(LoveCalculatorAppConfig.class.getName());
	
	// set up view resolver
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	@Bean
	public MessageSource messageSource() {

		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.addBasenames("messages");

		return messageSource;
	}

	@Bean(name = "validator") //si on met pas validator comme nom de méthode

	public LocalValidatorFactoryBean validator() {

		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource());

		return localValidatorFactoryBean;

	}
	
	
	@Bean
	
	public JavaMailSender getJavaMailSender() {
		
		JavaMailSenderImpl javaMailsenderImpl = new JavaMailSenderImpl();
		
		logger.info("fetching the hosst mail" + env.getProperty("mail.host"));
		
		javaMailsenderImpl.setHost(env.getProperty("mail.host"));//javaMailsenderImpl.setHost("smtp.mail.yahoo.com");  "smtp.gmail.com"
		javaMailsenderImpl.setUsername(env.getProperty("mail.username")); // "altgogo57@gmail.com" "altgogo57@​yahoo.com"
		javaMailsenderImpl.setPassword(env.getProperty("mail.password")); //"ljarghjldlcbtujz"  "lemeccheloudu93"
		javaMailsenderImpl.setPort( getIntProperty("mail.port"));
		//javaMailsenderImpl.setPort(465); //, "mail.smtps.port",
		//Properties mailProperties = getMailProperty();// "smtp.gmail.com" "smtp.mail.yahoo.com"
		//mailProperties.put("mail.smtps.ssl.enable", "true"); //ici
		//mailProperties.put("mail.smtp.auth", "true");
		javaMailsenderImpl.setJavaMailProperties(getMailProperty());
		
		return javaMailsenderImpl;
		
		
	}

	public Properties getMailProperty() {
		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.starttls.enable", true);
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com" );
		return mailProperties;
	}
	

	@Override // dire à spring qu'on a un formatter
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("inside addformatter");
		registry.addFormatter(new PhoneNumberFormatter());
		//registry.addFormatter(new CreditCardFormatter());
		registry.addConverter(new CreditCardConverter());
		registry.addFormatter(new AmountFormatter());
	}
	
	@Override
	public org.springframework.validation.Validator getValidator() {
		
		return validator();
	}
	
	
	
	//helper
	public int getIntProperty(String key) {
		
		String property = env.getProperty(key);
		return Integer.parseInt(property);
	}
	
	
	
	
}
