package kawa.standard;

import gnu.expr.Compilation;
import gnu.expr.Expression;
import gnu.expr.ModuleManager;
import gnu.expr.ScopeExp;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.mapping.Procedure;
import java.io.PrintStream;
import java.util.Vector;
import kawa.lang.Syntax;
import kawa.lang.Translator;

public class ImportFromLibrary
  extends Syntax
{
  private static final String BUILTIN = "";
  private static final String MISSING;
  static final String[][] SRFI97Map;
  public static final ImportFromLibrary instance = new ImportFromLibrary();
  public String[] classPrefixPath = { "", "kawa.lib." };
  
  static
  {
    MISSING = null;
    String[] arrayOfString1 = { "1", "lists", "gnu.kawa.slib.srfi1" };
    String[] arrayOfString2 = { "2", "and-let*", "gnu.kawa.slib.srfi2" };
    String[] arrayOfString3 = { "5", "let", MISSING };
    String[] arrayOfString4 = { "6", "basic-string-ports", "" };
    String[] arrayOfString5 = { "9", "records", "" };
    String[] arrayOfString6 = { "11", "let-values", "" };
    String[] arrayOfString7 = { "13", "strings", "gnu.kawa.slib.srfi13" };
    String[] arrayOfString8 = { "14", "char-sets", MISSING };
    String[] arrayOfString9 = { "16", "case-lambda", "" };
    String[] arrayOfString10 = { "17", "generalized-set!", "" };
    String[] arrayOfString11 = { "18", "multithreading", MISSING };
    String[] arrayOfString12 = { "19", "time", MISSING };
    String str1 = MISSING;
    String[] arrayOfString13 = { "25", "multi-dimensional-arrays", "" };
    String[] arrayOfString14 = { "26", "cut", "" };
    String[] arrayOfString15 = { "27", "random-bits", MISSING };
    String[] arrayOfString16 = { "28", "basic-format-strings", "" };
    String[] arrayOfString17 = { "29", "localization", MISSING };
    String[] arrayOfString18 = { "31", "rec", MISSING };
    String[] arrayOfString19 = { "38", "with-shared-structure", MISSING };
    String[] arrayOfString20 = { "39", "parameters", "" };
    String[] arrayOfString21 = { "41", "streams", MISSING };
    String str2 = MISSING;
    String[] arrayOfString22 = { "43", "vectors", MISSING };
    String[] arrayOfString23 = { "44", "collections", MISSING };
    String[] arrayOfString24 = { "45", "lazy", MISSING };
    String[] arrayOfString25 = { "46", "syntax-rules", MISSING };
    String[] arrayOfString26 = { "47", "arrays", MISSING };
    String[] arrayOfString27 = { "48", "intermediate-format-strings", MISSING };
    String[] arrayOfString28 = { "51", "rest-values", MISSING };
    String[] arrayOfString29 = { "54", "cat", MISSING };
    String str3 = MISSING;
    String[] arrayOfString30 = { "59", "vicinities", MISSING };
    String str4 = MISSING;
    String[] arrayOfString31 = { "61", "cond", MISSING };
    String str5 = MISSING;
    String[] arrayOfString32 = { "64", "testing", "gnu.kawa.slib.testing" };
    String[] arrayOfString33 = { "66", "octet-vectors", MISSING };
    String str6 = MISSING;
    String[] arrayOfString34 = { "69", "basic-hash-tables", "gnu.kawa.slib.srfi69" };
    String str7 = MISSING;
    String[] arrayOfString35 = { "74", "blobs", MISSING };
    String[] arrayOfString36 = { "78", "lightweight-testing", MISSING };
    String[] arrayOfString37 = { "86", "mu-and-nu", MISSING };
    String[] arrayOfString38 = { "87", "case", MISSING };
    String[] arrayOfString39 = { "95", "sorting-and-merging", "kawa.lib.srfi95" };
    SRFI97Map = new String[][] { arrayOfString1, arrayOfString2, arrayOfString3, arrayOfString4, { "8", "receive", "" }, arrayOfString5, arrayOfString6, arrayOfString7, arrayOfString8, arrayOfString9, arrayOfString10, arrayOfString11, arrayOfString12, { "21", "real-time-multithreading", str1 }, { "23", "error", "" }, arrayOfString13, arrayOfString14, arrayOfString15, arrayOfString16, arrayOfString17, arrayOfString18, arrayOfString19, arrayOfString20, arrayOfString21, { "42", "eager-comprehensions", str2 }, arrayOfString22, arrayOfString23, arrayOfString24, arrayOfString25, arrayOfString26, arrayOfString27, arrayOfString28, arrayOfString29, { "57", "records", str3 }, arrayOfString30, { "60", "integer-bits", str4 }, arrayOfString31, { "63", "arrays", str5 }, arrayOfString32, arrayOfString33, { "67", "compare-procedures", str6 }, arrayOfString34, { "71", "let", str7 }, arrayOfString35, arrayOfString36, arrayOfString37, arrayOfString38, arrayOfString39 };
  }
  
  public Expression rewriteForm(Pair paramPair, Translator paramTranslator)
  {
    return null;
  }
  
  public boolean scanForDefinitions(Pair paramPair, Vector paramVector, ScopeExp paramScopeExp, Translator paramTranslator)
  {
    Object localObject2 = null;
    paramPair = paramPair.getCdr();
    if (!(paramPair instanceof Pair)) {
      return false;
    }
    paramPair = (Pair)paramPair;
    Object localObject3 = paramPair.getCar();
    if (LList.listLength(localObject3, false) <= 0)
    {
      paramTranslator.error('e', "expected <library reference> which must be a list");
      return false;
    }
    paramPair = paramPair.getCdr();
    Object localObject1 = localObject2;
    if ((paramPair instanceof Pair))
    {
      localObject1 = localObject2;
      if ((((Pair)paramPair).getCar() instanceof Procedure)) {
        localObject1 = (Procedure)((Pair)paramPair).getCar();
      }
    }
    paramPair = null;
    localObject2 = null;
    Object localObject5 = new StringBuffer();
    Object localObject4;
    if ((localObject3 instanceof Pair))
    {
      localObject3 = (Pair)localObject3;
      localObject4 = ((Pair)localObject3).getCar();
      localObject3 = ((Pair)localObject3).getCdr();
      if ((localObject4 instanceof Pair))
      {
        if (paramPair != null) {
          paramTranslator.error('e', "duplicate version reference - was " + paramPair);
        }
        paramPair = (Pair)localObject4;
        System.err.println("import version " + localObject4);
      }
      for (;;)
      {
        break;
        if ((localObject4 instanceof String))
        {
          if ((localObject3 instanceof Pair)) {
            paramTranslator.error('e', "source specifier must be last elemnt in library reference");
          }
          localObject2 = (String)localObject4;
        }
        else
        {
          if (((StringBuffer)localObject5).length() > 0) {
            ((StringBuffer)localObject5).append('.');
          }
          ((StringBuffer)localObject5).append(Compilation.mangleNameIfNeeded(localObject4.toString()));
        }
      }
    }
    paramPair = null;
    if (localObject2 != null)
    {
      localObject3 = require.lookupModuleFromSourcePath((String)localObject2, paramScopeExp);
      paramPair = (Pair)localObject3;
      if (localObject3 == null)
      {
        paramTranslator.error('e', "malformed URL: " + (String)localObject2);
        return false;
      }
    }
    localObject3 = ((StringBuffer)localObject5).toString();
    localObject2 = localObject3;
    if (((String)localObject3).startsWith("srfi."))
    {
      localObject5 = Compilation.demangleName(((String)localObject3).substring(5));
      i = ((String)localObject5).indexOf('.');
      if (i < 0)
      {
        localObject2 = null;
        i = ((String)localObject5).length();
        localObject4 = null;
        if (i < 2)
        {
          localObject3 = localObject4;
          if (((String)localObject5).charAt(0) != ':') {}
        }
        else
        {
          j = 1;
        }
      }
      for (;;)
      {
        if (j == i) {
          localObject3 = ((String)localObject5).substring(1, i);
        }
        do
        {
          if (localObject3 != null) {
            break label491;
          }
          paramTranslator.error('e', "SRFI library reference must have the form: (srfi :NNN [name])");
          return false;
          localObject2 = ((String)localObject5).substring(i + 1);
          break;
          localObject3 = localObject4;
        } while (Character.digit(((String)localObject5).charAt(j), 10) < 0);
        j += 1;
      }
      label491:
      i = SRFI97Map.length;
      do
      {
        j = i - 1;
        if (j < 0)
        {
          paramTranslator.error('e', "unknown SRFI number '" + (String)localObject3 + "' in SRFI library reference");
          return false;
        }
        i = j;
      } while (!SRFI97Map[j][0].equals(localObject3));
      localObject5 = SRFI97Map[j][1];
      localObject4 = SRFI97Map[j][2];
      if ((localObject2 != null) && (!((String)localObject2).equals(localObject5))) {
        paramTranslator.error('w', "the name of SRFI " + (String)localObject3 + " should be '" + (String)localObject5 + '\'');
      }
      if (localObject4 == "") {
        return true;
      }
      if (localObject4 == MISSING)
      {
        paramTranslator.error('e', "sorry - Kawa does not support SRFI " + (String)localObject3 + " (" + (String)localObject5 + ')');
        return false;
      }
      localObject2 = localObject4;
    }
    int j = this.classPrefixPath.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label781;
      }
      localObject3 = this.classPrefixPath[i] + (String)localObject2;
      try
      {
        localObject3 = ModuleManager.getInstance().findWithClassName((String)localObject3);
        paramPair = (Pair)localObject3;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      i += 1;
    }
    label781:
    if (paramPair == null)
    {
      paramTranslator.error('e', "unknown class " + (String)localObject2);
      return false;
    }
    require.importDefinitions(null, paramPair, (Procedure)localObject1, paramVector, paramScopeExp, paramTranslator);
    return true;
  }
}


/* Location:              /home/nelmntrx/Desktop/SYNCCrowdTracker/dex2jar-2.0/classes-dex2jar.jar!/kawa/standard/ImportFromLibrary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */