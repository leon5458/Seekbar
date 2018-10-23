# Seekbar

## seekbar的方法
setProgress(int value)    设置滑块的位置
setMax(int value)    设置进度条的最大长度
setOnSeekBarChangeListener(OnSeekBarCHangeListener l) 设置SeekBar的进度改变事件

## 属性
android:secondaryProgress[integer] 设置第二进度，通常用做显示视频等得缓冲效果
android:thumb[drawable]设置滑块的图样
android:progressDrawable[drawable]设置进度条的图样
android:thumbOffset="0dip"   即可实现thumb滑块不被覆盖


