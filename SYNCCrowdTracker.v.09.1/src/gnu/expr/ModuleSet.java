package gnu.expr;

public abstract class ModuleSet
{
  public static final String MODULES_MAP = "$ModulesMap$";
  ModuleSet next;
  
  public abstract void register(ModuleManager paramModuleManager);
}


/* Location:              /home/nelmntrx/Desktop/SYNCCrowdTracker/dex2jar-2.0/classes-dex2jar.jar!/gnu/expr/ModuleSet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */