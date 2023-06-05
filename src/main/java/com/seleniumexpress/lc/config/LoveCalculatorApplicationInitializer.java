package com.seleniumexpress.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer //implements WebApplicationInitializer 

{

/*	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		// System.out.println("OOOOOOOOOOKKKKKKKKKK");
		/*
		 * config avec XML XmlWebApplicationContext webapplicationcontext = new
		 * XmlWebApplicationContext();
		 * webapplicationcontext.setConfigLocation("classpath:application-config.xml");
		 */

		// config sans XML

/*		AnnotationConfigWebApplicationContext webapplicationcontext = new AnnotationConfigWebApplicationContext();

		webapplicationcontext.register(LoveCalculatorAppConfig.class);

		// create dispatcher servlet object
		DispatcherServlet dispatcherservlet = new DispatcherServlet(webapplicationcontext);
		// register dispatcher servlet with servlet context
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet",
				dispatcherservlet);

		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/mywebsite.com/*");

	} */

}
