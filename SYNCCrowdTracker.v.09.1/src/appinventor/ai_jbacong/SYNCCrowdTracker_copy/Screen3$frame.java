package appinventor.ai_jbacong.SYNCCrowdTracker_copy;

import com.google.appinventor.components.runtime.Component;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleMethod;
import gnu.mapping.CallContext;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;

public class Screen3$frame
  extends ModuleBody
{
  Screen3 $main;
  
  public Object apply0(ModuleMethod paramModuleMethod)
  {
    switch (paramModuleMethod.selector)
    {
    case 17: 
    case 18: 
    default: 
      return super.apply0(paramModuleMethod);
    case 15: 
      return Screen3.lambda2();
    case 16: 
      this.$main.$define();
      return Values.empty;
    case 19: 
      return Screen3.lambda4();
    case 20: 
      return Screen3.lambda6();
    case 21: 
      return Screen3.lambda7();
    case 22: 
      return Screen3.lambda8();
    case 23: 
      return this.$main.Screen3$BackPressed();
    case 24: 
      return Screen3.lambda9();
    case 25: 
      return Screen3.lambda10();
    case 26: 
      return Screen3.lambda11();
    case 27: 
      return Screen3.lambda12();
    case 28: 
      return Screen3.lambda13();
    case 29: 
      return Screen3.lambda14();
    case 30: 
      return Screen3.lambda15();
    case 31: 
      return Screen3.lambda16();
    case 32: 
      return Screen3.lambda17();
    case 33: 
      return Screen3.lambda18();
    case 34: 
      return Screen3.lambda19();
    case 35: 
      return Screen3.lambda20();
    case 36: 
      return Screen3.lambda21();
    case 37: 
      return Screen3.lambda22();
    case 38: 
      return Screen3.lambda23();
    case 39: 
      return Screen3.lambda24();
    case 40: 
      return Screen3.lambda25();
    case 41: 
      return Screen3.lambda26();
    case 42: 
      return Screen3.lambda27();
    case 43: 
      return Screen3.lambda28();
    case 44: 
      return Screen3.lambda29();
    case 45: 
      return Screen3.lambda30();
    case 46: 
      return Screen3.lambda31();
    case 47: 
      return Screen3.lambda32();
    case 48: 
      return Screen3.lambda33();
    case 49: 
      return Screen3.lambda34();
    case 50: 
      return this.$main.Button3$Click();
    case 51: 
      return Screen3.lambda35();
    case 52: 
      return Screen3.lambda36();
    case 53: 
      return this.$main.Button2$Click();
    case 54: 
      return Screen3.lambda37();
    case 55: 
      return Screen3.lambda38();
    }
    return this.$main.Button1$Click();
  }
  
  public Object apply1(ModuleMethod paramModuleMethod, Object paramObject)
  {
    switch (paramModuleMethod.selector)
    {
    default: 
      return super.apply1(paramModuleMethod, paramObject);
    case 1: 
      this.$main.androidLogForm(paramObject);
      return Values.empty;
    case 3: 
      paramModuleMethod = this.$main;
    }
    try
    {
      localSymbol = (Symbol)paramObject;
      return paramModuleMethod.lookupInFormEnvironment(localSymbol);
    }
    catch (ClassCastException paramModuleMethod)
    {
      Symbol localSymbol;
      throw new WrongType(paramModuleMethod, "lookup-in-form-environment", 1, paramObject);
    }
    paramModuleMethod = this.$main;
    try
    {
      localSymbol = (Symbol)paramObject;
      if (paramModuleMethod.isBoundInFormEnvironment(localSymbol)) {
        return Boolean.TRUE;
      }
      return Boolean.FALSE;
    }
    catch (ClassCastException paramModuleMethod)
    {
      throw new WrongType(paramModuleMethod, "is-bound-in-form-environment", 1, paramObject);
    }
    this.$main.addToFormDoAfterCreation(paramObject);
    return Values.empty;
    this.$main.sendError(paramObject);
    return Values.empty;
    this.$main.processException(paramObject);
    return Values.empty;
    return Screen3.lambda3(paramObject);
    return Screen3.lambda5(paramObject);
    return this.$main.File1$GotText(paramObject);
    return this.$main.Notifier1$AfterTextInput(paramObject);
  }
  
  public Object apply2(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2)
  {
    switch (paramModuleMethod.selector)
    {
    case 4: 
    case 5: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      return super.apply2(paramModuleMethod, paramObject1, paramObject2);
    case 2: 
      paramModuleMethod = this.$main;
    }
    try
    {
      localSymbol = (Symbol)paramObject1;
      paramModuleMethod.addToFormEnvironment(localSymbol, paramObject2);
      return Values.empty;
    }
    catch (ClassCastException paramModuleMethod)
    {
      Symbol localSymbol;
      throw new WrongType(paramModuleMethod, "add-to-form-environment", 1, paramObject1);
    }
    paramModuleMethod = this.$main;
    try
    {
      localSymbol = (Symbol)paramObject1;
      return paramModuleMethod.lookupInFormEnvironment(localSymbol, paramObject2);
    }
    catch (ClassCastException paramModuleMethod)
    {
      throw new WrongType(paramModuleMethod, "lookup-in-form-environment", 1, paramObject1);
    }
    paramModuleMethod = this.$main;
    try
    {
      localSymbol = (Symbol)paramObject1;
      paramModuleMethod.addToGlobalVarEnvironment(localSymbol, paramObject2);
      return Values.empty;
    }
    catch (ClassCastException paramModuleMethod)
    {
      throw new WrongType(paramModuleMethod, "add-to-global-var-environment", 1, paramObject1);
    }
    this.$main.addToEvents(paramObject1, paramObject2);
    return Values.empty;
    this.$main.addToGlobalVars(paramObject1, paramObject2);
    return Values.empty;
    return this.$main.lookupHandler(paramObject1, paramObject2);
  }
  
  /* Error */
  public Object apply4(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 19	gnu/expr/ModuleMethod:selector	I
    //   4: lookupswitch	default:+28->32, 8:+40->44, 13:+57->61
    //   32: aload_0
    //   33: aload_1
    //   34: aload_2
    //   35: aload_3
    //   36: aload 4
    //   38: aload 5
    //   40: invokespecial 247	gnu/expr/ModuleBody:apply4	(Lgnu/expr/ModuleMethod;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   43: areturn
    //   44: aload_0
    //   45: getfield 29	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3$frame:$main	Lappinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3;
    //   48: aload_2
    //   49: aload_3
    //   50: aload 4
    //   52: aload 5
    //   54: invokevirtual 251	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   57: getstatic 38	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   60: areturn
    //   61: aload_0
    //   62: getfield 29	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3$frame:$main	Lappinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3;
    //   65: astore_1
    //   66: aload_2
    //   67: checkcast 253	com/google/appinventor/components/runtime/Component
    //   70: astore 6
    //   72: aload_3
    //   73: checkcast 255	java/lang/String
    //   76: astore_2
    //   77: aload 4
    //   79: checkcast 255	java/lang/String
    //   82: astore_3
    //   83: aload 5
    //   85: checkcast 257	[Ljava/lang/Object;
    //   88: astore 4
    //   90: aload_1
    //   91: aload 6
    //   93: aload_2
    //   94: aload_3
    //   95: aload 4
    //   97: invokevirtual 261	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:dispatchEvent	(Lcom/google/appinventor/components/runtime/Component;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Z
    //   100: ifeq +7 -> 107
    //   103: getstatic 180	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   106: areturn
    //   107: getstatic 183	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   110: areturn
    //   111: astore_1
    //   112: new 207	gnu/mapping/WrongType
    //   115: dup
    //   116: aload_1
    //   117: ldc_w 262
    //   120: iconst_1
    //   121: aload_2
    //   122: invokespecial 212	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   125: athrow
    //   126: astore_1
    //   127: new 207	gnu/mapping/WrongType
    //   130: dup
    //   131: aload_1
    //   132: ldc_w 262
    //   135: iconst_2
    //   136: aload_3
    //   137: invokespecial 212	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   140: athrow
    //   141: astore_1
    //   142: new 207	gnu/mapping/WrongType
    //   145: dup
    //   146: aload_1
    //   147: ldc_w 262
    //   150: iconst_3
    //   151: aload 4
    //   153: invokespecial 212	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   156: athrow
    //   157: astore_1
    //   158: new 207	gnu/mapping/WrongType
    //   161: dup
    //   162: aload_1
    //   163: ldc_w 262
    //   166: iconst_4
    //   167: aload 5
    //   169: invokespecial 212	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   172: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	frame
    //   0	173	1	paramModuleMethod	ModuleMethod
    //   0	173	2	paramObject1	Object
    //   0	173	3	paramObject2	Object
    //   0	173	4	paramObject3	Object
    //   0	173	5	paramObject4	Object
    //   70	22	6	localComponent	Component
    // Exception table:
    //   from	to	target	type
    //   66	72	111	java/lang/ClassCastException
    //   72	77	126	java/lang/ClassCastException
    //   77	83	141	java/lang/ClassCastException
    //   83	90	157	java/lang/ClassCastException
  }
  
  public int match0(ModuleMethod paramModuleMethod, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    case 17: 
    case 18: 
    default: 
      return super.match0(paramModuleMethod, paramCallContext);
    case 56: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 55: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 54: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 53: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 52: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 51: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 50: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 49: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 48: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 47: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 46: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 45: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 44: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 43: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 42: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 41: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 40: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 39: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 38: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 37: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 36: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 35: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 34: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 33: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 32: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 31: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 30: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 29: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 28: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 27: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 26: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 25: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 24: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 23: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 22: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 21: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 20: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 19: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 16: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    }
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 0;
    return 0;
  }
  
  public int match1(ModuleMethod paramModuleMethod, Object paramObject, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    default: 
      return super.match1(paramModuleMethod, paramObject, paramCallContext);
    case 58: 
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    case 57: 
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    case 18: 
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    case 17: 
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    case 12: 
      if (!(paramObject instanceof Screen3)) {
        return -786431;
      }
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    case 11: 
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    case 10: 
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    case 5: 
      if (!(paramObject instanceof Symbol)) {
        return -786431;
      }
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    case 3: 
      if (!(paramObject instanceof Symbol)) {
        return -786431;
      }
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    }
    paramCallContext.value1 = paramObject;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 1;
    return 0;
  }
  
  public int match2(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    case 4: 
    case 5: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      return super.match2(paramModuleMethod, paramObject1, paramObject2, paramCallContext);
    case 14: 
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 9: 
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 7: 
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 6: 
      if (!(paramObject1 instanceof Symbol)) {
        return -786431;
      }
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 3: 
      if (!(paramObject1 instanceof Symbol)) {
        return -786431;
      }
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    }
    if (!(paramObject1 instanceof Symbol)) {
      return -786431;
    }
    paramCallContext.value1 = paramObject1;
    paramCallContext.value2 = paramObject2;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 2;
    return 0;
  }
  
  public int match4(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    default: 
      return super.match4(paramModuleMethod, paramObject1, paramObject2, paramObject3, paramObject4, paramCallContext);
    case 13: 
      if (!(paramObject1 instanceof Screen3)) {
        return -786431;
      }
      paramCallContext.value1 = paramObject1;
      if (!(paramObject2 instanceof Component)) {
        return -786430;
      }
      paramCallContext.value2 = paramObject2;
      if (!(paramObject3 instanceof String)) {
        return -786429;
      }
      paramCallContext.value3 = paramObject3;
      if (!(paramObject4 instanceof String)) {
        return -786428;
      }
      paramCallContext.value4 = paramObject4;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 4;
      return 0;
    }
    paramCallContext.value1 = paramObject1;
    paramCallContext.value2 = paramObject2;
    paramCallContext.value3 = paramObject3;
    paramCallContext.value4 = paramObject4;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 4;
    return 0;
  }
}


/* Location:              /home/nelmntrx/Desktop/SYNCCrowdTracker/dex2jar-2.0/classes-dex2jar.jar!/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3$frame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */