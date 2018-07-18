# Spring 4.x

#### Spring Framework 是一个开源的Java／Java EE全功能栈（full-stack）的应用程序框架，提供了一个简易的开发式，这种开发方式，将避免那些可能致使底层代码变得繁杂混乱的大量的属性文件和帮助类。

### 核心技术
#### Bean管理、IOC/DI依赖注入、AOP切面编程

### 代理模式

#### 是一种设计模式，主要解决在直接访问对象时代理的问题。通过代理对象访问目标对象，可以在目标对象实现的基础上，增加额外的功能，即扩展目标对象的功能。

#### 分类：

静态代理：由程序员创建或工具生成代理类的源码，再编译代理类，在程序运行前就产生了代理类的字节码文件，代理对象和目标对象的关系在程序运行前就决定了。

动态代理：在程序运行期间由JVM根据反射机制动态生成的，不存在代理类的字节码文件，代理对象和目标对象的关系是在程序运行时决定的。

#### 动态代理两种方式
JDK代理：要求目标对象必须有接口，根据接口动态产生实现类，并引用目标对象

CGLib代理：不要求目标对象有接口，动态产生目标对象的子类，调用目标对象的方法
### AOP
#### 开发步骤
1.导入maven配置
``` xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-aop</artifactId>
    <version>4.3.18.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-aspects</artifactId>
    <version>4.3.18.RELEASE</version>
</dependency>
```
2.创建通知类

3.配置aop

### 注解配置

#### Bean管理、IOC/DI、AOP

### Spring -JDBC

### Transaction





