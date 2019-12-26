# OnePlusOxygenBusCardJumper

这只是一个小工具，用于在一加的氧OS系统上快速进入公交卡的功能。

## 问题在哪？

一加在国内的氢OS提供了公交卡功能，但氧OS去掉了它，即便你安装上“一加公交卡”APP也打不开，然而万能的酷安网友们找到了一个办法，可以通过隐式启动来调起公交卡的子界面，但在Android Q上，我没能成功的创建快捷方式到Launcher，于是愤怒的我在凌晨5点从床上爬起来做了这个小工具。

## 代码里有什么？

不建议你Fork或Star这个库，因为这里真的什么都没有，只有一个隐式调起的方法，这真的很基础，核心代码我放在下边：
```
Intent intent = new Intent();
intent.setAction("cn.oneplus.wallet.action.ALL_CARDS");
intent.addCategory("android.intent.category.DEFAULT");
intent.setPackage("cn.oneplus.wallet");
startActivity(intent);
```
软件启动后没有任何界面，正如你所见，只会去调起卡包界面而已，如果调起失败就会弹出一个提示，仅此而已。

真的很简单，但也挺好用，不是么？

## 我不会编程，我也想用

可以，请直接前往下载：

[下载“打开公交卡”工具](https://github.com/kongzue/OnePlusOxygenBusCardJumper/raw/master/release/%E6%89%93%E5%BC%80%E5%85%AC%E4%BA%A4%E5%8D%A1.apk)

一加公交卡的APP由于官方未提供外部下载地址，我这里放上一个备份，但更建议使用一加系统自带的应用商店下载最新版本！

[下载“一加公交卡2.4.0”](https://github.com/kongzue/OnePlusOxygenBusCardJumper/raw/master/release/cn.oneplus.wallet_2.4.0.190927222831.21baa08.apk)

本工具不需要任何权限，不会造成任何破坏，请放心使用。
