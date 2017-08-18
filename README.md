# TitleBarView
--------------------------
## 一、简介：

一个支持Android 4.4以上版本沉浸式及半透明状态栏效果的 TitleBarView;更全常见UI库参看 [UIWidget](https://github.com/AriesHoo/UIWidget)

#### TitleBarView是基于ViewGroup的扩展，主要具有以下特性


- 支持Android 4.4以上版本沉浸式（关于这个叫法大家不要去纠结,意会即可）及半透明状态栏效果

- 实现MIUI V6、Flyme 4.0、Android 6.0以上状态栏文字颜色切换(当然只能黑或白色)

- 支持设置主/副标题跑马灯效果

- 支持Java代码及XML设置众多自定义属性

- 可设置左边文字/图片、中间主、副标题、右边文字/图片

- 支持Java代码添加左边、中间、右边 View


说明:此处沉浸式状态栏为状态栏透明化且布局延伸至状态栏下效果，非状态栏着色模式

详情实现流程解析请移步:[Android自带沉浸状态栏效果标题栏控件-TitleBarView](http://www.jianshu.com/p/34ace867b29f)

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

## 三、鸣谢

1、[bacy/titlebar](https://github.com/bacy/titlebar)

2、[sandalli/TitleBarLibs](https://github.com/sandalli/TitleBarLibs)

3、[laobie/StatusBarUtil](https://github.com/laobie/StatusBarUtil)

