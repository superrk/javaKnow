<!--
 * @Description: In User Settings Edit
 * @Author: your name
 * @Date: 2019-08-17 11:04:47
 * @LastEditTime: 2019-08-17 11:41:19
 * @LastEditors: Please set LastEditors
 -->
- 1.2 hashCode与equals
面试官可能会问你：“你重写过 hashcode 和 equals 么，为什么重写equals时必须重写hashCode方法？”

   - 1.2.1 hashCode()介绍        
   hashCode() 的作用是获取哈希码，也称为散列码；它实际上是返回一个int整数。这个哈希码的作用是确定该对象在 哈希表中的索引位置。hashCode() 定义在JDK的Object.java中，这就意味着Java中的任何类都包含有hashCode() 函 数。另外需要注意的是： Object 的 hashcode 方法是本地方法，也就是用 c 语言或 c++ 实现的，该方法通常用来将 对象的 内存地址 转换为整数之后返回。
   散列表存储的是键值对(key-value)，它的特点是：能根据“键”快速的检索出对应的“值”。这其中就利用到了散列码！ （可以快速找到所需要的对象）
     
   - 1.2.2 为什么要有hashCode 
   我们以“HashSet如何检查重复”为例子来说明为什么要有hashCode：   
   当你把对象加入HashSet时，HashSet会先计算对象的hashcode值来判断对象加入的位置，同时也会与其他已经加 入的对象的hashcode值作比较，如果没有相符的hashcode，HashSet会假设对象没有重复出现。但是如果发现有相 同hashcode值的对象，这时会调用equals（）方法来检查hashcode相等的对象是否真的相同。如果两者相同， HashSet就不会让其加入操作成功。如果不同的话，就会重新散列到其他位置。（摘自我的Java启蒙书《Head ﬁst java》第二版）。这样我们就大大减少了equals的次数，相应就大大提高了执行速度。
   - 1.2.3 hashCode()与equals()的相关规定 
   1. 如果两个对象相等，则hashcode一定也是相同的 
   2. 两个对象相等,对两个对象分别调用equals方法都返回true
   3. 两个对象有相同的hashcode值，它们也不一定是相等的
   4. 因此，equals方法被覆盖过，则hashCode方法也必须被覆盖 
   5. hashCode()的默认行为是对堆上的对象产生独特值。如果没有重写hashCode()，则该class的两个对象无论如何 都不会相等（即使这两个对象指向相同的数据


## tips:
`1. hash%length==hash&(length-1)的前提是 length 是2的 n 次方`
