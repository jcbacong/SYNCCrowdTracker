package com.google.appinventor.components.runtime.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;

public final class ScreenDensityUtil
{
  public static final int DEFAULT_NORMAL_SHORT_DIMENSION = 320;
  private static final String LOG_TAG = "ScreenDensityUtil";
  public static final float MAXIMUM_ASPECT_RATIO = 1.7791667F;
  
  public static float computeCompatibleScaling(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    Point localPoint = new Point();
    getRawScreenDim(paramContext, localPoint);
    int i = localPoint.x;
    int j = localPoint.y;
    int n;
    int m;
    float f2;
    float f1;
    if (i < j)
    {
      n = i;
      m = j;
      int k = (int)(320.0F * localDisplayMetrics.density + 0.5F);
      f2 = m / n;
      f1 = f2;
      if (f2 > 1.7791667F) {
        f1 = 1.7791667F;
      }
      m = (int)(k * f1 + 0.5F);
      if (i >= j) {
        break label156;
      }
      n = k;
      k = m;
      label111:
      f1 = i / n;
      f2 = j / k;
      if (f1 >= f2) {
        break label163;
      }
    }
    for (;;)
    {
      f2 = f1;
      if (f1 < 1.0F) {
        f2 = 1.0F;
      }
      return f2;
      n = j;
      m = i;
      break;
      label156:
      n = m;
      break label111;
      label163:
      f1 = f2;
    }
  }
  
  /* Error */
  public static void getRawScreenDim(Context paramContext, Point paramPoint)
  {
    // Byte code:
    //   0: new 49	android/util/DisplayMetrics
    //   3: dup
    //   4: invokespecial 62	android/util/DisplayMetrics:<init>	()V
    //   7: pop
    //   8: aload_0
    //   9: ldc 64
    //   11: invokevirtual 68	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   14: checkcast 70	android/view/WindowManager
    //   17: invokeinterface 74 1 0
    //   22: astore_0
    //   23: invokestatic 80	com/google/appinventor/components/runtime/util/SdkLevel:getLevel	()I
    //   26: istore 4
    //   28: iload 4
    //   30: bipush 17
    //   32: if_icmplt +9 -> 41
    //   35: aload_0
    //   36: aload_1
    //   37: invokestatic 86	com/google/appinventor/components/runtime/util/JellybeanUtil:getRealSize	(Landroid/view/Display;Landroid/graphics/Point;)V
    //   40: return
    //   41: iload 4
    //   43: bipush 10
    //   45: if_icmple +110 -> 155
    //   48: ldc 88
    //   50: ldc 90
    //   52: iconst_0
    //   53: anewarray 92	java/lang/Class
    //   56: invokevirtual 96	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   59: astore_2
    //   60: ldc 88
    //   62: ldc 98
    //   64: iconst_0
    //   65: anewarray 92	java/lang/Class
    //   68: invokevirtual 96	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   71: astore_3
    //   72: aload_1
    //   73: aload_3
    //   74: aload_0
    //   75: iconst_0
    //   76: anewarray 4	java/lang/Object
    //   79: invokevirtual 104	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   82: checkcast 106	java/lang/Integer
    //   85: invokevirtual 109	java/lang/Integer:intValue	()I
    //   88: putfield 43	android/graphics/Point:x	I
    //   91: aload_1
    //   92: aload_2
    //   93: aload_0
    //   94: iconst_0
    //   95: anewarray 4	java/lang/Object
    //   98: invokevirtual 104	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   101: checkcast 106	java/lang/Integer
    //   104: invokevirtual 109	java/lang/Integer:intValue	()I
    //   107: putfield 46	android/graphics/Point:y	I
    //   110: return
    //   111: astore_0
    //   112: ldc 11
    //   114: ldc 111
    //   116: aload_0
    //   117: invokestatic 117	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   120: pop
    //   121: return
    //   122: astore_0
    //   123: ldc 11
    //   125: ldc 111
    //   127: aload_0
    //   128: invokestatic 117	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   131: pop
    //   132: return
    //   133: astore_0
    //   134: ldc 11
    //   136: ldc 111
    //   138: aload_0
    //   139: invokestatic 117	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   142: pop
    //   143: return
    //   144: astore_0
    //   145: ldc 11
    //   147: ldc 111
    //   149: aload_0
    //   150: invokestatic 117	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   153: pop
    //   154: return
    //   155: aload_1
    //   156: aload_0
    //   157: invokevirtual 120	android/view/Display:getWidth	()I
    //   160: putfield 43	android/graphics/Point:x	I
    //   163: aload_1
    //   164: aload_0
    //   165: invokevirtual 123	android/view/Display:getHeight	()I
    //   168: putfield 46	android/graphics/Point:y	I
    //   171: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	paramContext	Context
    //   0	172	1	paramPoint	Point
    //   59	34	2	localMethod1	java.lang.reflect.Method
    //   71	3	3	localMethod2	java.lang.reflect.Method
    //   26	20	4	i	int
    // Exception table:
    //   from	to	target	type
    //   72	110	111	java/lang/IllegalArgumentException
    //   48	72	122	java/lang/NoSuchMethodException
    //   72	110	122	java/lang/NoSuchMethodException
    //   112	121	122	java/lang/NoSuchMethodException
    //   134	143	122	java/lang/NoSuchMethodException
    //   145	154	122	java/lang/NoSuchMethodException
    //   72	110	133	java/lang/IllegalAccessException
    //   72	110	144	java/lang/reflect/InvocationTargetException
  }
}


/* Location:              /home/nelmntrx/Desktop/SYNCCrowdTracker/dex2jar-2.0/classes-dex2jar.jar!/com/google/appinventor/components/runtime/util/ScreenDensityUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */