.class public Lcom/google/appinventor/components/runtime/Slider;
.super Lcom/google/appinventor/components/runtime/AndroidViewComponent;
.source "Slider.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation runtime Lcom/google/appinventor/components/annotations/DesignerComponent;
    category = .enum Lcom/google/appinventor/components/common/ComponentCategory;->USERINTERFACE:Lcom/google/appinventor/components/common/ComponentCategory;
    description = "A Slider is a progress bar that adds a draggable thumb. You can touch the thumb and drag left or right to set the slider thumb position. As the Slider thumb is dragged, it will trigger the PositionChanged event, reporting the position of the Slider thumb. The reported position of the Slider thumb can be used to dynamically update another component attribute, such as the font size of a TextBox or the radius of a Ball."
    version = 0x2
.end annotation

.annotation runtime Lcom/google/appinventor/components/annotations/SimpleObject;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/appinventor/components/runtime/Slider$1;,
        Lcom/google/appinventor/components/runtime/Slider$SeekBarHelper;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final LOG_TAG:Ljava/lang/String; = "Slider"

.field private static final initialLeftColor:I = -0x3800

.field private static final initialLeftColorString:Ljava/lang/String; = "&HFFFFC800"

.field private static final initialRightColor:I = -0x777778

.field private static final initialRightColorString:Ljava/lang/String; = "&HFF888888"


# instance fields
.field private beforeThumb:Landroid/graphics/drawable/ClipDrawable;

.field private fullBar:Landroid/graphics/drawable/LayerDrawable;

.field private leftColor:I

.field private maxValue:F

.field private minValue:F

.field public final referenceGetThumb:Z

.field private rightColor:I

.field private final seekbar:Landroid/widget/SeekBar;

.field private thumbEnabled:Z

.field private thumbPosition:F


# direct methods
.method public constructor <init>(Lcom/google/appinventor/components/runtime/ComponentContainer;)V
    .locals 3
    .param p1, "container"    # Lcom/google/appinventor/components/runtime/ComponentContainer;

    .prologue
    const/4 v1, 0x1

    .line 96
    invoke-direct {p0, p1}, Lcom/google/appinventor/components/runtime/AndroidViewComponent;-><init>(Lcom/google/appinventor/components/runtime/ComponentContainer;)V

    .line 88
    invoke-static {}, Lcom/google/appinventor/components/runtime/util/SdkLevel;->getLevel()I

    move-result v0

    const/16 v2, 0x10

    if-lt v0, v2, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/google/appinventor/components/runtime/Slider;->referenceGetThumb:Z

    .line 97
    new-instance v0, Landroid/widget/SeekBar;

    invoke-interface {p1}, Lcom/google/appinventor/components/runtime/ComponentContainer;->$context()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->seekbar:Landroid/widget/SeekBar;

    .line 99
    iget-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->seekbar:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    iput-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->fullBar:Landroid/graphics/drawable/LayerDrawable;

    .line 100
    iget-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->fullBar:Landroid/graphics/drawable/LayerDrawable;

    const v2, 0x102000d

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/ClipDrawable;

    iput-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->beforeThumb:Landroid/graphics/drawable/ClipDrawable;

    .line 101
    const/16 v0, -0x3800

    iput v0, p0, Lcom/google/appinventor/components/runtime/Slider;->leftColor:I

    .line 102
    const v0, -0x777778

    iput v0, p0, Lcom/google/appinventor/components/runtime/Slider;->rightColor:I

    .line 103
    invoke-direct {p0}, Lcom/google/appinventor/components/runtime/Slider;->setSliderColors()V

    .line 106
    invoke-interface {p1, p0}, Lcom/google/appinventor/components/runtime/ComponentContainer;->$add(Lcom/google/appinventor/components/runtime/AndroidViewComponent;)V

    .line 109
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    .line 110
    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Lcom/google/appinventor/components/runtime/Slider;->maxValue:F

    .line 111
    const/high16 v0, 0x41f00000    # 30.0f

    iput v0, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbPosition:F

    .line 112
    iput-boolean v1, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbEnabled:Z

    .line 114
    iget-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->seekbar:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 119
    iget-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->seekbar:Landroid/widget/SeekBar;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 124
    invoke-direct {p0}, Lcom/google/appinventor/components/runtime/Slider;->setSeekbarPosition()V

    .line 135
    return-void

    .line 88
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic access$000(Lcom/google/appinventor/components/runtime/Slider;)Landroid/widget/SeekBar;
    .locals 1
    .param p0, "x0"    # Lcom/google/appinventor/components/runtime/Slider;

    .prologue
    .line 46
    iget-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->seekbar:Landroid/widget/SeekBar;

    return-object v0
