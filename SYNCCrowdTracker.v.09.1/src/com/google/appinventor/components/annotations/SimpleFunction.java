package com.google.appinventor.components.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
public @interface SimpleFunction
{
  String description() default "";
  
  boolean userVisible() default true;
}


/* Location:              /home/nelmntrx/Desktop/SYNCCrowdTracker/dex2jar-2.0/classes-dex2jar.jar!/com/google/appinventor/components/annotations/SimpleFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */