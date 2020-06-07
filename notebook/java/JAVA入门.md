# 第一章 初识JAVA

***

## 1.1 CMD操作符的使用

***

启动：					Win+R
切换盘符：			 :+盘符名称
进入文件夹		 	cd 文件夹名称
进入多级文件夹	  cd 文件夹1\文件夹2\文件夹3
返回上一级			 cd ..
直接回根路径 		 cd \
查看当前内容		  dir
清理cmd内容		  cls
退出						exit

## 1.2 Java与Javac的区别

***

Javac负责将Java源代码编译成.class文件，这个.class文件可以被Java解释。
获得.class文件后，由Java将其解释成计算机可以理解的操作码与操作数。

## 1.3 第一个程序

***

Code:  HelloWorld.java
public class HelloWorld{
			poblic static void main (String[] args){
						System.out.println("Hello, World!");
	}
}

## 1.4 命名规范

***

* 硬性规定：硬性要求
  - 标识符可以包含[^英文字母26个（区分大小写）]、[^0-9个数字]、[^$美元符号]和[^下划线_]
  - 标识符不能以数字开头
  - 标识符不能是关键字
* 命名规范：软性建议
  * 类名规范：首字母大写，后面每个单词首字母大写（大驼峰式）
  * 变量名规范：首字母小写，后面每个单词首字母大写（小驼峰式）
  * 方法名规范：同变量名



# 第二章 常量

## 2.1 常量的分类

***

1. 字符串常量：用双引号引起来的部分，叫做字符串常量。例如：“abc”、“Hello”
2. 整数常量：直接写上的数字，没有小数点
3. 浮点数常量：直接写上的数字，包括小数点。
4. 字符常量：用单引号引起来的单个字符。
5. 布尔常量：只有两种取值。1、0
6. 空常量：null。代表没有任何数据。

## 2.2 基本数据类型

***

1. 整数型  byte 	short 	int	long
2. 浮点型  float     double
3. 字符型  char
4. 布尔型  boolean

Tip：整数当中默认类型是int。浮点数类型默认是double。如果在浮点数中一定要使用float类型，需要加上一个后缀F。
System.out.println(100.0F)
对于float和long类型来说，字符后缀F和L不要丢掉

## 2.3 类型转换

***

软类型转换：当数据从默认类型转换成范围更大类型时，系统会自动帮你转换。例如，当整数型int转换成long

强制类型转换：数据类型从大格式转换成小格式
例如：默认的double类型转换成float

## 2.4 ASCII码表

常用码表对应关系：
48-'0'
65-'A'
97-'a'

## 2.5 三元运算符

***

一元运算符：只需要一个数据就可以进行操作的运算符。例如：取反！、自增++、自减--
二元运算符：需要两个数据才可以进行操作的运算符。例如：加法+、赋值=
三元运算符：余姚三个数据才可以进行操作的运算符。

三元运算符格式：
数据类型	变量名称 = 条件判断 ？ 表达式A：表达式B；
流程：
首先判断条件是否成立：
		如果成立为true，那么将表达式A的值赋值给左侧的变量；
		如果不成立为false，那么将表达式B的值赋值给左侧的变量；

# 第三章 方法入门

***

## 3.1 方法概念

如果在实现main方法中将过多的代码放到一起，那么代码会十分冗杂，适当的将里面一些为实现同一功能而写的代码抽象出来，用一个new方法存放，接着再main中调用这个功能函数，会让main代码变得更加简洁。

## 3.2 定义方法

格式： 
public static void 方法名称 () {
			方法体
}

方法名称的命名规则和变量一样，使用小驼峰
方法体：大括号当中可以包含任意条语句

注意事项：

1. 方法定义的先后顺序无所谓。
2. 方法的定义不能产生嵌套包含关系。

## 3.3 调用方法

调用格式：方法名称（）；

## 3.4 Jshell 的简单使用

# 第四章 集成环境开发

集成开发环境，是一种专门用来提高Java开发效率的软件
IDEA里，最大的组织为Project，其次为Module，接着是Module，最小的才是代码文件。

## 4.1 IDEA快捷键

***



| 快捷键             | 功能                                   |
| ------------------ | -------------------------------------- |
| Alt+Enter          | 导入包，自动修正代码                   |
| Ctrl+Y             | 删除光标所在行                         |
| Ctrl+D             | 赋值光标所在行内容，插入光标位置下面   |
| Ctrl+Alt+L         | 格式化代码                             |
| Ctrl+/             | 单行注释，再按取消注释                 |
| Ctrl+Shift+/       | 选中代码注释，多行注释，再按取消注释   |
| Alt+Insert         | 自动生成代码，toString，get，set等方法 |
| Alt+Shift+上下箭头 | 移动当前代码行                         |



# 第五章 方法

## 5.1 方法的概念

***

方法是若干语句的功能集合

方法好比一个工厂。
蒙牛工厂		原料：奶牛、饲料、水
					  产出物：奶制品

工厂制造产出需要原料，而原料属于工厂的输入，产出物属于工厂的输出

## 5.2 参数与返回值

***

参数：进入方法的数据。
返回值：从方法中出来的数据。

## 5.3 定义方法的完整格式

***

