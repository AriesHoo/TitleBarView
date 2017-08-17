# TitleBarView
--------------------------
## 一、简介：

一个支持Android 4.4以上版本沉浸式及半透明状态栏效果的 TitleBarView;更全常见UI库参看 [UIWidget](https://github.com/AriesHoo/UIWidget)
TitleBarView是基于ViewGroup的扩展，主要具有以下特性
1、支持Android 4.4以上版本沉浸式（关于这个叫法大家不要去纠结,意会即可）及半透明状态栏效果
2、实现MIUI V6、Flyme 4.0、Android 6.0以上状态栏文字颜色切换(当然只能黑或白色)
3、支持java代码及XML设置众多自定义属性
4、可设置左边文字/图片、中间主、副标题、右边文字/图片
5、支持Java代码添加左边、中间、右边 View
说明:此处沉浸式状态栏为状态栏透明化且布局延伸至状态栏下效果，非状态栏着色模式

[[Sample PC Download]](https://github.com/AriesHoo/TitleBarView/blob/master/apk/sample.apk)  

[[Sample Mobile Download]](https://fir.im/pmb2)

![](https://github.com/AriesHoo/TitleBarView/blob/master/apk/qr.png)

详情实现流程解析请移步:[Android自带沉浸状态栏效果标题栏控件-TitleBarView](http://www.jianshu.com/p/34ace867b29f)

**1.1 Gradle集成**

```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

```
dependencies {
    // compile 'com.github.AriesHoo:TitleBarView:1.8.0'
     compile 'com.github.AriesHoo:TitleBarView:${LATEST_VERSION}'
}
```

## 二、录屏预览

Android 4.1

![](https://github.com/AriesHoo/TitleBarView/blob/master/screenshot/4.1.gif)

Android 4.4

![](https://github.com/AriesHoo/TitleBarView/blob/master/screenshot/4.4.gif)

Android 5.1

![](https://github.com/AriesHoo/TitleBarView/blob/master/screenshot/5.1.gif)

Android 6.0

![](https://github.com/AriesHoo/TitleBarView/blob/master/screenshot/6.0.gif)

Android 7.0

![](https://github.com/AriesHoo/TitleBarView/blob/master/screenshot/7.0.gif)

其它UI库查看:[UIWidget](https://github.com/AriesHoo/UIWidget)

## 三、使用方法

### 3.1 属性
```
     <declare-styleable name="TitleBarView">
        <!--是否沉浸式状态栏,默认true-->
        <attr name="title_immersible" format="boolean"/>
        <!--内边距(距左右),默认12dp-->
        <attr name="title_outPadding" format="dimension"/>
        <!--添加子View 内边距,默认1dp-->
        <attr name="title_actionPadding" format="dimension"/>
        <!--标题文字是否左对齐,默认false即:标题居中-->
        <attr name="title_centerGravityLeft" format="boolean"/>
        <!--是否浅色状态栏(黑色文字及图标)-->
        <attr name="title_statusBarLightMode" format="boolean"/>

        <!--状态栏背景色,默认-1-->
        <attr name="title_statusColor" format="color"/>
        <!--状态栏背景资源,默认-1-->
        <attr name="title_statusResource" format="reference"/>
        <!--下划线背景色,默认Color.TRANSPARENT-->
        <attr name="title_dividerColor" format="color"/>
        <!--下划线背景资源,默认-1-->
        <attr name="title_dividerResource" format="reference"/>
        <!--下划线高度,默认0.5dp-->
        <attr name="title_dividerHeight" format="dimension"/>
        <!--下划线是否可见,默认true-->
        <attr name="title_dividerVisible" format="boolean"/>

        <!--左边文字,支持CharSequence及String资源-->
        <attr name="title_leftText" format="string"/>
        <!--左边文字大小,默认14dp-->
        <attr name="title_leftTextSize" format="dimension"/>
        <!--左边文字颜色,默认Color.WHITE-->
        <attr name="title_leftTextColor" format="color"/>
        <!--左边文字背景颜色,默认Color.TRANSPARENT-->
        <attr name="title_leftTextBackgroundColor" format="color"/>
        <!--左边文字背景资源,默认-1-->
        <attr name="title_leftTextBackgroundResource" format="reference"/>
        <!--左边文字drawable资源-->
        <attr name="title_leftTextDrawable" format="reference"/>
        <!--左边文字与drawable资源边距,默认1dp-->
        <attr name="title_leftTextDrawablePadding" format="dimension"/>

        <!--主标题文字,支持CharSequence及String资源-->
        <attr name="title_titleMainText" format="string"/>
        <!--主标题文字大小,默认18dp-->
        <attr name="title_titleMainTextSize" format="dimension"/>
        <!--主标题文字颜色,默认Color.WHITE-->
        <attr name="title_titleMainTextColor" format="color"/>
        <!--主标题文字背景颜色,默认Color.TRANSPARENT-->
        <attr name="title_titleMainTextBackgroundColor" format="color"/>
        <!--主标题文字背景资源,默认-1-->
        <attr name="title_titleMainTextBackgroundResource" format="reference"/>
        <!--主标题文字是否粗体,默认false-->
        <attr name="title_titleMainTextFakeBold" format="boolean"/>
        <!--主标题文字是否跑马灯,默认false-->
        <attr name="title_titleMainTextMarquee" format="boolean"/>

        <!--副标题文字,支持CharSequence及String资源-->
        <attr name="title_titleSubText" format="string"/>
        <!--副标题文字大小,默认12dp-->
        <attr name="title_titleSubTextSize" format="dimension"/>
        <!--副标题文字颜色,默认Color.WHITE-->
        <attr name="title_titleSubTextColor" format="color"/>
        <!--副标题文字背景颜色,默认Color.TRANSPARENT-->
        <attr name="title_titleSubTextBackgroundColor" format="color"/>
        <!--副标题文字背景资源,默认-1-->
        <attr name="title_titleSubTextBackgroundResource" format="reference"/>
        <!--副标题文字是否粗体,默认false-->
        <attr name="title_titleSubTextFakeBold" format="boolean"/>
        <!--副标题文字是否跑马灯,默认false-->
        <attr name="title_titleSubTextMarquee" format="boolean"/>

        <!--右边边文字,支持CharSequence及String资源-->
        <attr name="title_rightText" format="string"/>
        <!--右边文字大小,默认14dp-->
        <attr name="title_rightTextSize" format="dimension"/>
        <!--右边文字颜色,默认Color.WHITE-->
        <attr name="title_rightTextColor" format="color"/>
        <!--右边文字背景颜色,默认Color.TRANSPARENT-->
        <attr name="title_rightTextBackgroundColor" format="color"/>
        <!--右边文字背景资源,默认-1-->
        <attr name="title_rightTextBackgroundResource" format="reference"/>
        <!--右边文字drawable资源-->
        <attr name="title_rightTextDrawable" format="reference"/>
        <!--右边文字与drawable资源边距,默认1dp-->
        <attr name="title_rightTextDrawablePadding" format="dimension"/>

        <!--添加TextView文字大小,默认14dp-->
        <attr name="title_actionTextSize" format="dimension"/>
        <!--添加TextView文字颜色,默认Color.WHITE-->
        <attr name="title_actionTextColor" format="color"/>
        <!--添加TextView文字背景颜色,默认Color.TRANSPARENT-->
        <attr name="title_actionTextBackgroundColor" format="color"/>
        <!--添加TextView文字背景资源,默认-1-->
        <attr name="title_actionTextBackgroundResource" format="reference"/>
    </declare-styleable>
```
### 3.2 部分属性说明

属性名 | 说明 | 默认值
:----------- | :----------- | :-----------
title_immersible         | 是否状态栏沉浸  | true
title_outPadding         | 左右TextView边距        | 12dp
title_actionPadding         | 添加自定义控件左右边距        | 1dp
title_centerGravityLeft         | 标题Layout是否左对齐        | false
title_statusColor         | 状态栏背景色        | -1
title_statusResource         | 状态栏背景资源  | -1
title_dividerColor         | 下划线背景色  | Color.TRANSPARENT
title_dividerResource         | 下划线背景资源  | -1
title_dividerHeight         | 下划线高度  | 0.5dp
title_dividerVisible         | 下划线是否可见  | true
title_titleMainTextMarquee| 主标题是否跑马灯效果-主副标题只能设置一个  | false
title_titleSubTextMarquee| 副标题是否跑马灯效果-主副标题只能设置一个  | false
title_actionTextSize| 添加TextView 字体  | 14dp
title_actionTextColor| 添加TextView 文字颜色  | Color.WHITE

### 3.3 xml示例

```
<?xml version="1.0" encoding="utf-8"?>
<com.aries.ui.view.title.TitleBarView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/titleBar"
    android:layout_width="match_parent"
    android:layout_height="48dp"
    android:background="@color/colorTitle"
    app:title_actionTextColor="@color/colorTextBlack"
    app:title_dividerColor="@color/colorLineGray"
    app:title_leftTextColor="@color/colorTextBlack"
    app:title_leftTextDrawable="@drawable/ic_arrow_left"
    app:title_rightTextColor="@color/colorTextBlack"
    app:title_titleMainTextColor="@color/colorTextBlack"
    app:title_titleSubTextColor="@color/colorTextBlack"/>
```
### 3.4 java代码示例

###### 3.4.1 设置文本-支持字符串和String资源

```
titleBar.setLeftText("左边文字");
titleBar.setRightText("右边文字");
titleBar.setTitleMainText("主标题");
titleBar.setTitleSubText("副标题");
```
###### 3.4.2 设置左右图片资源-只支持drawable

```
titleBar.setLeftTextDrawable(R.drawable.ic_share);
titleBar.setRightTextDrawable(R.drawable.ic_close);
```
###### 3.4.3 设置点击事件

```
titleBar.setOnLeftTextClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
titleBar.setOnCenterClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
 titleBar.setOnRightTextClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
```
###### 3.4.4 addView--可支持TextView、ImageView、View

```
titleBar.addLeftAction(titleBar.new ImageAction(R.drawable.ic_close, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        }));
 View view = View.inflate(mContext, R.layout.layout_news_sliding, null);
            mSlidingTab = (SlidingTabLayout) view.findViewById(R.id.tabLayout_slidingNews);
 titleBar.addCenterAction(titleBar.new ViewAction(view));
 titleBar.addRightAction(titleBar.new ImageAction(R.drawable.fast_ic_close, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        }));
```

### 3.5 特殊场景处理

###### 3.5.1 底部输入框处理--IM常见用法参考[TitleEditActivity](https://github.com/AriesHoo/TitleBarView/blob/master/app/src/main/java/com/aries/title/TitleEditActivity.java)
```
//底部有输入框时使用--最后一个参数false
titleBar.setImmersible(mContext, true, true, false);
//设置根布局setFitsSystemWindows(true)
getRootView().setFitsSystemWindows(true);
//根布局背景色保持和titleBar背景一致
getRootView().setBackground(titleBar.getBackground());
//或者
getRootView().setBackgroundColor("TitleBarView背景色或者背景资源");
//注:软键盘弹起会透出根布局背景(即:TitleBarView背景色)
```
## 四、鸣谢

1、[https://github.com/bacy/titlebar](https://github.com/bacy/titlebar)

2、[https://github.com/sandalli/TitleBarLibs](https://github.com/sandalli/TitleBarLibs)

3、[https://github.com/laobie/StatusBarUtil](https://github.com/laobie/StatusBarUtil)