.end method

.method private setSeekbarPosition()V
    .locals 4

    .prologue
    .line 157
    iget v1, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbPosition:F

    iget v2, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    sub-float/2addr v1, v2

    iget v2, p0, Lcom/google/appinventor/components/runtime/Slider;->maxValue:F

    iget v3, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    sub-float/2addr v2, v3

    div-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float v0, v1, v2

    .line 165
    .local v0, "seekbarPosition":F
    iget-object v1, p0, Lcom/google/appinventor/components/runtime/Slider;->seekbar:Landroid/widget/SeekBar;

    float-to-int v2, v0

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 166
    return-void
.end method

.method private setSliderColors()V
    .locals 3

    .prologue
    .line 140
    iget-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->fullBar:Landroid/graphics/drawable/LayerDrawable;

    iget v1, p0, Lcom/google/appinventor/components/runtime/Slider;->rightColor:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/LayerDrawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 141
    iget-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->beforeThumb:Landroid/graphics/drawable/ClipDrawable;

    iget v1, p0, Lcom/google/appinventor/components/runtime/Slider;->leftColor:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/ClipDrawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 142
    return-void
.end method


# virtual methods
.method public ColorLeft()I
    .locals 1
    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
        category = .enum Lcom/google/appinventor/components/annotations/PropertyCategory;->APPEARANCE:Lcom/google/appinventor/components/annotations/PropertyCategory;
        description = "The color of slider to the left of the thumb."
    .end annotation

    .prologue
    .line 306
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->leftColor:I

    return v0
.end method

.method public ColorLeft(I)V
    .locals 0
    .param p1, "argb"    # I
    .annotation runtime Lcom/google/appinventor/components/annotations/DesignerProperty;
        defaultValue = "&HFFFFC800"
        editorType = "color"
    .end annotation

    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
    .end annotation

    .prologue
    .line 321
    iput p1, p0, Lcom/google/appinventor/components/runtime/Slider;->leftColor:I

    .line 322
    invoke-direct {p0}, Lcom/google/appinventor/components/runtime/Slider;->setSliderColors()V

    .line 323
    return-void
.end method

.method public ColorRight()I
    .locals 1
    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
        category = .enum Lcom/google/appinventor/components/annotations/PropertyCategory;->APPEARANCE:Lcom/google/appinventor/components/annotations/PropertyCategory;
        description = "The color of slider to the left of the thumb."
    .end annotation

    .prologue
    .line 337
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->rightColor:I

    return v0
.end method

.method public ColorRight(I)V
    .locals 0
    .param p1, "argb"    # I
    .annotation runtime Lcom/google/appinventor/components/annotations/DesignerProperty;
        defaultValue = "&HFF888888"
        editorType = "color"
    .end annotation

    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
    .end annotation

    .prologue
    .line 352
    iput p1, p0, Lcom/google/appinventor/components/runtime/Slider;->rightColor:I

    .line 353
    invoke-direct {p0}, Lcom/google/appinventor/components/runtime/Slider;->setSliderColors()V

    .line 354
    return-void
.end method

.method public Height()I
    .locals 1

    .prologue
    .line 406
    invoke-virtual {p0}, Lcom/google/appinventor/components/runtime/Slider;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    return v0
.end method

