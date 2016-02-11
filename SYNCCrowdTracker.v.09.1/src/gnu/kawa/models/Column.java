package gnu.kawa.models;

import java.io.Serializable;

public class Column
  extends Box
  implements Viewable, Serializable
{
  public int getAxis()
  {
    return 1;
  }
}


/* Location:              /home/nelmntrx/Desktop/SYNCCrowdTracker/dex2jar-2.0/classes-dex2jar.jar!/gnu/kawa/models/Column.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */