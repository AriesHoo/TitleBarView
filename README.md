# TitleBarView
--------------------------
## 一、简介：

一个支持Android 4.4以上版本沉浸式及半透明状态栏效果的 TitleBarView;更全常见UI库参看 [UIWidget](https://github.com/AriesHoo/UIWidget)

1、支持文xml及java代码设置各种属性;

2、可动态设置左边、中间、右边布局 实现复写;

3、可动态控制状态栏是否沉浸及状态栏透明度

4、实现MIUI V6、Flyme 4.0、Android 6.0以上状态栏文字颜色切换（黑、白）。

[[Sample PC Download]](https://github.com/AriesHoo/TitleBarView/blob/master/apk/sample.apk)  

[[Sample Mobile Download]](https://fir.im/pmb2)

![](https://github.com/AriesHoo/TitleBarView/blob/master/apk/qr.png)

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
    // compile 'com.github.AriesHoo:TitleBarView:1.7.0'
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

## 三、实用方法

**3.1 属性**
```
<declare-styleable name="TitleBarView">
        <attr name="title_immersible" format="boolean"/>
        <attr name="title_outPadding" format="dimension"/>
        <attr name="title_actionPadding" format="dimension"/>
        <attr name="title_centerGravityLeft" format="boolean"/>

        <attr name="title_statusColor" format="color"/>
        <attr name="title_statusResource" format="reference"/>
        <attr name="title_dividerColor" format="color"/>
        <attr name="title_dividerResource" format="reference"/>
        <attr name="title_dividerHeight" format="dimension"/>
        <attr name="title_dividerVisible" format="boolean"/>

        <attr name="title_leftText" format="string"/>
        <attr name="title_leftTextSize" format="dimension"/>
        <attr name="title_leftTextColor" format="color"/>
        <attr name="title_leftTextBackgroundColor" format="color"/>
        <attr name="title_leftTextBackgroundResource" format="reference"/>
        <attr name="title_leftTextDrawable" format="reference"/>
        <attr name="title_leftTextDrawablePadding" format="dimension"/>

        <attr name="title_titleMainText" format="string"/>
        <attr name="title_titleMainTextSize" format="dimension"/>
        <attr name="title_titleMainTextColor" format="color"/>
        <attr name="title_titleMainTextBackgroundColor" format="color"/>
        <attr name="title_titleMainTextBackgroundResource" format="reference"/>
        <attr name="title_titleMainTextFakeBold" format="boolean"/>
        <attr name="title_titleMainTextMarquee" format="boolean"/>

        <attr name="title_titleSubText" format="string"/>
        <attr name="title_titleSubTextSize" format="dimension"/>
        <attr name="title_titleSubTextColor" format="color"/>
        <attr name="title_titleSubTextBackgroundColor" format="color"/>
        <attr name="title_titleSubTextBackgroundResource" format="reference"/>
        <attr name="title_titleSubTextFakeBold" format="boolean"/>
        <attr name="title_titleSubTextMarquee" format="boolean"/>

        <attr name="title_rightText" format="string"/>
        <attr name="title_rightTextSize" format="dimension"/>
        <attr name="title_rightTextColor" format="color"/>
        <attr name="title_rightTextBackgroundColor" format="color"/>
        <attr name="title_rightTextBackgroundResource" format="reference"/>
        <attr name="title_rightTextDrawable" format="reference"/>
        <attr name="title_rightTextDrawablePadding" format="dimension"/>

        <attr name="title_actionTextSize" format="dimension"/>
        <attr name="title_actionTextColor" format="color"/>
        <attr name="title_actionTextBackgroundColor" format="color"/>
        <attr name="title_actionTextBackgroundResource" format="reference"/>
    </declare-styleable>
```

属性名 | 说明 | 默认值
:----------- | :----------- | :-----------
title_immersible         | 是否状态栏沉浸  | true
title_outPadding         | 左右TextView边距        | 12dp
title_actionPadding         | 添加自定义控件左右边距        | 1dp
title_centerGravityLeft         | 标题Layout是否左对齐        | false
title_statusColor         | 状态栏背景色        | -1
title_statusResource         | 状态栏背景资源  | -1

## 四、鸣谢

1、[https://github.com/bacy/titlebar](https://github.com/bacy/titlebar)

2、[https://github.com/sandalli/TitleBarLibs](https://github.com/sandalli/TitleBarLibs)

3、[https://github.com/laobie/StatusBarUtil](https://github.com/laobie/StatusBarUtil)
