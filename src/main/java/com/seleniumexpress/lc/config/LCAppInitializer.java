package com.seleniumexpress.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override 	//donner la classe pour la config
	protected Class<?>[] getServletConfigClasses() {
		
		Class arr[] = {LoveCalculatorAppConfig.class};
		return arr;
	}

	@Override  //Mapping de la  servlet
	protected String[] getServletMappings() {
		String arr[] = {"/"};
		return arr;
	}

}
