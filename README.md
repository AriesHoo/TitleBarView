# TitleBarView
--------------------------
### 一、简介：

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
    // compile 'com.github.AriesHoo:TitleBarView:1.5.0'
     compile 'com.github.AriesHoo:TitleBarView:${LATEST_VERSION}'
}
```

### 二、录屏预览

Android 4.4

![](https://github.com/AriesHoo/TitleBarView/blob/master/screenshot/4.4.gif)

Android 5.1

![](https://github.com/AriesHoo/TitleBarView/blob/master/screenshot/5.1.gif)

Android 6.0

![](https://github.com/AriesHoo/TitleBarView/blob/master/screenshot/6.0.gif)

Android 7.0

![](https://github.com/AriesHoo/TitleBarView/blob/master/screenshot/7.0.gif)

其它UI库查看:[UIWidget](https://github.com/AriesHoo/UIWidget)

### 三、鸣谢

1、[https://github.com/bacy/titlebar](https://github.com/bacy/titlebar)

2、[https://github.com/sandalli/TitleBarLibs](https://github.com/sandalli/TitleBarLibs)

3、[https://github.com/laobie/StatusBarUtil](https://github.com/laobie/StatusBarUtil)
