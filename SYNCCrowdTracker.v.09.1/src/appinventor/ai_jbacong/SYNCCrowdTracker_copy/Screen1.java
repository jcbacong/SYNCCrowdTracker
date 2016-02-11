package appinventor.ai_jbacong.SYNCCrowdTracker_copy;

import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.math.DFloNum;
import gnu.math.IntNum;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.standard.Scheme;

public class Screen1
  extends Form
  implements Runnable
{
  static final SimpleSymbol Lit0 = (SimpleSymbol)new SimpleSymbol("Screen1").readResolve();
  static final SimpleSymbol Lit1;
  static final PairWithPosition Lit10;
  static final SimpleSymbol Lit100;
  static final SimpleSymbol Lit101 = (SimpleSymbol)new SimpleSymbol("any").readResolve();
  static final SimpleSymbol Lit11;
  static final IntNum Lit12;
  static final SimpleSymbol Lit13;
  static final SimpleSymbol Lit14;
  static final SimpleSymbol Lit15;
  static final SimpleSymbol Lit16;
  static final SimpleSymbol Lit17;
  static final SimpleSymbol Lit18;
  static final SimpleSymbol Lit19;
  static final SimpleSymbol Lit2;
  static final SimpleSymbol Lit20;
  static final SimpleSymbol Lit21;
  static final SimpleSymbol Lit22;
  static final FString Lit23;
  static final SimpleSymbol Lit24;
  static final SimpleSymbol Lit25;
  static final IntNum Lit26;
  static final SimpleSymbol Lit27;
  static final IntNum Lit28;
  static final SimpleSymbol Lit29;
  static final SimpleSymbol Lit3;
  static final IntNum Lit30;
  static final SimpleSymbol Lit31;
  static final IntNum Lit32;
  static final FString Lit33;
  static final FString Lit34;
  static final SimpleSymbol Lit35;
  static final FString Lit36;
  static final FString Lit37;
  static final SimpleSymbol Lit38;
  static final SimpleSymbol Lit39;
  static final SimpleSymbol Lit4;
  static final SimpleSymbol Lit40;
  static final DFloNum Lit41;
  static final SimpleSymbol Lit42;
  static final SimpleSymbol Lit43;
  static final IntNum Lit44;
  static final FString Lit45;
  static final FString Lit46;
  static final SimpleSymbol Lit47;
  static final DFloNum Lit48;
  static final FString Lit49;
  static final PairWithPosition Lit5;
  static final FString Lit50;
  static final SimpleSymbol Lit51;
  static final IntNum Lit52;
  static final IntNum Lit53;
  static final FString Lit54;
  static final FString Lit55;
  static final SimpleSymbol Lit56;
  static final DFloNum Lit57;
  static final IntNum Lit58;
  static final FString Lit59;
  static final PairWithPosition Lit6;
  static final FString Lit60;
  static final SimpleSymbol Lit61;
  static final FString Lit62;
  static final FString Lit63;
  static final SimpleSymbol Lit64;
  static final DFloNum Lit65;
  static final FString Lit66;
  static final FString Lit67;
  static final SimpleSymbol Lit68;
  static final DFloNum Lit69;
  static final PairWithPosition Lit7;
  static final FString Lit70;
  static final FString Lit71;
  static final SimpleSymbol Lit72;
  static final SimpleSymbol Lit73;
  static final DFloNum Lit74;
  static final IntNum Lit75;
  static final FString Lit76;
  static final FString Lit77;
  static final SimpleSymbol Lit78;
  static final IntNum Lit79;
  static final PairWithPosition Lit8;
  static final IntNum Lit80;
  static final FString Lit81;
  static final FString Lit82;
  static final SimpleSymbol Lit83;
  static final DFloNum Lit84;
  static final SimpleSymbol Lit85;
  static final FString Lit86;
  static final SimpleSymbol Lit87;
  static final SimpleSymbol Lit88;
  static final SimpleSymbol Lit89;
  static final PairWithPosition Lit9;
  static final SimpleSymbol Lit90;
  static final SimpleSymbol Lit91;
  static final SimpleSymbol Lit92;
  static final SimpleSymbol Lit93;
  static final SimpleSymbol Lit94;
  static final SimpleSymbol Lit95;
  static final SimpleSymbol Lit96;
  static final SimpleSymbol Lit97;
  static final SimpleSymbol Lit98;
  static final SimpleSymbol Lit99;
  public static Screen1 Screen1;
  static final ModuleMethod lambda$Fn1;
  static final ModuleMethod lambda$Fn10;
  static final ModuleMethod lambda$Fn11;
  static final ModuleMethod lambda$Fn12;
  static final ModuleMethod lambda$Fn13;
  static final ModuleMethod lambda$Fn14;
  static final ModuleMethod lambda$Fn15;
  static final ModuleMethod lambda$Fn16;
  static final ModuleMethod lambda$Fn17;
  static final ModuleMethod lambda$Fn18;
  static final ModuleMethod lambda$Fn19;
  static final ModuleMethod lambda$Fn2;
  static final ModuleMethod lambda$Fn20;
  static final ModuleMethod lambda$Fn21;
  static final ModuleMethod lambda$Fn22;
  static final ModuleMethod lambda$Fn23;
  static final ModuleMethod lambda$Fn24;
  static final ModuleMethod lambda$Fn25;
  static final ModuleMethod lambda$Fn26;
  static final ModuleMethod lambda$Fn27;
  static final ModuleMethod lambda$Fn28;
  static final ModuleMethod lambda$Fn29;
  static final ModuleMethod lambda$Fn3;
  static final ModuleMethod lambda$Fn30;
  static final ModuleMethod lambda$Fn4;
  static final ModuleMethod lambda$Fn5;
  static final ModuleMethod lambda$Fn6;
  static final ModuleMethod lambda$Fn7;
  static final ModuleMethod lambda$Fn8;
  static final ModuleMethod lambda$Fn9;
  public Boolean $Stdebug$Mnform$St;
  public final ModuleMethod $define;
  public Button Button1;
  public final ModuleMethod Button1$Click;
  public HorizontalArrangement HorizontalArrangement1;
  public HorizontalArrangement HorizontalArrangement2;
  public HorizontalArrangement HorizontalArrangement3;
  public Label Label2;
  public Label Label3;
  public Label Label4;
  public Label Label5;
  public Label Label6;
  public Label Label7;
  public final ModuleMethod Screen1$BackPressed;
  public VerticalArrangement VerticalArrangement1;
  public VerticalArrangement VerticalArrangement2;
  public final ModuleMethod add$Mnto$Mncomponents;
  public final ModuleMethod add$Mnto$Mnevents;
  public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
  public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
  public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
  public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
  public final ModuleMethod android$Mnlog$Mnform;
  public LList components$Mnto$Mncreate;
  public final ModuleMethod dispatchEvent;
  public LList events$Mnto$Mnregister;
  public LList form$Mndo$Mnafter$Mncreation;
  public Environment form$Mnenvironment;
  public Symbol form$Mnname$Mnsymbol;
  public Environment global$Mnvar$Mnenvironment;
  public LList global$Mnvars$Mnto$Mncreate;
  public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
  public final ModuleMethod lookup$Mnhandler;
  public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
  public final ModuleMethod process$Mnexception;
  public final ModuleMethod send$Mnerror;
  
  static
  {
    Lit100 = (SimpleSymbol)new SimpleSymbol("lookup-handler").readResolve();
    Lit99 = (SimpleSymbol)new SimpleSymbol("dispatchEvent").readResolve();
    Lit98 = (SimpleSymbol)new SimpleSymbol("send-error").readResolve();
    Lit97 = (SimpleSymbol)new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    Lit96 = (SimpleSymbol)new SimpleSymbol("add-to-global-vars").readResolve();
    Lit95 = (SimpleSymbol)new SimpleSymbol("add-to-components").readResolve();
    Lit94 = (SimpleSymbol)new SimpleSymbol("add-to-events").readResolve();
    Lit93 = (SimpleSymbol)new SimpleSymbol("add-to-global-var-environment").readResolve();
    Lit92 = (SimpleSymbol)new SimpleSymbol("is-bound-in-form-environment").readResolve();
    Lit91 = (SimpleSymbol)new SimpleSymbol("lookup-in-form-environment").readResolve();
    Lit90 = (SimpleSymbol)new SimpleSymbol("add-to-form-environment").readResolve();
    Lit89 = (SimpleSymbol)new SimpleSymbol("android-log-form").readResolve();
    Lit88 = (SimpleSymbol)new SimpleSymbol("Click").readResolve();
    Lit87 = (SimpleSymbol)new SimpleSymbol("Button1$Click").readResolve();
    Lit86 = new FString("com.google.appinventor.components.runtime.Button");
    Lit85 = (SimpleSymbol)new SimpleSymbol("Shape").readResolve();
    Lit84 = DFloNum.make(50);
    Lit83 = (SimpleSymbol)new SimpleSymbol("Button1").readResolve();
    Lit82 = new FString("com.google.appinventor.components.runtime.Button");
    Lit81 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit80 = IntNum.make(64456);
    Lit79 = IntNum.make(64506);
    Lit78 = (SimpleSymbol)new SimpleSymbol("HorizontalArrangement1").readResolve();
    Lit77 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit76 = new FString("com.google.appinventor.components.runtime.Label");
    Lit75 = IntNum.make(64446);
    Lit74 = DFloNum.make(11);
    Lit73 = (SimpleSymbol)new SimpleSymbol("FontItalic").readResolve();
    Lit72 = (SimpleSymbol)new SimpleSymbol("Label6").readResolve();
    Lit71 = new FString("com.google.appinventor.components.runtime.Label");
    Lit70 = new FString("com.google.appinventor.components.runtime.Label");
    Lit69 = DFloNum.make(12);
    Lit68 = (SimpleSymbol)new SimpleSymbol("Label7").readResolve();
    Lit67 = new FString("com.google.appinventor.components.runtime.Label");
    Lit66 = new FString("com.google.appinventor.components.runtime.Label");
    Lit65 = DFloNum.make(16);
    Lit64 = (SimpleSymbol)new SimpleSymbol("Label5").readResolve();
    Lit63 = new FString("com.google.appinventor.components.runtime.Label");
    Lit62 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit61 = (SimpleSymbol)new SimpleSymbol("VerticalArrangement2").readResolve();
    Lit60 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit59 = new FString("com.google.appinventor.components.runtime.Label");
    Lit58 = IntNum.make(64449);
    Lit57 = DFloNum.make(13);
    Lit56 = (SimpleSymbol)new SimpleSymbol("Label2").readResolve();
    Lit55 = new FString("com.google.appinventor.components.runtime.Label");
    Lit54 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit53 = IntNum.make(64436);
    Lit52 = IntNum.make(64516);
    Lit51 = (SimpleSymbol)new SimpleSymbol("HorizontalArrangement3").readResolve();
    Lit50 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit49 = new FString("com.google.appinventor.components.runtime.Label");
    Lit48 = DFloNum.make(10);
    Lit47 = (SimpleSymbol)new SimpleSymbol("Label3").readResolve();
    Lit46 = new FString("com.google.appinventor.components.runtime.Label");
    Lit45 = new FString("com.google.appinventor.components.runtime.Label");
    Lit44 = IntNum.make(1);
    Lit43 = (SimpleSymbol)new SimpleSymbol("TextAlignment").readResolve();
    Lit42 = (SimpleSymbol)new SimpleSymbol("Text").readResolve();
    Lit41 = DFloNum.make(25);
    Lit40 = (SimpleSymbol)new SimpleSymbol("FontSize").readResolve();
    Lit39 = (SimpleSymbol)new SimpleSymbol("FontBold").readResolve();
    Lit38 = (SimpleSymbol)new SimpleSymbol("Label4").readResolve();
    Lit37 = new FString("com.google.appinventor.components.runtime.Label");
    Lit36 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit35 = (SimpleSymbol)new SimpleSymbol("VerticalArrangement1").readResolve();
    Lit34 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit33 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit32 = IntNum.make(64436);
    Lit31 = (SimpleSymbol)new SimpleSymbol("Width").readResolve();
    Lit30 = IntNum.make(64516);
    Lit29 = (SimpleSymbol)new SimpleSymbol("Height").readResolve();
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = -3355444;
    Lit28 = IntNum.make(arrayOfInt);
    Lit27 = (SimpleSymbol)new SimpleSymbol("BackgroundColor").readResolve();
    Lit26 = IntNum.make(2);
    Lit25 = (SimpleSymbol)new SimpleSymbol("AlignVertical").readResolve();
    Lit24 = (SimpleSymbol)new SimpleSymbol("HorizontalArrangement2").readResolve();
    Lit23 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit22 = (SimpleSymbol)new SimpleSymbol("BackPressed").readResolve();
    Lit21 = (SimpleSymbol)new SimpleSymbol("Screen1$BackPressed").readResolve();
    Lit20 = (SimpleSymbol)new SimpleSymbol("VersionName").readResolve();
    Lit19 = (SimpleSymbol)new SimpleSymbol("TitleVisible").readResolve();
    Lit18 = (SimpleSymbol)new SimpleSymbol("Title").readResolve();
    Lit17 = (SimpleSymbol)new SimpleSymbol("boolean").readResolve();
    Lit16 = (SimpleSymbol)new SimpleSymbol("Scrollable").readResolve();
    Lit15 = (SimpleSymbol)new SimpleSymbol("text").readResolve();
    Lit14 = (SimpleSymbol)new SimpleSymbol("AppName").readResolve();
    Lit13 = (SimpleSymbol)new SimpleSymbol("number").readResolve();
    Lit12 = IntNum.make(3);
    Lit11 = (SimpleSymbol)new SimpleSymbol("AlignHorizontal").readResolve();
    Lit10 = PairWithPosition.make(Lit15, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1.yail", 37171);
    Lit9 = PairWithPosition.make(Lit101, PairWithPosition.make(Lit101, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1.yail", 37065), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1.yail", 37060);
    Lit8 = PairWithPosition.make(Lit15, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1.yail", 37030);
    Lit7 = PairWithPosition.make(Lit15, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1.yail", 37171);
    Lit6 = PairWithPosition.make(Lit101, PairWithPosition.make(Lit101, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1.yail", 37065), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1.yail", 37060);
    Lit5 = PairWithPosition.make(Lit15, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1.yail", 37030);
    Lit4 = (SimpleSymbol)new SimpleSymbol("p$ToScreen").readResolve();
    Lit3 = (SimpleSymbol)new SimpleSymbol("g$screenname").readResolve();
    Lit2 = (SimpleSymbol)new SimpleSymbol("*the-null-value*").readResolve();
    Lit1 = (SimpleSymbol)new SimpleSymbol("getMessage").readResolve();
  }
  
  public Screen1()
  {
    ModuleInfo.register(this);
    Screen1.frame localframe = new Screen1.frame();
    localframe.$main = this;
    this.android$Mnlog$Mnform = new ModuleMethod(localframe, 1, Lit89, 4097);
    this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(localframe, 2, Lit90, 8194);
    this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 3, Lit91, 8193);
    this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 5, Lit92, 4097);
    this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(localframe, 6, Lit93, 8194);
    this.add$Mnto$Mnevents = new ModuleMethod(localframe, 7, Lit94, 8194);
    this.add$Mnto$Mncomponents = new ModuleMethod(localframe, 8, Lit95, 16388);
    this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(localframe, 9, Lit96, 8194);
    this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(localframe, 10, Lit97, 4097);
    this.send$Mnerror = new ModuleMethod(localframe, 11, Lit98, 4097);
    this.process$Mnexception = new ModuleMethod(localframe, 12, "process-exception", 4097);
    this.dispatchEvent = new ModuleMethod(localframe, 13, Lit99, 16388);
    this.lookup$Mnhandler = new ModuleMethod(localframe, 14, Lit100, 8194);
    ModuleMethod localModuleMethod = new ModuleMethod(localframe, 15, null, 0);
    localModuleMethod.setProperty("source-location", "/tmp/runtime8900109651564447184.scm:542");
    lambda$Fn1 = localModuleMethod;
    this.$define = new ModuleMethod(localframe, 16, "$define", 0);
    lambda$Fn2 = new ModuleMethod(localframe, 17, null, 0);
    lambda$Fn3 = new ModuleMethod(localframe, 18, null, 4097);
    lambda$Fn5 = new ModuleMethod(localframe, 19, null, 4097);
    lambda$Fn4 = new ModuleMethod(localframe, 20, null, 0);
    lambda$Fn6 = new ModuleMethod(localframe, 21, null, 0);
    this.Screen1$BackPressed = new ModuleMethod(localframe, 22, Lit21, 0);
    lambda$Fn7 = new ModuleMethod(localframe, 23, null, 0);
    lambda$Fn8 = new ModuleMethod(localframe, 24, null, 0);
    lambda$Fn9 = new ModuleMethod(localframe, 25, null, 0);
    lambda$Fn10 = new ModuleMethod(localframe, 26, null, 0);
    lambda$Fn11 = new ModuleMethod(localframe, 27, null, 0);
    lambda$Fn12 = new ModuleMethod(localframe, 28, null, 0);
    lambda$Fn13 = new ModuleMethod(localframe, 29, null, 0);
    lambda$Fn14 = new ModuleMethod(localframe, 30, null, 0);
    lambda$Fn15 = new ModuleMethod(localframe, 31, null, 0);
    lambda$Fn16 = new ModuleMethod(localframe, 32, null, 0);
    lambda$Fn17 = new ModuleMethod(localframe, 33, null, 0);
    lambda$Fn18 = new ModuleMethod(localframe, 34, null, 0);
    lambda$Fn19 = new ModuleMethod(localframe, 35, null, 0);
    lambda$Fn20 = new ModuleMethod(localframe, 36, null, 0);
    lambda$Fn21 = new ModuleMethod(localframe, 37, null, 0);
    lambda$Fn22 = new ModuleMethod(localframe, 38, null, 0);
    lambda$Fn23 = new ModuleMethod(localframe, 39, null, 0);
    lambda$Fn24 = new ModuleMethod(localframe, 40, null, 0);
    lambda$Fn25 = new ModuleMethod(localframe, 41, null, 0);
    lambda$Fn26 = new ModuleMethod(localframe, 42, null, 0);
    lambda$Fn27 = new ModuleMethod(localframe, 43, null, 0);
    lambda$Fn28 = new ModuleMethod(localframe, 44, null, 0);
    lambda$Fn29 = new ModuleMethod(localframe, 45, null, 0);
    lambda$Fn30 = new ModuleMethod(localframe, 46, null, 0);
    this.Button1$Click = new ModuleMethod(localframe, 47, Lit87, 0);
  }
  
  static Object lambda10()
  {
    return runtime.setAndCoerceProperty$Ex(Lit35, Lit11, Lit12, Lit13);
  }
  
  static Object lambda11()
  {
    return runtime.setAndCoerceProperty$Ex(Lit35, Lit11, Lit12, Lit13);
  }
  
  static Object lambda12()
  {
    runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit38, Lit40, Lit41, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit38, Lit42, "CROWD TRACKING", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit38, Lit43, Lit44, Lit13);
  }
  
  static Object lambda13()
  {
    runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit38, Lit40, Lit41, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit38, Lit42, "CROWD TRACKING", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit38, Lit43, Lit44, Lit13);
  }
  
  static Object lambda14()
  {
    runtime.setAndCoerceProperty$Ex(Lit47, Lit39, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit47, Lit40, Lit48, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit47, Lit42, "A Project of the Sync.Bio.Optics Research Group", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit47, Lit43, Lit44, Lit13);
  }
  
  static Object lambda15()
  {
    runtime.setAndCoerceProperty$Ex(Lit47, Lit39, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit47, Lit40, Lit48, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit47, Lit42, "A Project of the Sync.Bio.Optics Research Group", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit47, Lit43, Lit44, Lit13);
  }
  
  static Object lambda16()
  {
    runtime.setAndCoerceProperty$Ex(Lit51, Lit11, Lit12, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit25, Lit26, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit29, Lit52, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit51, Lit31, Lit53, Lit13);
  }
  
  static Object lambda17()
  {
    runtime.setAndCoerceProperty$Ex(Lit51, Lit11, Lit12, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit25, Lit26, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit29, Lit52, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit51, Lit31, Lit53, Lit13);
  }
  
  static Object lambda18()
  {
    runtime.setAndCoerceProperty$Ex(Lit56, Lit40, Lit57, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit56, Lit31, Lit58, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit56, Lit42, "You are about to participate in our research on crowd dynamics. By clicking the START button, this app will be able to track your location and 3D acceleration at a particular instant. ", Lit15);
  }
  
  static Object lambda19()
  {
    runtime.setAndCoerceProperty$Ex(Lit56, Lit40, Lit57, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit56, Lit31, Lit58, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit56, Lit42, "You are about to participate in our research on crowd dynamics. By clicking the START button, this app will be able to track your location and 3D acceleration at a particular instant. ", Lit15);
  }
  
  /* Error */
  public static SimpleSymbol lambda1symbolAppend$V(Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: invokestatic 698	gnu/lists/LList:makeList	([Ljava/lang/Object;I)Lgnu/lists/LList;
    //   5: astore_1
    //   6: getstatic 704	kawa/standard/Scheme:apply	Lgnu/kawa/functions/Apply;
    //   9: astore_2
    //   10: getstatic 709	kawa/lib/strings:string$Mnappend	Lgnu/expr/ModuleMethod;
    //   13: astore_3
    //   14: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   17: astore_0
    //   18: aload_1
    //   19: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   22: if_acmpne +23 -> 45
    //   25: aload_2
    //   26: aload_3
    //   27: aload_0
    //   28: invokestatic 713	gnu/lists/LList:reverseInPlace	(Ljava/lang/Object;)Lgnu/lists/LList;
    //   31: invokevirtual 719	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   34: astore_0
    //   35: aload_0
    //   36: checkcast 721	java/lang/CharSequence
    //   39: astore_1
    //   40: aload_1
    //   41: invokestatic 727	kawa/lib/misc:string$To$Symbol	(Ljava/lang/CharSequence;)Lgnu/mapping/SimpleSymbol;
    //   44: areturn
    //   45: aload_1
    //   46: checkcast 729	gnu/lists/Pair
    //   49: astore 4
    //   51: aload 4
    //   53: invokevirtual 732	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   56: astore_1
    //   57: aload 4
    //   59: invokevirtual 735	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   62: astore 4
    //   64: aload 4
    //   66: checkcast 737	gnu/mapping/Symbol
    //   69: astore 5
    //   71: aload 5
    //   73: invokestatic 741	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   76: aload_0
    //   77: invokestatic 744	gnu/lists/Pair:make	(Ljava/lang/Object;Ljava/lang/Object;)Lgnu/lists/Pair;
    //   80: astore_0
    //   81: goto -63 -> 18
    //   84: astore_0
    //   85: new 746	gnu/mapping/WrongType
    //   88: dup
    //   89: aload_0
    //   90: ldc_w 748
    //   93: bipush -2
    //   95: aload_1
    //   96: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   99: athrow
    //   100: astore_0
    //   101: new 746	gnu/mapping/WrongType
    //   104: dup
    //   105: aload_0
    //   106: ldc_w 753
    //   109: iconst_1
    //   110: aload 4
    //   112: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   115: athrow
    //   116: astore_1
    //   117: new 746	gnu/mapping/WrongType
    //   120: dup
    //   121: aload_1
    //   122: ldc_w 755
    //   125: iconst_1
    //   126: aload_0
    //   127: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	paramArrayOfObject	Object[]
    //   5	91	1	localObject1	Object
    //   116	6	1	localClassCastException	ClassCastException
    //   9	17	2	localApply	gnu.kawa.functions.Apply
    //   13	14	3	localModuleMethod	ModuleMethod
    //   49	62	4	localObject2	Object
    //   69	3	5	localSymbol	Symbol
    // Exception table:
    //   from	to	target	type
    //   45	51	84	java/lang/ClassCastException
    //   64	71	100	java/lang/ClassCastException
    //   35	40	116	java/lang/ClassCastException
  }
  
  static Object lambda2()
  {
    return null;
  }
  
  static Object lambda20()
  {
    runtime.setAndCoerceProperty$Ex(Lit61, Lit11, Lit12, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit61, Lit25, Lit26, Lit13);
  }
  
  static Object lambda21()
  {
    runtime.setAndCoerceProperty$Ex(Lit61, Lit11, Lit12, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit61, Lit25, Lit26, Lit13);
  }
  
  static Object lambda22()
  {
    runtime.setAndCoerceProperty$Ex(Lit64, Lit39, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit64, Lit40, Lit65, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit64, Lit42, "Please don't forget to TURN ON your GPS.", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit64, Lit43, Lit44, Lit13);
  }
  
  static Object lambda23()
  {
    runtime.setAndCoerceProperty$Ex(Lit64, Lit39, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit64, Lit40, Lit65, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit64, Lit42, "Please don't forget to TURN ON your GPS.", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit64, Lit43, Lit44, Lit13);
  }
  
  static Object lambda24()
  {
    runtime.setAndCoerceProperty$Ex(Lit68, Lit40, Lit69, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit68, Lit42, "Click the START button after your GPS sensor stabilizes. Sensing your current position might take a while.", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit68, Lit43, Lit44, Lit13);
  }
  
  static Object lambda25()
  {
    runtime.setAndCoerceProperty$Ex(Lit68, Lit40, Lit69, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit68, Lit42, "Click the START button after your GPS sensor stabilizes. Sensing your current position might take a while.", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit68, Lit43, Lit44, Lit13);
  }
  
  static Object lambda26()
  {
    runtime.setAndCoerceProperty$Ex(Lit72, Lit73, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit72, Lit40, Lit74, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit72, Lit31, Lit75, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit72, Lit42, "Swipe your Notification bar down and select GPS. For others, go to Settings > Personal > Tap on \"Location services\" > Tap \"Access Location\".", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit72, Lit43, Lit44, Lit13);
  }
  
  static Object lambda27()
  {
    runtime.setAndCoerceProperty$Ex(Lit72, Lit73, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit72, Lit40, Lit74, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit72, Lit31, Lit75, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit72, Lit42, "Swipe your Notification bar down and select GPS. For others, go to Settings > Personal > Tap on \"Location services\" > Tap \"Access Location\".", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit72, Lit43, Lit44, Lit13);
  }
  
  static Object lambda28()
  {
    runtime.setAndCoerceProperty$Ex(Lit78, Lit11, Lit12, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit78, Lit25, Lit26, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit78, Lit29, Lit79, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit78, Lit31, Lit80, Lit13);
  }
  
  static Object lambda29()
  {
    runtime.setAndCoerceProperty$Ex(Lit78, Lit11, Lit12, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit78, Lit25, Lit26, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit78, Lit29, Lit79, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit78, Lit31, Lit80, Lit13);
  }
  
  static String lambda3()
  {
    return "";
  }
  
  static Object lambda30()
  {
    runtime.setAndCoerceProperty$Ex(Lit83, Lit39, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit83, Lit40, Lit84, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit83, Lit85, Lit44, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit83, Lit42, "START", Lit15);
  }
  
  static Object lambda31()
  {
    runtime.setAndCoerceProperty$Ex(Lit83, Lit39, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit83, Lit40, Lit84, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit83, Lit85, Lit44, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit83, Lit42, "START", Lit15);
  }
  
  static Object lambda4(Object paramObject)
  {
    if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(paramObject), Lit5, "is text empty?"), Boolean.FALSE), Lit6, "=") != Boolean.FALSE) {
      return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1(paramObject), Lit7, "open another screen");
    }
    return Values.empty;
  }
  
  static Procedure lambda5()
  {
    return lambda$Fn5;
  }
  
  static Object lambda6(Object paramObject)
  {
    if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(paramObject), Lit8, "is text empty?"), Boolean.FALSE), Lit9, "=") != Boolean.FALSE) {
      return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1(paramObject), Lit10, "open another screen");
    }
    return Values.empty;
  }
  
  static Object lambda7()
  {
    runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Lit12, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "SYNCCrowdTracker", Lit15);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "Screen1", Lit15);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.FALSE, Lit17);
    return runtime.setAndCoerceProperty$Ex(Lit0, Lit20, "jcbacong", Lit15);
  }
  
  static Object lambda8()
  {
    runtime.setAndCoerceProperty$Ex(Lit24, Lit11, Lit12, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit25, Lit26, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit27, Lit28, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit29, Lit30, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit24, Lit31, Lit32, Lit13);
  }
  
  static Object lambda9()
  {
    runtime.setAndCoerceProperty$Ex(Lit24, Lit11, Lit12, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit25, Lit26, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit27, Lit28, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit29, Lit30, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit24, Lit31, Lit32, Lit13);
  }
  
  /* Error */
  public void $define()
  {
    // Byte code:
    //   0: invokestatic 834	kawa/standard/Scheme:getInstance	()Lkawa/standard/Scheme;
    //   3: invokestatic 840	gnu/expr/Language:setDefaults	(Lgnu/expr/Language;)V
    //   6: aload_0
    //   7: invokevirtual 843	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:run	()V
    //   10: aload_0
    //   11: putstatic 845	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Screen1	Lappinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1;
    //   14: aload_0
    //   15: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   18: aload_0
    //   19: invokevirtual 849	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   22: aload_0
    //   23: getfield 851	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:events$Mnto$Mnregister	Lgnu/lists/LList;
    //   26: astore_1
    //   27: aload_1
    //   28: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   31: if_acmpne +96 -> 127
    //   34: aload_0
    //   35: getstatic 531	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit2	Lgnu/mapping/SimpleSymbol;
    //   38: getstatic 598	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn1	Lgnu/expr/ModuleMethod;
    //   41: invokevirtual 854	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield 856	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:global$Mnvars$Mnto$Mncreate	Lgnu/lists/LList;
    //   48: invokestatic 862	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   51: astore_1
    //   52: aload_1
    //   53: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   56: if_acmpne +139 -> 195
    //   59: aload_0
    //   60: getfield 864	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:form$Mndo$Mnafter$Mncreation	Lgnu/lists/LList;
    //   63: invokestatic 862	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   66: astore_1
    //   67: aload_1
    //   68: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   71: if_acmpne +214 -> 285
    //   74: aload_0
    //   75: getfield 866	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:components$Mnto$Mncreate	Lgnu/lists/LList;
    //   78: invokestatic 862	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   81: astore_1
    //   82: aload_1
    //   83: astore_2
    //   84: aload_2
    //   85: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   88: if_acmpne +234 -> 322
    //   91: aload_1
    //   92: astore_2
    //   93: aload_2
    //   94: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   97: if_acmpne +379 -> 476
    //   100: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   103: astore_2
    //   104: aload_1
    //   105: aload_2
    //   106: if_acmpne +435 -> 541
    //   109: return
    //   110: astore_1
    //   111: aload_0
    //   112: aload_1
    //   113: invokevirtual 868	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   116: invokevirtual 871	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:androidLogForm	(Ljava/lang/Object;)V
    //   119: aload_0
    //   120: aload_1
    //   121: invokevirtual 874	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:processException	(Ljava/lang/Object;)V
    //   124: goto -114 -> 10
    //   127: aload_1
    //   128: checkcast 729	gnu/lists/Pair
    //   131: astore_3
    //   132: aload_3
    //   133: invokevirtual 735	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   136: astore_2
    //   137: getstatic 878	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   140: aload_2
    //   141: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   144: astore_1
    //   145: aload_1
    //   146: ifnonnull +33 -> 179
    //   149: aconst_null
    //   150: astore_1
    //   151: getstatic 884	kawa/lib/lists:cdr	Lgnu/expr/GenericProc;
    //   154: aload_2
    //   155: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   158: astore_2
    //   159: aload_2
    //   160: ifnonnull +27 -> 187
    //   163: aconst_null
    //   164: astore_2
    //   165: aload_0
    //   166: aload_1
    //   167: aload_2
    //   168: invokestatic 890	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   171: aload_3
    //   172: invokevirtual 732	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   175: astore_1
    //   176: goto -149 -> 27
    //   179: aload_1
    //   180: invokevirtual 895	java/lang/Object:toString	()Ljava/lang/String;
    //   183: astore_1
    //   184: goto -33 -> 151
    //   187: aload_2
    //   188: invokevirtual 895	java/lang/Object:toString	()Ljava/lang/String;
    //   191: astore_2
    //   192: goto -27 -> 165
    //   195: aload_1
    //   196: checkcast 729	gnu/lists/Pair
    //   199: astore_2
    //   200: aload_2
    //   201: invokevirtual 735	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   204: astore_3
    //   205: getstatic 878	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   208: aload_3
    //   209: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   212: astore_1
    //   213: getstatic 898	kawa/lib/lists:cadr	Lgnu/expr/GenericProc;
    //   216: aload_3
    //   217: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   220: astore_3
    //   221: aload_1
    //   222: checkcast 737	gnu/mapping/Symbol
    //   225: astore 4
    //   227: aload_0
    //   228: aload 4
    //   230: getstatic 902	kawa/standard/Scheme:applyToArgs	Lgnu/kawa/functions/ApplyToArgs;
    //   233: aload_3
    //   234: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   237: invokevirtual 905	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToGlobalVarEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   240: aload_2
    //   241: invokevirtual 732	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   244: astore_1
    //   245: goto -193 -> 52
    //   248: astore_2
    //   249: new 746	gnu/mapping/WrongType
    //   252: dup
    //   253: aload_2
    //   254: ldc_w 748
    //   257: bipush -2
    //   259: aload_1
    //   260: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   263: athrow
    //   264: astore_1
    //   265: aload_0
    //   266: aload_1
    //   267: invokevirtual 874	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:processException	(Ljava/lang/Object;)V
    //   270: return
    //   271: astore_2
    //   272: new 746	gnu/mapping/WrongType
    //   275: dup
    //   276: aload_2
    //   277: ldc -21
    //   279: iconst_0
    //   280: aload_1
    //   281: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   284: athrow
    //   285: aload_1
    //   286: checkcast 729	gnu/lists/Pair
    //   289: astore_2
    //   290: aload_2
    //   291: invokevirtual 735	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   294: invokestatic 908	kawa/lib/misc:force	(Ljava/lang/Object;)Ljava/lang/Object;
    //   297: pop
    //   298: aload_2
    //   299: invokevirtual 732	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   302: astore_1
    //   303: goto -236 -> 67
    //   306: astore_2
    //   307: new 746	gnu/mapping/WrongType
    //   310: dup
    //   311: aload_2
    //   312: ldc_w 748
    //   315: bipush -2
    //   317: aload_1
    //   318: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   321: athrow
    //   322: aload_2
    //   323: checkcast 729	gnu/lists/Pair
    //   326: astore_3
    //   327: aload_3
    //   328: invokevirtual 735	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   331: astore 5
    //   333: getstatic 911	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   336: aload 5
    //   338: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   341: astore_2
    //   342: getstatic 914	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   345: aload 5
    //   347: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   350: pop
    //   351: getstatic 898	kawa/lib/lists:cadr	Lgnu/expr/GenericProc;
    //   354: aload 5
    //   356: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   359: astore 4
    //   361: getstatic 878	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   364: aload 5
    //   366: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   369: astore 5
    //   371: aload 5
    //   373: checkcast 737	gnu/mapping/Symbol
    //   376: astore 6
    //   378: aload_0
    //   379: aload 6
    //   381: invokevirtual 918	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lookupInFormEnvironment	(Lgnu/mapping/Symbol;)Ljava/lang/Object;
    //   384: astore 5
    //   386: getstatic 923	gnu/kawa/reflect/Invoke:make	Lgnu/kawa/reflect/Invoke;
    //   389: aload 4
    //   391: aload 5
    //   393: invokevirtual 719	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   396: astore 4
    //   398: getstatic 929	gnu/kawa/reflect/SlotSet:set$Mnfield$Ex	Lgnu/kawa/reflect/SlotSet;
    //   401: aload_0
    //   402: aload_2
    //   403: aload 4
    //   405: invokevirtual 933	gnu/mapping/Procedure:apply3	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   408: pop
    //   409: aload_2
    //   410: checkcast 737	gnu/mapping/Symbol
    //   413: astore 5
    //   415: aload_0
    //   416: aload 5
    //   418: aload 4
    //   420: invokevirtual 849	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   423: aload_3
    //   424: invokevirtual 732	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   427: astore_2
    //   428: goto -344 -> 84
    //   431: astore_1
    //   432: new 746	gnu/mapping/WrongType
    //   435: dup
    //   436: aload_1
    //   437: ldc_w 748
    //   440: bipush -2
    //   442: aload_2
    //   443: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   446: athrow
    //   447: astore_1
    //   448: new 746	gnu/mapping/WrongType
    //   451: dup
    //   452: aload_1
    //   453: ldc -13
    //   455: iconst_0
    //   456: aload 5
    //   458: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   461: athrow
    //   462: astore_1
    //   463: new 746	gnu/mapping/WrongType
    //   466: dup
    //   467: aload_1
    //   468: ldc -9
    //   470: iconst_0
    //   471: aload_2
    //   472: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   475: athrow
    //   476: aload_2
    //   477: checkcast 729	gnu/lists/Pair
    //   480: astore_3
    //   481: aload_3
    //   482: invokevirtual 735	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   485: astore_2
    //   486: getstatic 911	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   489: aload_2
    //   490: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   493: pop
    //   494: getstatic 914	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   497: aload_2
    //   498: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   501: astore_2
    //   502: aload_2
    //   503: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   506: if_acmpeq +11 -> 517
    //   509: getstatic 902	kawa/standard/Scheme:applyToArgs	Lgnu/kawa/functions/ApplyToArgs;
    //   512: aload_2
    //   513: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   516: pop
    //   517: aload_3
    //   518: invokevirtual 732	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   521: astore_2
    //   522: goto -429 -> 93
    //   525: astore_1
    //   526: new 746	gnu/mapping/WrongType
    //   529: dup
    //   530: aload_1
    //   531: ldc_w 748
    //   534: bipush -2
    //   536: aload_2
    //   537: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   540: athrow
    //   541: aload_1
    //   542: checkcast 729	gnu/lists/Pair
    //   545: astore_2
    //   546: aload_2
    //   547: invokevirtual 735	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   550: astore_1
    //   551: getstatic 911	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   554: aload_1
    //   555: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   558: astore_3
    //   559: getstatic 914	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   562: aload_1
    //   563: invokevirtual 881	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   566: pop
    //   567: aload_0
    //   568: getstatic 939	gnu/kawa/reflect/SlotGet:field	Lgnu/kawa/reflect/SlotGet;
    //   571: aload_0
    //   572: aload_3
    //   573: invokevirtual 719	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   576: invokevirtual 942	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:callInitialize	(Ljava/lang/Object;)V
    //   579: aload_2
    //   580: invokevirtual 732	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   583: astore_1
    //   584: goto -484 -> 100
    //   587: astore_2
    //   588: new 746	gnu/mapping/WrongType
    //   591: dup
    //   592: aload_2
    //   593: ldc_w 748
    //   596: bipush -2
    //   598: aload_1
    //   599: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   602: athrow
    //   603: astore_2
    //   604: new 746	gnu/mapping/WrongType
    //   607: dup
    //   608: aload_2
    //   609: ldc_w 748
    //   612: bipush -2
    //   614: aload_1
    //   615: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   618: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	619	0	this	Screen1
    //   26	79	1	localLList	LList
    //   110	18	1	localException	Exception
    //   144	116	1	localObject1	Object
    //   264	22	1	localYailRuntimeError	YailRuntimeError
    //   302	16	1	localObject2	Object
    //   431	6	1	localClassCastException1	ClassCastException
    //   447	6	1	localClassCastException2	ClassCastException
    //   462	6	1	localClassCastException3	ClassCastException
    //   525	17	1	localClassCastException4	ClassCastException
    //   550	65	1	localObject3	Object
    //   83	158	2	localObject4	Object
    //   248	6	2	localClassCastException5	ClassCastException
    //   271	6	2	localClassCastException6	ClassCastException
    //   289	10	2	localPair	gnu.lists.Pair
    //   306	17	2	localClassCastException7	ClassCastException
    //   341	239	2	localObject5	Object
    //   587	6	2	localClassCastException8	ClassCastException
    //   603	6	2	localClassCastException9	ClassCastException
    //   131	442	3	localObject6	Object
    //   225	194	4	localObject7	Object
    //   331	126	5	localObject8	Object
    //   376	4	6	localSymbol	Symbol
    // Exception table:
    //   from	to	target	type
    //   6	10	110	java/lang/Exception
    //   195	200	248	java/lang/ClassCastException
    //   34	52	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   52	67	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   67	82	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   84	91	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   93	100	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   100	104	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   195	200	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   200	221	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   221	227	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   227	245	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   249	264	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   272	285	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   285	290	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   290	303	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   307	322	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   322	327	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   327	371	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   371	378	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   378	409	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   409	415	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   415	428	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   432	447	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   448	462	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   463	476	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   476	481	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   481	517	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   517	522	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   526	541	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   541	546	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   546	584	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   588	603	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   221	227	271	java/lang/ClassCastException
    //   285	290	306	java/lang/ClassCastException
    //   322	327	431	java/lang/ClassCastException
    //   371	378	447	java/lang/ClassCastException
    //   409	415	462	java/lang/ClassCastException
    //   476	481	525	java/lang/ClassCastException
    //   541	546	587	java/lang/ClassCastException
    //   127	132	603	java/lang/ClassCastException
  }
  
  public Object Button1$Click()
  {
    runtime.setThisForm();
    runtime.addGlobalVarToCurrentFormEnvironment(Lit3, "Screen2");
    Scheme.applyToArgs.apply2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
    return runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen");
  }
  
  public Object Screen1$BackPressed()
  {
    runtime.setThisForm();
    return runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application");
  }
  
  public void addToComponents(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    this.components$Mnto$Mncreate = lists.cons(LList.list4(paramObject1, paramObject2, paramObject3, paramObject4), this.components$Mnto$Mncreate);
  }
  
  public void addToEvents(Object paramObject1, Object paramObject2)
  {
    this.events$Mnto$Mnregister = lists.cons(lists.cons(paramObject1, paramObject2), this.events$Mnto$Mnregister);
  }
  
  public void addToFormDoAfterCreation(Object paramObject)
  {
    this.form$Mndo$Mnafter$Mncreation = lists.cons(paramObject, this.form$Mndo$Mnafter$Mncreation);
  }
  
  public void addToFormEnvironment(Symbol paramSymbol, Object paramObject)
  {
    androidLogForm(Format.formatToString(0, new Object[] { "Adding ~A to env ~A with value ~A", paramSymbol, this.form$Mnenvironment, paramObject }));
    this.form$Mnenvironment.put(paramSymbol, paramObject);
  }
  
  public void addToGlobalVarEnvironment(Symbol paramSymbol, Object paramObject)
  {
    androidLogForm(Format.formatToString(0, new Object[] { "Adding ~A to env ~A with value ~A", paramSymbol, this.global$Mnvar$Mnenvironment, paramObject }));
    this.global$Mnvar$Mnenvironment.put(paramSymbol, paramObject);
  }
  
  public void addToGlobalVars(Object paramObject1, Object paramObject2)
  {
    this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(paramObject1, paramObject2), this.global$Mnvars$Mnto$Mncreate);
  }
  
  public void androidLogForm(Object paramObject) {}
  
  public boolean dispatchEvent(Component paramComponent, String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    boolean bool = false;
    SimpleSymbol localSimpleSymbol = misc.string$To$Symbol(paramString1);
    if (isBoundInFormEnvironment(localSimpleSymbol))
    {
      if (lookupInFormEnvironment(localSimpleSymbol) == paramComponent) {
        paramComponent = lookupHandler(paramString1, paramString2);
      }
      try
      {
        Scheme.apply.apply2(paramComponent, LList.makeList(paramArrayOfObject, 0));
        bool = true;
        return bool;
      }
      catch (Throwable paramComponent)
      {
        androidLogForm(paramComponent.getMessage());
        paramComponent.printStackTrace();
        processException(paramComponent);
        return false;
      }
    }
    EventDispatcher.unregisterEventForDelegation(this, paramString1, paramString2);
    return false;
  }
  
  public boolean isBoundInFormEnvironment(Symbol paramSymbol)
  {
    return this.form$Mnenvironment.isBound(paramSymbol);
  }
  
  public Object lookupHandler(Object paramObject1, Object paramObject2)
  {
    Object localObject = null;
    if (paramObject1 == null)
    {
      paramObject1 = null;
      if (paramObject2 != null) {
        break label35;
      }
    }
    label35:
    for (paramObject2 = localObject;; paramObject2 = paramObject2.toString())
    {
      return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName((String)paramObject1, (String)paramObject2)));
      paramObject1 = paramObject1.toString();
      break;
    }
  }
  
  public Object lookupInFormEnvironment(Symbol paramSymbol)
  {
    return lookupInFormEnvironment(paramSymbol, Boolean.FALSE);
  }
  
  public Object lookupInFormEnvironment(Symbol paramSymbol, Object paramObject)
  {
    int i;
    if (this.form$Mnenvironment == null)
    {
      i = 1;
      i = i + 1 & 0x1;
      if (i == 0) {
        break label46;
      }
      if (!this.form$Mnenvironment.isBound(paramSymbol)) {}
    }
    for (;;)
    {
      paramObject = this.form$Mnenvironment.get(paramSymbol);
      label46:
      do
      {
        return paramObject;
        i = 0;
        break;
      } while (i == 0);
    }
  }
  
  public void processException(Object paramObject)
  {
    Object localObject = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(paramObject, Lit1));
    if (localObject == null)
    {
      localObject = null;
      if (!(paramObject instanceof YailRuntimeError)) {
        break label56;
      }
    }
    label56:
    for (paramObject = ((YailRuntimeError)paramObject).getErrorType();; paramObject = "Runtime Error")
    {
      RuntimeErrorAlert.alert(this, (String)localObject, (String)paramObject, "End Application");
      return;
      localObject = localObject.toString();
      break;
    }
  }
  
  public void run()
  {
    CallContext localCallContext = CallContext.getInstance();
    Consumer localConsumer = localCallContext.consumer;
    localCallContext.consumer = VoidConsumer.instance;
    try
    {
      run(localCallContext);
      localThrowable1 = null;
    }
    catch (Throwable localThrowable2)
    {
      Throwable localThrowable1;
      for (;;) {}
    }
    ModuleBody.runCleanup(localCallContext, localThrowable1, localConsumer);
  }
  
  /* Error */
  public final void run(CallContext paramCallContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 1053	gnu/mapping/CallContext:consumer	Lgnu/lists/Consumer;
    //   4: astore_2
    //   5: ldc_w 1070
    //   8: invokestatic 1076	kawa/standard/require:find	(Ljava/lang/String;)Ljava/lang/Object;
    //   11: astore_1
    //   12: aload_1
    //   13: checkcast 6	java/lang/Runnable
    //   16: astore_3
    //   17: aload_3
    //   18: invokeinterface 1077 1 0
    //   23: aload_0
    //   24: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   27: putfield 1079	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:$Stdebug$Mnform$St	Ljava/lang/Boolean;
    //   30: aload_0
    //   31: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   34: invokestatic 741	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   37: invokestatic 1082	gnu/mapping/Environment:make	(Ljava/lang/String;)Lgnu/mapping/SimpleEnvironment;
    //   40: putfield 983	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:form$Mnenvironment	Lgnu/mapping/Environment;
    //   43: iconst_2
    //   44: anewarray 892	java/lang/Object
    //   47: dup
    //   48: iconst_0
    //   49: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   52: invokestatic 741	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   55: aastore
    //   56: dup
    //   57: iconst_1
    //   58: ldc_w 1084
    //   61: aastore
    //   62: invokestatic 1088	kawa/lib/strings:stringAppend	([Ljava/lang/Object;)Lgnu/lists/FString;
    //   65: astore_1
    //   66: aload_1
    //   67: ifnonnull +709 -> 776
    //   70: aconst_null
    //   71: astore_1
    //   72: aload_0
    //   73: aload_1
    //   74: invokestatic 1082	gnu/mapping/Environment:make	(Ljava/lang/String;)Lgnu/mapping/SimpleEnvironment;
    //   77: putfield 996	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:global$Mnvar$Mnenvironment	Lgnu/mapping/Environment;
    //   80: aconst_null
    //   81: putstatic 845	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Screen1	Lappinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1;
    //   84: aload_0
    //   85: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   88: putfield 1090	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:form$Mnname$Mnsymbol	Lgnu/mapping/Symbol;
    //   91: aload_0
    //   92: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   95: putfield 851	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:events$Mnto$Mnregister	Lgnu/lists/LList;
    //   98: aload_0
    //   99: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   102: putfield 866	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:components$Mnto$Mncreate	Lgnu/lists/LList;
    //   105: aload_0
    //   106: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   109: putfield 856	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:global$Mnvars$Mnto$Mncreate	Lgnu/lists/LList;
    //   112: aload_0
    //   113: getstatic 496	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   116: putfield 864	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:form$Mndo$Mnafter$Mncreation	Lgnu/lists/LList;
    //   119: ldc_w 1070
    //   122: invokestatic 1076	kawa/standard/require:find	(Ljava/lang/String;)Ljava/lang/Object;
    //   125: astore_1
    //   126: aload_1
    //   127: checkcast 6	java/lang/Runnable
    //   130: astore_3
    //   131: aload_3
    //   132: invokeinterface 1077 1 0
    //   137: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   140: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   143: if_acmpeq +641 -> 784
    //   146: getstatic 527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit3	Lgnu/mapping/SimpleSymbol;
    //   149: ldc_w 776
    //   152: invokestatic 951	com/google/youngandroid/runtime:addGlobalVarToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   155: aload_2
    //   156: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   159: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   162: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   165: if_acmpeq +632 -> 797
    //   168: getstatic 523	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit4	Lgnu/mapping/SimpleSymbol;
    //   171: getstatic 605	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn3	Lgnu/expr/ModuleMethod;
    //   174: invokestatic 951	com/google/youngandroid/runtime:addGlobalVarToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   177: aload_2
    //   178: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   181: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   184: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   187: if_acmpeq +623 -> 810
    //   190: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   193: getstatic 491	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit11	Lgnu/mapping/SimpleSymbol;
    //   196: getstatic 487	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit12	Lgnu/math/IntNum;
    //   199: getstatic 485	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit13	Lgnu/mapping/SimpleSymbol;
    //   202: invokestatic 670	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   205: pop
    //   206: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   209: getstatic 481	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit14	Lgnu/mapping/SimpleSymbol;
    //   212: ldc_w 822
    //   215: getstatic 477	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit15	Lgnu/mapping/SimpleSymbol;
    //   218: invokestatic 670	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   221: pop
    //   222: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   225: getstatic 473	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit16	Lgnu/mapping/SimpleSymbol;
    //   228: getstatic 677	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   231: getstatic 469	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit17	Lgnu/mapping/SimpleSymbol;
    //   234: invokestatic 670	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   237: pop
    //   238: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   241: getstatic 465	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit18	Lgnu/mapping/SimpleSymbol;
    //   244: ldc_w 536
    //   247: getstatic 477	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit15	Lgnu/mapping/SimpleSymbol;
    //   250: invokestatic 670	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   253: pop
    //   254: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   257: getstatic 461	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit19	Lgnu/mapping/SimpleSymbol;
    //   260: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   263: getstatic 469	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit17	Lgnu/mapping/SimpleSymbol;
    //   266: invokestatic 670	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   269: pop
    //   270: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   273: getstatic 457	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit20	Lgnu/mapping/SimpleSymbol;
    //   276: ldc_w 824
    //   279: getstatic 477	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit15	Lgnu/mapping/SimpleSymbol;
    //   282: invokestatic 670	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   285: aload_2
    //   286: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   289: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   292: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   295: if_acmpeq +532 -> 827
    //   298: getstatic 453	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit21	Lgnu/mapping/SimpleSymbol;
    //   301: aload_0
    //   302: getfield 613	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Screen1$BackPressed	Lgnu/expr/ModuleMethod;
    //   305: invokestatic 1100	com/google/youngandroid/runtime:addToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   308: pop
    //   309: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   312: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   315: if_acmpeq +526 -> 841
    //   318: getstatic 1103	com/google/youngandroid/runtime:$Stthis$Mnform$St	Ljava/lang/Object;
    //   321: checkcast 1105	com/google/appinventor/components/runtime/HandlesEventDispatching
    //   324: ldc_w 536
    //   327: ldc_w 448
    //   330: invokestatic 890	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   333: aload_0
    //   334: aconst_null
    //   335: putfield 1107	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:HorizontalArrangement2	Lcom/google/appinventor/components/runtime/HorizontalArrangement;
    //   338: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   341: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   344: if_acmpeq +510 -> 854
    //   347: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   350: getstatic 446	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit23	Lgnu/lists/FString;
    //   353: getstatic 444	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit24	Lgnu/mapping/SimpleSymbol;
    //   356: getstatic 615	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn7	Lgnu/expr/ModuleMethod;
    //   359: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   362: aload_2
    //   363: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   366: aload_0
    //   367: aconst_null
    //   368: putfield 1112	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:VerticalArrangement1	Lcom/google/appinventor/components/runtime/VerticalArrangement;
    //   371: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   374: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   377: if_acmpeq +496 -> 873
    //   380: getstatic 444	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit24	Lgnu/mapping/SimpleSymbol;
    //   383: getstatic 411	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit34	Lgnu/lists/FString;
    //   386: getstatic 409	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit35	Lgnu/mapping/SimpleSymbol;
    //   389: getstatic 619	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn9	Lgnu/expr/ModuleMethod;
    //   392: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   395: aload_2
    //   396: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   399: aload_0
    //   400: aconst_null
    //   401: putfield 1114	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Label4	Lcom/google/appinventor/components/runtime/Label;
    //   404: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   407: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   410: if_acmpeq +482 -> 892
    //   413: getstatic 409	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit35	Lgnu/mapping/SimpleSymbol;
    //   416: getstatic 404	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit37	Lgnu/lists/FString;
    //   419: getstatic 402	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit38	Lgnu/mapping/SimpleSymbol;
    //   422: getstatic 623	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn11	Lgnu/expr/ModuleMethod;
    //   425: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   428: aload_2
    //   429: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   432: aload_0
    //   433: aconst_null
    //   434: putfield 1116	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Label3	Lcom/google/appinventor/components/runtime/Label;
    //   437: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   440: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   443: if_acmpeq +468 -> 911
    //   446: getstatic 409	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit35	Lgnu/mapping/SimpleSymbol;
    //   449: getstatic 377	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit46	Lgnu/lists/FString;
    //   452: getstatic 375	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit47	Lgnu/mapping/SimpleSymbol;
    //   455: getstatic 627	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn13	Lgnu/expr/ModuleMethod;
    //   458: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   461: aload_2
    //   462: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   465: aload_0
    //   466: aconst_null
    //   467: putfield 1118	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:HorizontalArrangement3	Lcom/google/appinventor/components/runtime/HorizontalArrangement;
    //   470: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   473: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   476: if_acmpeq +454 -> 930
    //   479: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   482: getstatic 368	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit50	Lgnu/lists/FString;
    //   485: getstatic 366	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit51	Lgnu/mapping/SimpleSymbol;
    //   488: getstatic 631	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn15	Lgnu/expr/ModuleMethod;
    //   491: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   494: aload_2
    //   495: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   498: aload_0
    //   499: aconst_null
    //   500: putfield 1120	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Label2	Lcom/google/appinventor/components/runtime/Label;
    //   503: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   506: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   509: if_acmpeq +440 -> 949
    //   512: getstatic 366	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit51	Lgnu/mapping/SimpleSymbol;
    //   515: getstatic 357	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit55	Lgnu/lists/FString;
    //   518: getstatic 355	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit56	Lgnu/mapping/SimpleSymbol;
    //   521: getstatic 635	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn17	Lgnu/expr/ModuleMethod;
    //   524: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   527: aload_2
    //   528: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   531: aload_0
    //   532: aconst_null
    //   533: putfield 1122	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:VerticalArrangement2	Lcom/google/appinventor/components/runtime/VerticalArrangement;
    //   536: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   539: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   542: if_acmpeq +426 -> 968
    //   545: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   548: getstatic 346	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit60	Lgnu/lists/FString;
    //   551: getstatic 344	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit61	Lgnu/mapping/SimpleSymbol;
    //   554: getstatic 639	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn19	Lgnu/expr/ModuleMethod;
    //   557: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   560: aload_2
    //   561: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   564: aload_0
    //   565: aconst_null
    //   566: putfield 1124	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Label5	Lcom/google/appinventor/components/runtime/Label;
    //   569: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   572: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   575: if_acmpeq +412 -> 987
    //   578: getstatic 344	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit61	Lgnu/mapping/SimpleSymbol;
    //   581: getstatic 337	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit63	Lgnu/lists/FString;
    //   584: getstatic 335	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit64	Lgnu/mapping/SimpleSymbol;
    //   587: getstatic 643	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn21	Lgnu/expr/ModuleMethod;
    //   590: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   593: aload_2
    //   594: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   597: aload_0
    //   598: aconst_null
    //   599: putfield 1126	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Label7	Lcom/google/appinventor/components/runtime/Label;
    //   602: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   605: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   608: if_acmpeq +398 -> 1006
    //   611: getstatic 344	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit61	Lgnu/mapping/SimpleSymbol;
    //   614: getstatic 328	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit67	Lgnu/lists/FString;
    //   617: getstatic 326	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit68	Lgnu/mapping/SimpleSymbol;
    //   620: getstatic 647	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn23	Lgnu/expr/ModuleMethod;
    //   623: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   626: aload_2
    //   627: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   630: aload_0
    //   631: aconst_null
    //   632: putfield 1128	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Label6	Lcom/google/appinventor/components/runtime/Label;
    //   635: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   638: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   641: if_acmpeq +384 -> 1025
    //   644: getstatic 344	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit61	Lgnu/mapping/SimpleSymbol;
    //   647: getstatic 319	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit71	Lgnu/lists/FString;
    //   650: getstatic 317	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit72	Lgnu/mapping/SimpleSymbol;
    //   653: getstatic 651	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn25	Lgnu/expr/ModuleMethod;
    //   656: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   659: aload_2
    //   660: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   663: aload_0
    //   664: aconst_null
    //   665: putfield 1130	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:HorizontalArrangement1	Lcom/google/appinventor/components/runtime/HorizontalArrangement;
    //   668: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   671: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   674: if_acmpeq +370 -> 1044
    //   677: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   680: getstatic 302	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit77	Lgnu/lists/FString;
    //   683: getstatic 300	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit78	Lgnu/mapping/SimpleSymbol;
    //   686: getstatic 655	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn27	Lgnu/expr/ModuleMethod;
    //   689: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   692: aload_2
    //   693: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   696: aload_0
    //   697: aconst_null
    //   698: putfield 1132	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Button1	Lcom/google/appinventor/components/runtime/Button;
    //   701: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   704: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   707: if_acmpeq +356 -> 1063
    //   710: getstatic 300	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit78	Lgnu/mapping/SimpleSymbol;
    //   713: getstatic 284	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit82	Lgnu/lists/FString;
    //   716: getstatic 282	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit83	Lgnu/mapping/SimpleSymbol;
    //   719: getstatic 659	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn29	Lgnu/expr/ModuleMethod;
    //   722: invokestatic 1110	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   725: aload_2
    //   726: invokestatic 1097	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   729: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   732: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   735: if_acmpeq +347 -> 1082
    //   738: getstatic 260	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit87	Lgnu/mapping/SimpleSymbol;
    //   741: aload_0
    //   742: getfield 663	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Button1$Click	Lgnu/expr/ModuleMethod;
    //   745: invokestatic 1100	com/google/youngandroid/runtime:addToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   748: pop
    //   749: getstatic 1093	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   752: getstatic 800	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   755: if_acmpeq +341 -> 1096
    //   758: getstatic 1103	com/google/youngandroid/runtime:$Stthis$Mnform$St	Ljava/lang/Object;
    //   761: checkcast 1105	com/google/appinventor/components/runtime/HandlesEventDispatching
    //   764: ldc_w 280
    //   767: ldc -1
    //   769: invokestatic 890	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   772: invokestatic 1135	com/google/youngandroid/runtime:initRuntime	()V
    //   775: return
    //   776: aload_1
    //   777: invokevirtual 895	java/lang/Object:toString	()Ljava/lang/String;
    //   780: astore_1
    //   781: goto -709 -> 72
    //   784: aload_0
    //   785: getstatic 527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit3	Lgnu/mapping/SimpleSymbol;
    //   788: getstatic 603	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn2	Lgnu/expr/ModuleMethod;
    //   791: invokevirtual 854	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   794: goto -635 -> 159
    //   797: aload_0
    //   798: getstatic 523	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit4	Lgnu/mapping/SimpleSymbol;
    //   801: getstatic 609	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn4	Lgnu/expr/ModuleMethod;
    //   804: invokevirtual 854	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   807: goto -626 -> 181
    //   810: aload_0
    //   811: new 1137	kawa/lang/Promise
    //   814: dup
    //   815: getstatic 611	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn6	Lgnu/expr/ModuleMethod;
    //   818: invokespecial 1140	kawa/lang/Promise:<init>	(Lgnu/mapping/Procedure;)V
    //   821: invokevirtual 1142	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToFormDoAfterCreation	(Ljava/lang/Object;)V
    //   824: goto -535 -> 289
    //   827: aload_0
    //   828: getstatic 453	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit21	Lgnu/mapping/SimpleSymbol;
    //   831: aload_0
    //   832: getfield 613	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Screen1$BackPressed	Lgnu/expr/ModuleMethod;
    //   835: invokevirtual 849	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   838: goto -529 -> 309
    //   841: aload_0
    //   842: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   845: getstatic 450	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit22	Lgnu/mapping/SimpleSymbol;
    //   848: invokevirtual 1144	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   851: goto -518 -> 333
    //   854: aload_0
    //   855: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   858: getstatic 413	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit33	Lgnu/lists/FString;
    //   861: getstatic 444	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit24	Lgnu/mapping/SimpleSymbol;
    //   864: getstatic 617	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn8	Lgnu/expr/ModuleMethod;
    //   867: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   870: goto -504 -> 366
    //   873: aload_0
    //   874: getstatic 444	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit24	Lgnu/mapping/SimpleSymbol;
    //   877: getstatic 406	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit36	Lgnu/lists/FString;
    //   880: getstatic 409	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit35	Lgnu/mapping/SimpleSymbol;
    //   883: getstatic 621	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn10	Lgnu/expr/ModuleMethod;
    //   886: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   889: goto -490 -> 399
    //   892: aload_0
    //   893: getstatic 409	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit35	Lgnu/mapping/SimpleSymbol;
    //   896: getstatic 379	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit45	Lgnu/lists/FString;
    //   899: getstatic 402	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit38	Lgnu/mapping/SimpleSymbol;
    //   902: getstatic 625	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn12	Lgnu/expr/ModuleMethod;
    //   905: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   908: goto -476 -> 432
    //   911: aload_0
    //   912: getstatic 409	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit35	Lgnu/mapping/SimpleSymbol;
    //   915: getstatic 370	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit49	Lgnu/lists/FString;
    //   918: getstatic 375	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit47	Lgnu/mapping/SimpleSymbol;
    //   921: getstatic 629	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn14	Lgnu/expr/ModuleMethod;
    //   924: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   927: goto -462 -> 465
    //   930: aload_0
    //   931: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   934: getstatic 359	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit54	Lgnu/lists/FString;
    //   937: getstatic 366	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit51	Lgnu/mapping/SimpleSymbol;
    //   940: getstatic 633	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn16	Lgnu/expr/ModuleMethod;
    //   943: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   946: goto -448 -> 498
    //   949: aload_0
    //   950: getstatic 366	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit51	Lgnu/mapping/SimpleSymbol;
    //   953: getstatic 348	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit59	Lgnu/lists/FString;
    //   956: getstatic 355	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit56	Lgnu/mapping/SimpleSymbol;
    //   959: getstatic 637	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn18	Lgnu/expr/ModuleMethod;
    //   962: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   965: goto -434 -> 531
    //   968: aload_0
    //   969: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   972: getstatic 341	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit62	Lgnu/lists/FString;
    //   975: getstatic 344	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit61	Lgnu/mapping/SimpleSymbol;
    //   978: getstatic 641	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn20	Lgnu/expr/ModuleMethod;
    //   981: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   984: goto -420 -> 564
    //   987: aload_0
    //   988: getstatic 344	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit61	Lgnu/mapping/SimpleSymbol;
    //   991: getstatic 330	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit66	Lgnu/lists/FString;
    //   994: getstatic 335	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit64	Lgnu/mapping/SimpleSymbol;
    //   997: getstatic 645	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn22	Lgnu/expr/ModuleMethod;
    //   1000: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1003: goto -406 -> 597
    //   1006: aload_0
    //   1007: getstatic 344	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit61	Lgnu/mapping/SimpleSymbol;
    //   1010: getstatic 321	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit70	Lgnu/lists/FString;
    //   1013: getstatic 326	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit68	Lgnu/mapping/SimpleSymbol;
    //   1016: getstatic 649	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn24	Lgnu/expr/ModuleMethod;
    //   1019: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1022: goto -392 -> 630
    //   1025: aload_0
    //   1026: getstatic 344	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit61	Lgnu/mapping/SimpleSymbol;
    //   1029: getstatic 306	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit76	Lgnu/lists/FString;
    //   1032: getstatic 317	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit72	Lgnu/mapping/SimpleSymbol;
    //   1035: getstatic 653	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn26	Lgnu/expr/ModuleMethod;
    //   1038: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1041: goto -378 -> 663
    //   1044: aload_0
    //   1045: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1048: getstatic 288	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit81	Lgnu/lists/FString;
    //   1051: getstatic 300	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit78	Lgnu/mapping/SimpleSymbol;
    //   1054: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn28	Lgnu/expr/ModuleMethod;
    //   1057: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1060: goto -364 -> 696
    //   1063: aload_0
    //   1064: getstatic 300	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit78	Lgnu/mapping/SimpleSymbol;
    //   1067: getstatic 267	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit86	Lgnu/lists/FString;
    //   1070: getstatic 282	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit83	Lgnu/mapping/SimpleSymbol;
    //   1073: getstatic 661	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:lambda$Fn30	Lgnu/expr/ModuleMethod;
    //   1076: invokevirtual 1146	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1079: goto -350 -> 729
    //   1082: aload_0
    //   1083: getstatic 260	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit87	Lgnu/mapping/SimpleSymbol;
    //   1086: aload_0
    //   1087: getfield 663	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Button1$Click	Lgnu/expr/ModuleMethod;
    //   1090: invokevirtual 849	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   1093: goto -344 -> 749
    //   1096: aload_0
    //   1097: getstatic 282	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit83	Lgnu/mapping/SimpleSymbol;
    //   1100: getstatic 257	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:Lit88	Lgnu/mapping/SimpleSymbol;
    //   1103: invokevirtual 1144	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1106: goto -334 -> 772
    //   1109: astore_2
    //   1110: new 746	gnu/mapping/WrongType
    //   1113: dup
    //   1114: aload_2
    //   1115: ldc_w 1148
    //   1118: iconst_1
    //   1119: aload_1
    //   1120: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   1123: athrow
    //   1124: astore_2
    //   1125: new 746	gnu/mapping/WrongType
    //   1128: dup
    //   1129: aload_2
    //   1130: ldc_w 1148
    //   1133: iconst_1
    //   1134: aload_1
    //   1135: invokespecial 751	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   1138: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1139	0	this	Screen1
    //   0	1139	1	paramCallContext	CallContext
    //   4	722	2	localConsumer	Consumer
    //   1109	6	2	localClassCastException1	ClassCastException
    //   1124	6	2	localClassCastException2	ClassCastException
    //   16	116	3	localRunnable	Runnable
    // Exception table:
    //   from	to	target	type
    //   12	17	1109	java/lang/ClassCastException
    //   126	131	1124	java/lang/ClassCastException
  }
  
  public void sendError(Object paramObject)
  {
    if (paramObject == null) {}
    for (paramObject = null;; paramObject = paramObject.toString())
    {
      RetValManager.sendError((String)paramObject);
      return;
    }
  }
}


/* Location:              /home/nelmntrx/Desktop/SYNCCrowdTracker/dex2jar-2.0/classes-dex2jar.jar!/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */