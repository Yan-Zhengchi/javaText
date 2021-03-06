## 1.按要求编写一个Java应用程序：

```
（1）定义一个类，描述一个矩形，包含有长、宽两种属性，和计算面积方法。
（2）编写一个类，继承自矩形类，同时该类描述长方体，具有长、宽、高属性，和计算体积的方法。
（3）编写一个测试类，对以上两个类进行测试，创建一个长方体，定义其长、宽、高，输出其底面积和体积
```

## 2.求结果：1

```
class A {
int i = 1;
 void print() {
     System.out.println(i);
 }
}
class B extends A {

static int i = 2;

 public static void main(String[] args) {
  B b = new B();
   b.print();
 }
} 
```

## 3.求输出结果：

## shape constructor   

## circle constructor



```
class Test {
	public static void main(String[] args) {
	new Circle();
	} 
}
class Draw {
	public Draw(String type) {
		System.out.println(type+" draw constructor");
	} 
}
class Shape {
	private Draw draw = new Draw("shape");
	public Shape(){
		System.out.println("shape constructor");
	}
}
class Circle extends Shape {
	private Draw draw = new Draw("circle");
	public Circle() {
		System.out.println("circle constructor");
	} 
}
```

## 4.求下面的结果:

## shape constructor
circle constructor
shape
this is circle
shape

```
public class Test {
	public static void main(String[] args) {
		Shape shape = new Circle();
		System.out.println(shape.name);
		shape.printType();
		shape.printName();
	}
}
class Shape {
	public String name = "shape";
	public Shape(){
		System.out.println("shape constructor");
	}
	public void printType() {
		System.out.println("this is shape");
	}
	public static void printName() {
		System.out.println("shape");
	}
}
class Circle extends Shape {
	public String name = "circle";
	public Circle() {
		System.out.println("circle constructor");
	}
	public void printType() {
		System.out.println("this is circle");
	}
	public static void printName() {
		System.out.println("circle");
	}
}
```

## 5.分析以下需求，并用代码实现

### 1.定义Person类

属性：姓名name、性别gender、年龄age、国籍nationality； 方法：吃饭eat、睡觉sleep，工作work。

### 2.根据人类，创建一个学生类Student

增加属性：学校school、学号stuNumber； 重写工作方法（学生的工作是学习）

### 3.根据人类，创建一个工人类Worker

增加属性：单位unit、工龄workAge； 重写工作方法（工人的工作是盖房子

### 4.根据学生类，创建一个学生干部类 StudentLeader

增加属性：职务job； 增加方法：开会meeting。 编写测试类分别对上述3类具体人物进行测试。

## 6.编写一个Java应用程序

设计一个汽车类Vehicle，包含的属性有车轮个数wheels和车重weight 小车类Car是Vehicle的子类，其中包含的属性有载人数loader。 卡车类Truck是Car类的子类，其中包含的属性有载重量payload。   每个类都有构造方法和输出相关数据的方法。最后，写一个测试类来测试这些类的功能

## 1.下面正确的是( b)

```
public class Pri extends Base{
	static int i = 200;
	public static void main(String argv[]){
		Pri p = new Pri();
		System.out.println(i);
	}
}
A.编译错误
B.200
C.100 200
D.100
```

## 2.下列程序运行结果是( c)。

```
class Base{
	Base(){
		int i = 100;
		System.out.println(i);
	}
}
public class Pri extends Base{
	static int i = 200;
	public static void main(String argv[]){
		Pri p = new Pri();
		System.out.println(i);
	}
}
A.编译错误
B.200
C.100 200
D.100
```

## 6.如何定义一个不能有子类的类Key( b)。

```
A.class Key { }
B.final class Key { }
C.public class Key { }
D.class Key {final int I;}
```

## 7.哪个选项可以做为以下方法的覆盖方法 )。ab

```
public void add(i nt a) {…}
A.public void add(int b) {…}
B.void add(int a) {…}
C.public int add(int a) {…}
D.public void add(float a) {…}
```

## 8.在子类构造方法的哪个地方可以调用超类的构造方法( b)。

```
A.任何地方
B.构造方法的第一条语句
C.构造方法的最后一条语句
D.不能在子类构造方法中调用超类的构造方法
```

## 9.下列程序的运行结果是(c )。

```
public class Test {
	public static void test() {
		this.print();
}
	public static void print() {
		System.out.println("Test");
}
	public static void main(String args []) {
		test();
	}
}
A.输出Test
B.无输出结果
C.类编译错误,指示不能在static上下文中使用this
D.以上都不对
```

## 10.设有如下代码:

```
1. class Example{
2. String str;
3. Example(){
4. str= "example";
5. }
6. Example(String s){
7. str=s;
8. }
9. }
10. class Demo extends Example{
11. }
12. public class Test{
13. public void f () {
14. Example ex = new Example("Good");
15. Demo d = new Demo("Good");
16. }
17. }
以下哪行将导致错误( 15  )。
A.第3行
B.第6行
C.第10行
D.第15行
```

## 11.在Java中,如下的修饰符不是访问控制修饰符( a)。

```
A.static
B.public
C.protected
D.private
```

## 12.试完成下述程序片段( d)。

```
public class Point{
  int x,y;
  public Point(int x,int y){
  ()=x;
  ( )=y;
}
...
}
A.Point.x Point.y
B.无解
C.x1 y1
D.this.x this.y
```

## 13.在JAVA 中( c)。

```
A.一个子类可以有多个父类,一个父类也可以有多个子类
B.一个子类可以有多个父类,但一个父类只可以有一个子类
C.一个子类只可以有一个父类,但一个父类可以有多个子类
D.上述说法都不对
```

## 14.什么是在子类中创建一个和父类具有一样特征的方法,特征包括方法名字,参数个数,参数类型和方法返回值类型(a )。

```
A.覆盖(overloading)
B.重载(overriding)
C.继承(inheritance)
D.none
```

## 15.哪个关键词在子类中用来访问与父类中一样的方法(a )。

```
A.super
B.this
C.static
D.以上没有
```

## 16.哪个关键词用来引用当前类的对象(b )。

```
A.super
B.this
C.static
D.以上没有
```

## 17.哪个修饰符定义的方法和变量只在定义它们的类中可见,而在其他的任何类中它们都不可见(c )。

```
A.protected
B.public
C.private
D.none of the above
```

## 编程题

### A.写一个名为Account的类模拟账户。该类包括的属性:账号id,余额balance,年利率annualInterestRate;

包含的方法:访问器方法(getter和setter方法),取款方法withdraw(),存款方法deposit()。 提示:在提款方法withdraw中,需要判断用户余额是否能够满足提款数额的要求,如果不能,应给出提示。

### B.创建Customer类。

```
a. 声明三个私有对象属性:firstName、lastName和account。
b. 声明一个公有构造器,这个构造器带有两个代表对象属性的参数(f和l)
c. 声明两个公有存取器来访问该对象属性,方法getFirstName和getLastName返回相应的属性。
d. 声明setAccount 方法来对account属性赋值。 
e. 声明getAccount 方法以获取account属性。
```

### C写一个测试程序。

```
(1)创建一个Customer ,名字叫 Jane Smith, 他有一个账号为1000,余额为2000元,年利率为 1.23% 的账户。
(2)对Jane Smith操作。
存入 100 元,再取出960元。再取出2000元。打印出Jane Smith 的基本信息
成功存入 :100.0,成功取出:960.0,余额不足,取款失败
Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23%, balance is 1140.0
```

上面这句话是Customer 类里面的一个display方法 被调用时候 就输出类似语句