.method public Height(I)V
    .locals 1
    .param p1, "height"    # I

    .prologue
    .line 418
    iget-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->container:Lcom/google/appinventor/components/runtime/ComponentContainer;

    invoke-interface {v0, p0, p1}, Lcom/google/appinventor/components/runtime/ComponentContainer;->setChildHeight(Lcom/google/appinventor/components/runtime/AndroidViewComponent;I)V

    .line 419
    return-void
.end method

.method public MaxValue()F
    .locals 1
    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
        category = .enum Lcom/google/appinventor/components/annotations/PropertyCategory;->APPEARANCE:Lcom/google/appinventor/components/annotations/PropertyCategory;
        description = "Returns the slider max value."
        userVisible = true
    .end annotation

    .prologue
    .line 290
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->maxValue:F

    return v0
.end method

.method public MaxValue(F)V
    .locals 2
    .param p1, "value"    # F
    .annotation runtime Lcom/google/appinventor/components/annotations/DesignerProperty;
        defaultValue = "50.0"
        editorType = "float"
    .end annotation

    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
        description = "Sets the maximum value of slider.  Changing the maximum value also resets Thumbposition to be halfway between the minimum and the (new) maximum. If the new maximum is less than the current minimum, then minimum and maximum will both be set to this value.  Setting MaxValue resets the thumb position to halfway between MinValue and MaxValue and signals the PositionChanged event."
        userVisible = true
    .end annotation

    .prologue
    .line 273
    iput p1, p0, Lcom/google/appinventor/components/runtime/Slider;->maxValue:F

    .line 274
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    .line 279
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    iget v1, p0, Lcom/google/appinventor/components/runtime/Slider;->maxValue:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/appinventor/components/runtime/Slider;->ThumbPosition(F)V

    .line 280
    return-void
.end method

.method public MinValue()F
    .locals 1
    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
        category = .enum Lcom/google/appinventor/components/annotations/PropertyCategory;->APPEARANCE:Lcom/google/appinventor/components/annotations/PropertyCategory;
        description = "Returns the value of slider min value."
        userVisible = true
    .end annotation

    .prologue
    .line 261
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    return v0
.end method

.method public MinValue(F)V
    .locals 2
    .param p1, "value"    # F
    .annotation runtime Lcom/google/appinventor/components/annotations/DesignerProperty;
        defaultValue = "10.0"
        editorType = "float"
    .end annotation

    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
        description = "Sets the minimum value of slider.  Changing the minimum value also resets Thumbposition to be halfway between the (new) minimum and the maximum. If the new minimum is greater than the current maximum, then minimum and maximum will both be set to this value.  Setting MinValue resets the thumb position to halfway between MinValue and MaxValue and signals the PositionChanged event."
        userVisible = true
    .end annotation

    .prologue
    .line 242
    iput p1, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    .line 244
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->maxValue:F

    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/google/appinventor/components/runtime/Slider;->maxValue:F

    .line 249
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    iget v1, p0, Lcom/google/appinventor/components/runtime/Slider;->maxValue:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/google/appinventor/components/runtime/Slider;->ThumbPosition(F)V

    .line 250
    return-void
.end method

