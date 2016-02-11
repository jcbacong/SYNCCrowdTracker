package appinventor.ai_jbacong.SYNCCrowdTracker_copy;

import com.google.appinventor.components.runtime.AccelerometerSensor;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.File;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.LocationSensor;
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
import kawa.standard.Scheme;

public class Screen2
  extends Form
  implements Runnable
{
  static final SimpleSymbol Lit0 = (SimpleSymbol)new SimpleSymbol("Screen2").readResolve();
  static final SimpleSymbol Lit1;
  static final PairWithPosition Lit10;
  static final SimpleSymbol Lit100;
  static final SimpleSymbol Lit101;
  static final SimpleSymbol Lit102;
  static final PairWithPosition Lit103;
  static final PairWithPosition Lit104;
  static final PairWithPosition Lit105;
  static final PairWithPosition Lit106;
  static final SimpleSymbol Lit107;
  static final SimpleSymbol Lit108;
  static final FString Lit109;
  static final SimpleSymbol Lit11;
  static final FString Lit110;
  static final FString Lit111;
  static final FString Lit112;
  static final FString Lit113;
  static final SimpleSymbol Lit114;
  static final FString Lit115;
  static final SimpleSymbol Lit116;
  static final SimpleSymbol Lit117;
  static final SimpleSymbol Lit118;
  static final SimpleSymbol Lit119;
  static final IntNum Lit12;
  static final SimpleSymbol Lit120;
  static final SimpleSymbol Lit121;
  static final SimpleSymbol Lit122;
  static final SimpleSymbol Lit123;
  static final SimpleSymbol Lit124;
  static final SimpleSymbol Lit125;
  static final SimpleSymbol Lit126;
  static final SimpleSymbol Lit127;
  static final SimpleSymbol Lit128;
  static final SimpleSymbol Lit129 = (SimpleSymbol)new SimpleSymbol("list").readResolve();
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
  static final SimpleSymbol Lit23;
  static final SimpleSymbol Lit24;
  static final SimpleSymbol Lit25;
  static final IntNum Lit26;
  static final SimpleSymbol Lit27;
  static final SimpleSymbol Lit28;
  static final PairWithPosition Lit29;
  static final SimpleSymbol Lit3;
  static final PairWithPosition Lit30;
  static final PairWithPosition Lit31;
  static final PairWithPosition Lit32;
  static final SimpleSymbol Lit33;
  static final SimpleSymbol Lit34;
  static final FString Lit35;
  static final SimpleSymbol Lit36;
  static final SimpleSymbol Lit37;
  static final IntNum Lit38;
  static final SimpleSymbol Lit39;
  static final SimpleSymbol Lit4;
  static final IntNum Lit40;
  static final SimpleSymbol Lit41;
  static final IntNum Lit42;
  static final SimpleSymbol Lit43;
  static final IntNum Lit44;
  static final FString Lit45;
  static final FString Lit46;
  static final SimpleSymbol Lit47;
  static final FString Lit48;
  static final FString Lit49;
  static final PairWithPosition Lit5;
  static final SimpleSymbol Lit50;
  static final SimpleSymbol Lit51;
  static final SimpleSymbol Lit52;
  static final DFloNum Lit53;
  static final SimpleSymbol Lit54;
  static final SimpleSymbol Lit55;
  static final IntNum Lit56;
  static final FString Lit57;
  static final FString Lit58;
  static final SimpleSymbol Lit59;
  static final PairWithPosition Lit6;
  static final DFloNum Lit60;
  static final FString Lit61;
  static final FString Lit62;
  static final SimpleSymbol Lit63;
  static final IntNum Lit64;
  static final IntNum Lit65;
  static final FString Lit66;
  static final FString Lit67;
  static final SimpleSymbol Lit68;
  static final FString Lit69;
  static final PairWithPosition Lit7;
  static final FString Lit70;
  static final SimpleSymbol Lit71;
  static final DFloNum Lit72;
  static final FString Lit73;
  static final FString Lit74;
  static final SimpleSymbol Lit75;
  static final DFloNum Lit76;
  static final IntNum Lit77;
  static final FString Lit78;
  static final FString Lit79;
  static final PairWithPosition Lit8;
  static final SimpleSymbol Lit80;
  static final IntNum Lit81;
  static final FString Lit82;
  static final FString Lit83;
  static final SimpleSymbol Lit84;
  static final DFloNum Lit85;
  static final FString Lit86;
  static final SimpleSymbol Lit87;
  static final SimpleSymbol Lit88;
  static final FString Lit89;
  static final PairWithPosition Lit9;
  static final SimpleSymbol Lit90;
  static final IntNum Lit91;
  static final FString Lit92;
  static final FString Lit93;
  static final FString Lit94;
  static final SimpleSymbol Lit95;
  static final SimpleSymbol Lit96;
  static final PairWithPosition Lit97;
  static final SimpleSymbol Lit98;
  static final SimpleSymbol Lit99;
  public static Screen2 Screen2;
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
  public AccelerometerSensor AccelerometerSensor1;
  public Button Button1;
  public final ModuleMethod Button1$Click;
  public Clock Clock1;
  public final ModuleMethod Clock1$Timer;
  public File File1;
  public HorizontalArrangement HorizontalArrangement1;
  public HorizontalArrangement HorizontalArrangement2;
  public HorizontalArrangement HorizontalArrangement3;
  public Label Label1;
  public Label Label2;
  public Label Label3;
  public Label Label4;
  public LocationSensor LocationSensor1;
  public final ModuleMethod Screen2$Initialize;
  public TinyDB TinyDB1;
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
    Lit128 = (SimpleSymbol)new SimpleSymbol("any").readResolve();
    Lit127 = (SimpleSymbol)new SimpleSymbol("lookup-handler").readResolve();
    Lit126 = (SimpleSymbol)new SimpleSymbol("dispatchEvent").readResolve();
    Lit125 = (SimpleSymbol)new SimpleSymbol("send-error").readResolve();
    Lit124 = (SimpleSymbol)new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    Lit123 = (SimpleSymbol)new SimpleSymbol("add-to-global-vars").readResolve();
    Lit122 = (SimpleSymbol)new SimpleSymbol("add-to-components").readResolve();
    Lit121 = (SimpleSymbol)new SimpleSymbol("add-to-events").readResolve();
    Lit120 = (SimpleSymbol)new SimpleSymbol("add-to-global-var-environment").readResolve();
    Lit119 = (SimpleSymbol)new SimpleSymbol("is-bound-in-form-environment").readResolve();
    Lit118 = (SimpleSymbol)new SimpleSymbol("lookup-in-form-environment").readResolve();
    Lit117 = (SimpleSymbol)new SimpleSymbol("add-to-form-environment").readResolve();
    Lit116 = (SimpleSymbol)new SimpleSymbol("android-log-form").readResolve();
    Lit115 = new FString("com.google.appinventor.components.runtime.TinyDB");
    Lit114 = (SimpleSymbol)new SimpleSymbol("TinyDB1").readResolve();
    Lit113 = new FString("com.google.appinventor.components.runtime.TinyDB");
    Lit112 = new FString("com.google.appinventor.components.runtime.File");
    Lit111 = new FString("com.google.appinventor.components.runtime.File");
    Lit110 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    Lit109 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    Lit108 = (SimpleSymbol)new SimpleSymbol("Timer").readResolve();
    Lit107 = (SimpleSymbol)new SimpleSymbol("Clock1$Timer").readResolve();
    Object localObject = (SimpleSymbol)new SimpleSymbol("text").readResolve();
    Lit15 = (SimpleSymbol)localObject;
    Lit106 = PairWithPosition.make(localObject, PairWithPosition.make(Lit15, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 615172), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 615166);
    Lit105 = PairWithPosition.make(Lit129, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 615116);
    Lit104 = PairWithPosition.make(Lit128, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 615091);
    Lit103 = PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 615067), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 615063), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 615059), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 615055), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 615051), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 615046);
    Lit102 = (SimpleSymbol)new SimpleSymbol("ZAccel").readResolve();
    Lit101 = (SimpleSymbol)new SimpleSymbol("YAccel").readResolve();
    Lit100 = (SimpleSymbol)new SimpleSymbol("XAccel").readResolve();
    Lit99 = (SimpleSymbol)new SimpleSymbol("Longitude").readResolve();
    Lit98 = (SimpleSymbol)new SimpleSymbol("Latitude").readResolve();
    Lit97 = PairWithPosition.make((SimpleSymbol)new SimpleSymbol("InstantInTime").readResolve(), PairWithPosition.make(Lit15, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 614816), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 614801);
    Lit96 = (SimpleSymbol)new SimpleSymbol("Now").readResolve();
    Lit95 = (SimpleSymbol)new SimpleSymbol("FormatDateTime").readResolve();
    Lit94 = new FString("com.google.appinventor.components.runtime.Clock");
    Lit93 = new FString("com.google.appinventor.components.runtime.Clock");
    Lit92 = new FString("com.google.appinventor.components.runtime.AccelerometerSensor");
    Lit91 = IntNum.make(0);
    Lit90 = (SimpleSymbol)new SimpleSymbol("MinimumInterval").readResolve();
    Lit89 = new FString("com.google.appinventor.components.runtime.AccelerometerSensor");
    Lit88 = (SimpleSymbol)new SimpleSymbol("Click").readResolve();
    Lit87 = (SimpleSymbol)new SimpleSymbol("Button1$Click").readResolve();
    Lit86 = new FString("com.google.appinventor.components.runtime.Button");
    Lit85 = DFloNum.make(50);
    Lit84 = (SimpleSymbol)new SimpleSymbol("Button1").readResolve();
    Lit83 = new FString("com.google.appinventor.components.runtime.Button");
    Lit82 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit81 = IntNum.make(64456);
    Lit80 = (SimpleSymbol)new SimpleSymbol("HorizontalArrangement3").readResolve();
    Lit79 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit78 = new FString("com.google.appinventor.components.runtime.Label");
    Lit77 = IntNum.make(64451);
    Lit76 = DFloNum.make(13);
    Lit75 = (SimpleSymbol)new SimpleSymbol("Label4").readResolve();
    Lit74 = new FString("com.google.appinventor.components.runtime.Label");
    Lit73 = new FString("com.google.appinventor.components.runtime.Label");
    Lit72 = DFloNum.make(17);
    Lit71 = (SimpleSymbol)new SimpleSymbol("Label3").readResolve();
    Lit70 = new FString("com.google.appinventor.components.runtime.Label");
    Lit69 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit68 = (SimpleSymbol)new SimpleSymbol("VerticalArrangement2").readResolve();
    Lit67 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit66 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit65 = IntNum.make(64446);
    Lit64 = IntNum.make(64506);
    Lit63 = (SimpleSymbol)new SimpleSymbol("HorizontalArrangement2").readResolve();
    Lit62 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit61 = new FString("com.google.appinventor.components.runtime.Label");
    Lit60 = DFloNum.make(10);
    Lit59 = (SimpleSymbol)new SimpleSymbol("Label2").readResolve();
    Lit58 = new FString("com.google.appinventor.components.runtime.Label");
    Lit57 = new FString("com.google.appinventor.components.runtime.Label");
    Lit56 = IntNum.make(1);
    Lit55 = (SimpleSymbol)new SimpleSymbol("TextAlignment").readResolve();
    Lit54 = (SimpleSymbol)new SimpleSymbol("Text").readResolve();
    Lit53 = DFloNum.make(25);
    Lit52 = (SimpleSymbol)new SimpleSymbol("FontSize").readResolve();
    Lit51 = (SimpleSymbol)new SimpleSymbol("FontBold").readResolve();
    Lit50 = (SimpleSymbol)new SimpleSymbol("Label1").readResolve();
    Lit49 = new FString("com.google.appinventor.components.runtime.Label");
    Lit48 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit47 = (SimpleSymbol)new SimpleSymbol("VerticalArrangement1").readResolve();
    Lit46 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit45 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit44 = IntNum.make(64436);
    Lit43 = (SimpleSymbol)new SimpleSymbol("Width").readResolve();
    Lit42 = IntNum.make(64516);
    Lit41 = (SimpleSymbol)new SimpleSymbol("Height").readResolve();
    localObject = new int[2];
    localObject[0] = -3355444;
    Lit40 = IntNum.make((int[])localObject);
    Lit39 = (SimpleSymbol)new SimpleSymbol("BackgroundColor").readResolve();
    Lit38 = IntNum.make(2);
    Lit37 = (SimpleSymbol)new SimpleSymbol("AlignVertical").readResolve();
    Lit36 = (SimpleSymbol)new SimpleSymbol("HorizontalArrangement1").readResolve();
    Lit35 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit34 = (SimpleSymbol)new SimpleSymbol("Initialize").readResolve();
    Lit33 = (SimpleSymbol)new SimpleSymbol("Screen2$Initialize").readResolve();
    Lit32 = PairWithPosition.make(Lit15, PairWithPosition.make(Lit15, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 82671), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 82665);
    Lit31 = PairWithPosition.make(Lit129, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 82615);
    Lit30 = PairWithPosition.make(Lit128, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 82590);
    Lit29 = PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 82566), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 82562), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 82558), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 82554), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 82550), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 82545);
    Lit28 = (SimpleSymbol)new SimpleSymbol("AppendToFile").readResolve();
    Lit27 = (SimpleSymbol)new SimpleSymbol("File1").readResolve();
    Lit26 = IntNum.make(1000);
    Lit25 = (SimpleSymbol)new SimpleSymbol("TimeInterval").readResolve();
    Lit24 = (SimpleSymbol)new SimpleSymbol("LocationSensor1").readResolve();
    Lit23 = (SimpleSymbol)new SimpleSymbol("TimerEnabled").readResolve();
    Lit22 = (SimpleSymbol)new SimpleSymbol("Clock1").readResolve();
    Lit21 = (SimpleSymbol)new SimpleSymbol("Enabled").readResolve();
    Lit20 = (SimpleSymbol)new SimpleSymbol("AccelerometerSensor1").readResolve();
    Lit19 = (SimpleSymbol)new SimpleSymbol("TitleVisible").readResolve();
    Lit18 = (SimpleSymbol)new SimpleSymbol("Title").readResolve();
    Lit17 = (SimpleSymbol)new SimpleSymbol("boolean").readResolve();
    Lit16 = (SimpleSymbol)new SimpleSymbol("Scrollable").readResolve();
    Lit14 = (SimpleSymbol)new SimpleSymbol("AppName").readResolve();
    Lit13 = (SimpleSymbol)new SimpleSymbol("number").readResolve();
    Lit12 = IntNum.make(3);
    Lit11 = (SimpleSymbol)new SimpleSymbol("AlignHorizontal").readResolve();
    Lit10 = PairWithPosition.make(Lit15, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 37171);
    Lit9 = PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 37065), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 37060);
    Lit8 = PairWithPosition.make(Lit15, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 37030);
    Lit7 = PairWithPosition.make(Lit15, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 37171);
    Lit6 = PairWithPosition.make(Lit128, PairWithPosition.make(Lit128, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 37065), "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 37060);
    Lit5 = PairWithPosition.make(Lit15, LList.Empty, "/tmp/1454469614516_0.5651732735461203-0/youngandroidproject/../src/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.yail", 37030);
    Lit4 = (SimpleSymbol)new SimpleSymbol("p$toScreen").readResolve();
    Lit3 = (SimpleSymbol)new SimpleSymbol("g$screenname").readResolve();
    Lit2 = (SimpleSymbol)new SimpleSymbol("*the-null-value*").readResolve();
    Lit1 = (SimpleSymbol)new SimpleSymbol("getMessage").readResolve();
  }
  
  public Screen2()
  {
    ModuleInfo.register(this);
    Screen2.frame localframe = new Screen2.frame();
    localframe.$main = this;
    this.android$Mnlog$Mnform = new ModuleMethod(localframe, 1, Lit116, 4097);
    this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(localframe, 2, Lit117, 8194);
    this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 3, Lit118, 8193);
    this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 5, Lit119, 4097);
    this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(localframe, 6, Lit120, 8194);
    this.add$Mnto$Mnevents = new ModuleMethod(localframe, 7, Lit121, 8194);
    this.add$Mnto$Mncomponents = new ModuleMethod(localframe, 8, Lit122, 16388);
    this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(localframe, 9, Lit123, 8194);
    this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(localframe, 10, Lit124, 4097);
    this.send$Mnerror = new ModuleMethod(localframe, 11, Lit125, 4097);
    this.process$Mnexception = new ModuleMethod(localframe, 12, "process-exception", 4097);
    this.dispatchEvent = new ModuleMethod(localframe, 13, Lit126, 16388);
    this.lookup$Mnhandler = new ModuleMethod(localframe, 14, Lit127, 8194);
    ModuleMethod localModuleMethod = new ModuleMethod(localframe, 15, null, 0);
    localModuleMethod.setProperty("source-location", "/tmp/runtime8900109651564447184.scm:542");
    lambda$Fn1 = localModuleMethod;
    this.$define = new ModuleMethod(localframe, 16, "$define", 0);
    lambda$Fn2 = new ModuleMethod(localframe, 17, null, 0);
    lambda$Fn3 = new ModuleMethod(localframe, 18, null, 4097);
    lambda$Fn5 = new ModuleMethod(localframe, 19, null, 4097);
    lambda$Fn4 = new ModuleMethod(localframe, 20, null, 0);
    lambda$Fn6 = new ModuleMethod(localframe, 21, null, 0);
    this.Screen2$Initialize = new ModuleMethod(localframe, 22, Lit33, 0);
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
    this.Button1$Click = new ModuleMethod(localframe, 43, Lit87, 0);
    lambda$Fn27 = new ModuleMethod(localframe, 44, null, 0);
    lambda$Fn28 = new ModuleMethod(localframe, 45, null, 0);
    this.Clock1$Timer = new ModuleMethod(localframe, 46, Lit107, 0);
    lambda$Fn29 = new ModuleMethod(localframe, 47, null, 0);
    lambda$Fn30 = new ModuleMethod(localframe, 48, null, 0);
  }
  
  static Object lambda10()
  {
    return runtime.setAndCoerceProperty$Ex(Lit47, Lit11, Lit12, Lit13);
  }
  
  static Object lambda11()
  {
    return runtime.setAndCoerceProperty$Ex(Lit47, Lit11, Lit12, Lit13);
  }
  
  static Object lambda12()
  {
    runtime.setAndCoerceProperty$Ex(Lit50, Lit51, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit50, Lit52, Lit53, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit50, Lit54, "CROWD TRACKING", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit50, Lit55, Lit56, Lit13);
  }
  
  static Object lambda13()
  {
    runtime.setAndCoerceProperty$Ex(Lit50, Lit51, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit50, Lit52, Lit53, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit50, Lit54, "CROWD TRACKING", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit50, Lit55, Lit56, Lit13);
  }
  
  static Object lambda14()
  {
    runtime.setAndCoerceProperty$Ex(Lit59, Lit51, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit59, Lit52, Lit60, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit59, Lit54, "A Project of the Sync.Bio.Optics Research Group", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit59, Lit55, Lit56, Lit13);
  }
  
  static Object lambda15()
  {
    runtime.setAndCoerceProperty$Ex(Lit59, Lit51, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit59, Lit52, Lit60, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit59, Lit54, "A Project of the Sync.Bio.Optics Research Group", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit59, Lit55, Lit56, Lit13);
  }
  
  static Object lambda16()
  {
    runtime.setAndCoerceProperty$Ex(Lit63, Lit11, Lit12, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit63, Lit37, Lit38, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit63, Lit41, Lit64, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit63, Lit43, Lit65, Lit13);
  }
  
  static Object lambda17()
  {
    runtime.setAndCoerceProperty$Ex(Lit63, Lit11, Lit12, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit63, Lit37, Lit38, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit63, Lit41, Lit64, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit63, Lit43, Lit65, Lit13);
  }
  
  static Object lambda18()
  {
    runtime.setAndCoerceProperty$Ex(Lit68, Lit11, Lit12, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit68, Lit37, Lit12, Lit13);
  }
  
  static Object lambda19()
  {
    runtime.setAndCoerceProperty$Ex(Lit68, Lit11, Lit12, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit68, Lit37, Lit12, Lit13);
  }
  
  /* Error */
  public static SimpleSymbol lambda1symbolAppend$V(Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: invokestatic 851	gnu/lists/LList:makeList	([Ljava/lang/Object;I)Lgnu/lists/LList;
    //   5: astore_1
    //   6: getstatic 857	kawa/standard/Scheme:apply	Lgnu/kawa/functions/Apply;
    //   9: astore_2
    //   10: getstatic 862	kawa/lib/strings:string$Mnappend	Lgnu/expr/ModuleMethod;
    //   13: astore_3
    //   14: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   17: astore_0
    //   18: aload_1
    //   19: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   22: if_acmpne +23 -> 45
    //   25: aload_2
    //   26: aload_3
    //   27: aload_0
    //   28: invokestatic 866	gnu/lists/LList:reverseInPlace	(Ljava/lang/Object;)Lgnu/lists/LList;
    //   31: invokevirtual 872	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   34: astore_0
    //   35: aload_0
    //   36: checkcast 874	java/lang/CharSequence
    //   39: astore_1
    //   40: aload_1
    //   41: invokestatic 880	kawa/lib/misc:string$To$Symbol	(Ljava/lang/CharSequence;)Lgnu/mapping/SimpleSymbol;
    //   44: areturn
    //   45: aload_1
    //   46: checkcast 882	gnu/lists/Pair
    //   49: astore 4
    //   51: aload 4
    //   53: invokevirtual 885	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   56: astore_1
    //   57: aload 4
    //   59: invokevirtual 888	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   62: astore 4
    //   64: aload 4
    //   66: checkcast 890	gnu/mapping/Symbol
    //   69: astore 5
    //   71: aload 5
    //   73: invokestatic 894	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   76: aload_0
    //   77: invokestatic 897	gnu/lists/Pair:make	(Ljava/lang/Object;Ljava/lang/Object;)Lgnu/lists/Pair;
    //   80: astore_0
    //   81: goto -63 -> 18
    //   84: astore_0
    //   85: new 899	gnu/mapping/WrongType
    //   88: dup
    //   89: aload_0
    //   90: ldc_w 901
    //   93: bipush -2
    //   95: aload_1
    //   96: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   99: athrow
    //   100: astore_0
    //   101: new 899	gnu/mapping/WrongType
    //   104: dup
    //   105: aload_0
    //   106: ldc_w 906
    //   109: iconst_1
    //   110: aload 4
    //   112: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   115: athrow
    //   116: astore_1
    //   117: new 899	gnu/mapping/WrongType
    //   120: dup
    //   121: aload_1
    //   122: ldc_w 908
    //   125: iconst_1
    //   126: aload_0
    //   127: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
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
    runtime.setAndCoerceProperty$Ex(Lit71, Lit51, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit71, Lit52, Lit72, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit71, Lit54, "We're recovering your location now.", Lit15);
  }
  
  static Object lambda21()
  {
    runtime.setAndCoerceProperty$Ex(Lit71, Lit51, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit71, Lit52, Lit72, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit71, Lit54, "We're recovering your location now.", Lit15);
  }
  
  static Object lambda22()
  {
    runtime.setAndCoerceProperty$Ex(Lit75, Lit52, Lit76, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit75, Lit43, Lit77, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit75, Lit54, "If you find this creepy and uncomfortable, you can stop the GPS tracking at this instant.", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit75, Lit55, Lit56, Lit13);
  }
  
  static Object lambda23()
  {
    runtime.setAndCoerceProperty$Ex(Lit75, Lit52, Lit76, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit75, Lit43, Lit77, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit75, Lit54, "If you find this creepy and uncomfortable, you can stop the GPS tracking at this instant.", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit75, Lit55, Lit56, Lit13);
  }
  
  static Object lambda24()
  {
    runtime.setAndCoerceProperty$Ex(Lit80, Lit11, Lit12, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit80, Lit43, Lit81, Lit13);
  }
  
  static Object lambda25()
  {
    runtime.setAndCoerceProperty$Ex(Lit80, Lit11, Lit12, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit80, Lit43, Lit81, Lit13);
  }
  
  static Object lambda26()
  {
    runtime.setAndCoerceProperty$Ex(Lit84, Lit51, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit84, Lit52, Lit85, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit84, Lit54, "STOP", Lit15);
  }
  
  static Object lambda27()
  {
    runtime.setAndCoerceProperty$Ex(Lit84, Lit51, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit84, Lit52, Lit85, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit84, Lit54, "STOP", Lit15);
  }
  
  static Object lambda28()
  {
    return runtime.setAndCoerceProperty$Ex(Lit20, Lit90, Lit91, Lit13);
  }
  
  static Object lambda29()
  {
    return runtime.setAndCoerceProperty$Ex(Lit20, Lit90, Lit91, Lit13);
  }
  
  static String lambda3()
  {
    return "";
  }
  
  static Object lambda30()
  {
    return runtime.setAndCoerceProperty$Ex(Lit24, Lit25, Lit91, Lit13);
  }
  
  static Object lambda31()
  {
    return runtime.setAndCoerceProperty$Ex(Lit24, Lit25, Lit91, Lit13);
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
    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "IPLCrowdTracker", Lit15);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "Screen2", Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Boolean.FALSE, Lit17);
  }
  
  static Object lambda8()
  {
    runtime.setAndCoerceProperty$Ex(Lit36, Lit11, Lit12, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit36, Lit37, Lit38, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit36, Lit39, Lit40, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit36, Lit41, Lit42, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit36, Lit43, Lit44, Lit13);
  }
  
  static Object lambda9()
  {
    runtime.setAndCoerceProperty$Ex(Lit36, Lit11, Lit12, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit36, Lit37, Lit38, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit36, Lit39, Lit40, Lit13);
    runtime.setAndCoerceProperty$Ex(Lit36, Lit41, Lit42, Lit13);
    return runtime.setAndCoerceProperty$Ex(Lit36, Lit43, Lit44, Lit13);
  }
  
  /* Error */
  public void $define()
  {
    // Byte code:
    //   0: invokestatic 983	kawa/standard/Scheme:getInstance	()Lkawa/standard/Scheme;
    //   3: invokestatic 989	gnu/expr/Language:setDefaults	(Lgnu/expr/Language;)V
    //   6: aload_0
    //   7: invokevirtual 992	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:run	()V
    //   10: aload_0
    //   11: putstatic 994	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Screen2	Lappinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2;
    //   14: aload_0
    //   15: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   18: aload_0
    //   19: invokevirtual 998	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   22: aload_0
    //   23: getfield 1000	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:events$Mnto$Mnregister	Lgnu/lists/LList;
    //   26: astore_1
    //   27: aload_1
    //   28: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   31: if_acmpne +96 -> 127
    //   34: aload_0
    //   35: getstatic 684	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit2	Lgnu/mapping/SimpleSymbol;
    //   38: getstatic 751	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn1	Lgnu/expr/ModuleMethod;
    //   41: invokevirtual 1003	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield 1005	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:global$Mnvars$Mnto$Mncreate	Lgnu/lists/LList;
    //   48: invokestatic 1011	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   51: astore_1
    //   52: aload_1
    //   53: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   56: if_acmpne +139 -> 195
    //   59: aload_0
    //   60: getfield 1013	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:form$Mndo$Mnafter$Mncreation	Lgnu/lists/LList;
    //   63: invokestatic 1011	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   66: astore_1
    //   67: aload_1
    //   68: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   71: if_acmpne +215 -> 286
    //   74: aload_0
    //   75: getfield 1015	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:components$Mnto$Mncreate	Lgnu/lists/LList;
    //   78: invokestatic 1011	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   81: astore_1
    //   82: aload_1
    //   83: astore_2
    //   84: aload_2
    //   85: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   88: if_acmpne +235 -> 323
    //   91: aload_1
    //   92: astore_2
    //   93: aload_2
    //   94: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   97: if_acmpne +382 -> 479
    //   100: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   103: astore_2
    //   104: aload_1
    //   105: aload_2
    //   106: if_acmpne +438 -> 544
    //   109: return
    //   110: astore_1
    //   111: aload_0
    //   112: aload_1
    //   113: invokevirtual 1017	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   116: invokevirtual 1020	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:androidLogForm	(Ljava/lang/Object;)V
    //   119: aload_0
    //   120: aload_1
    //   121: invokevirtual 1023	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:processException	(Ljava/lang/Object;)V
    //   124: goto -114 -> 10
    //   127: aload_1
    //   128: checkcast 882	gnu/lists/Pair
    //   131: astore_3
    //   132: aload_3
    //   133: invokevirtual 888	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   136: astore_2
    //   137: getstatic 1027	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   140: aload_2
    //   141: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   144: astore_1
    //   145: aload_1
    //   146: ifnonnull +33 -> 179
    //   149: aconst_null
    //   150: astore_1
    //   151: getstatic 1033	kawa/lib/lists:cdr	Lgnu/expr/GenericProc;
    //   154: aload_2
    //   155: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   158: astore_2
    //   159: aload_2
    //   160: ifnonnull +27 -> 187
    //   163: aconst_null
    //   164: astore_2
    //   165: aload_0
    //   166: aload_1
    //   167: aload_2
    //   168: invokestatic 1039	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   171: aload_3
    //   172: invokevirtual 885	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   175: astore_1
    //   176: goto -149 -> 27
    //   179: aload_1
    //   180: invokevirtual 1044	java/lang/Object:toString	()Ljava/lang/String;
    //   183: astore_1
    //   184: goto -33 -> 151
    //   187: aload_2
    //   188: invokevirtual 1044	java/lang/Object:toString	()Ljava/lang/String;
    //   191: astore_2
    //   192: goto -27 -> 165
    //   195: aload_1
    //   196: checkcast 882	gnu/lists/Pair
    //   199: astore_2
    //   200: aload_2
    //   201: invokevirtual 888	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   204: astore_3
    //   205: getstatic 1027	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   208: aload_3
    //   209: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   212: astore_1
    //   213: getstatic 1047	kawa/lib/lists:cadr	Lgnu/expr/GenericProc;
    //   216: aload_3
    //   217: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   220: astore_3
    //   221: aload_1
    //   222: checkcast 890	gnu/mapping/Symbol
    //   225: astore 4
    //   227: aload_0
    //   228: aload 4
    //   230: getstatic 1051	kawa/standard/Scheme:applyToArgs	Lgnu/kawa/functions/ApplyToArgs;
    //   233: aload_3
    //   234: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   237: invokevirtual 1054	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToGlobalVarEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   240: aload_2
    //   241: invokevirtual 885	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   244: astore_1
    //   245: goto -193 -> 52
    //   248: astore_2
    //   249: new 899	gnu/mapping/WrongType
    //   252: dup
    //   253: aload_2
    //   254: ldc_w 901
    //   257: bipush -2
    //   259: aload_1
    //   260: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   263: athrow
    //   264: astore_1
    //   265: aload_0
    //   266: aload_1
    //   267: invokevirtual 1023	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:processException	(Ljava/lang/Object;)V
    //   270: return
    //   271: astore_2
    //   272: new 899	gnu/mapping/WrongType
    //   275: dup
    //   276: aload_2
    //   277: ldc_w 276
    //   280: iconst_0
    //   281: aload_1
    //   282: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   285: athrow
    //   286: aload_1
    //   287: checkcast 882	gnu/lists/Pair
    //   290: astore_2
    //   291: aload_2
    //   292: invokevirtual 888	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   295: invokestatic 1057	kawa/lib/misc:force	(Ljava/lang/Object;)Ljava/lang/Object;
    //   298: pop
    //   299: aload_2
    //   300: invokevirtual 885	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   303: astore_1
    //   304: goto -237 -> 67
    //   307: astore_2
    //   308: new 899	gnu/mapping/WrongType
    //   311: dup
    //   312: aload_2
    //   313: ldc_w 901
    //   316: bipush -2
    //   318: aload_1
    //   319: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   322: athrow
    //   323: aload_2
    //   324: checkcast 882	gnu/lists/Pair
    //   327: astore_3
    //   328: aload_3
    //   329: invokevirtual 888	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   332: astore 5
    //   334: getstatic 1060	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   337: aload 5
    //   339: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   342: astore_2
    //   343: getstatic 1063	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   346: aload 5
    //   348: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   351: pop
    //   352: getstatic 1047	kawa/lib/lists:cadr	Lgnu/expr/GenericProc;
    //   355: aload 5
    //   357: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   360: astore 4
    //   362: getstatic 1027	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   365: aload 5
    //   367: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   370: astore 5
    //   372: aload 5
    //   374: checkcast 890	gnu/mapping/Symbol
    //   377: astore 6
    //   379: aload_0
    //   380: aload 6
    //   382: invokevirtual 1067	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lookupInFormEnvironment	(Lgnu/mapping/Symbol;)Ljava/lang/Object;
    //   385: astore 5
    //   387: getstatic 1072	gnu/kawa/reflect/Invoke:make	Lgnu/kawa/reflect/Invoke;
    //   390: aload 4
    //   392: aload 5
    //   394: invokevirtual 872	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   397: astore 4
    //   399: getstatic 1078	gnu/kawa/reflect/SlotSet:set$Mnfield$Ex	Lgnu/kawa/reflect/SlotSet;
    //   402: aload_0
    //   403: aload_2
    //   404: aload 4
    //   406: invokevirtual 1082	gnu/mapping/Procedure:apply3	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   409: pop
    //   410: aload_2
    //   411: checkcast 890	gnu/mapping/Symbol
    //   414: astore 5
    //   416: aload_0
    //   417: aload 5
    //   419: aload 4
    //   421: invokevirtual 998	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   424: aload_3
    //   425: invokevirtual 885	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   428: astore_2
    //   429: goto -345 -> 84
    //   432: astore_1
    //   433: new 899	gnu/mapping/WrongType
    //   436: dup
    //   437: aload_1
    //   438: ldc_w 901
    //   441: bipush -2
    //   443: aload_2
    //   444: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   447: athrow
    //   448: astore_1
    //   449: new 899	gnu/mapping/WrongType
    //   452: dup
    //   453: aload_1
    //   454: ldc_w 284
    //   457: iconst_0
    //   458: aload 5
    //   460: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   463: athrow
    //   464: astore_1
    //   465: new 899	gnu/mapping/WrongType
    //   468: dup
    //   469: aload_1
    //   470: ldc_w 288
    //   473: iconst_0
    //   474: aload_2
    //   475: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   478: athrow
    //   479: aload_2
    //   480: checkcast 882	gnu/lists/Pair
    //   483: astore_3
    //   484: aload_3
    //   485: invokevirtual 888	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   488: astore_2
    //   489: getstatic 1060	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   492: aload_2
    //   493: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   496: pop
    //   497: getstatic 1063	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   500: aload_2
    //   501: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   504: astore_2
    //   505: aload_2
    //   506: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   509: if_acmpeq +11 -> 520
    //   512: getstatic 1051	kawa/standard/Scheme:applyToArgs	Lgnu/kawa/functions/ApplyToArgs;
    //   515: aload_2
    //   516: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   519: pop
    //   520: aload_3
    //   521: invokevirtual 885	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   524: astore_2
    //   525: goto -432 -> 93
    //   528: astore_1
    //   529: new 899	gnu/mapping/WrongType
    //   532: dup
    //   533: aload_1
    //   534: ldc_w 901
    //   537: bipush -2
    //   539: aload_2
    //   540: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   543: athrow
    //   544: aload_1
    //   545: checkcast 882	gnu/lists/Pair
    //   548: astore_2
    //   549: aload_2
    //   550: invokevirtual 888	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   553: astore_1
    //   554: getstatic 1060	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   557: aload_1
    //   558: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   561: astore_3
    //   562: getstatic 1063	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   565: aload_1
    //   566: invokevirtual 1030	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   569: pop
    //   570: aload_0
    //   571: getstatic 1088	gnu/kawa/reflect/SlotGet:field	Lgnu/kawa/reflect/SlotGet;
    //   574: aload_0
    //   575: aload_3
    //   576: invokevirtual 872	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   579: invokevirtual 1091	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:callInitialize	(Ljava/lang/Object;)V
    //   582: aload_2
    //   583: invokevirtual 885	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   586: astore_1
    //   587: goto -487 -> 100
    //   590: astore_2
    //   591: new 899	gnu/mapping/WrongType
    //   594: dup
    //   595: aload_2
    //   596: ldc_w 901
    //   599: bipush -2
    //   601: aload_1
    //   602: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   605: athrow
    //   606: astore_2
    //   607: new 899	gnu/mapping/WrongType
    //   610: dup
    //   611: aload_2
    //   612: ldc_w 901
    //   615: bipush -2
    //   617: aload_1
    //   618: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   621: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	622	0	this	Screen2
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
    runtime.addGlobalVarToCurrentFormEnvironment(Lit3, "Screen3");
    Scheme.applyToArgs.apply2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
    return runtime.callYailPrimitive(runtime.close$Mnscreen, LList.Empty, LList.Empty, "close screen");
  }
  
  public Object Clock1$Timer()
  {
    runtime.setThisForm();
    SimpleSymbol localSimpleSymbol1 = Lit27;
    SimpleSymbol localSimpleSymbol2 = Lit28;
    ModuleMethod localModuleMethod1 = runtime.yail$Mnlist$Mnto$Mncsv$Mntable;
    ModuleMethod localModuleMethod2 = runtime.make$Mnyail$Mnlist;
    ModuleMethod localModuleMethod3 = runtime.make$Mnyail$Mnlist;
    Pair localPair = LList.list1(runtime.callComponentMethod(Lit22, Lit95, LList.list2(runtime.callComponentMethod(Lit22, Lit96, LList.Empty, LList.Empty), "MM/dd/yyyy hh:mm:ss a"), Lit97));
    LList.chain1(LList.chain4(localPair, runtime.getProperty$1(Lit24, Lit98), runtime.getProperty$1(Lit24, Lit99), runtime.getProperty$1(Lit20, Lit100), runtime.getProperty$1(Lit20, Lit101)), runtime.getProperty$1(Lit20, Lit102));
    return runtime.callComponentMethod(localSimpleSymbol1, localSimpleSymbol2, LList.list2(runtime.callYailPrimitive(localModuleMethod1, LList.list1(runtime.callYailPrimitive(localModuleMethod2, LList.list1(runtime.callYailPrimitive(localModuleMethod3, localPair, Lit103, "make a list")), Lit104, "make a list")), Lit105, "list to csv table"), "/GPSData_tmp.csv"), Lit106);
  }
  
  public Object Screen2$Initialize()
  {
    runtime.setThisForm();
    runtime.setAndCoerceProperty$Ex(Lit20, Lit21, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit22, Lit23, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit21, Boolean.TRUE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit24, Lit25, Lit26, Lit13);
    SimpleSymbol localSimpleSymbol1 = Lit27;
    SimpleSymbol localSimpleSymbol2 = Lit28;
    ModuleMethod localModuleMethod1 = runtime.yail$Mnlist$Mnto$Mncsv$Mntable;
    ModuleMethod localModuleMethod2 = runtime.make$Mnyail$Mnlist;
    ModuleMethod localModuleMethod3 = runtime.make$Mnyail$Mnlist;
    Pair localPair = LList.list1("Date and Time");
    LList.chain1(LList.chain4(localPair, "Latitude", "Longitude", "X-Acceleration (m/s^2)", "Y-Acceleration (m/s^2)"), "Z-Acceleration (m/s^2)");
    return runtime.callComponentMethod(localSimpleSymbol1, localSimpleSymbol2, LList.list2(runtime.callYailPrimitive(localModuleMethod1, LList.list1(runtime.callYailPrimitive(localModuleMethod2, LList.list1(runtime.callYailPrimitive(localModuleMethod3, localPair, Lit29, "make a list")), Lit30, "make a list")), Lit31, "list to csv table"), "/GPSData_tmp.csv"), Lit32);
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
    //   1: getfield 1233	gnu/mapping/CallContext:consumer	Lgnu/lists/Consumer;
    //   4: astore_2
    //   5: ldc_w 1250
    //   8: invokestatic 1256	kawa/standard/require:find	(Ljava/lang/String;)Ljava/lang/Object;
    //   11: astore_1
    //   12: aload_1
    //   13: checkcast 6	java/lang/Runnable
    //   16: astore_3
    //   17: aload_3
    //   18: invokeinterface 1257 1 0
    //   23: aload_0
    //   24: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   27: putfield 1259	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:$Stdebug$Mnform$St	Ljava/lang/Boolean;
    //   30: aload_0
    //   31: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   34: invokestatic 894	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   37: invokestatic 1262	gnu/mapping/Environment:make	(Ljava/lang/String;)Lgnu/mapping/SimpleEnvironment;
    //   40: putfield 1163	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:form$Mnenvironment	Lgnu/mapping/Environment;
    //   43: iconst_2
    //   44: anewarray 1041	java/lang/Object
    //   47: dup
    //   48: iconst_0
    //   49: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   52: invokestatic 894	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   55: aastore
    //   56: dup
    //   57: iconst_1
    //   58: ldc_w 1264
    //   61: aastore
    //   62: invokestatic 1268	kawa/lib/strings:stringAppend	([Ljava/lang/Object;)Lgnu/lists/FString;
    //   65: astore_1
    //   66: aload_1
    //   67: ifnonnull +837 -> 904
    //   70: aconst_null
    //   71: astore_1
    //   72: aload_0
    //   73: aload_1
    //   74: invokestatic 1262	gnu/mapping/Environment:make	(Ljava/lang/String;)Lgnu/mapping/SimpleEnvironment;
    //   77: putfield 1176	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:global$Mnvar$Mnenvironment	Lgnu/mapping/Environment;
    //   80: aconst_null
    //   81: putstatic 994	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Screen2	Lappinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2;
    //   84: aload_0
    //   85: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   88: putfield 1270	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:form$Mnname$Mnsymbol	Lgnu/mapping/Symbol;
    //   91: aload_0
    //   92: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   95: putfield 1000	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:events$Mnto$Mnregister	Lgnu/lists/LList;
    //   98: aload_0
    //   99: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   102: putfield 1015	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:components$Mnto$Mncreate	Lgnu/lists/LList;
    //   105: aload_0
    //   106: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   109: putfield 1005	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:global$Mnvars$Mnto$Mncreate	Lgnu/lists/LList;
    //   112: aload_0
    //   113: getstatic 334	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   116: putfield 1013	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:form$Mndo$Mnafter$Mncreation	Lgnu/lists/LList;
    //   119: ldc_w 1250
    //   122: invokestatic 1256	kawa/standard/require:find	(Ljava/lang/String;)Ljava/lang/Object;
    //   125: astore_1
    //   126: aload_1
    //   127: checkcast 6	java/lang/Runnable
    //   130: astore_3
    //   131: aload_3
    //   132: invokeinterface 1257 1 0
    //   137: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   140: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   143: if_acmpeq +769 -> 912
    //   146: getstatic 680	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit3	Lgnu/mapping/SimpleSymbol;
    //   149: ldc_w 929
    //   152: invokestatic 1100	com/google/youngandroid/runtime:addGlobalVarToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   155: aload_2
    //   156: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   159: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   162: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   165: if_acmpeq +760 -> 925
    //   168: getstatic 676	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit4	Lgnu/mapping/SimpleSymbol;
    //   171: getstatic 758	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn3	Lgnu/expr/ModuleMethod;
    //   174: invokestatic 1100	com/google/youngandroid/runtime:addGlobalVarToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   177: aload_2
    //   178: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   181: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   184: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   187: if_acmpeq +751 -> 938
    //   190: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   193: getstatic 656	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit11	Lgnu/mapping/SimpleSymbol;
    //   196: getstatic 652	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit12	Lgnu/math/IntNum;
    //   199: getstatic 650	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit13	Lgnu/mapping/SimpleSymbol;
    //   202: invokestatic 825	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   205: pop
    //   206: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   209: getstatic 646	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit14	Lgnu/mapping/SimpleSymbol;
    //   212: ldc_w 973
    //   215: getstatic 329	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit15	Lgnu/mapping/SimpleSymbol;
    //   218: invokestatic 825	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   221: pop
    //   222: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   225: getstatic 642	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit16	Lgnu/mapping/SimpleSymbol;
    //   228: getstatic 832	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   231: getstatic 638	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit17	Lgnu/mapping/SimpleSymbol;
    //   234: invokestatic 825	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   237: pop
    //   238: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   241: getstatic 634	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit18	Lgnu/mapping/SimpleSymbol;
    //   244: ldc_w 689
    //   247: getstatic 329	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit15	Lgnu/mapping/SimpleSymbol;
    //   250: invokestatic 825	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   253: pop
    //   254: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   257: getstatic 630	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit19	Lgnu/mapping/SimpleSymbol;
    //   260: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   263: getstatic 638	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit17	Lgnu/mapping/SimpleSymbol;
    //   266: invokestatic 825	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   269: aload_2
    //   270: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   273: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   276: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   279: if_acmpeq +676 -> 955
    //   282: getstatic 578	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit33	Lgnu/mapping/SimpleSymbol;
    //   285: aload_0
    //   286: getfield 766	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Screen2$Initialize	Lgnu/expr/ModuleMethod;
    //   289: invokestatic 1280	com/google/youngandroid/runtime:addToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   292: pop
    //   293: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   296: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   299: if_acmpeq +670 -> 969
    //   302: getstatic 1283	com/google/youngandroid/runtime:$Stthis$Mnform$St	Ljava/lang/Object;
    //   305: checkcast 1285	com/google/appinventor/components/runtime/HandlesEventDispatching
    //   308: ldc_w 689
    //   311: ldc_w 573
    //   314: invokestatic 1039	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   317: aload_0
    //   318: aconst_null
    //   319: putfield 1287	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:HorizontalArrangement1	Lcom/google/appinventor/components/runtime/HorizontalArrangement;
    //   322: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   325: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   328: if_acmpeq +654 -> 982
    //   331: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   334: getstatic 571	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit35	Lgnu/lists/FString;
    //   337: getstatic 569	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit36	Lgnu/mapping/SimpleSymbol;
    //   340: getstatic 768	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn7	Lgnu/expr/ModuleMethod;
    //   343: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   346: aload_2
    //   347: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   350: aload_0
    //   351: aconst_null
    //   352: putfield 1292	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:VerticalArrangement1	Lcom/google/appinventor/components/runtime/VerticalArrangement;
    //   355: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   358: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   361: if_acmpeq +640 -> 1001
    //   364: getstatic 569	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit36	Lgnu/mapping/SimpleSymbol;
    //   367: getstatic 536	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit46	Lgnu/lists/FString;
    //   370: getstatic 534	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit47	Lgnu/mapping/SimpleSymbol;
    //   373: getstatic 772	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn9	Lgnu/expr/ModuleMethod;
    //   376: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   379: aload_2
    //   380: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   383: aload_0
    //   384: aconst_null
    //   385: putfield 1294	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Label1	Lcom/google/appinventor/components/runtime/Label;
    //   388: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   391: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   394: if_acmpeq +626 -> 1020
    //   397: getstatic 534	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit47	Lgnu/mapping/SimpleSymbol;
    //   400: getstatic 529	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit49	Lgnu/lists/FString;
    //   403: getstatic 527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit50	Lgnu/mapping/SimpleSymbol;
    //   406: getstatic 776	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn11	Lgnu/expr/ModuleMethod;
    //   409: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   412: aload_2
    //   413: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   416: aload_0
    //   417: aconst_null
    //   418: putfield 1296	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Label2	Lcom/google/appinventor/components/runtime/Label;
    //   421: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   424: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   427: if_acmpeq +612 -> 1039
    //   430: getstatic 534	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit47	Lgnu/mapping/SimpleSymbol;
    //   433: getstatic 502	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit58	Lgnu/lists/FString;
    //   436: getstatic 500	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit59	Lgnu/mapping/SimpleSymbol;
    //   439: getstatic 780	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn13	Lgnu/expr/ModuleMethod;
    //   442: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   445: aload_2
    //   446: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   449: aload_0
    //   450: aconst_null
    //   451: putfield 1298	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:HorizontalArrangement2	Lcom/google/appinventor/components/runtime/HorizontalArrangement;
    //   454: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   457: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   460: if_acmpeq +598 -> 1058
    //   463: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   466: getstatic 493	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit62	Lgnu/lists/FString;
    //   469: getstatic 491	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit63	Lgnu/mapping/SimpleSymbol;
    //   472: getstatic 784	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn15	Lgnu/expr/ModuleMethod;
    //   475: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   478: aload_2
    //   479: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   482: aload_0
    //   483: aconst_null
    //   484: putfield 1300	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:VerticalArrangement2	Lcom/google/appinventor/components/runtime/VerticalArrangement;
    //   487: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   490: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   493: if_acmpeq +584 -> 1077
    //   496: getstatic 491	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit63	Lgnu/mapping/SimpleSymbol;
    //   499: getstatic 482	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit67	Lgnu/lists/FString;
    //   502: getstatic 480	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit68	Lgnu/mapping/SimpleSymbol;
    //   505: getstatic 788	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn17	Lgnu/expr/ModuleMethod;
    //   508: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   511: aload_2
    //   512: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   515: aload_0
    //   516: aconst_null
    //   517: putfield 1302	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Label3	Lcom/google/appinventor/components/runtime/Label;
    //   520: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   523: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   526: if_acmpeq +570 -> 1096
    //   529: getstatic 480	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit68	Lgnu/mapping/SimpleSymbol;
    //   532: getstatic 473	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit70	Lgnu/lists/FString;
    //   535: getstatic 471	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit71	Lgnu/mapping/SimpleSymbol;
    //   538: getstatic 792	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn19	Lgnu/expr/ModuleMethod;
    //   541: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   544: aload_2
    //   545: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   548: aload_0
    //   549: aconst_null
    //   550: putfield 1304	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Label4	Lcom/google/appinventor/components/runtime/Label;
    //   553: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   556: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   559: if_acmpeq +556 -> 1115
    //   562: getstatic 480	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit68	Lgnu/mapping/SimpleSymbol;
    //   565: getstatic 464	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit74	Lgnu/lists/FString;
    //   568: getstatic 462	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit75	Lgnu/mapping/SimpleSymbol;
    //   571: getstatic 796	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn21	Lgnu/expr/ModuleMethod;
    //   574: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   577: aload_2
    //   578: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   581: aload_0
    //   582: aconst_null
    //   583: putfield 1306	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:HorizontalArrangement3	Lcom/google/appinventor/components/runtime/HorizontalArrangement;
    //   586: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   589: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   592: if_acmpeq +542 -> 1134
    //   595: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   598: getstatic 451	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit79	Lgnu/lists/FString;
    //   601: getstatic 449	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit80	Lgnu/mapping/SimpleSymbol;
    //   604: getstatic 800	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn23	Lgnu/expr/ModuleMethod;
    //   607: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   610: aload_2
    //   611: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   614: aload_0
    //   615: aconst_null
    //   616: putfield 1308	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Button1	Lcom/google/appinventor/components/runtime/Button;
    //   619: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   622: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   625: if_acmpeq +528 -> 1153
    //   628: getstatic 449	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit80	Lgnu/mapping/SimpleSymbol;
    //   631: getstatic 440	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit83	Lgnu/lists/FString;
    //   634: getstatic 438	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit84	Lgnu/mapping/SimpleSymbol;
    //   637: getstatic 804	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn25	Lgnu/expr/ModuleMethod;
    //   640: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   643: aload_2
    //   644: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   647: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   650: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   653: if_acmpeq +519 -> 1172
    //   656: getstatic 424	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit87	Lgnu/mapping/SimpleSymbol;
    //   659: aload_0
    //   660: getfield 808	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Button1$Click	Lgnu/expr/ModuleMethod;
    //   663: invokestatic 1280	com/google/youngandroid/runtime:addToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   666: pop
    //   667: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   670: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   673: if_acmpeq +513 -> 1186
    //   676: getstatic 1283	com/google/youngandroid/runtime:$Stthis$Mnform$St	Ljava/lang/Object;
    //   679: checkcast 1285	com/google/appinventor/components/runtime/HandlesEventDispatching
    //   682: ldc_w 436
    //   685: ldc_w 419
    //   688: invokestatic 1039	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   691: aload_0
    //   692: aconst_null
    //   693: putfield 1310	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:AccelerometerSensor1	Lcom/google/appinventor/components/runtime/AccelerometerSensor;
    //   696: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   699: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   702: if_acmpeq +497 -> 1199
    //   705: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   708: getstatic 417	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit89	Lgnu/lists/FString;
    //   711: getstatic 626	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit20	Lgnu/mapping/SimpleSymbol;
    //   714: getstatic 810	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn27	Lgnu/expr/ModuleMethod;
    //   717: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   720: aload_2
    //   721: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   724: aload_0
    //   725: aconst_null
    //   726: putfield 1312	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Clock1	Lcom/google/appinventor/components/runtime/Clock;
    //   729: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   732: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   735: if_acmpeq +483 -> 1218
    //   738: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   741: getstatic 400	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit93	Lgnu/lists/FString;
    //   744: getstatic 619	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit22	Lgnu/mapping/SimpleSymbol;
    //   747: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   750: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   753: aload_2
    //   754: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   757: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   760: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   763: if_acmpeq +474 -> 1237
    //   766: getstatic 325	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit107	Lgnu/mapping/SimpleSymbol;
    //   769: aload_0
    //   770: getfield 814	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Clock1$Timer	Lgnu/expr/ModuleMethod;
    //   773: invokestatic 1280	com/google/youngandroid/runtime:addToCurrentFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)Ljava/lang/Object;
    //   776: pop
    //   777: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   780: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   783: if_acmpeq +468 -> 1251
    //   786: getstatic 1283	com/google/youngandroid/runtime:$Stthis$Mnform$St	Ljava/lang/Object;
    //   789: checkcast 1285	com/google/appinventor/components/runtime/HandlesEventDispatching
    //   792: ldc_w 617
    //   795: ldc_w 320
    //   798: invokestatic 1039	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   801: aload_0
    //   802: aconst_null
    //   803: putfield 1314	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:LocationSensor1	Lcom/google/appinventor/components/runtime/LocationSensor;
    //   806: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   809: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   812: if_acmpeq +452 -> 1264
    //   815: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   818: getstatic 318	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit109	Lgnu/lists/FString;
    //   821: getstatic 612	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit24	Lgnu/mapping/SimpleSymbol;
    //   824: getstatic 816	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn29	Lgnu/expr/ModuleMethod;
    //   827: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   830: aload_2
    //   831: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   834: aload_0
    //   835: aconst_null
    //   836: putfield 1316	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:File1	Lcom/google/appinventor/components/runtime/File;
    //   839: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   842: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   845: if_acmpeq +438 -> 1283
    //   848: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   851: getstatic 312	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit111	Lgnu/lists/FString;
    //   854: getstatic 603	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit27	Lgnu/mapping/SimpleSymbol;
    //   857: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   860: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   863: aload_2
    //   864: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   867: aload_0
    //   868: aconst_null
    //   869: putfield 1318	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:TinyDB1	Lcom/google/appinventor/components/runtime/TinyDB;
    //   872: getstatic 1273	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   875: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   878: if_acmpeq +424 -> 1302
    //   881: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   884: getstatic 306	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit113	Lgnu/lists/FString;
    //   887: getstatic 304	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit114	Lgnu/mapping/SimpleSymbol;
    //   890: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   893: invokestatic 1290	com/google/youngandroid/runtime:addComponentWithinRepl	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   896: aload_2
    //   897: invokestatic 1277	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   900: invokestatic 1321	com/google/youngandroid/runtime:initRuntime	()V
    //   903: return
    //   904: aload_1
    //   905: invokevirtual 1044	java/lang/Object:toString	()Ljava/lang/String;
    //   908: astore_1
    //   909: goto -837 -> 72
    //   912: aload_0
    //   913: getstatic 680	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit3	Lgnu/mapping/SimpleSymbol;
    //   916: getstatic 756	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn2	Lgnu/expr/ModuleMethod;
    //   919: invokevirtual 1003	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   922: goto -763 -> 159
    //   925: aload_0
    //   926: getstatic 676	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit4	Lgnu/mapping/SimpleSymbol;
    //   929: getstatic 762	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn4	Lgnu/expr/ModuleMethod;
    //   932: invokevirtual 1003	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   935: goto -754 -> 181
    //   938: aload_0
    //   939: new 1323	kawa/lang/Promise
    //   942: dup
    //   943: getstatic 764	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn6	Lgnu/expr/ModuleMethod;
    //   946: invokespecial 1326	kawa/lang/Promise:<init>	(Lgnu/mapping/Procedure;)V
    //   949: invokevirtual 1328	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToFormDoAfterCreation	(Ljava/lang/Object;)V
    //   952: goto -679 -> 273
    //   955: aload_0
    //   956: getstatic 578	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit33	Lgnu/mapping/SimpleSymbol;
    //   959: aload_0
    //   960: getfield 766	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Screen2$Initialize	Lgnu/expr/ModuleMethod;
    //   963: invokevirtual 998	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   966: goto -673 -> 293
    //   969: aload_0
    //   970: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   973: getstatic 575	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit34	Lgnu/mapping/SimpleSymbol;
    //   976: invokevirtual 1330	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   979: goto -662 -> 317
    //   982: aload_0
    //   983: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   986: getstatic 538	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit45	Lgnu/lists/FString;
    //   989: getstatic 569	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit36	Lgnu/mapping/SimpleSymbol;
    //   992: getstatic 770	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn8	Lgnu/expr/ModuleMethod;
    //   995: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   998: goto -648 -> 350
    //   1001: aload_0
    //   1002: getstatic 569	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit36	Lgnu/mapping/SimpleSymbol;
    //   1005: getstatic 531	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit48	Lgnu/lists/FString;
    //   1008: getstatic 534	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit47	Lgnu/mapping/SimpleSymbol;
    //   1011: getstatic 774	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn10	Lgnu/expr/ModuleMethod;
    //   1014: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1017: goto -634 -> 383
    //   1020: aload_0
    //   1021: getstatic 534	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit47	Lgnu/mapping/SimpleSymbol;
    //   1024: getstatic 504	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit57	Lgnu/lists/FString;
    //   1027: getstatic 527	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit50	Lgnu/mapping/SimpleSymbol;
    //   1030: getstatic 778	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn12	Lgnu/expr/ModuleMethod;
    //   1033: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1036: goto -620 -> 416
    //   1039: aload_0
    //   1040: getstatic 534	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit47	Lgnu/mapping/SimpleSymbol;
    //   1043: getstatic 495	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit61	Lgnu/lists/FString;
    //   1046: getstatic 500	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit59	Lgnu/mapping/SimpleSymbol;
    //   1049: getstatic 782	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn14	Lgnu/expr/ModuleMethod;
    //   1052: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1055: goto -606 -> 449
    //   1058: aload_0
    //   1059: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1062: getstatic 484	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit66	Lgnu/lists/FString;
    //   1065: getstatic 491	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit63	Lgnu/mapping/SimpleSymbol;
    //   1068: getstatic 786	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn16	Lgnu/expr/ModuleMethod;
    //   1071: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1074: goto -592 -> 482
    //   1077: aload_0
    //   1078: getstatic 491	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit63	Lgnu/mapping/SimpleSymbol;
    //   1081: getstatic 477	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit69	Lgnu/lists/FString;
    //   1084: getstatic 480	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit68	Lgnu/mapping/SimpleSymbol;
    //   1087: getstatic 790	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn18	Lgnu/expr/ModuleMethod;
    //   1090: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1093: goto -578 -> 515
    //   1096: aload_0
    //   1097: getstatic 480	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit68	Lgnu/mapping/SimpleSymbol;
    //   1100: getstatic 466	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit73	Lgnu/lists/FString;
    //   1103: getstatic 471	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit71	Lgnu/mapping/SimpleSymbol;
    //   1106: getstatic 794	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn20	Lgnu/expr/ModuleMethod;
    //   1109: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1112: goto -564 -> 548
    //   1115: aload_0
    //   1116: getstatic 480	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit68	Lgnu/mapping/SimpleSymbol;
    //   1119: getstatic 455	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit78	Lgnu/lists/FString;
    //   1122: getstatic 462	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit75	Lgnu/mapping/SimpleSymbol;
    //   1125: getstatic 798	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn22	Lgnu/expr/ModuleMethod;
    //   1128: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1131: goto -550 -> 581
    //   1134: aload_0
    //   1135: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1138: getstatic 444	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit82	Lgnu/lists/FString;
    //   1141: getstatic 449	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit80	Lgnu/mapping/SimpleSymbol;
    //   1144: getstatic 802	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn24	Lgnu/expr/ModuleMethod;
    //   1147: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1150: goto -536 -> 614
    //   1153: aload_0
    //   1154: getstatic 449	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit80	Lgnu/mapping/SimpleSymbol;
    //   1157: getstatic 428	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit86	Lgnu/lists/FString;
    //   1160: getstatic 438	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit84	Lgnu/mapping/SimpleSymbol;
    //   1163: getstatic 806	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn26	Lgnu/expr/ModuleMethod;
    //   1166: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1169: goto -522 -> 647
    //   1172: aload_0
    //   1173: getstatic 424	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit87	Lgnu/mapping/SimpleSymbol;
    //   1176: aload_0
    //   1177: getfield 808	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Button1$Click	Lgnu/expr/ModuleMethod;
    //   1180: invokevirtual 998	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   1183: goto -516 -> 667
    //   1186: aload_0
    //   1187: getstatic 438	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit84	Lgnu/mapping/SimpleSymbol;
    //   1190: getstatic 421	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit88	Lgnu/mapping/SimpleSymbol;
    //   1193: invokevirtual 1330	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1196: goto -505 -> 691
    //   1199: aload_0
    //   1200: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1203: getstatic 404	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit92	Lgnu/lists/FString;
    //   1206: getstatic 626	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit20	Lgnu/mapping/SimpleSymbol;
    //   1209: getstatic 812	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn28	Lgnu/expr/ModuleMethod;
    //   1212: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1215: goto -491 -> 724
    //   1218: aload_0
    //   1219: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1222: getstatic 398	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit94	Lgnu/lists/FString;
    //   1225: getstatic 619	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit22	Lgnu/mapping/SimpleSymbol;
    //   1228: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1231: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1234: goto -477 -> 757
    //   1237: aload_0
    //   1238: getstatic 325	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit107	Lgnu/mapping/SimpleSymbol;
    //   1241: aload_0
    //   1242: getfield 814	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Clock1$Timer	Lgnu/expr/ModuleMethod;
    //   1245: invokevirtual 998	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   1248: goto -471 -> 777
    //   1251: aload_0
    //   1252: getstatic 619	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit22	Lgnu/mapping/SimpleSymbol;
    //   1255: getstatic 322	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit108	Lgnu/mapping/SimpleSymbol;
    //   1258: invokevirtual 1330	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToEvents	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   1261: goto -460 -> 801
    //   1264: aload_0
    //   1265: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1268: getstatic 316	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit110	Lgnu/lists/FString;
    //   1271: getstatic 612	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit24	Lgnu/mapping/SimpleSymbol;
    //   1274: getstatic 818	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:lambda$Fn30	Lgnu/expr/ModuleMethod;
    //   1277: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1280: goto -446 -> 834
    //   1283: aload_0
    //   1284: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1287: getstatic 310	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit112	Lgnu/lists/FString;
    //   1290: getstatic 603	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit27	Lgnu/mapping/SimpleSymbol;
    //   1293: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1296: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1299: goto -432 -> 867
    //   1302: aload_0
    //   1303: getstatic 691	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit0	Lgnu/mapping/SimpleSymbol;
    //   1306: getstatic 301	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit115	Lgnu/lists/FString;
    //   1309: getstatic 304	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:Lit114	Lgnu/mapping/SimpleSymbol;
    //   1312: getstatic 951	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1315: invokevirtual 1332	appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1318: goto -418 -> 900
    //   1321: astore_2
    //   1322: new 899	gnu/mapping/WrongType
    //   1325: dup
    //   1326: aload_2
    //   1327: ldc_w 1334
    //   1330: iconst_1
    //   1331: aload_1
    //   1332: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   1335: athrow
    //   1336: astore_2
    //   1337: new 899	gnu/mapping/WrongType
    //   1340: dup
    //   1341: aload_2
    //   1342: ldc_w 1334
    //   1345: iconst_1
    //   1346: aload_1
    //   1347: invokespecial 904	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   1350: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1351	0	this	Screen2
    //   0	1351	1	paramCallContext	CallContext
    //   4	893	2	localConsumer	Consumer
    //   1321	6	2	localClassCastException1	ClassCastException
    //   1336	6	2	localClassCastException2	ClassCastException
    //   16	116	3	localRunnable	Runnable
    // Exception table:
    //   from	to	target	type
    //   12	17	1321	java/lang/ClassCastException
    //   126	131	1336	java/lang/ClassCastException
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


/* Location:              /home/nelmntrx/Desktop/SYNCCrowdTracker/dex2jar-2.0/classes-dex2jar.jar!/appinventor/ai_jbacong/SYNCCrowdTracker_copy/Screen2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */