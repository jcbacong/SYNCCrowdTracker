package com.google.appinventor.components.runtime.errors;

import com.google.appinventor.components.annotations.SimpleObject;

@SimpleObject
public class AssertionFailure
  extends RuntimeError
{
  public AssertionFailure() {}
  
  public AssertionFailure(String paramString)
  {
    super(paramString);
  }
}


/* Location:              /home/nelmntrx/Desktop/SYNCCrowdTracker/dex2jar-2.0/classes-dex2jar.jar!/com/google/appinventor/components/runtime/errors/AssertionFailure.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */