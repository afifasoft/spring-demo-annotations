package com.alakesoftware.springdemoannotations.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	// for multiple code
	// private String[] coursePrefixes;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
		//coursePrefixes = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidtorContext) {
	
		boolean result;
		
		if (theCode != null) {
			result = theCode.startsWith(coursePrefix);
			
//			for(String tempPrefix : coursePrefixes) {
//				result = theCode.startsWith(tempPrefix);
//				
//				if(result) {
//					break;
//				}
//			}
		} else {
			result = true;
		}
				
		return result;
	}	

}