.method public PositionChanged(F)V
    .locals 4
    .param p1, "thumbPosition"    # F
    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleEvent;
    .end annotation

    .prologue
    .line 384
    const-string v0, "PositionChanged"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {p0, v0, v1}, Lcom/google/appinventor/components/runtime/EventDispatcher;->dispatchEvent(Lcom/google/appinventor/components/runtime/Component;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 385
    return-void
.end method

.method public ThumbEnabled(Z)V
    .locals 3
    .param p1, "enabled"    # Z
    .annotation runtime Lcom/google/appinventor/components/annotations/DesignerProperty;
        defaultValue = "True"
        editorType = "boolean"
    .end annotation

    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
        description = "Sets whether or not to display the slider thumb."
        userVisible = true
    .end annotation

    .prologue
    .line 178
    iput-boolean p1, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbEnabled:Z

    .line 179
    iget-boolean v1, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbEnabled:Z

    if-eqz v1, :cond_1

    const/16 v0, 0xff

    .line 180
    .local v0, "alpha":I
    :goto_0
    iget-boolean v1, p0, Lcom/google/appinventor/components/runtime/Slider;->referenceGetThumb:Z

    if-eqz v1, :cond_0

    .line 181
    new-instance v1, Lcom/google/appinventor/components/runtime/Slider$SeekBarHelper;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/appinventor/components/runtime/Slider$SeekBarHelper;-><init>(Lcom/google/appinventor/components/runtime/Slider;Lcom/google/appinventor/components/runtime/Slider$1;)V

    invoke-virtual {v1, v0}, Lcom/google/appinventor/components/runtime/Slider$SeekBarHelper;->getThumb(I)V

    .line 183
    :cond_0
    iget-object v1, p0, Lcom/google/appinventor/components/runtime/Slider;->seekbar:Landroid/widget/SeekBar;

    iget-boolean v2, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbEnabled:Z

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    .line 185
    return-void

    .line 179
    .end local v0    # "alpha":I
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public ThumbEnabled()Z
    .locals 1
    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
        category = .enum Lcom/google/appinventor/components/annotations/PropertyCategory;->APPEARANCE:Lcom/google/appinventor/components/annotations/PropertyCategory;
        description = "Returns whether or not the slider thumb is being be shown"
        userVisible = true
    .end annotation

    .prologue
    .line 196
    iget-boolean v0, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbEnabled:Z

    return v0
.end method

.method public ThumbPosition()F
    .locals 1
    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
        category = .enum Lcom/google/appinventor/components/annotations/PropertyCategory;->APPEARANCE:Lcom/google/appinventor/components/annotations/PropertyCategory;
        description = "Returns the position of slider thumb"
        userVisible = true
    .end annotation

    .prologue
    .line 229
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbPosition:F

    return v0
.end method

.method public ThumbPosition(F)V
    .locals 2
    .param p1, "position"    # F
    .annotation runtime Lcom/google/appinventor/components/annotations/DesignerProperty;
        defaultValue = "30.0"
        editorType = "float"
    .end annotation

    .annotation runtime Lcom/google/appinventor/components/annotations/SimpleProperty;
        description = "Sets the position of the slider thumb. If this value is greater than MaxValue, then it will be set to same value as MaxValue. If this value is less than MinValue, then it will be set to same value as MinValue."
        userVisible = true
    .end annotation

    .prologue
    .line 214
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->maxValue:F

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget v1, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbPosition:F

    .line 217
    invoke-direct {p0}, Lcom/google/appinventor/components/runtime/Slider;->setSeekbarPosition()V

    .line 218
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbPosition:F

    invoke-virtual {p0, v0}, Lcom/google/appinventor/components/runtime/Slider;->PositionChanged(F)V

    .line 219
    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Lcom/google/appinventor/components/runtime/Slider;->seekbar:Landroid/widget/SeekBar;

    return-object v0
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2
    .param p1, "seekBar"    # Landroid/widget/SeekBar;
    .param p2, "progress"    # I
    .param p3, "fromUser"    # Z

    .prologue
    .line 367
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->maxValue:F

    iget v1, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    sub-float/2addr v0, v1

    int-to-float v1, p2

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    iget v1, p0, Lcom/google/appinventor/components/runtime/Slider;->minValue:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbPosition:F

    .line 376
    iget v0, p0, Lcom/google/appinventor/components/runtime/Slider;->thumbPosition:F

    invoke-virtual {p0, v0}, Lcom/google/appinventor/components/runtime/Slider;->PositionChanged(F)V

    .line 377
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0
    .param p1, "seekBar"    # Landroid/widget/SeekBar;

    .prologue
    .line 390
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0
    .param p1, "seekBar"    # Landroid/widget/SeekBar;

    .prologue
    .line 395
    return-void
.end method
