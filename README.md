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
