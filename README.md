# TitleBarView
----------
[![fir.im](https://img.shields.io/badge/download-fir.im-blue.svg)](https://fir.im/pmb2)
[![](https://jitpack.io/v/AriesHoo/TitleBarView.svg)](https://jitpack.io/#AriesHoo/TitleBarView)
[![](https://img.shields.io/github/release/AriesHoo/TitleBarView.svg)](https://github.com/AriesHoo/TitleBarView/releases)
[![API](https://img.shields.io/badge/API-11%2B-green.svg?style=flat)](https://android-arsenal.com/api?level=11)
[![GitHub license](https://img.shields.io/github/license/AriesHoo/TitleBarView.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://img.shields.io/badge/简书-AriesHoo-blue.svg)](http://www.jianshu.com/u/a229eee96115)
[![](https://img.shields.io/badge/简书解析-Android自带沉浸状态栏效果标题栏控件TitleBarView-green.svg)](http://www.jianshu.com/p/34ace867b29f)
<!-- [![GitHub stars](https://img.shields.io/github/stars/AriesHoo/TitleBarView.svg)](https://github.com/AriesHoo/UITitleBarViewWidget/stargazers) -->
<!-- [![GitHub forks](https://img.shields.io/github/forks/AriesHoo/TitleBarView.svg)](https://github.com/AriesHoo/TitleBarView/network) -->
## 简介：

一个支持Android 4.4以上版本沉浸式及半透明状态栏效果的 TitleBarView;更全常见UI库参看 [UIWidget](https://github.com/AriesHoo/UIWidget)

**说明2.0.0以后版本UIWidget维护，不再做版本更新**

#### TitleBarView是基于ViewGroup的扩展，主要具有以下特性


- 支持Android 4.4以上版本沉浸式（关于这个叫法大家不要去纠结,意会即可）及半透明状态栏效果

- 实现MIUI V6、Flyme 4.0、Android 6.0以上状态栏文字颜色切换(当然只能黑或白色)

- 支持设置主/副标题跑马灯效果

- 支持Java代码及XML设置众多自定义属性

- 支持Java代码链式调用方便快捷

- 可设置左边文字/图片、中间主、副标题、右边文字/图片

- 支持Java代码添加左边、中间、右边 View


说明:此处沉浸式状态栏为状态栏透明化且布局延伸至状态栏下效果，非状态栏着色模式

详情实现流程解析请移步:[Android自带沉浸状态栏效果标题栏控件-TitleBarView](http://www.jianshu.com/p/34ace867b29f)

[[Sample PC Download]](https://github.com/AriesHoo/TitleBarView/blob/master/apk/sample.apk)  

[[Sample Mobile Download]](https://fir.im/pmb2)

![](https://github.com/AriesHoo/TitleBarView/blob/master/apk/qr.png)


**Gradle集成**

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
    // compile 'com.github.AriesHoo:TitleBarView:2.0.0'
     compile 'com.github.AriesHoo:TitleBarView:${LATEST_VERSION}'
}
```

## 录屏预览

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

## 鸣谢

- [bacy/titlebar](https://github.com/bacy/titlebar)

- [sandalli/TitleBarLibs](https://github.com/sandalli/TitleBarLibs)

- [laobie/StatusBarUtil](https://github.com/laobie/StatusBarUtil)

## License

```
Copyright 2016 Aries Hoo

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

