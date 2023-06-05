package com.seleniumexpress.lc.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {
	
	
	
	@Override
	
	public void setAsText(String text) throws java.lang.IllegalArgumentException {
        
      String myText = text.toUpperCase();
       
       setValue(myText);
    }

}