修饰符	返回值类型	方法名称	（参数类型	参数名称，...）{
			方法体
			return	返回值；
｝

修饰符：现阶段的固定写法，public static
返回值类型：方法最终产生的数据结果是什么类型
方法名称：方法的名字，规则和变量一样，小驼峰
参数类型：进入方法的数据是什么类型
参数名称：进入方法的数据对应的变量名称

PS：参数如果有多个，使用逗号进行分隔
方法体：方法需要做的事情，若干行代码
return：两个作用，第一停止当天方法，第二将返回值返还给调用处
返回值：方法执行后最终产生的数据结果
return后面的返回值必须和方法名称前面的返回值类型，保持对应



## 5.4 方法的三种调用格式

***

```java
public class fangfashili{
    public static void main(String[] args){
        //单独调用
        sum(10,20);
        System.out.println("==========");
        //打印调用
        System.out.println(sum(10,20));
        System.out.println("==========");
        //赋值调用
        int number = sum(15,25);
        System.out.println("变量的值："+ number);
    }
    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }
}
```

## 5.4  有参数和无参数方法

有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数。

无参数：小括号当中留空。一个方法不需要任何数据条件，自己就能独立完成任务。

## 5.5 使用方法需要知道的事情

注意方法的三要素：

* 返回值类型
* 方法名称
* 参数列表

额外的注意事项：

1. 新定义的方法应该被包含在class类中，不能在方法中在定义一个方法。
2. 方法定义没有所谓的前后顺序，任何时候都可以在class内定义一个方法。
3. 方法定义后将不会被执行，如果希望执行，那么一定要在main方法中调用。
4. 关于return的使用，如果该方法有返回值，则必须使用return进行返回，除此之外，return的值必须与方法中定义的值对应。
5. 数据类型为void的方法不能用return返回值，但是可以使用return语句，void类型的方法中，return可以不写。
6. 一个方法中可以有多个return语句，但必须保证这个方法每次只会执行一个return语句。

## 5.6 方法的重载

定义：多个方法的名称一样，但是拥有不同的参数列表。
例如：

```java
isWay(int a, int b);
isWay(int a, int b, int c);
isWay(int a, int b, int c, int d);
```

方法的重载与下列因素无关：

1. 参数个数不同
2. 参数类型不同
3. 参数的多类型顺序不同

方法重载与下列因素无关：

1. 与参数的名称无关
2. 与方法的返回值类型无关



# 第六章 数组

## 6.1 概念

***

数组是一种容器，可以同时存放多个数据值

数组的特点：

1. 数组是一种引用数据类型
2. 数组当中的多个数据，类型必须统一
3. 数组的长度在程序运行期间不可改变

## 6.2 初始化

***

数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值。

两种常见的初始化方式：

1. 动态初始化（指定长度）
2. 静态初始化（指定内容）

动态初始化数组的格式：
数据类型[ ] 数组名称 = new 数据类型[数组长度]；
例如:` int [   ] arrayA = new int [100];`

静态初始化数组的格式：

基本格式：
数据类型[  ]  数组名称 = new 数据类型 [  ]  { 元素1， 元素2， ...};
例如：`int[  ]  arrayB = new int [  ] { 1, 2, 3, 4};`
静态初始化没有直接告诉系统其长度，但是系统会根据大括号里面的元素自动确定其长度。

省略格式：
数据类型[  ]  数组名称  =  { 元素1，元素2，...};
`int[ ]  arrayC = { 1, 2, 3, 4};`

动态初始化与静态初始化的标准格式可以拆分成两个步骤。

```java
int [] = arrayA;
arrayA = new int[20];

int [] = arrayB;
arrayB = new int[] { 1, 2, 3, 4};
```



初始化过程中，数组元素将会自动拥有一个默认值。规则如下：

| 类型 | 默认值   |
| ---- | -------- |
| 整数 | 0        |
| 浮点 | 0.0      |
| 字符 | '\u0000' |
| 布尔 | false    |
| 引用 | null     |

PS：静态初始化其实也有默认值，只不过系统马上将默认值替换成大括号内的值。

## 6.3 Java中的内存划分

***

Java的内存被划分为5个部分：

> 1. 栈（Stack）：存放的都是方法中的局部变量。方法的运行一定要在栈当中运行。
>
>    > 局部变量：方法的参数，或者是方法｛｝内部的变量
>    >
>    > 作用域：一旦超出作用域，立刻从栈内存当中消失。
>
> 2. 堆（Heap）：凡是new出来的东西，都在堆中。
>
>    > 堆内存里面的东西都有一个地址值：16进制
>    >
>    > 堆内存里面的数据，都有默认值。如则上面的表格。
>
> 3. 方法区（Method Area）：储存.class相关信息，包含方法的信息。
>
> 4. 本地方法栈（Native Method Stack）：与操作系统相关。
>
> 5. 寄存器（pc Register）:与CPU相关。

## 6.4 一个数组的内存图

***

参考bilibili[黑马Java零基础入门](https://www.bilibili.com/video/BV1Lf4y1U7Cz?p=86)P86

讲解的太好了

# 第七章 面向对象

## 7.1 面向对象的思想

现实例子：拿洗衣机与手洗衣服做例子，洗衣服需要人从脱衣服到晾衣服每一步都要亲力亲为，而洗衣机不用这么仔细，人们只需要将衣服放进去，其余的都交给洗衣机就行了。

抽象到Java当中的面向对象：这个对象其实再模仿现实中的一个客观事物。

## 7.2 类的定义

***

类需要有两个东西——成员变量、成员方法

例如我们这里定义一个类，用来模拟“母亲”事物。
																			对应到Java的类中：
属性：															成员变量：																	
		姓名																String name														
		年龄																int age
        身份																String identity
行为：
		吃饭																public void eat( )	{ }
		睡觉																public void sleep( )	{ }
		照顾孩子                             							public void takeCare( )	{ }
		做家务															 public void homework( )	{ }

## 7.3 类的创建

***

通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。

1. 导包：也就是指出需要使用的类，在什么位置：
   import 包名称.类名称;
   import xxxx;
   对于和当前类属于同一个包的情况，可以忽略导包语句不写。
2. 创建，格式：
   类名称    对象名   =   new   类名称（）；
   Student   stu  =  new   Student（）；
3. 使用，分为两类情况：
   使用成员变量：对象名.成员变量名
   使用成员方法：对象名.成员方法名（参数）
   总结：想用谁，就用对象名点谁。

## 7.3A 构造方法

构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法。

```java
//假设有一个Student的类
public static void main(String[] args){
    Student stu = new Student();
}
//构造方法如果不写，则编译器默认构造方法为空，如下所示：
public static void main(String[] args){
    
}
//执行构造方法将不会产生任何事情


```

思考：当Java在new一个新的对象的时候，如第3行语句，这个时候不仅会在堆中存放地址，同时会调用Student这个类中的构造方法。

构造方法的注意事项：

1. 构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
2. 构造方法不要写返回值类型，连void都不写。
3. 构造方法不能return一个具体的返回值。
4. 如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数、方法体什么事情都不做。
5. 一旦编写了至少一个构造方法，那么编译器将不再赠送空白构造方法。
6. 构造方法同样可以进行重载。

## 7.3B 定义一个标准的类

一个标准的类通常要拥有下面四个组成成分：

1. 所有的成员变量都要使用private关键字修饰
2. 为每一个成员变量编写一堆Getter/Setter方法
3. 编写一个无参数的构造方法
4. 编写一个全参数的构造方法

实例：（注意：Getter/Setter and generate 可以由IDEA自动生成）

```java
package Day03;

public class Demo05 {
    private String name;
    private int age;

    public Demo05(){
        System.out.println("无参方法顺利执行啦！");
    }
    public Demo05(String name,int age){
        System.out.println("全参方法顺利执行啦！");
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

```



## 7.4 API使用之Scanner操作

引用类型的使用步骤：

1. 导包
   import 包路径.类名称：
   如果需要使用的目标类，和当前类位于同一个包下，则可以省略包语句不写。

   导包只能在package后面，public class 前面写
   只有java.lang包下的内容不需要导包，其他的包都需要import语句。

2. 创建
   类名称 对象名 = new 类名称（）；

3. 使用
   对象名.成员方法名（）

使用实例：

```java
package Day03;
import java.util.Scanner;//导包操作
public class Demo_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//创建对象操作
        int num  = sc.nextInt();
        String str = sc.next();

        System.out.println(num);
        System.out.println(str);
    }
}

```

## 7.5 对象数组

在Java的数组中，数组可以存放基础类型以及引用类型数据，而Java的类属于引用类数据，因此在Java中，可以利用数组制作对象数组用来存放对象。
示例：

```java
public class Demo05_2 {
    public static void main(String[] args) {
        Demo05[] array = new Demo05[2];
        //Java 里面定义数组的方式如上，与C语言大同小异，记住Java的数组定义方式！
        Demo05 a = new Demo05("何东蓓",21);
        Demo05 b = new Demo05("周莉婷",20);
        array[0] = a;
        array[1] = b;
        System.out.println(array[1]);
        System.out.println("我叫" + array[1].getName() + "我现在的年龄是"+ array[1].getAge());
    }
}
```

数组的缺点在于，数组的长度一旦定义，就不能再被改变。



## 7.6  面向对象的三大特征

封装、继承、多态

7.6.1 封装性

> 封装性在Java当中的体现：
>
> 1. 方法就是一种封装
> 2. 关键字private也是一种封装
>
> 封装就是将一些细节信息隐藏起来，对于外界不可见
>
> > private关键字
> >
> > 每一个参数都需要一对getter setter来配合设置参数

private练习实例：

```java
//要想使用一个private一定在另外一个main程序中调用一个方法中的参数。
public class PersonalMessage {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

}
```





7.6.2继承性

继承的关键字：extends

继承主要解决的问题就是：共性抽取。
继承关系当中的特点：

1. 子类可以拥有父类的“内容”
2. 子类还可以拥有自己专有的内容。

对应到Java本身，就是在一个父类中定义一个方法，当子类继承父类的所有内容后，在一个地方使用子类的方法时，即使子类代码内你看不到父类的方法代码，但是却可以通过子类来调用父类的方法。

例如，我定义一个员工的父类，子类分别为讲师和辅导员，那么我在main方法中调用讲师和辅导员这个类的时候，可以通过讲师与辅导员的类来使用员工中的方法，这个就叫继承性。

继承格式：
定义父类的格式：（一个普通的类定义）
public class 父类名称｛
//			
｝

定义子类的格式：
public class 子类名称  extends 父类形成

操作实例：

父类

```java
package Day03;
//这里根据继承格式创建父类，使得子类可以继承父类的所有内容
public class Demo_03_01 {
    public void father(){
        System.out.println("方法执行承购了！");
    }
}

```

子类

```java
package Day03;
//这里根据子类继承格式创建子类，使得子类可以在父类的基础上创建一些额外的不一样的东西
//本子类无任何东西
public class Demo_03_02 extends Demo_03_01{
    //这个地方是子类，继承父类的方法
}
```

执行

```java
package Day03;
//这里创建一个实验类，实验一下学习的知识
public class Demo_03_03 {
    public static void main(String[] args) {
        Demo_03_02 a = new Demo_03_02();
        a.father();
    }
}
```

7.6.2.1 继承中成员变量的访问特点

在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：

> 直接方式：直接通过子类对象访问成员变量：
>
> > 等号左边是谁，就优先用谁，没有则向上寻找。
>
> 间接方式：通过成员方法访问成员变量：
>
> > 该方法属于谁，就优先用谁。

7.6.2.1 super关键字的三种使用方法

super参考父类的另外一个说法超类，意思是在子类中可以访问父类。
super关键字的用法有三种：

1. 在子类的成员方法中，访问父类的成员变量。
2. 在子类的成员方法中，访问父类的成员方法。
3. 在子类的构造方法中，访问父类的构造方法。

```java
public class Zi extends Fu{
    int num = 20;
    public Zi(){
        super();//访问父类的构造方法
    }
    public void methodZi(){
        System.out.println(super.num);//访问父类的num值
    }
    public  void method(){
        super.method();//访问父类的method
        System.out.println("访问父类的method");
    }
```

7.6.3 多态性

前面学习了面向对象的两个特征——封装性与继承性，今天学习面向对象的最后一个特性——多态性
extends继承或者implements实现，是多态性的前提。
一个人拥有多个身份，对应到面向对象中即为一个对象拥有多种形态，这就是面向对象的多态性。

7.6.3.1 多态性定义的格式

代码中体现多态性，其实就是：父类引用指向子类对象。

格式：
父类名称	对象名	=	new	子类名称（）；
或者：
接口名称	对象名	=	 new	实现类名称（）；

思考：引用子类对象时，当子类中不含此方法则向上在父类中寻找。

7.6.3.2  多态中成员变量的访问规则

访问规则与之前并无差别。
访问成员变量的两种方式：

1. 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上寻找。
2. 间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上寻找。

7.6.3.3 多态中成员方法的使用

在多态的代码中，成员方法的访问规则是：
		new的是谁就优先用谁，没有则向上寻找。

使用多态时，若使用Only子类含有的方法，那么编译无法通过。
口诀：编译看左边，运行看右边。

7.6.3.4 对象转型

![alt 对象转型图片](D:\code\hello-world\notebook\photo\MethodTranslate.png)

## 7.7 static关键字修饰成员

如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。

静态方法使用注意事项：

1. 一旦使用static修饰成员方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类的。
   如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
   如果有了static关键字，那么不需要创建对象，直接通过类名称来使用它。

2. 对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来进行调用。

   ```java
   //现在有一个MyClass的类，类里面method（）是成员方法，而methodStatic是静态方法。则
   public class Demo01 {
       public static void main(String[] args) {
           MyClass obj = new MyClass();
           obj.method();//创建对象后才可以使用method成员对象方法
           MyClass.methodStatic();//static修饰的静态方法可以直接通过MyClass调用
           obj.methodStatic();//同时也可以通过对象调用，但是不推荐，因为编译器会将其转为上面的方式进行调用
       }
   }
   ```

3. 无论是成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用。

   调用格式：
   静态变量：类名称.静态变量
   静态方法：类名称.静态方法（）

## 7.8 this关键字

super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三种：

1. 在本类的成员方法中，访问本类的成员变量。
2. 在本类的成员方法中，访问本类的另一个成员方法。
3. 在本类的构造方法中，访问本类的另一个构造方法。

思考：super 与 this 关键字有定位作用，在写代码的时候多加上super与this即能确保变量及方法用在正确的地方，同时也能帮助理解代码的内容。

## 7.9 抽象方法abstract的使用

抽象方法的定义：

1. 就是在定义方法的时候加上abstract关键字，然后去掉大括号，直接分号结束。
2. 抽象类：抽象方法所在的类，必须是抽象类才行。在class之前写上abstract即可。

抽象类与抽象对象的使用方法：

1. 不能直接创建new抽象类对象，必须用一个子类来继承父类。
2. 子类必须覆盖重写抽象父类当中所有的抽象方法——覆盖重写——子类去掉抽象方法的abstract关键字，然后补上方法体大括号。
3. 这样子就完成了一个子类方法的定义。之后便可创建一个子类对象进行使用。

思考：抽象对象与抽象类的关系——抽象类包含抽象对象

## 7.10 instanceof 使用

如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象	instanceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。

注意：向下转型的时候一定要注意用instanceof判断，否则可能会出现转型异常。

## 7.11 final关键字的使用

final关键字代表最终、不可改变的。

常见四种用法：

1. 修饰一个类

   格式：
   public final class 类名称｛

   ​		//......
   ｝//当前这个类不能有任何的子类。

2. 修饰一个方法
   当final关键字用来修饰一个方法的时候，这个方法就是最终方法，将不能被用来覆盖重写。

3. 修饰一个局部变量
   一旦使用final用来修饰局部变量，那么这个变量就不能进行更改——“一次赋值，终生不变！”
   `对于基本类型来说，不可变说的是变量当中的数据不可改变`
   `对于引用类型来说，不可变说的是变量当中的地址值不可改变`

4. 修饰一个成员变量
   `由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了`
   `对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值，二者选其一`
   `必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值`

注意事项：
对于类、方法来说，abstract关键字和final关键字不能同时使用，因为他们自相矛盾。

## 7.12 四种权限修饰符

| 权限大小               | public | protected | (default) | private |
| ---------------------- | ------ | --------- | --------- | ------- |
| 同一个类（我自己）     | ✔      | ✔         | ✔         | ✔       |
| 同一个包（我邻居）     | ✔      | ✔         | ✔         | ✖       |
| 不同包子类(我儿子)     | ✔      | ✔         | ✖         | ✖       |
| 不同包非子类（陌生人） | ✔      | ✖         | ✖         | ✖       |



## 7.13 内部类

如果一个事物的内部包含另一个事物，那么这就是一个类内部包含另一个类。
例如：身体和心脏的关系。又如：汽车和发动机的关系。

分类：

1. ### 成员内部类

   定义格式：

   ```java
   修饰符 class 外部类名称｛
       修饰符 class 内部类名称｛
   //...
           ｝
   //...
    ｝
   ```

   注意：内用外，随意访问；外用内，需要内部类对象。
   $在文件名命名的时候一般当做内部类标志
   `访问成员内部类的两种方式`
   间接方式：在外部类的方法当中，使用内部类；然后main只是调用外部类的方法。
   直接方式：套公式
   `【外部类名称.内部类名称 对象名 = new 外部类名称（）.new 内部类名称（）；】`
   如果在内部类中出现重名现象，那么格式是：
   `外部类名称.this.外部类成员变量名`

   ```java
   public class Outer{
       int num = 10;//外部类的成员变量
       public class Inner{
           int num = 20;//内部类的成员变量
           public void methodInner(){
               int num = 30;//内部类方法的局部变量
               System.out.println(num);//局部变量，就近原则
               System.out.println(this.num);//内部类的成员变量
               System.out.println(Outer.this.num)//外部类的成员变量
           }
       }
   }
   ```

   ### 2.局部内部类（包含匿名内部类）

如果一个类是定义在一个方法内部的，那么这就是一个局部内部类。
“局部”：只有当前所属的方法才能使用它，出了这个方法外面就不能用了。

定义格式：

```java
修饰符	class	外部类名称｛
    修饰符	返回值类型	外部类方法名称（）｛
    class	局部内部类名称｛
        //...
		｝
     ｝
｝
```

`局部内部类访问所在方法的局部变量`

局部内部类：如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】。

**备注**：从Java 8+ 开始，只要局部变量事实不变，那么final关键字可以省略。
*原因*：

1. new出来的对象在堆内存当中。
2. 局部变量是跟着方法走的，在栈内存当中。
3. 方法运行结束后，立刻出栈，局部变量就会立刻消失。
4. 但是new出来的对象会在堆当中持续存在直到来及回收消失。

3.匿名内部类

如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】。

匿名内部类的定义格式：
接口名称	对象名	=	new	接口名称（）｛

//覆盖重写所有抽象方法

｝；



# 第八章 集合

## 泛型

泛型：一种未知的数据类型，当我们不知道使用什么数据类型的时候，可以使用泛型`泛型可以看成是一个变量，用来接受数据类型`

`E e :Element元素`
`T t : Type 类型`

ArrayList集合在定义的时候，不知道集合中都会存储什么类型的数据，所以类型使用泛型。
E：未知的数据类型

![](D:\code\hello-world\notebook\photo\Element.png)

泛型使用的时候，未知类型的变化规律。

泛型通配符

？：代表任意的数据类型
使用方式：
		不能创建对象使用
		只能作为方法的参数使用

## 8.1 ArrarList()

ArrayList出现的原因：数组的长度不可以发生改变。但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说， 有一个尖括号<E>代表泛型。
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型。
注意：泛型只能是引用类型，不能是基本类型。

注意事项：
对于ArrayList集合来说，直接打印得到的是地址值，而是内容。
如果内容是空，得到的是空的中括号。

```java
//创建一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型数据
//备注：从JDK 1，7+ 开始，右侧的尖括号内部可以不写内容，但是<>尖括号本身还是要写的
ArrayList<String> list = new ArrayList<>();
System.out.println(list);
```

ArrayList常用方法

public boolean add(E  e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
但是对于其他集合来说，add的添加动作不一定成功。

public E get (int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。

public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。

public int size (  )： 获取集合的尺寸长度，返回值是集合中包含的元素个数。

思考：详细观察以上方法，其实所谓的ArrayList集合不过是Java中的一个类，因此使用起来与使用方法并无差异。

## 8.2 Collection集合

Collection集合框架

![CollectionList](D:\code\hello-world\notebook\photo\Collection.png)

Collection 常用功能

![Collection常用功能](D:\code\hello-world\notebook\photo\Collectionforuse.png)



## 8.3 List集合

`java.util.List`接口 extends Collection接口
List接口的特点：

1. 有序的集合，存储元素和取出元素的顺序是一致的（存储123，取出123）
2. 有索引，包含了一些带索引的方法
3. 允许存储重复的元素

List常用方法![](D:\code\hello-world\notebook\photo\Collection_List.png)

ArrayList集合

参考8.1

ArrayList集合底层是数组结构。因此其元素增删慢，查找快。

LinkedList集合

java.util.LinkedList集合  implements List接口
LinkedList集合的特点：

		1. 底层是一个链表结构：查询慢，增删快
  		2. 里边包含了大量操作首尾元素的方法
       注意：使用LinkedList集合特有的方法，不能使用多态

**常用方法**

![](D:\code\hello-world\notebook\photo\LinkList——Collection.png)

思考：创建LinkedList对象的时候，不可以使用多态。

## 8.4 Vector集合（了解）

同步且单线程的，速度较慢。

## 8.5 HashSet集合

java.util.Set接口  extends Collection接口

Set接口的特点：

1. 不允许存储重复的元素
2. 没有索引，没有带索引的方法，也不能使用普通的for循环遍历

`java.util.HashSet`结合  `implements Set`接口

HashSet特点：

1. 不允许存储重复的元素
2. 没有索引，没有带索引的方法，也不能使用普通的for循环遍历
3. 是一个无序的集合，存储元素和取出元素的顺序有可能不一致
4. 底层是一个哈希表结构（查询的速度非常的快）

HashSet实例：

```java
public class Demo01Set{
    public static main(String[] args){
        Set<Integer> set = new HashSet<>();//使用add方法
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        //使用迭代器遍历set集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n);/1,2,3
        }
        //使用增强for遍历set集合
        System.out.println("============");
        for (Integer i :set){
            System.out.println(i);
        }  
    }
}
```

哈希值

哈希值：是一个十进制的正数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到的地址，不是数据实际存储的物理地址）
在Object类有一个方法，可以获取对象的哈希值
int hashCode(  )返回该对象的哈希码值。
hashCode方法的源码：

```java
public native int hashCode();
native:代表该方法调用的是本地操作系统的方法
```

hashSet存储方式

![](D:\code\hello-world\notebook\photo\HashSet.png)

hashSet集合不能存储相同元素的原理

![](D:\code\hello-world\notebook\photo\hashCode1.png)

HashSet存储自定义类型元素

set集合存储的元素唯一：
		存储的元素（String，Integer，...Student，Person...），为实现存储元素唯一的原则，必须在类中重写hashCode以及equals方法。

## 8.6 LinkedHashSet集合



`java.util.LinkedHashSet`集合 extends HashSet
LinkedHashSet集合特点：
		底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序。

## 8.7 可变参数

可变参数：是JDK1.5之后出现的新特性

使用前提：
			当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可使用可变参数。

**使用格式：定义方法时使用**
			**修饰符   返回值类型   方法名（数据类型**...**变量名）{}**

可变参数的原理：
			可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这些参数
			传递参数的格式，可以是0个（不传递），1，2等多个。

注意事项：

1. 一个方法的参数列表，只能有一个可变参数
2. 如果方法的参数有多个，那么可变参数必须卸载参数列表的末尾

## 8.8 Collections集合工具类

**常用方法**

`java.utils.Collections`是集合工具类，用来对集合进行操作。

* **public static <T> boolean addAll(Collection)<T>c,T...elements):**往集合中添加一些元素。

* **public static void shuffle(List<?> list) **打乱顺序：打乱集合顺序。

* > **public static<T>void sort(List<T> list):**将集合中元素按照默认规则排序。
  > 注意：
  > sort(List<T> list)使用前提——被排序的集合里边存储的元素，必须实现Comparable，重写接口中的方法compareTo
  > **Comparable**接口的排序规则：
  >   自己（this）- 参数 ：升序

  Comparator 和 Comparable的区别：

  > Comparable：自己（this）和别人（参数）比较，自己需要实现Comparable接口，重写比较的规则comparableTo方法
  >
  > Comparator：相当于找一个第三方的裁判	

* public static <T>void sort(List<T>list,Comparator<? super T> ):将集合中元素按照指定规则排序

## 8.9 Map集合

* `Collection`中的集合，元素是孤立存在的（理解为单身），向集合中存储元素采用一个个元素的方式存储。
* `Map`中的集合，元素是成对存在的（理解为夫妻）。每个元素由键与值两部分组成，通过键可以找对应的值。
* `Collection`中的集合称为单列集合，`Map`中的集合称为双列集合。
* 需要注意的是，`Map`中的集合不能包含重复的键，值可以重复；每个键只能对应一个值。

`HashMap`集合的特点：

1. HashMap集合底层是哈希表：查询的速度特别的快
   		JDK1.8之前：数组+单向链表
      		JDK1.8之后：数组+单向链表/红黑树（链表的长度超过8）：提高查询的速度
2. HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致。

`LinkedHashMap`的特点：

1. LinkedHashMap集合底层是哈希表+链表（保证迭代的顺序）
2. LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的。

Map集合的常用方法

* put(K  key,  V  value):把指定的键与指定的值添加到Map集合中。

  > 返回值：V
  > 			存储键值对的时候，key不重复，返回值V是null
  > 			存储键值对的时候，key重复，会使用新的value替换map中重负的value

* remove(Object key)：把制定的键  所对应的键值对元素  在Map集合中删除，返回被删除元素的值。

  > 返回值：V
  > 			key存在，V返回被删除的值
  >
  > ​			key不存在，V返回null

* get(Object key)根据指定的键，在Map集合中获取对应的值。

  > 返回值：
  > 			key存在，返回对应的value值
  > 			key不存在，返回null

* containsKey(Object key) 判断集合中是否包含指定的键。

  > 包含返回true，不包含返回false

Map集合遍历

* **通过键找值的方式**
  Map集合中的方法：
  		Set<K> keySet(  ) 返回此映射中包含的键的Set视图。
  实现步骤：
  1. 使用Map集合中的方法keySet（），把Map集合所有的key取出来，存储到一个Set集合中
    2. 遍历set集合，获取Map集合中的每一个key
    3. 用Map集合中的方法get（key），通过key找到value

![](D:\code\hello-world\notebook\photo\MapKeyValue.png)

实例：

```java
package Day10;

import java.util.HashMap;//导包操作
import java.util.Map;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) {
        show1();
    }
    private static void show1() {
        Map<String, Integer>  map  = new HashMap<>();
        map.put("易烊千玺",20);//导入数据进入map集合
        map.put("王俊凯",21);
        map.put("何东蓓",20);
        System.out.println(map);//map集合中重写了toString方法
        Set<String> set = map.keySet();
       	//第一种方法，通过增强for循环
        System.out.println(set);
        for (String s :set){
            int a = map.get(s);
            System.out.println(a);
        //第二种方法，使用迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()/*判断set集合内是否还能继续取出数据*/){
            String key = it.next();//取出数据
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        }
    }
}
```

Entry键值对对象

Map.Entry<k,V>:在Map接口中有一个内部接口Entry
作用：当Map集合一创建，那么就会在Map集合中创建一个Entry对象，用来记录键与值（键值对对象，键与值的映射关系）

LnkedHashMap

Map接口的哈希表和链接列表实现，具有可预知的迭代顺序
底层原理：
			哈希表+链表（记录元素的顺序）

## 8.10 静态方法of

JDK9的新特性：
		List接口，Set接口，Map接口：里边添加了一个静态的方法of，可以给集合一次性添加多个元素
		使用前提：
						当集合中存储的元素的个数已经确定了，不在改变时使用

​		注意：

				1. of方法只适用于List、Set、Map接口，不适用于接接口的实现类
   				2. of方法的返回值是一个不能改变的集合，集合不能再使用add，put方法添加元素，会抛出异常
                        				3. Set接口和Map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常





# 第九章 接口

## 9.1 接口的定义

接口是一种公共规范，属于引用数据类型，最重要的内容就是其中的抽象方法。

定义格式：（接口的地位与class地位相当）

```java
public interface 接口名称 {
    //接口内容
}
//换成interface关键字后，编译生成的字节码文件仍然是:java --> .class
/*
接口中可以包含的内容有：
1.常量
2.抽象方法
3.默认方法
4.静态方法
5.私有方法
*/
```

## 9.2 Iterator接口（迭代器）

对 Collection 进行迭代的迭代器。
Iterator接口常用方法![](D:\code\hello-world\notebook\photo\Iterator.png)



增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写，是JDK1.5之后出现的新特性
`Collection<E>extends Iterable<E>:`所有的单列集合都可以使用增强for
`public interface Iterable<T>`实现这个接口允许对象成为"foreach"语句的目标。

**增强for循环**：用来遍历集合和数组

**格式**：
		for（集合/数组的数据类型	变量名：集合名/数组名）｛

sout (变量名）；
｝



# 第十章 简单数据结构

## 10.1 栈

![](D:\code\hello-world\notebook\photo\Date_stack.png)

## 10.2 队列

![](D:\code\hello-world\notebook\photo\Date_queue.png)

## 10.3 数组

![](D:\code\hello-world\notebook\photo\Array.png)

## 10.4 链表

![](D:\code\hello-world\notebook\photo\Date_LinkedList.png)

## 10.5 红黑树



![](D:\code\hello-world\notebook\photo\Date_BinaryTree.png)





# 

# 第十一章 基础类

## 11.1 Object类

java.lang.Object类中的Object是类结构的父类。每个类都使用Object作为超类。所有对象（包括数组）都实现这个类的方法。

**toString方法**

toString方法，直接使用toString方法打印对象的时候只能打印出对象的内存地址，为了得到toString方法设置的功能，必须在使用toString方法前将toString功能进行重写。重写的时候可以利用constructor直接获得toString重写值。

```java
    @Override
    public String toString() {
        return "Fu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
```



**equals方法**

创建的类默认继承了object类，所以可以使用Object类的equals方法
boolean equals(Object obj)指示其他某个对象是否与此对象“相等”。
equals 方法源码：

```java
public boolean equals (Object obj){
    return (this == obj0);
}
```

参数：
		Objcet obj:可以传递任意的对象
		== 比较运算符，返回的是一个布尔值
		基本数据类型：值比较
		引用数据类型：对象地址比较
综上所述：未重载的equals方法只能比较对象的地址值
为了使equals方法可以比较对象的属性，那么equals需要重载。

```java
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fu fu = (Fu) o;
        return age == fu.age &&
                Objects.equals(name, fu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
```



## 11.2 Data类

**毫秒值的概念**

java.util.Date：表示日期和时间的类
类Date表示特定的瞬间，精确到毫秒。
毫秒：千分之一秒 1000毫秒=1秒
特定的瞬间：一个时间点，一刹那时间

毫秒值的作用：可以对时间和日期进行计算
2099-01-03 到  2088-01-01 中间共有多少天
可以日期转换为毫秒进行计算，计算完毕，在把毫秒转换为日期

把日期转换为毫秒：
		当前的日期：2088-01-01
		时间原点（0毫秒）：1970 年 1 月 1 日 00：00：00（英国格林威治）
		就是计算当前日前到时间远点之间一共经历了多少毫秒
	注意：
		中国属于东八区，会把时间增加8个小时

​		把毫秒转换为日期：
​		1 天 = 24 * 60 * 60 = 86400 秒 = 86400 * 1000 = 86400000毫秒

**Date类的构造方法和成员方法**

**构造方法**

Date类的无参数构造方法
Data（）表示获取当前系统的日期和时间。

```java
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
```

Data类的带参数构造方法

```java
    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);
    }
```

**成员方法**

getTime方法
获取当前日期的毫秒值（起始时间为1970年7月1日）

```java
    private static void demo03() {
        Date time = new Date();
        System.out.println(time.getTime());
    }
```

**DateFormat**

`java.text.DateFormat`是日期/时间格式化子类的抽象类，我们通过这个类可以帮我们完成日期和文本之间的转换，也就是可以在Date对象与String对象之间进行来回转换。

* **格式化**：按照指定的格式，从Date对象转换为String对象。
* **解析**：按照指定的格式，从String对象转换为Date对象。

**构造方法**

由于DateFormat为抽象类，不能直接使用，所以需要常用的子类`java.text.SimpleDateFormat`。这个类需要一个模式（格式）来指定格式化或解析的标准。构造方法为：

* `public SimpleDateFormat(String pattern):用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat。

参数pattern是一个字符串，代表日渐时间的自定义格式。

**格式规则**

| 标识字母（区分大小写） | 含义 |
| ---------------------- | ---- |
| y                      | 年   |
| M                      | 月   |
| d                      | 日   |
| H                      | 时   |
| m                      | 分   |
| s                      | 秒   |



**使用规则**

`java.text.DateFormat`：是日期/时间格式化子类的抽象类
作用：
		格式化（日期 ----  文本）、解析（文本  ---- 日期）
成员方法：
		**String format（Date date）**按照指定的模式，把Date日期，格式化为符合模式的字符串
		**Date parse（String source）**把符合模式的字符串，解析为Date日期
DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat类的子类，`java.text.DateFormat extends DateFormat`

构造方法：
		`SimpleDateFormat(String pattern)`
			用给定的模式和默认语言环境的日期格式符号构造  `SimpleDateFormat`。
			参数：
					String pattern：传递指定的模式

**使用方法**

**String format（Date date）**
使用DateFormat类中的方法format，把日期格式化为文本
使用步骤：

		1. 创建SimpleDateFormat对象，构造方法中传递指定的模式
	
	 		2. 调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串（文本）

**Date parse（String source）**

使用DateFormat类中的方法parse，把文本解析为日期
使用步骤：

1. 创建SimpleDateFormat对象，构造方法中传递指定的模式
2. 创建SimpleDateFormat对象中的方法parse，把符合构造方法中的模式的字符串，解析为Date日期

注意：parse方法生命了一个异常叫ParseException
如果字符串和构造方法的模式不一样，那么程序就会抛出此异常
调用一个抛出了异常的方法，就必须处理这个异常，要么throws继续抛出，要么try catch自己处理。



## 11.3 Calender类



## 11.4 System类

`java.lang.System`类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，常用的方法有：

* `public static long currtTimeMillis()`:返回以毫秒为单位的当前之间。
* `public static void arraycopy(object src, int srcPos, Object dest, int destPos, int lengt)`:将数组中指定的数据拷贝到另一个数组中。

**currentTimeMillis方法**

实际上，currentTimeMillis方法就是获取当前系统时间与1970年01月01日00：00之间的毫秒差值

```java
package Day09;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//由于System包位于java.lang包下，所以不需要导包
    }
}
```



**arraycopy方法**

`public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length):`将数组中指定的数据拷贝到另一个数组中。

参数：
		src - 源数组
		srcPos - 源数组中的起始位置
		dest - 目标数组
		destPos - 目标数据中的起始位置
		length - 要复制的数组元素的数量

```java
package Day09;

public class Demo05 {
    public static void main(String[] args) {
        int[]  arrayA = new int[]{1,2,3,4,5,6,7};
        int[]  arrayB = new int[]{8,9,10,11,12};
        System.arraycopy(arrayA,0,arrayB,0,3);
        for (int i = 0;i<7;i++){
            System.out.print(arrayA[i]);

        }            System.out.println();
        for (int i = 0;i<5;i ++){
            System.out.print(arrayB[i]);
        }
    }
}

```



使用技巧：其实就是将目标数组的指定位置由源数组的指定位置直接覆盖。

## 11.5 StringBuilder类

字符串缓冲区，可以提高字符串的操作效率（看成一个长度可以变化的字符串）
**StringBuilder在内存中始终是一个数组，占用空间少，效率高**
如果超出了StringBuilder的容量，会自动的扩容

**构造方法**

​		`StringBuilder() `构造一个不带任何字符的字符串生成器，其初始容量为16个字符。

​		`StringBuilder(String str)`构造一个字符串生成器，并初始化为指定的字符串内容。

**成员方法**

​		`StringBuilder`的常用方法：
​				`public StringBuilder append(...)`：添加任意类型数据的字符串形式，并返回当前对象自身。
​		使用append方法往StringBuilder中添加数据，append方法返回的是this。



## 11.6 包装类

包装类的概念：将基本数据类型放到一个类中进行操作，这叫包装。

**装箱与拆箱**

**装箱**：把基本类型的数据，包装到包装类中（基本类型的数据-包装类）
	构造方法：
		Integer（int value）构造一个新分配的Integer对象，它表示指定的int值
		Integer（String s）构造一个新分配的Integer对象，它表示String参数所指定的int值。
	静态方法：

​		static Integer valueOf(int i)返回一个表示指定的int值的Integer实例。
​		static Integer valueOf(Sting s)返回保存指定的String 的值的Integer对象。

**拆箱**：在包装类中取出基本类型的数据（包装类 - 基本数据类型）
	成员方法：
		int intValue（）以int类型返回Integer的值。

**自动装箱与自动拆箱**

基本类型的数据和包装类之间可以自动的相互转换

```java
Integer in = 1;//相当于 Integer in = new Integer(1);
/*
自动拆箱：in 是包装类，无法直接参与运算，可以自动转换为基本数据类型，在进行计算
in + 2;就相当于 in.intVale()+2 = 3
接着 in  =  in.intvale() + 2 =3 又进行自动装箱
```



# 第十二章 异常

## 12.1 **异常概念**

> **异常：**指的是程序在运行过程中，出现的非正常的情况，最终会导致JVM的非正常停止。

在Java等面向对象的编程语言中，异常本身是一个类，产生异常就是创建异常对象并抛出一个异常对象。Java处理异常的方式是中断处理。

> 异常指的并不是语法错误，语法错了，编译不通过，不会产生字节码文件，根本不能运行。

**异常体系**

异常机制其实是帮助我们**找到**程序中的问题，异常的根类是`java.lang.Throwable`,旗下有两个子类：`java.lang.Error`与`java.lang.Exception`，平常所说的异常是指`java.lang.Exception`

![](D:\code\hello-world\notebook\photo\Exception.png)

**异常原理**

![](D:\code\hello-world\notebook\photo\Exceptiondeep.png)

## 12.2 异常处理

**throw**关键字
作用：
		可以使用throw关键字在指定的方法中抛出指定的异常
使用格式：
		throws new xxxException（“异常产生的原因”）；
注意：

  1. throw关键字必须写在方法的内部

  2. throw关键字后边new的对象必须是Exception或者Exception的子类对象

  3. throw关键字抛出指定的异常对象，我们就必须处理这个异常对象

     > throw关键字后边创建的是RuntimeException或者是 RuntimeException的子类对象，我们可以不处理， 默认交给JVM处理(打印异常对象，中断程序)
     >
     > throw关键字后边创建的是编译异常，我们就必须处理这个异常，要么throws，要么try catch 

**Objects非空判断**

当需要用到空内容判断的时候，不需要自己写详细的判断代码，直接利用Objects中的子方法来实现判断（throw）的要求
**Objects.requireNonNull()**

**第一种异常处理方式   声明异常throws**

throws关键字：异常处理的第一种方式，交给别人处理
作用：
		当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象
		可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理

注意：

1. throws关键字必须写在方法声明处
2. throws关键字后边声明的异常必须是Exception或者是Exception的子类
3. 方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常**如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
4. 调用了一个声明抛出异常的方法，我们就必须的处理声明的异常，要么继续使用throws声明抛出，交给方法的调用者处理，最终交给JVM，要么try...catch自己处理异常

**第二种异常处理方式   捕获异常 try...catch**

try...catch：异常处理的第二种方式，自己处理异常
格式：
	try｛
可能产生异常的代码｝catch（定义一个异常的变量，用来接收try中抛出的异常对象）｛
异常的处理逻辑，一般在工作中，会把异常的信息记录到一个日志何总｝...
catch(异常类名 变量名)
｛｝
**注意**：

1. try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
2. 如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try...catch之后的代码

**Throwable类的三种异常处理方法**

1. getMessage()：获取简单的异常描述信息
2. toString（）：获取一般的异常描述信息
3. printStackTrace( )：打印最详细的异常描述信息

**finally代码块**

用于异常处理的时候，无论异常是否发生，finally代码块内的内容都需要被执行。

注意：

1. finally不能单独使用，必须和try一起使用
2. finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要进行资源释放（IO）

**多个异常捕获的处理方式**

1. 多个异常分别处理
2. 多个异常一次捕获，多次处理
3. 多个异常一次捕获一次处理

**子父类异常**

> 如果父类抛出了多个异常，子类重写父类方法时
>
> > 1. 抛出和父类相同的异常
> > 2. 父类异常的子类
> > 3. 不抛出异常
>
> 父类方法没有抛出异常，子类重写父类方法时也不可抛出异常。此时子类产生该异常，只能try...catch**捕获**处理，不能声明抛出

## 12.3 自定义异常

​			java提供的异常类，不够我们使用，需要自己定义一些异常类
格式：
​		public calss XXXEXception extends Exception | RuntimeException{
添加一个空参数的构造方法
添加一个带异常信息的构造方法}
注意：

1. 自定义异常类一般都时以Exception结尾，说明该类是一个异常类

2. 自定义异常类，必须的继承Exception或者RuntimeException

   > 继承Exception：那么自定义的异常类就是一个编译器异常，如果方法内部抛出了编译器异常，就必须处理这个异常，要么throws，要么try....catch
   > 继承RuntimeException：那么自定义的异常类就是一个运行期异常，无需处理，交给虚拟机处理（中断处理）

实例：

```java
public class RegisterException extends Exception {
        public RegisterException(){
            super();
        }
        public RegisterException(String meassage){
            super(meassage);
        }
    }
```

# 第十三章 IO流

**顶层概念**

|        | 输入流                            | 输出流                             |
| ------ | --------------------------------- | ---------------------------------- |
| 字节流 | 字节输入流<br /><br />InputStream | 字节输出流<br /><br />OutputStream |
| 字符流 | 字符输入流<br /><br />Reader      | 字符输出流<br /><br />Writer       |

## 13.1 字节流



  