package appinventor.ai_jbacong.SYNCCrowdTracker_copy;

import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.File;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.Sharing;
import com.google.appinventor.components.runtime.TinyDB;
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
import gnu.lists.Pair;
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
import kawa.lib.strings;
import kawa.standard.Scheme;

public class Screen3
  extends Form
  implements Runnable
{
  static final SimpleSymbol Lit0 = (SimpleSymbol)new SimpleSymbol("Screen3").readResolve();
  static final SimpleSymbol Lit1;
  static final SimpleSymbol Lit10;
  static final FString Lit100;
  static final SimpleSymbol Lit101;
  static final DFloNum Lit102;
  static final FString Lit103;
  static final SimpleSymbol Lit104;
  static final PairWithPosition Lit105;
  static final SimpleSymbol Lit106;
  static final FString Lit107;
  static final SimpleSymbol Lit108;
  static final FString Lit109;
  static final SimpleSymbol Lit11;
  static final FString Lit110;
  static final FString Lit111;
  static final FString Lit112;
  static final FString Lit113;
  static final SimpleSymbol Lit114;
  static final SimpleSymbol Lit115;
  static final FString Lit116;
  static final FString Lit117;
  static final SimpleSymbol Lit118;
  static final PairWithPosition Lit119;
  static final SimpleSymbol Lit12;
  static final PairWithPosition Lit120;
  static final SimpleSymbol Lit121;
  static final SimpleSymbol Lit122;
  static final SimpleSymbol Lit123;
  static final PairWithPosition Lit124;
  static final SimpleSymbol Lit125;
  static final PairWithPosition Lit126;
  static final SimpleSymbol Lit127;
  static final PairWithPosition Lit128;
  static final SimpleSymbol Lit129;
  static final IntNum Lit13;
  static final PairWithPosition Lit130;
  static final SimpleSymbol Lit131;
  static final PairWithPosition Lit132;
  static final SimpleSymbol Lit133;
  static final PairWithPosition Lit134;
  static final PairWithPosition Lit135;
  static final PairWithPosition Lit136;
  static final PairWithPosition Lit137;
  static final SimpleSymbol Lit138;
  static final PairWithPosition Lit139;
  static final SimpleSymbol Lit14;
  static final SimpleSymbol Lit140;
  static final SimpleSymbol Lit141;
  static final FString Lit142;
  static final FString Lit143;
  static final SimpleSymbol Lit144;
  static final SimpleSymbol Lit145;
  static final SimpleSymbol Lit146;
  static final SimpleSymbol Lit147;
  static final SimpleSymbol Lit148;
  static final SimpleSymbol Lit149;
  static final SimpleSymbol Lit15;
  static final SimpleSymbol Lit150;
  static final SimpleSymbol Lit151;
  static final SimpleSymbol Lit152;
  static final SimpleSymbol Lit153;
  static final SimpleSymbol Lit154;
  static final SimpleSymbol Lit155;
  static final SimpleSymbol Lit156;
  static final SimpleSymbol Lit157 = (SimpleSymbol)new SimpleSymbol("any").readResolve();
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
  static final PairWithPosition Lit4;
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
  static final FString Lit57;
  static final FString Lit58;
  static final SimpleSymbol Lit59;
  static final PairWithPosition Lit6;
  static final DFloNum Lit60;
  static final FString Lit61;
  static final FString Lit62;
  static final SimpleSymbol Lit63;
  static final FString Lit64;
  static final FString Lit65;
  static final SimpleSymbol Lit66;
  static final FString Lit67;
  static final FString Lit68;
  static final SimpleSymbol Lit69;
  static final PairWithPosition Lit7;
  static final IntNum Lit70;
  static final FString Lit71;
  static final FString Lit72;
  static final SimpleSymbol Lit73;
  static final IntNum Lit74;
  static final FString Lit75;
  static final FString Lit76;
  static final SimpleSymbol Lit77;
  static final FString Lit78;
  static final FString Lit79;
  static final PairWithPosition Lit8;
  static final SimpleSymbol Lit80;
  static final DFloNum Lit81;
  static final FString Lit82;
  static final SimpleSymbol Lit83;
  static final SimpleSymbol Lit84;
  static final PairWithPosition Lit85;
  static final SimpleSymbol Lit86;
  static final SimpleSymbol Lit87;
  static final PairWithPosition Lit88;
  static final SimpleSymbol Lit89;
  static final PairWithPosition Lit9;
  static final SimpleSymbol Lit90;
  static final FString Lit91;
  static final SimpleSymbol Lit92;
  static final DFloNum Lit93;
  static final FString Lit94;
  static final SimpleSymbol Lit95;
  static final SimpleSymbol Lit96;
  static final PairWithPosition Lit97;
  static final PairWithPosition Lit98;
  static final SimpleSymbol Lit99;
  public static Screen3 Screen3;
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
  static final ModuleMethod lambda$Fn31;
  static final ModuleMethod lambda$Fn32;
  static final ModuleMethod lambda$Fn33;
  static final ModuleMethod lambda$Fn34;
  static final ModuleMethod lambda$Fn35;
  static final ModuleMethod lambda$Fn36;
  static final ModuleMethod lambda$Fn37;
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
  public Button Button2;
  public final ModuleMethod Button2$Click;
  public Button Button3;
  public final ModuleMethod Button3$Click;
  public Clock Clock1;
  public File File1;
  public final ModuleMethod File1$GotText;
  public HorizontalArrangement HorizontalArrangement1;
  public HorizontalArrangement HorizontalArrangement2;
  public HorizontalArrangement HorizontalArrangement3;
  public Label Label1;
  public Label Label2;
  public Label Label3;
  public Label Label4;
  public Label Label5;
  public Label Label6;
  public Notifier Notifier1;
  public final ModuleMethod Notifier1$AfterTextInput;
  public final ModuleMethod Screen3$BackPressed;
  public Sharing Sharing1;
  public TinyDB TinyDB1;
  public VerticalArrangement VerticalArrangement1;
  public VerticalArrangement VerticalArrangement2;
  public VerticalArrangement VerticalArrangement3;
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
    Lit156 = (SimpleSymbol)new SimpleSymbol("InstantInTime").readResolve();
    Lit155 = (SimpleSymbol)new SimpleSymbol("lookup-handler").readResolve();
    Lit154 = (SimpleSymbol)new SimpleSymbol("dispatchEvent").readResolve();
    Lit153 = (SimpleSymbol)new SimpleSymbol("send-error").readResolve();
    Lit152 = (SimpleSymbol)new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    Lit151 = (SimpleSymbol)new SimpleSymbol("add-to-global-vars").readResolve();
    Lit150 = (SimpleSymbol)new SimpleSymbol("add-to-components").readResolve();
    Lit149 = (SimpleSymbol)new SimpleSymbol("add-to-events").readResolve();
    Lit148 = (SimpleSymbol)new SimpleSymbol("add-to-global-var-environment").readResolve();
    Lit147 = (SimpleSymbol)new SimpleSymbol("is-bound-in-form-environment").readResolve();
    Lit146 = (SimpleSymbol)new SimpleSymbol("lookup-in-form-environment").readResolve();
    Lit145 = (SimpleSymbol)new SimpleSymbol("add-to-form-environment").readResolve();
    Lit144 = (SimpleSymbol)new SimpleSymbol("android-log-form").readResolve();
    Lit143 = new FString("com.google.appinventor.components.runtime.Clock");
    Lit142 = new FString("com.google.appinventor.components.runtime.Clock");
    Lit141 = (SimpleSymbol)new SimpleSymbol("AfterTextInput").readResolve();
    Lit140 = (SimpleSymbol)new SimpleSymbol("Notifier1$AfterTextInput").readResolve();
    Object localObject = (SimpleSymbol)new SimpleSymbol("text").readResolve();
    Lit16 = (SimpleSymbol)localObject;
    Lit139 = PairWithPosition.make(localObject, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861928), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861923), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861917);
    Lit138 = (SimpleSymbol)new SimpleSymbol("ShowMessageDialog").readResolve();
    Lit137 = PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861635);
    Lit136 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861501), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861495);
    Lit135 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861478), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861473), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861468), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861463), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861458), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861453), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861448), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861443), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861438), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861433), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861428), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861423), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861418), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861413), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861407);
    Lit134 = PairWithPosition.make(Lit156, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861350);
    Lit133 = (SimpleSymbol)new SimpleSymbol("Second").readResolve();
    Lit132 = PairWithPosition.make(Lit156, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861206);
    Lit131 = (SimpleSymbol)new SimpleSymbol("Minute").readResolve();
    Lit130 = PairWithPosition.make(Lit156, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 861062);
    Lit129 = (SimpleSymbol)new SimpleSymbol("Hour").readResolve();
    Lit128 = PairWithPosition.make(Lit156, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 860920);
    Lit127 = (SimpleSymbol)new SimpleSymbol("Year").readResolve();
    Lit126 = PairWithPosition.make(Lit156, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 860778);
    Lit125 = (SimpleSymbol)new SimpleSymbol("DayOfMonth").readResolve();
    Lit124 = PairWithPosition.make(Lit156, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 860630);
    Lit123 = (SimpleSymbol)new SimpleSymbol("Now").readResolve();
    Lit122 = (SimpleSymbol)new SimpleSymbol("MonthName").readResolve();
    Lit121 = (SimpleSymbol)new SimpleSymbol("Clock1").readResolve();
    Lit120 = PairWithPosition.make((SimpleSymbol)new SimpleSymbol("list").readResolve(), LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 860416);
    Lit119 = PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 860383);
    Lit118 = (SimpleSymbol)new SimpleSymbol("AppendToFile").readResolve();
    Lit117 = new FString("com.google.appinventor.components.runtime.Notifier");
    Lit116 = new FString("com.google.appinventor.components.runtime.Notifier");
    Lit115 = (SimpleSymbol)new SimpleSymbol("GotText").readResolve();
    Lit114 = (SimpleSymbol)new SimpleSymbol("File1$GotText").readResolve();
    Lit113 = new FString("com.google.appinventor.components.runtime.File");
    Lit112 = new FString("com.google.appinventor.components.runtime.File");
    Lit111 = new FString("com.google.appinventor.components.runtime.Sharing");
    Lit110 = new FString("com.google.appinventor.components.runtime.Sharing");
    Lit109 = new FString("com.google.appinventor.components.runtime.TinyDB");
    Lit108 = (SimpleSymbol)new SimpleSymbol("TinyDB1").readResolve();
    Lit107 = new FString("com.google.appinventor.components.runtime.TinyDB");
    Lit106 = (SimpleSymbol)new SimpleSymbol("Button1$Click").readResolve();
    Lit105 = PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 761940);
    Lit104 = (SimpleSymbol)new SimpleSymbol("Delete").readResolve();
    Lit103 = new FString("com.google.appinventor.components.runtime.Button");
    Lit102 = DFloNum.make(15);
    Lit101 = (SimpleSymbol)new SimpleSymbol("Button1").readResolve();
    Lit100 = new FString("com.google.appinventor.components.runtime.Button");
    Lit99 = (SimpleSymbol)new SimpleSymbol("Button2$Click").readResolve();
    Lit98 = PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 708811);
    Lit97 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 708794), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 708789), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 708783);
    Lit96 = (SimpleSymbol)new SimpleSymbol("ShareFile").readResolve();
    Lit95 = (SimpleSymbol)new SimpleSymbol("Sharing1").readResolve();
    Lit94 = new FString("com.google.appinventor.components.runtime.Button");
    Lit93 = DFloNum.make(15);
    Lit92 = (SimpleSymbol)new SimpleSymbol("Button2").readResolve();
    Lit91 = new FString("com.google.appinventor.components.runtime.Button");
    Lit90 = (SimpleSymbol)new SimpleSymbol("Click").readResolve();
    Lit89 = (SimpleSymbol)new SimpleSymbol("Button3$Click").readResolve();
    localObject = Lit16;
    SimpleSymbol localSimpleSymbol1 = Lit16;
    SimpleSymbol localSimpleSymbol2 = (SimpleSymbol)new SimpleSymbol("boolean").readResolve();
    Lit18 = localSimpleSymbol2;
    Lit88 = PairWithPosition.make(localObject, PairWithPosition.make(localSimpleSymbol1, PairWithPosition.make(localSimpleSymbol2, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 655651), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 655646), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 655640);
    Lit87 = (SimpleSymbol)new SimpleSymbol("ShowTextDialog").readResolve();
    Lit86 = (SimpleSymbol)new SimpleSymbol("Notifier1").readResolve();
    Lit85 = PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 655446);
    Lit84 = (SimpleSymbol)new SimpleSymbol("ReadFrom").readResolve();
    Lit83 = (SimpleSymbol)new SimpleSymbol("File1").readResolve();
    Lit82 = new FString("com.google.appinventor.components.runtime.Button");
    Lit81 = DFloNum.make(15);
    Lit80 = (SimpleSymbol)new SimpleSymbol("Button3").readResolve();
    Lit79 = new FString("com.google.appinventor.components.runtime.Button");
    Lit78 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit77 = (SimpleSymbol)new SimpleSymbol("HorizontalArrangement1").readResolve();
    Lit76 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit75 = new FString("com.google.appinventor.components.runtime.Label");
    Lit74 = IntNum.make(20);
    Lit73 = (SimpleSymbol)new SimpleSymbol("Label6").readResolve();
    Lit72 = new FString("com.google.appinventor.components.runtime.Label");
    Lit71 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit70 = IntNum.make(64531);
    Lit69 = (SimpleSymbol)new SimpleSymbol("VerticalArrangement3").readResolve();
    Lit68 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit67 = new FString("com.google.appinventor.components.runtime.Label");
    Lit66 = (SimpleSymbol)new SimpleSymbol("Label5").readResolve();
    Lit65 = new FString("com.google.appinventor.components.runtime.Label");
    Lit64 = new FString("com.google.appinventor.components.runtime.Label");
    Lit63 = (SimpleSymbol)new SimpleSymbol("Label4").readResolve();
    Lit62 = new FString("com.google.appinventor.components.runtime.Label");
    Lit61 = new FString("com.google.appinventor.components.runtime.Label");
    Lit60 = DFloNum.make(15);
    Lit59 = (SimpleSymbol)new SimpleSymbol("Label3").readResolve();
    Lit58 = new FString("com.google.appinventor.components.runtime.Label");
    Lit57 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit56 = (SimpleSymbol)new SimpleSymbol("VerticalArrangement2").readResolve();
    Lit55 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit54 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit53 = IntNum.make(64436);
    Lit52 = IntNum.make(64486);
    Lit51 = (SimpleSymbol)new SimpleSymbol("HorizontalArrangement3").readResolve();
    Lit50 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit49 = new FString("com.google.appinventor.components.runtime.Label");
    Lit48 = DFloNum.make(10);
    Lit47 = (SimpleSymbol)new SimpleSymbol("Label2").readResolve();
    Lit46 = new FString("com.google.appinventor.components.runtime.Label");
    Lit45 = new FString("com.google.appinventor.components.runtime.Label");
    Lit44 = IntNum.make(1);
    Lit43 = (SimpleSymbol)new SimpleSymbol("TextAlignment").readResolve();
    Lit42 = (SimpleSymbol)new SimpleSymbol("Text").readResolve();
    Lit41 = DFloNum.make(25);
    Lit40 = (SimpleSymbol)new SimpleSymbol("FontSize").readResolve();
    Lit39 = (SimpleSymbol)new SimpleSymbol("FontBold").readResolve();
    Lit38 = (SimpleSymbol)new SimpleSymbol("Label1").readResolve();
    Lit37 = new FString("com.google.appinventor.components.runtime.Label");
    Lit36 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit35 = (SimpleSymbol)new SimpleSymbol("VerticalArrangement1").readResolve();
    Lit34 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit33 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit32 = IntNum.make(64436);
    Lit31 = (SimpleSymbol)new SimpleSymbol("Width").readResolve();
    Lit30 = IntNum.make(64516);
    Lit29 = (SimpleSymbol)new SimpleSymbol("Height").readResolve();
    localObject = new int[2];
    localObject[0] = -3355444;
    Lit28 = IntNum.make((int[])localObject);
    Lit27 = (SimpleSymbol)new SimpleSymbol("BackgroundColor").readResolve();
    Lit26 = IntNum.make(2);
    Lit25 = (SimpleSymbol)new SimpleSymbol("AlignVertical").readResolve();
    Lit24 = (SimpleSymbol)new SimpleSymbol("HorizontalArrangement2").readResolve();
    Lit23 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit22 = (SimpleSymbol)new SimpleSymbol("BackPressed").readResolve();
    Lit21 = (SimpleSymbol)new SimpleSymbol("Screen3$BackPressed").readResolve();
    Lit20 = (SimpleSymbol)new SimpleSymbol("TitleVisible").readResolve();
    Lit19 = (SimpleSymbol)new SimpleSymbol("Title").readResolve();
    Lit17 = (SimpleSymbol)new SimpleSymbol("Scrollable").readResolve();
    Lit15 = (SimpleSymbol)new SimpleSymbol("AppName").readResolve();
    Lit14 = (SimpleSymbol)new SimpleSymbol("number").readResolve();
    Lit13 = IntNum.make(3);
    Lit12 = (SimpleSymbol)new SimpleSymbol("AlignHorizontal").readResolve();
    Lit11 = (SimpleSymbol)new SimpleSymbol("g$saved_name").readResolve();
    Lit10 = (SimpleSymbol)new SimpleSymbol("g$tmp_name").readResolve();
    Lit9 = PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 33075);
    Lit8 = PairWithPosition.make(Lit157, PairWithPosition.make(Lit157, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 32969), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 32964);
    Lit7 = PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 32934);
    Lit6 = PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 33075);
    Lit5 = PairWithPosition.make(Lit157, PairWithPosition.make(Lit157, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 32969), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 32964);
    Lit4 = PairWithPosition.make(Lit16, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.yail", 32934);
    Lit3 = (SimpleSymbol)new SimpleSymbol("p$ToScreen").readResolve();
    Lit2 = (SimpleSymbol)new SimpleSymbol("*the-null-value*").readResolve();
    Lit1 = (SimpleSymbol)new SimpleSymbol("getMessage").readResolve();
  }
  
  public Screen3()
  {
    ModuleInfo.register(this);
    Screen3.frame localframe = new Screen3.frame();
    localframe.$main = this;
    this.android$Mnlog$Mnform = new ModuleMethod(localframe, 1, Lit144, 4097);
    this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(localframe, 2, Lit145, 8194);
    this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 3, Lit146, 8193);
    this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 5, Lit147, 4097);
    this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(localframe, 6, Lit148, 8194);
    this.add$Mnto$Mnevents = new ModuleMethod(localframe, 7, Lit149, 8194);
    this.add$Mnto$Mncomponents = new ModuleMethod(localframe, 8, Lit150, 16388);
    this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(localframe, 9, Lit151, 8194);
    this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(localframe, 10, Lit152, 4097);
    this.send$Mnerror = new ModuleMethod(localframe, 11, Lit153, 4097);
    this.process$Mnexception = new ModuleMethod(localframe, 12, "process-exception", 4097);
    this.dispatchEvent = new ModuleMethod(localframe, 13, Lit154, 16388);
    this.lookup$Mnhandler = new ModuleMethod(localframe, 14, Lit155, 8194);
    ModuleMethod localModuleMethod = new ModuleMethod(localframe, 15, null, 0);
    localModuleMethod.setProperty("source-location", "/tmp/runtime8900109651564447184.scm:542");
    lambda$Fn1 = localModuleMethod;
    this.$define = new ModuleMethod(localframe, 16, "$define", 0);
    lambda$Fn2 = new ModuleMethod(localframe, 17, null, 4097);
    lambda$Fn4 = new ModuleMethod(localframe, 18, null, 4097);
    lambda$Fn3 = new ModuleMethod(localframe, 19, null, 0);
    lambda$Fn5 = new ModuleMethod(localframe, 20, null, 0);
    lambda$Fn6 = new ModuleMethod(localframe, 21, null, 0);
    lambda$Fn7 = new ModuleMethod(localframe, 22, null, 0);
    this.Screen3$BackPressed = new ModuleMethod(localframe, 23, Lit21, 0);
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
    lambda$Fn31 = new ModuleMethod(localframe, 47, null, 0);
    lambda$Fn32 = new ModuleMethod(localframe, 48, null, 0);
    lambda$Fn33 = new ModuleMethod(localframe, 49, null, 0);
    this.Button3$Click = new ModuleMethod(localframe, 50, Lit89, 0);
    lambda$Fn34 = new ModuleMethod(localframe, 51, null, 0);
    lambda$Fn35 = new ModuleMethod(localframe, 52, null, 0);
    this.Button2$Click = new ModuleMethod(localframe, 53, Lit99, 0);
    lambda$Fn36 = new ModuleMethod(localframe, 54, null, 0);
    lambda$Fn37 = new ModuleMethod(localframe, 55, null, 0);
    this.Button1$Click = new ModuleMethod(localframe, 56, Lit106, 0);
    this.File1$GotText = new ModuleMethod(localframe, 57, Lit114, 4097);
    this.Notifier1$AfterTextInput = new ModuleMethod(localframe, 58, Lit140, 4097);
  }
  
  static Object lambda10()
  {
    runtime.setAndCoerceProperty$Ex(Lit24, Lit12, Lit13, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit25, Lit26, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit27, Lit28, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit29, Lit30, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit24, Lit31, Lit32, Lit14);
  }
  
  static Object lambda11()
  {
    return runtime.setAndCoerceProperty$Ex(Lit35, Lit12, Lit13, Lit14);
  }
  
  static Object lambda12()
  {
    return runtime.setAndCoerceProperty$Ex(Lit35, Lit12, Lit13, Lit14);
  }
  
  static Object lambda13()
  {
    runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit38, Lit40, Lit41, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit38, Lit42, "CROWD TRACKING", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit38, Lit43, Lit44, Lit14);
  }
  
  static Object lambda14()
  {
    runtime.setAndCoerceProperty$Ex(Lit38, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit38, Lit40, Lit41, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit38, Lit42, "CROWD TRACKING", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit38, Lit43, Lit44, Lit14);
  }
  
  static Object lambda15()
  {
    runtime.setAndCoerceProperty$Ex(Lit47, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit47, Lit40, Lit48, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit47, Lit42, "A Project of the Sync.Bio.Optics Research Group", Lit16);
  }
  
  static Object lambda16()
  {
    runtime.setAndCoerceProperty$Ex(Lit47, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit47, Lit40, Lit48, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit47, Lit42, "A Project of the Sync.Bio.Optics Research Group", Lit16);
  }
  
  static Object lambda17()
  {
    runtime.setAndCoerceProperty$Ex(Lit51, Lit12, Lit13, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit25, Lit26, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit29, Lit52, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit51, Lit31, Lit53, Lit14);
  }
  
  static Object lambda18()
  {
    runtime.setAndCoerceProperty$Ex(Lit51, Lit12, Lit13, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit25, Lit26, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit51, Lit29, Lit52, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit51, Lit31, Lit53, Lit14);
  }
  
  static Object lambda19()
  {
    runtime.setAndCoerceProperty$Ex(Lit56, Lit12, Lit13, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit56, Lit25, Lit26, Lit14);
  }
  
  /* Error */
  public static SimpleSymbol lambda1symbolAppend$V(Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: invokestatic 1000	gnu/lists/LList:makeList	([Ljava/lang/Object;I)Lgnu/lists/LList;
    //   5: astore_1
    //   6: getstatic 1006	kawa/standard/Scheme:apply	Lgnu/kawa/functions/Apply;
    //   9: astore_2
    //   10: getstatic 1011	kawa/lib/strings:string$Mnappend	Lgnu/expr/ModuleMethod;
    //   13: astore_3
    //   14: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   17: astore_0
    //   18: aload_1
    //   19: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   22: if_acmpne +23 -> 45
    //   25: aload_2
    //   26: aload_3
    //   27: aload_0
    //   28: invokestatic 1015	gnu/lists/LList:reverseInPlace	(Ljava/lang/Object;)Lgnu/lists/LList;
    //   31: invokevirtual 1021	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   34: astore_0
    //   35: aload_0
    //   36: checkcast 1023	java/lang/CharSequence
    //   39: astore_1
    //   40: aload_1
    //   41: invokestatic 1029	kawa/lib/misc:string$To$Symbol	(Ljava/lang/CharSequence;)Lgnu/mapping/SimpleSymbol;
    //   44: areturn
    //   45: aload_1
    //   46: checkcast 1031	gnu/lists/Pair
    //   49: astore 4
    //   51: aload 4
    //   53: invokevirtual 1034	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   56: astore_1
    //   57: aload 4
    //   59: invokevirtual 1037	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   62: astore 4
    //   64: aload 4
    //   66: checkcast 1039	gnu/mapping/Symbol
    //   69: astore 5
    //   71: aload 5
    //   73: invokestatic 1043	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   76: aload_0
    //   77: invokestatic 1046	gnu/lists/Pair:make	(Ljava/lang/Object;Ljava/lang/Object;)Lgnu/lists/Pair;
    //   80: astore_0
    //   81: goto -63 -> 18
    //   84: astore_0
    //   85: new 1048	gnu/mapping/WrongType
    //   88: dup
    //   89: aload_0
    //   90: ldc_w 1050
    //   93: bipush -2
    //   95: aload_1
    //   96: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   99: athrow
    //   100: astore_0
    //   101: new 1048	gnu/mapping/WrongType
    //   104: dup
    //   105: aload_0
    //   106: ldc_w 1055
    //   109: iconst_1
    //   110: aload 4
    //   112: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   115: athrow
    //   116: astore_1
    //   117: new 1048	gnu/mapping/WrongType
    //   120: dup
    //   121: aload_1
    //   122: ldc_w 1057
    //   125: iconst_1
    //   126: aload_0
    //   127: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
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
    runtime.setAndCoerceProperty$Ex(Lit56, Lit12, Lit13, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit56, Lit25, Lit26, Lit14);
  }
  
  static Object lambda21()
  {
    runtime.setAndCoerceProperty$Ex(Lit59, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit59, Lit40, Lit60, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit59, Lit42, "The tracking has been stopped!", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit59, Lit43, Lit44, Lit14);
  }
  
  static Object lambda22()
  {
    runtime.setAndCoerceProperty$Ex(Lit59, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit59, Lit40, Lit60, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit59, Lit42, "The tracking has been stopped!", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit59, Lit43, Lit44, Lit14);
  }
  
  static Object lambda23()
  {
    runtime.setAndCoerceProperty$Ex(Lit63, Lit42, "Press the SAVE button to save your tracking data.", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit63, Lit43, Lit44, Lit14);
  }
  
  static Object lambda24()
  {
    runtime.setAndCoerceProperty$Ex(Lit63, Lit42, "Press the SAVE button to save your tracking data.", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit63, Lit43, Lit44, Lit14);
  }
  
  static Object lambda25()
  {
    runtime.setAndCoerceProperty$Ex(Lit66, Lit42, "Kindly send your track data to this email address: bacong.junelle@gmail.com", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit66, Lit43, Lit44, Lit14);
  }
  
  static Object lambda26()
  {
    runtime.setAndCoerceProperty$Ex(Lit66, Lit42, "Kindly send your track data to this email address: bacong.junelle@gmail.com", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit66, Lit43, Lit44, Lit14);
  }
  
  static Object lambda27()
  {
    runtime.setAndCoerceProperty$Ex(Lit69, Lit25, Lit26, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit69, Lit29, Lit70, Lit14);
  }
  
  static Object lambda28()
  {
    runtime.setAndCoerceProperty$Ex(Lit69, Lit25, Lit26, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit69, Lit29, Lit70, Lit14);
  }
  
  static Object lambda29()
  {
    runtime.setAndCoerceProperty$Ex(Lit73, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit73, Lit40, Lit74, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit73, Lit42, "Thank you for participating!", Lit16);
  }
  
  static Object lambda3(Object paramObject)
  {
    if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(paramObject), Lit4, "is text empty?"), Boolean.FALSE), Lit5, "=") != Boolean.FALSE) {
      return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1(paramObject), Lit6, "open another screen");
    }
    return Values.empty;
  }
  
  static Object lambda30()
  {
    runtime.setAndCoerceProperty$Ex(Lit73, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit73, Lit40, Lit74, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit73, Lit42, "Thank you for participating!", Lit16);
  }
  
  static Object lambda31()
  {
    return runtime.setAndCoerceProperty$Ex(Lit77, Lit12, Lit13, Lit14);
  }
  
  static Object lambda32()
  {
    return runtime.setAndCoerceProperty$Ex(Lit77, Lit12, Lit13, Lit14);
  }
  
  static Object lambda33()
  {
    runtime.setAndCoerceProperty$Ex(Lit80, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit80, Lit40, Lit81, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit80, Lit42, "SAVE", Lit16);
  }
  
  static Object lambda34()
  {
    runtime.setAndCoerceProperty$Ex(Lit80, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit80, Lit40, Lit81, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit80, Lit42, "SAVE", Lit16);
  }
  
  static Object lambda35()
  {
    runtime.setAndCoerceProperty$Ex(Lit92, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit92, Lit40, Lit93, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit92, Lit42, "SEND", Lit16);
  }
  
  static Object lambda36()
  {
    runtime.setAndCoerceProperty$Ex(Lit92, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit92, Lit40, Lit93, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit92, Lit42, "SEND", Lit16);
  }
  
  static Object lambda37()
  {
    runtime.setAndCoerceProperty$Ex(Lit101, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit101, Lit40, Lit102, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit101, Lit42, "BACK", Lit16);
  }
  
  static Object lambda38()
  {
    runtime.setAndCoerceProperty$Ex(Lit101, Lit39, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit101, Lit40, Lit102, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit101, Lit42, "BACK", Lit16);
  }
  
  static Procedure lambda4()
  {
    return lambda$Fn4;
  }
  
  static Object lambda5(Object paramObject)
  {
    if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.callYailPrimitive(runtime.string$Mnempty$Qu, LList.list1(paramObject), Lit7, "is text empty?"), Boolean.FALSE), Lit8, "=") != Boolean.FALSE) {
      return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1(paramObject), Lit9, "open another screen");
    }
    return Values.empty;
  }
  
  static String lambda6()
  {
    return "";
  }
  
  static String lambda7()
  {
    return "";
  }
  
  static Object lambda8()
  {
    runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Lit13, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit15, "IPLCrowdTracker", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit17, Boolean.TRUE, Lit18);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "Screen3", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit0, Lit20, Boolean.FALSE, Lit18);
  }
  
  static Object lambda9()
  {
    runtime.setAndCoerceProperty$Ex(Lit24, Lit12, Lit13, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit25, Lit26, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit27, Lit28, Lit14);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit29, Lit30, Lit14);
    return runtime.setAndCoerceProperty$Ex(Lit24, Lit31, Lit32, Lit14);
  }
  
  /* Error */
  public void $define()
  {
    // Byte code:
    //   0: invokestatic 1147	kawa/standard/Scheme:getInstance	()Lkawa/standard/Scheme;
    //   3: invokestatic 1153	gnu/expr/Language:setDefaults	(Lgnu/expr/Language;)V
    //   6: aload_0
    //   7: invokevirtual 1156	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:run	()V
    //   10: aload_0
    //   11: putstatic 1158	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Screen3	Lappinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3;
    //   14: aload_0
    //   15: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   18: aload_0
    //   19: invokevirtual 1162	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   22: aload_0
    //   23: getfield 1164	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:events$Mnto$Mnregister	Lgnu/lists/LList;
    //   26: astore_1
    //   27: aload_1
    //   28: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   31: if_acmpne +96 -> 127
    //   34: aload_0
    //   35: getstatic 813	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit2	Lgnu/mapping/SimpleSymbol;
    //   38: getstatic 880	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn1	Lgnu/expr/ModuleMethod;
    //   41: invokevirtual 1167	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield 1169	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:global$Mnvars$Mnto$Mncreate	Lgnu/lists/LList;
    //   48: invokestatic 1175	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   51: astore_1
    //   52: aload_1
    //   53: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   56: if_acmpne +139 -> 195
    //   59: aload_0
    //   60: getfield 1177	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:form$Mndo$Mnafter$Mncreation	Lgnu/lists/LList;
    //   63: invokestatic 1175	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   66: astore_1
    //   67: aload_1
    //   68: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   71: if_acmpne +215 -> 286
    //   74: aload_0
    //   75: getfield 1179	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:components$Mnto$Mncreate	Lgnu/lists/LList;
    //   78: invokestatic 1175	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   81: astore_1
    //   82: aload_1
    //   83: astore_2
    //   84: aload_2
    //   85: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   88: if_acmpne +235 -> 323
    //   91: aload_1
    //   92: astore_2
    //   93: aload_2
    //   94: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   97: if_acmpne +382 -> 479
    //   100: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   103: astore_2
    //   104: aload_1
    //   105: aload_2
    //   106: if_acmpne +438 -> 544
    //   109: return
    //   110: astore_1
    //   111: aload_0
    //   112: aload_1
    //   113: invokevirtual 1181	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   116: invokevirtual 1184	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:androidLogForm	(Ljava/lang/Object;)V
    //   119: aload_0
    //   120: aload_1
    //   121: invokevirtual 1187	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:processException	(Ljava/lang/Object;)V
    //   124: goto -114 -> 10
    //   127: aload_1
    //   128: checkcast 1031	gnu/lists/Pair
    //   131: astore_3
    //   132: aload_3
    //   133: invokevirtual 1037	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   136: astore_2
    //   137: getstatic 1191	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   140: aload_2
    //   141: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   144: astore_1
    //   145: aload_1
    //   146: ifnonnull +33 -> 179
    //   149: aconst_null
    //   150: astore_1
    //   151: getstatic 1197	kawa/lib/lists:cdr	Lgnu/expr/GenericProc;
    //   154: aload_2
    //   155: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   158: astore_2
    //   159: aload_2
    //   160: ifnonnull +27 -> 187
    //   163: aconst_null
    //   164: astore_2
    //   165: aload_0
    //   166: aload_1
    //   167: aload_2
    //   168: invokestatic 1203	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   171: aload_3
    //   172: invokevirtual 1034	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   175: astore_1
    //   176: goto -149 -> 27
    //   179: aload_1
    //   180: invokevirtual 1208	java/lang/Object:toString	()Ljava/lang/String;
    //   183: astore_1
    //   184: goto -33 -> 151
    //   187: aload_2
    //   188: invokevirtual 1208	java/lang/Object:toString	()Ljava/lang/String;
    //   191: astore_2
    //   192: goto -27 -> 165
    //   195: aload_1
    //   196: checkcast 1031	gnu/lists/Pair
    //   199: astore_2
    //   200: aload_2
    //   201: invokevirtual 1037	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   204: astore_3
    //   205: getstatic 1191	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   208: aload_3
    //   209: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   212: astore_1
    //   213: getstatic 1211	kawa/lib/lists:cadr	Lgnu/expr/GenericProc;
    //   216: aload_3
    //   217: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   220: astore_3
    //   221: aload_1
    //   222: checkcast 1039	gnu/mapping/Symbol
    //   225: astore 4
    //   227: aload_0
    //   228: aload 4
    //   230: getstatic 1215	kawa/standard/Scheme:applyToArgs	Lgnu/kawa/functions/ApplyToArgs;
    //   233: aload_3
    //   234: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   237: invokevirtual 1218	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToGlobalVarEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   240: aload_2
    //   241: invokevirtual 1034	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   244: astore_1
    //   245: goto -193 -> 52
    //   248: astore_2
    //   249: new 1048	gnu/mapping/WrongType
    //   252: dup
    //   253: aload_2
    //   254: ldc_w 1050
    //   257: bipush -2
    //   259: aload_1
    //   260: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   263: athrow
    //   264: astore_1
    //   265: aload_0
    //   266: aload_1
    //   267: invokevirtual 1187	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:processException	(Ljava/lang/Object;)V
    //   270: return
    //   271: astore_2
    //   272: new 1048	gnu/mapping/WrongType
    //   275: dup
    //   276: aload_2
    //   277: ldc_w 319
    //   280: iconst_0
    //   281: aload_1
    //   282: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   285: athrow
    //   286: aload_1
    //   287: checkcast 1031	gnu/lists/Pair
    //   290: astore_2
    //   291: aload_2
    //   292: invokevirtual 1037	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   295: invokestatic 1221	kawa/lib/misc:force	(Ljava/lang/Object;)Ljava/lang/Object;
    //   298: pop
    //   299: aload_2
    //   300: invokevirtual 1034	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   303: astore_1
    //   304: goto -237 -> 67
    //   307: astore_2
    //   308: new 1048	gnu/mapping/WrongType
    //   311: dup
    //   312: aload_2
    //   313: ldc_w 1050
    //   316: bipush -2
    //   318: aload_1
    //   319: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   322: athrow
    //   323: aload_2
    //   324: checkcast 1031	gnu/lists/Pair
    //   327: astore_3
    //   328: aload_3
    //   329: invokevirtual 1037	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   332: astore 5
    //   334: getstatic 1224	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   337: aload 5
    //   339: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   342: astore_2
    //   343: getstatic 1227	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   346: aload 5
    //   348: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   351: pop
    //   352: getstatic 1211	kawa/lib/lists:cadr	Lgnu/expr/GenericProc;
    //   355: aload 5
    //   357: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   360: astore 4
    //   362: getstatic 1191	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   365: aload 5
    //   367: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   370: astore 5
    //   372: aload 5
    //   374: checkcast 1039	gnu/mapping/Symbol
    //   377: astore 6
    //   379: aload_0
    //   380: aload 6
    //   382: invokevirtual 1231	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lookupInFormEnvironment	(Lgnu/mapping/Symbol;)Ljava/lang/Object;
    //   385: astore 5
    //   387: getstatic 1236	gnu/kawa/reflect/Invoke:make	Lgnu/kawa/reflect/Invoke;
    //   390: aload 4
    //   392: aload 5
    //   394: invokevirtual 1021	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   397: astore 4
    //   399: getstatic 1242	gnu/kawa/reflect/SlotSet:set$Mnfield$Ex	Lgnu/kawa/reflect/SlotSet;
    //   402: aload_0
    //   403: aload_2
    //   404: aload 4
    //   406: invokevirtual 1246	gnu/mapping/Procedure:apply3	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   409: pop
    //   410: aload_2
    //   411: checkcast 1039	gnu/mapping/Symbol
    //   414: astore 5
    //   416: aload_0
    //   417: aload 5
    //   419: aload 4
    //   421: invokevirtual 1162	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   424: aload_3
    //   425: invokevirtual 1034	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   428: astore_2
    //   429: goto -345 -> 84
    //   432: astore_1
    //   433: new 1048	gnu/mapping/WrongType
    //   436: dup
    //   437: aload_1
    //   438: ldc_w 1050
    //   441: bipush -2
    //   443: aload_2
    //   444: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   447: athrow
    //   448: astore_1
    //   449: new 1048	gnu/mapping/WrongType
    //   452: dup
    //   453: aload_1
    //   454: ldc_w 327
    //   457: iconst_0
    //   458: aload 5
    //   460: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   463: athrow
    //   464: astore_1
    //   465: new 1048	gnu/mapping/WrongType
    //   468: dup
    //   469: aload_1
    //   470: ldc_w 331
    //   473: iconst_0
    //   474: aload_2
    //   475: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   478: athrow
    //   479: aload_2
    //   480: checkcast 1031	gnu/lists/Pair
    //   483: astore_3
    //   484: aload_3
    //   485: invokevirtual 1037	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   488: astore_2
    //   489: getstatic 1224	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   492: aload_2
    //   493: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   496: pop
    //   497: getstatic 1227	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   500: aload_2
    //   501: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   504: astore_2
    //   505: aload_2
    //   506: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   509: if_acmpeq +11 -> 520
    //   512: getstatic 1215	kawa/standard/Scheme:applyToArgs	Lgnu/kawa/functions/ApplyToArgs;
    //   515: aload_2
    //   516: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   519: pop
    //   520: aload_3
    //   521: invokevirtual 1034	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   524: astore_2
    //   525: goto -432 -> 93
    //   528: astore_1
    //   529: new 1048	gnu/mapping/WrongType
    //   532: dup
    //   533: aload_1
    //   534: ldc_w 1050
    //   537: bipush -2
    //   539: aload_2
    //   540: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   543: athrow
    //   544: aload_1
    //   545: checkcast 1031	gnu/lists/Pair
    //   548: astore_2
    //   549: aload_2
    //   550: invokevirtual 1037	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   553: astore_1
    //   554: getstatic 1224	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   557: aload_1
    //   558: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   561: astore_3
    //   562: getstatic 1227	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   565: aload_1
    //   566: invokevirtual 1194	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   569: pop
    //   570: aload_0
    //   571: getstatic 1252	gnu/kawa/reflect/SlotGet:field	Lgnu/kawa/reflect/SlotGet;
    //   574: aload_0
    //   575: aload_3
    //   576: invokevirtual 1021	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   579: invokevirtual 1255	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:callInitialize	(Ljava/lang/Object;)V
    //   582: aload_2
    //   583: invokevirtual 1034	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   586: astore_1
    //   587: goto -487 -> 100
    //   590: astore_2
    //   591: new 1048	gnu/mapping/WrongType
    //   594: dup
    //   595: aload_2
    //   596: ldc_w 1050
    //   599: bipush -2
    //   601: aload_1
    //   602: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   605: athrow
    //   606: astore_2
    //   607: new 1048	gnu/mapping/WrongType
    //   610: dup
    //   611: aload_2
    //   612: ldc_w 1050
    //   615: bipush -2
    //   617: aload_1
    //   618: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   621: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	622	0	this	Screen3
    //   26	79	1	localLList	LList
    //   110	18	1	localException	Exception
    //   144	116	1	localObject1	Object
    //   264	23	1	localYailRuntimeError	YailRuntimeError
    //   303	16	1	localObject2	Object
    //   432	6	1	localClassCastException1	ClassCastException
    //   448	6	1	localClassCastException2	ClassCastException
    //   464	6	1	localClassCastException3	ClassCastException
    //   528	17	1	localClassCastException4	ClassCastException
    //   553	65	1	localObject3	Object
    //   83	158	2	localObject4	Object
    //   248	6	2	localClassCastException5	ClassCastException
    //   271	6	2	localClassCastException6	ClassCastException
    //   290	10	2	localPair	Pair
    //   307	17	2	localClassCastException7	ClassCastException
    //   342	241	2	localObject5	Object
    //   590	6	2	localClassCastException8	ClassCastException
    //   606	6	2	localClassCastException9	ClassCastException
    //   131	445	3	localObject6	Object
    //   225	195	4	localObject7	Object
    //   332	127	5	localObject8	Object
    //   377	4	6	localSymbol	Symbol
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
    //   272	286	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   286	291	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   291	304	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   308	323	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   323	328	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   328	372	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   372	379	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   379	410	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   410	416	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   416	429	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   433	448	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   449	464	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   465	479	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   479	484	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   484	520	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   520	525	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   529	544	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   544	549	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   549	587	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   591	606	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   221	227	271	java/lang/ClassCastException
    //   286	291	307	java/lang/ClassCastException
    //   323	328	432	java/lang/ClassCastException
    //   372	379	448	java/lang/ClassCastException
    //   410	416	464	java/lang/ClassCastException
    //   479	484	528	java/lang/ClassCastException
    //   544	549	590	java/lang/ClassCastException
    //   127	132	606	java/lang/ClassCastException
  }
  
  public Object Button1$Click()
  {
    runtime.setThisForm();
    runtime.callComponentMethod(Lit83, Lit104, LList.list1("/GPSData_tmp.csv"), Lit105);
    Scheme.applyToArgs.apply2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), "Screen1");
    return runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen");
  }
  
  public Object Button2$Click()
  {
    runtime.setThisForm();
    return runtime.callComponentMethod(Lit95, Lit96, LList.list1(runtime.callYailPrimitive(strings.string$Mnappend, LList.list3("file:///sdcard/", runtime.lookupGlobalVarInCurrentFormEnvironment(Lit11, runtime.$Stthe$Mnnull$Mnvalue$St), ".csv"), Lit97, "join")), Lit98);
  }
  
  public Object Button3$Click()
  {
    runtime.setThisForm();
    runtime.callComponentMethod(Lit83, Lit84, LList.list1("/GPSData_tmp.csv"), Lit85);
    return runtime.callComponentMethod(Lit86, Lit87, LList.list3("Please input your desired username. The file will be saved as [Date]_[Time Saved]_[username].", "Rename File", Boolean.FALSE), Lit88);
  }
  
  public Object File1$GotText(Object paramObject)
  {
    paramObject = runtime.sanitizeComponentData(paramObject);
    runtime.setThisForm();
    return runtime.addGlobalVarToCurrentFormEnvironment(Lit10, paramObject);
  }
  
  public Object Notifier1$AfterTextInput(Object paramObject)
  {
    paramObject = runtime.sanitizeComponentData(paramObject);
    runtime.setThisForm();
    SimpleSymbol localSimpleSymbol1 = Lit83;
    SimpleSymbol localSimpleSymbol2 = Lit118;
    Object localObject = runtime.callYailPrimitive(runtime.yail$Mnlist$Mnto$Mncsv$Mntable, LList.list1(runtime.callYailPrimitive(runtime.yail$Mnlist$Mnfrom$Mncsv$Mntable, LList.list1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit10, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit119, "list from csv table")), Lit120, "list to csv table");
    ModuleMethod localModuleMethod = strings.string$Mnappend;
    Pair localPair = LList.list1("/");
    LList.chain1(LList.chain1(LList.chain4(LList.chain4(LList.chain4(localPair, runtime.callComponentMethod(Lit121, Lit122, LList.list1(runtime.callComponentMethod(Lit121, Lit123, LList.Empty, LList.Empty)), Lit124), "_", runtime.callComponentMethod(Lit121, Lit125, LList.list1(runtime.callComponentMethod(Lit121, Lit123, LList.Empty, LList.Empty)), Lit126), "_"), runtime.callComponentMethod(Lit121, Lit127, LList.list1(runtime.callComponentMethod(Lit121, Lit123, LList.Empty, LList.Empty)), Lit128), "_", runtime.callComponentMethod(Lit121, Lit129, LList.list1(runtime.callComponentMethod(Lit121, Lit123, LList.Empty, LList.Empty)), Lit130), ":"), runtime.callComponentMethod(Lit121, Lit131, LList.list1(runtime.callComponentMethod(Lit121, Lit123, LList.Empty, LList.Empty)), Lit132), ":", runtime.callComponentMethod(Lit121, Lit133, LList.list1(runtime.callComponentMethod(Lit121, Lit123, LList.Empty, LList.Empty)), Lit134), "_"), paramObject), ".csv");
    runtime.callComponentMethod(localSimpleSymbol1, localSimpleSymbol2, LList.list2(localObject, runtime.callYailPrimitive(localModuleMethod, localPair, Lit135, "join")), Lit136);
    runtime.addGlobalVarToCurrentFormEnvironment(Lit11, paramObject);
    runtime.callComponentMethod(Lit83, Lit104, LList.list1("/GPSData_tmp.csv"), Lit137);
    return runtime.callComponentMethod(Lit86, Lit138, LList.list3("The file has now been in stored in your local phone storage. If you wish to send the file to our database right now, select SEND. Otherwise, press the BACK button.", "THANK YOU!", "You're the best!"), Lit139);
  }
  
  public Object Screen3$BackPressed()
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
    //   1: getfield 1418	gnu/mapping/CallContext:consumer	Lgnu/lists/Consumer;
    //   4: astore_2
    //   5: ldc_w 1435
    //   8: invokestatic 1441	kawa/standard/require:find	(Ljava/lang/String;)Ljava/lang/Object;
    //   11: astore_1
    //   12: aload_1
    //   13: checkcast 6	java/lang/Runnable
    //   16: astore_3
    //   17: aload_3
    //   18: invokeinterface 1442 1 0
    //   23: aload_0
    //   24: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   27: putfield 1444	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:$Stdebug$Mnform$St	Ljava/lang/Boolean;
    //   30: aload_0
    //   31: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   34: invokestatic 1043	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   37: invokestatic 1447	gnu/mapping/Environment:make	(Ljava/lang/String;)Lgnu/mapping/SimpleEnvironment;
    //   40: putfield 1348	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:form$Mnenvironment	Lgnu/mapping/Environment;
    //   43: iconst_2
    //   44: anewarray 1205	java/lang/Object
    //   47: dup
    //   48: iconst_0
    //   49: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   52: invokestatic 1043	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   55: aastore
    //   56: dup
    //   57: iconst_1
    //   58: ldc_w 1449
    //   61: aastore
    //   62: invokestatic 1453	kawa/lib/strings:stringAppend	([Ljava/lang/Object;)Lgnu/lists/FString;
    //   65: astore_1
    //   66: aload_1
    //   67: ifnonnull +1156 -> 1223
    //   70: aconst_null
    //   71: astore_1
    //   72: aload_0
    //   73: aload_1
    //   74: invokestatic 1447	gnu/mapping/Environment:make	(Ljava/lang/String;)Lgnu/mapping/SimpleEnvironment;
    //   77: putfield 1361	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:global$Mnvar$Mnenvironment	Lgnu/mapping/Environment;
    //   80: aconst_null
    //   81: putstatic 1158	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Screen3	Lappinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3;
    //   84: aload_0
    //   85: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   88: putfield 1455	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:form$Mnname$Mnsymbol	Lgnu/mapping/Symbol;
    //   91: aload_0
    //   92: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   95: putfield 1164	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:events$Mnto$Mnregister	Lgnu/lists/LList;
    //   98: aload_0
    //   99: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   102: putfield 1179	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:components$Mnto$Mncreate	Lgnu/lists/LList;
    //   105: aload_0
    //   106: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   109: putfield 1169	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:global$Mnvars$Mnto$Mncreate	Lgnu/lists/LList;
    //   112: aload_0
    //   113: getstatic 362	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   116: putfield 1177	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:form$Mndo$Mnafter$Mncreation	Lgnu/lists/LList;
    //   119: ldc_w 1435
    //   122: invokestatic 1441	kawa/standard/require:find	(Ljava/lang/String;)Ljava/lang/Object;
    //   125: astore_1
    //   126: aload_1
    //   127: checkcast 6	java/lang/Runnable
    //   130: astore_3
    //   131: aload_3
    //   132: invokeinterface 1442 1 0
    //   137: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   140: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   143: if_acmpeq +1088 -> 1231
    //   146: getstatic 809	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit3	Lgnu/mapping/SimpleSymbol;
    //   149: getstatic 885	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn2	Lgnu/expr/ModuleMethod;
    //   152: invokestatic 1298	com/google/youngandroid/runtime:addGlobalVarToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   155: aload_2
    //   156: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   159: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   162: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   165: if_acmpeq +1079 -> 1244
    //   168: getstatic 789	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit10	Lgnu/mapping/SimpleSymbol;
    //   171: ldc_w 1134
    //   174: invokestatic 1298	com/google/youngandroid/runtime:addGlobalVarToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   177: aload_2
    //   178: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   181: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   184: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   187: if_acmpeq +1070 -> 1257
    //   190: getstatic 785	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit11	Lgnu/mapping/SimpleSymbol;
    //   193: ldc_w 1134
    //   196: invokestatic 1298	com/google/youngandroid/runtime:addGlobalVarToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   199: aload_2
    //   200: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   203: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   206: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   209: if_acmpeq +1061 -> 1270
    //   212: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   215: getstatic 781	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit12	Lgnu/mapping/SimpleSymbol;
    //   218: getstatic 777	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit13	Lgnu/math/IntNum;
    //   221: getstatic 775	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit14	Lgnu/mapping/SimpleSymbol;
    //   224: invokestatic 974	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   227: pop
    //   228: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   231: getstatic 771	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit15	Lgnu/mapping/SimpleSymbol;
    //   234: ldc_w 1138
    //   237: getstatic 357	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit16	Lgnu/mapping/SimpleSymbol;
    //   240: invokestatic 974	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   243: pop
    //   244: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   247: getstatic 767	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit17	Lgnu/mapping/SimpleSymbol;
    //   250: getstatic 982	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   253: getstatic 562	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit18	Lgnu/mapping/SimpleSymbol;
    //   256: invokestatic 974	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   259: pop
    //   260: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   263: getstatic 763	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit19	Lgnu/mapping/SimpleSymbol;
    //   266: ldc_w 818
    //   269: getstatic 357	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit16	Lgnu/mapping/SimpleSymbol;
    //   272: invokestatic 974	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   275: pop
    //   276: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   279: getstatic 759	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit20	Lgnu/mapping/SimpleSymbol;
    //   282: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   285: getstatic 562	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit18	Lgnu/mapping/SimpleSymbol;
    //   288: invokestatic 974	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   291: aload_2
    //   292: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   295: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   298: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   301: if_acmpeq +986 -> 1287
    //   304: getstatic 755	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit21	Lgnu/mapping/SimpleSymbol;
    //   307: aload_0
    //   308: getfield 897	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Screen3$BackPressed	Lgnu/expr/ModuleMethod;
    //   311: invokestatic 1465	com/google/youngandroid/runtime:addToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   314: pop
    //   315: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   318: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   321: if_acmpeq +980 -> 1301
    //   324: getstatic 1468	com/google/youngandroid/runtime:$Stthis$Mnform$St	Ljava/lang/Object;
    //   327: checkcast 1470	com/google/appinventor/components/runtime/HandlesEventDispatching
    //   330: ldc_w 818
    //   333: ldc_w 750
    //   336: invokestatic 1203	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   339: aload_0
    //   340: aconst_null
    //   341: putfield 1472	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:HorizontalArrangement2	Lcom/google/appinventor/components/runtime/HorizontalArrangement;
    //   344: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   347: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   350: if_acmpeq +964 -> 1314
    //   353: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   356: getstatic 748	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit23	Lgnu/lists/FString;
    //   359: getstatic 746	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit24	Lgnu/mapping/SimpleSymbol;
    //   362: getstatic 899	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn8	Lgnu/expr/ModuleMethod;
    //   365: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   368: aload_2
    //   369: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   372: aload_0
    //   373: aconst_null
    //   374: putfield 1477	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:VerticalArrangement1	Lcom/google/appinventor/components/runtime/VerticalArrangement;
    //   377: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   380: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   383: if_acmpeq +950 -> 1333
    //   386: getstatic 746	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit24	Lgnu/mapping/SimpleSymbol;
    //   389: getstatic 713	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit34	Lgnu/lists/FString;
    //   392: getstatic 711	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit35	Lgnu/mapping/SimpleSymbol;
    //   395: getstatic 903	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn10	Lgnu/expr/ModuleMethod;
    //   398: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   401: aload_2
    //   402: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   405: aload_0
    //   406: aconst_null
    //   407: putfield 1479	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Label1	Lcom/google/appinventor/components/runtime/Label;
    //   410: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   413: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   416: if_acmpeq +936 -> 1352
    //   419: getstatic 711	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit35	Lgnu/mapping/SimpleSymbol;
    //   422: getstatic 706	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit37	Lgnu/lists/FString;
    //   425: getstatic 704	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit38	Lgnu/mapping/SimpleSymbol;
    //   428: getstatic 907	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn12	Lgnu/expr/ModuleMethod;
    //   431: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   434: aload_2
    //   435: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   438: aload_0
    //   439: aconst_null
    //   440: putfield 1481	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Label2	Lcom/google/appinventor/components/runtime/Label;
    //   443: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   446: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   449: if_acmpeq +922 -> 1371
    //   452: getstatic 711	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit35	Lgnu/mapping/SimpleSymbol;
    //   455: getstatic 679	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit46	Lgnu/lists/FString;
    //   458: getstatic 677	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit47	Lgnu/mapping/SimpleSymbol;
    //   461: getstatic 911	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn14	Lgnu/expr/ModuleMethod;
    //   464: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   467: aload_2
    //   468: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   471: aload_0
    //   472: aconst_null
    //   473: putfield 1483	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:HorizontalArrangement3	Lcom/google/appinventor/components/runtime/HorizontalArrangement;
    //   476: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   479: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   482: if_acmpeq +908 -> 1390
    //   485: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   488: getstatic 670	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit50	Lgnu/lists/FString;
    //   491: getstatic 668	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit51	Lgnu/mapping/SimpleSymbol;
    //   494: getstatic 915	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn16	Lgnu/expr/ModuleMethod;
    //   497: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   500: aload_2
    //   501: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   504: aload_0
    //   505: aconst_null
    //   506: putfield 1485	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:VerticalArrangement2	Lcom/google/appinventor/components/runtime/VerticalArrangement;
    //   509: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   512: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   515: if_acmpeq +894 -> 1409
    //   518: getstatic 668	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit51	Lgnu/mapping/SimpleSymbol;
    //   521: getstatic 659	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit55	Lgnu/lists/FString;
    //   524: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   527: getstatic 919	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn18	Lgnu/expr/ModuleMethod;
    //   530: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   533: aload_2
    //   534: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   537: aload_0
    //   538: aconst_null
    //   539: putfield 1487	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Label3	Lcom/google/appinventor/components/runtime/Label;
    //   542: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   545: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   548: if_acmpeq +880 -> 1428
    //   551: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   554: getstatic 652	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit58	Lgnu/lists/FString;
    //   557: getstatic 650	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit59	Lgnu/mapping/SimpleSymbol;
    //   560: getstatic 923	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn20	Lgnu/expr/ModuleMethod;
    //   563: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   566: aload_2
    //   567: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   570: aload_0
    //   571: aconst_null
    //   572: putfield 1489	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Label4	Lcom/google/appinventor/components/runtime/Label;
    //   575: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   578: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   581: if_acmpeq +866 -> 1447
    //   584: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   587: getstatic 643	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit62	Lgnu/lists/FString;
    //   590: getstatic 641	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit63	Lgnu/mapping/SimpleSymbol;
    //   593: getstatic 927	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn22	Lgnu/expr/ModuleMethod;
    //   596: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   599: aload_2
    //   600: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   603: aload_0
    //   604: aconst_null
    //   605: putfield 1491	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Label5	Lcom/google/appinventor/components/runtime/Label;
    //   608: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   611: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   614: if_acmpeq +852 -> 1466
    //   617: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   620: getstatic 636	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit65	Lgnu/lists/FString;
    //   623: getstatic 634	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit66	Lgnu/mapping/SimpleSymbol;
    //   626: getstatic 931	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn24	Lgnu/expr/ModuleMethod;
    //   629: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   632: aload_2
    //   633: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   636: aload_0
    //   637: aconst_null
    //   638: putfield 1493	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:VerticalArrangement3	Lcom/google/appinventor/components/runtime/VerticalArrangement;
    //   641: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   644: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   647: if_acmpeq +838 -> 1485
    //   650: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   653: getstatic 629	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit68	Lgnu/lists/FString;
    //   656: getstatic 627	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit69	Lgnu/mapping/SimpleSymbol;
    //   659: getstatic 935	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn26	Lgnu/expr/ModuleMethod;
    //   662: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   665: aload_2
    //   666: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   669: aload_0
    //   670: aconst_null
    //   671: putfield 1495	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Label6	Lcom/google/appinventor/components/runtime/Label;
    //   674: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   677: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   680: if_acmpeq +824 -> 1504
    //   683: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   686: getstatic 618	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit72	Lgnu/lists/FString;
    //   689: getstatic 616	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit73	Lgnu/mapping/SimpleSymbol;
    //   692: getstatic 939	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn28	Lgnu/expr/ModuleMethod;
    //   695: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   698: aload_2
    //   699: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   702: aload_0
    //   703: aconst_null
    //   704: putfield 1497	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:HorizontalArrangement1	Lcom/google/appinventor/components/runtime/HorizontalArrangement;
    //   707: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   710: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   713: if_acmpeq +810 -> 1523
    //   716: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   719: getstatic 602	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit76	Lgnu/lists/FString;
    //   722: getstatic 600	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit77	Lgnu/mapping/SimpleSymbol;
    //   725: getstatic 943	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn30	Lgnu/expr/ModuleMethod;
    //   728: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   731: aload_2
    //   732: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   735: aload_0
    //   736: aconst_null
    //   737: putfield 1499	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Button3	Lcom/google/appinventor/components/runtime/Button;
    //   740: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   743: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   746: if_acmpeq +796 -> 1542
    //   749: getstatic 600	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit77	Lgnu/mapping/SimpleSymbol;
    //   752: getstatic 593	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit79	Lgnu/lists/FString;
    //   755: getstatic 591	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit80	Lgnu/mapping/SimpleSymbol;
    //   758: getstatic 947	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn32	Lgnu/expr/ModuleMethod;
    //   761: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   764: aload_2
    //   765: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   768: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   771: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   774: if_acmpeq +787 -> 1561
    //   777: getstatic 558	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit89	Lgnu/mapping/SimpleSymbol;
    //   780: aload_0
    //   781: getfield 951	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Button3$Click	Lgnu/expr/ModuleMethod;
    //   784: invokestatic 1465	com/google/youngandroid/runtime:addToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   787: pop
    //   788: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   791: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   794: if_acmpeq +781 -> 1575
    //   797: getstatic 1468	com/google/youngandroid/runtime:$Stthis$Mnform$St	Ljava/lang/Object;
    //   800: checkcast 1470	com/google/appinventor/components/runtime/HandlesEventDispatching
    //   803: ldc_w 589
    //   806: ldc_w 553
    //   809: invokestatic 1203	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   812: aload_0
    //   813: aconst_null
    //   814: putfield 1501	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Button2	Lcom/google/appinventor/components/runtime/Button;
    //   817: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   820: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   823: if_acmpeq +765 -> 1588
    //   826: getstatic 600	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit77	Lgnu/mapping/SimpleSymbol;
    //   829: getstatic 551	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit91	Lgnu/lists/FString;
    //   832: getstatic 549	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit92	Lgnu/mapping/SimpleSymbol;
    //   835: getstatic 953	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn34	Lgnu/expr/ModuleMethod;
    //   838: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   841: aload_2
    //   842: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   845: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   848: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   851: if_acmpeq +756 -> 1607
    //   854: getstatic 527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit99	Lgnu/mapping/SimpleSymbol;
    //   857: aload_0
    //   858: getfield 957	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Button2$Click	Lgnu/expr/ModuleMethod;
    //   861: invokestatic 1465	com/google/youngandroid/runtime:addToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   864: pop
    //   865: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   868: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   871: if_acmpeq +750 -> 1621
    //   874: getstatic 1468	com/google/youngandroid/runtime:$Stthis$Mnform$St	Ljava/lang/Object;
    //   877: checkcast 1470	com/google/appinventor/components/runtime/HandlesEventDispatching
    //   880: ldc_w 547
    //   883: ldc_w 553
    //   886: invokestatic 1203	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   889: aload_0
    //   890: aconst_null
    //   891: putfield 1503	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Button1	Lcom/google/appinventor/components/runtime/Button;
    //   894: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   897: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   900: if_acmpeq +734 -> 1634
    //   903: getstatic 600	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit77	Lgnu/mapping/SimpleSymbol;
    //   906: getstatic 524	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit100	Lgnu/lists/FString;
    //   909: getstatic 522	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit101	Lgnu/mapping/SimpleSymbol;
    //   912: getstatic 959	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn36	Lgnu/expr/ModuleMethod;
    //   915: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   918: aload_2
    //   919: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   922: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   925: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   928: if_acmpeq +725 -> 1653
    //   931: getstatic 501	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit106	Lgnu/mapping/SimpleSymbol;
    //   934: aload_0
    //   935: getfield 963	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Button1$Click	Lgnu/expr/ModuleMethod;
    //   938: invokestatic 1465	com/google/youngandroid/runtime:addToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   941: pop
    //   942: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   945: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   948: if_acmpeq +719 -> 1667
    //   951: getstatic 1468	com/google/youngandroid/runtime:$Stthis$Mnform$St	Ljava/lang/Object;
    //   954: checkcast 1470	com/google/appinventor/components/runtime/HandlesEventDispatching
    //   957: ldc_w 520
    //   960: ldc_w 553
    //   963: invokestatic 1203	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   966: aload_0
    //   967: aconst_null
    //   968: putfield 1505	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:TinyDB1	Lcom/google/appinventor/components/runtime/TinyDB;
    //   971: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   974: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   977: if_acmpeq +703 -> 1680
    //   980: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   983: getstatic 498	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit107	Lgnu/lists/FString;
    //   986: getstatic 496	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit108	Lgnu/mapping/SimpleSymbol;
    //   989: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   992: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   995: aload_2
    //   996: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   999: aload_0
    //   1000: aconst_null
    //   1001: putfield 1507	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Sharing1	Lcom/google/appinventor/components/runtime/Sharing;
    //   1004: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   1007: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1010: if_acmpeq +689 -> 1699
    //   1013: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1016: getstatic 489	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit110	Lgnu/lists/FString;
    //   1019: getstatic 542	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit95	Lgnu/mapping/SimpleSymbol;
    //   1022: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1025: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1028: aload_2
    //   1029: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   1032: aload_0
    //   1033: aconst_null
    //   1034: putfield 1509	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:File1	Lcom/google/appinventor/components/runtime/File;
    //   1037: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   1040: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1043: if_acmpeq +675 -> 1718
    //   1046: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1049: getstatic 483	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit112	Lgnu/lists/FString;
    //   1052: getstatic 584	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit83	Lgnu/mapping/SimpleSymbol;
    //   1055: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1058: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1061: aload_2
    //   1062: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   1065: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   1068: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1071: if_acmpeq +666 -> 1737
    //   1074: getstatic 477	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit114	Lgnu/mapping/SimpleSymbol;
    //   1077: aload_0
    //   1078: getfield 965	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:File1$GotText	Lgnu/expr/ModuleMethod;
    //   1081: invokestatic 1465	com/google/youngandroid/runtime:addToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   1084: pop
    //   1085: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   1088: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1091: if_acmpeq +660 -> 1751
    //   1094: getstatic 1468	com/google/youngandroid/runtime:$Stthis$Mnform$St	Ljava/lang/Object;
    //   1097: checkcast 1470	com/google/appinventor/components/runtime/HandlesEventDispatching
    //   1100: ldc_w 582
    //   1103: ldc_w 472
    //   1106: invokestatic 1203	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   1109: aload_0
    //   1110: aconst_null
    //   1111: putfield 1511	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Notifier1	Lcom/google/appinventor/components/runtime/Notifier;
    //   1114: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   1117: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1120: if_acmpeq +644 -> 1764
    //   1123: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1126: getstatic 470	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit116	Lgnu/lists/FString;
    //   1129: getstatic 574	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit86	Lgnu/mapping/SimpleSymbol;
    //   1132: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1135: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1138: aload_2
    //   1139: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   1142: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   1145: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1148: if_acmpeq +635 -> 1783
    //   1151: getstatic 353	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit140	Lgnu/mapping/SimpleSymbol;
    //   1154: aload_0
    //   1155: getfield 967	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Notifier1$AfterTextInput	Lgnu/expr/ModuleMethod;
    //   1158: invokestatic 1465	com/google/youngandroid/runtime:addToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   1161: pop
    //   1162: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   1165: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1168: if_acmpeq +629 -> 1797
    //   1171: getstatic 1468	com/google/youngandroid/runtime:$Stthis$Mnform$St	Ljava/lang/Object;
    //   1174: checkcast 1470	com/google/appinventor/components/runtime/HandlesEventDispatching
    //   1177: ldc_w 572
    //   1180: ldc_w 348
    //   1183: invokestatic 1203	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   1186: aload_0
    //   1187: aconst_null
    //   1188: putfield 1513	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Clock1	Lcom/google/appinventor/components/runtime/Clock;
    //   1191: getstatic 1458	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   1194: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1197: if_acmpeq +613 -> 1810
    //   1200: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1203: getstatic 346	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit142	Lgnu/lists/FString;
    //   1206: getstatic 452	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit121	Lgnu/mapping/SimpleSymbol;
    //   1209: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1212: invokestatic 1475	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1215: aload_2
    //   1216: invokestatic 1462	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   1219: invokestatic 1516	com/google/youngandroid/runtime:initRuntime	()V
    //   1222: return
    //   1223: aload_1
    //   1224: invokevirtual 1208	java/lang/Object:toString	()Ljava/lang/String;
    //   1227: astore_1
    //   1228: goto -1156 -> 72
    //   1231: aload_0
    //   1232: getstatic 809	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit3	Lgnu/mapping/SimpleSymbol;
    //   1235: getstatic 889	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn3	Lgnu/expr/ModuleMethod;
    //   1238: invokevirtual 1167	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1241: goto -1082 -> 159
    //   1244: aload_0
    //   1245: getstatic 789	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit10	Lgnu/mapping/SimpleSymbol;
    //   1248: getstatic 891	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn5	Lgnu/expr/ModuleMethod;
    //   1251: invokevirtual 1167	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1254: goto -1073 -> 181
    //   1257: aload_0
    //   1258: getstatic 785	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit11	Lgnu/mapping/SimpleSymbol;
    //   1261: getstatic 893	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn6	Lgnu/expr/ModuleMethod;
    //   1264: invokevirtual 1167	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1267: goto -1064 -> 203
    //   1270: aload_0
    //   1271: new 1518	kawa/lang/Promise
    //   1274: dup
    //   1275: getstatic 895	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn7	Lgnu/expr/ModuleMethod;
    //   1278: invokespecial 1521	kawa/lang/Promise:<init>	(Lgnu/mapping/Procedure;)V
    //   1281: invokevirtual 1523	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToFormDoAfterCreation	(Ljava/lang/Object;)V
    //   1284: goto -989 -> 295
    //   1287: aload_0
    //   1288: getstatic 755	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit21	Lgnu/mapping/SimpleSymbol;
    //   1291: aload_0
    //   1292: getfield 897	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Screen3$BackPressed	Lgnu/expr/ModuleMethod;
    //   1295: invokevirtual 1162	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   1298: goto -983 -> 315
    //   1301: aload_0
    //   1302: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1305: getstatic 752	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit22	Lgnu/mapping/SimpleSymbol;
    //   1308: invokevirtual 1525	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1311: goto -972 -> 339
    //   1314: aload_0
    //   1315: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1318: getstatic 715	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit33	Lgnu/lists/FString;
    //   1321: getstatic 746	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit24	Lgnu/mapping/SimpleSymbol;
    //   1324: getstatic 901	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn9	Lgnu/expr/ModuleMethod;
    //   1327: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1330: goto -958 -> 372
    //   1333: aload_0
    //   1334: getstatic 746	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit24	Lgnu/mapping/SimpleSymbol;
    //   1337: getstatic 708	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit36	Lgnu/lists/FString;
    //   1340: getstatic 711	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit35	Lgnu/mapping/SimpleSymbol;
    //   1343: getstatic 905	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn11	Lgnu/expr/ModuleMethod;
    //   1346: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1349: goto -944 -> 405
    //   1352: aload_0
    //   1353: getstatic 711	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit35	Lgnu/mapping/SimpleSymbol;
    //   1356: getstatic 681	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit45	Lgnu/lists/FString;
    //   1359: getstatic 704	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit38	Lgnu/mapping/SimpleSymbol;
    //   1362: getstatic 909	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn13	Lgnu/expr/ModuleMethod;
    //   1365: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1368: goto -930 -> 438
    //   1371: aload_0
    //   1372: getstatic 711	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit35	Lgnu/mapping/SimpleSymbol;
    //   1375: getstatic 672	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit49	Lgnu/lists/FString;
    //   1378: getstatic 677	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit47	Lgnu/mapping/SimpleSymbol;
    //   1381: getstatic 913	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn15	Lgnu/expr/ModuleMethod;
    //   1384: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1387: goto -916 -> 471
    //   1390: aload_0
    //   1391: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1394: getstatic 661	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit54	Lgnu/lists/FString;
    //   1397: getstatic 668	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit51	Lgnu/mapping/SimpleSymbol;
    //   1400: getstatic 917	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn17	Lgnu/expr/ModuleMethod;
    //   1403: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1406: goto -902 -> 504
    //   1409: aload_0
    //   1410: getstatic 668	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit51	Lgnu/mapping/SimpleSymbol;
    //   1413: getstatic 654	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit57	Lgnu/lists/FString;
    //   1416: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   1419: getstatic 921	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn19	Lgnu/expr/ModuleMethod;
    //   1422: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1425: goto -888 -> 537
    //   1428: aload_0
    //   1429: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   1432: getstatic 645	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit61	Lgnu/lists/FString;
    //   1435: getstatic 650	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit59	Lgnu/mapping/SimpleSymbol;
    //   1438: getstatic 925	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn21	Lgnu/expr/ModuleMethod;
    //   1441: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1444: goto -874 -> 570
    //   1447: aload_0
    //   1448: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   1451: getstatic 638	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit64	Lgnu/lists/FString;
    //   1454: getstatic 641	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit63	Lgnu/mapping/SimpleSymbol;
    //   1457: getstatic 929	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn23	Lgnu/expr/ModuleMethod;
    //   1460: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1463: goto -860 -> 603
    //   1466: aload_0
    //   1467: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   1470: getstatic 631	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit67	Lgnu/lists/FString;
    //   1473: getstatic 634	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit66	Lgnu/mapping/SimpleSymbol;
    //   1476: getstatic 933	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn25	Lgnu/expr/ModuleMethod;
    //   1479: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1482: goto -846 -> 636
    //   1485: aload_0
    //   1486: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   1489: getstatic 622	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit71	Lgnu/lists/FString;
    //   1492: getstatic 627	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit69	Lgnu/mapping/SimpleSymbol;
    //   1495: getstatic 937	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn27	Lgnu/expr/ModuleMethod;
    //   1498: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1501: goto -832 -> 669
    //   1504: aload_0
    //   1505: getstatic 657	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit56	Lgnu/mapping/SimpleSymbol;
    //   1508: getstatic 606	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit75	Lgnu/lists/FString;
    //   1511: getstatic 616	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit73	Lgnu/mapping/SimpleSymbol;
    //   1514: getstatic 941	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn29	Lgnu/expr/ModuleMethod;
    //   1517: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1520: goto -818 -> 702
    //   1523: aload_0
    //   1524: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1527: getstatic 597	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit78	Lgnu/lists/FString;
    //   1530: getstatic 600	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit77	Lgnu/mapping/SimpleSymbol;
    //   1533: getstatic 945	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn31	Lgnu/expr/ModuleMethod;
    //   1536: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1539: goto -804 -> 735
    //   1542: aload_0
    //   1543: getstatic 600	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit77	Lgnu/mapping/SimpleSymbol;
    //   1546: getstatic 586	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit82	Lgnu/lists/FString;
    //   1549: getstatic 591	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit80	Lgnu/mapping/SimpleSymbol;
    //   1552: getstatic 949	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn33	Lgnu/expr/ModuleMethod;
    //   1555: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1558: goto -790 -> 768
    //   1561: aload_0
    //   1562: getstatic 558	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit89	Lgnu/mapping/SimpleSymbol;
    //   1565: aload_0
    //   1566: getfield 951	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Button3$Click	Lgnu/expr/ModuleMethod;
    //   1569: invokevirtual 1162	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   1572: goto -784 -> 788
    //   1575: aload_0
    //   1576: getstatic 591	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit80	Lgnu/mapping/SimpleSymbol;
    //   1579: getstatic 555	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit90	Lgnu/mapping/SimpleSymbol;
    //   1582: invokevirtual 1525	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1585: goto -773 -> 812
    //   1588: aload_0
    //   1589: getstatic 600	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit77	Lgnu/mapping/SimpleSymbol;
    //   1592: getstatic 544	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit94	Lgnu/lists/FString;
    //   1595: getstatic 549	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit92	Lgnu/mapping/SimpleSymbol;
    //   1598: getstatic 955	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn35	Lgnu/expr/ModuleMethod;
    //   1601: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1604: goto -759 -> 845
    //   1607: aload_0
    //   1608: getstatic 527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit99	Lgnu/mapping/SimpleSymbol;
    //   1611: aload_0
    //   1612: getfield 957	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Button2$Click	Lgnu/expr/ModuleMethod;
    //   1615: invokevirtual 1162	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   1618: goto -753 -> 865
    //   1621: aload_0
    //   1622: getstatic 549	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit92	Lgnu/mapping/SimpleSymbol;
    //   1625: getstatic 555	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit90	Lgnu/mapping/SimpleSymbol;
    //   1628: invokevirtual 1525	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1631: goto -742 -> 889
    //   1634: aload_0
    //   1635: getstatic 600	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit77	Lgnu/mapping/SimpleSymbol;
    //   1638: getstatic 512	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit103	Lgnu/lists/FString;
    //   1641: getstatic 522	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit101	Lgnu/mapping/SimpleSymbol;
    //   1644: getstatic 961	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:lambda$Fn37	Lgnu/expr/ModuleMethod;
    //   1647: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1650: goto -728 -> 922
    //   1653: aload_0
    //   1654: getstatic 501	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit106	Lgnu/mapping/SimpleSymbol;
    //   1657: aload_0
    //   1658: getfield 963	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Button1$Click	Lgnu/expr/ModuleMethod;
    //   1661: invokevirtual 1162	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   1664: goto -722 -> 942
    //   1667: aload_0
    //   1668: getstatic 522	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit101	Lgnu/mapping/SimpleSymbol;
    //   1671: getstatic 555	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit90	Lgnu/mapping/SimpleSymbol;
    //   1674: invokevirtual 1525	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1677: goto -711 -> 966
    //   1680: aload_0
    //   1681: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1684: getstatic 493	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit109	Lgnu/lists/FString;
    //   1687: getstatic 496	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit108	Lgnu/mapping/SimpleSymbol;
    //   1690: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1693: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1696: goto -697 -> 999
    //   1699: aload_0
    //   1700: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1703: getstatic 487	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit111	Lgnu/lists/FString;
    //   1706: getstatic 542	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit95	Lgnu/mapping/SimpleSymbol;
    //   1709: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1712: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1715: goto -683 -> 1032
    //   1718: aload_0
    //   1719: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1722: getstatic 481	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit113	Lgnu/lists/FString;
    //   1725: getstatic 584	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit83	Lgnu/mapping/SimpleSymbol;
    //   1728: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1731: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1734: goto -669 -> 1065
    //   1737: aload_0
    //   1738: getstatic 477	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit114	Lgnu/mapping/SimpleSymbol;
    //   1741: aload_0
    //   1742: getfield 965	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:File1$GotText	Lgnu/expr/ModuleMethod;
    //   1745: invokevirtual 1162	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   1748: goto -663 -> 1085
    //   1751: aload_0
    //   1752: getstatic 584	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit83	Lgnu/mapping/SimpleSymbol;
    //   1755: getstatic 474	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit115	Lgnu/mapping/SimpleSymbol;
    //   1758: invokevirtual 1525	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1761: goto -652 -> 1109
    //   1764: aload_0
    //   1765: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1768: getstatic 468	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit117	Lgnu/lists/FString;
    //   1771: getstatic 574	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit86	Lgnu/mapping/SimpleSymbol;
    //   1774: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1777: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1780: goto -638 -> 1142
    //   1783: aload_0
    //   1784: getstatic 353	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit140	Lgnu/mapping/SimpleSymbol;
    //   1787: aload_0
    //   1788: getfield 967	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Notifier1$AfterTextInput	Lgnu/expr/ModuleMethod;
    //   1791: invokevirtual 1162	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   1794: goto -632 -> 1162
    //   1797: aload_0
    //   1798: getstatic 574	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit86	Lgnu/mapping/SimpleSymbol;
    //   1801: getstatic 350	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit141	Lgnu/mapping/SimpleSymbol;
    //   1804: invokevirtual 1525	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1807: goto -621 -> 1186
    //   1810: aload_0
    //   1811: getstatic 820	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1814: getstatic 344	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit143	Lgnu/lists/FString;
    //   1817: getstatic 452	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:Lit121	Lgnu/mapping/SimpleSymbol;
    //   1820: getstatic 1096	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1823: invokevirtual 1527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1826: goto -607 -> 1219
    //   1829: astore_2
    //   1830: new 1048	gnu/mapping/WrongType
    //   1833: dup
    //   1834: aload_2
    //   1835: ldc_w 1529
    //   1838: iconst_1
    //   1839: aload_1
    //   1840: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   1843: athrow
    //   1844: astore_2
    //   1845: new 1048	gnu/mapping/WrongType
    //   1848: dup
    //   1849: aload_2
    //   1850: ldc_w 1529
    //   1853: iconst_1
    //   1854: aload_1
    //   1855: invokespecial 1053	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   1858: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1859	0	this	Screen3
    //   0	1859	1	paramCallContext	CallContext
    //   4	1212	2	localConsumer	Consumer
    //   1829	6	2	localClassCastException1	ClassCastException
    //   1844	6	2	localClassCastException2	ClassCastException
    //   16	116	3	localRunnable	Runnable
    // Exception table:
    //   from	to	target	type
    //   12	17	1829	java/lang/ClassCastException
    //   126	131	1844	java/lang/ClassCastException
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


/* Location:              /home/nelmntrx/Desktop/SYNCCrowdTracker/dex2jar-2.0/classes-dex2jar.jar!/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */