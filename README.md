# Spring 4.x

#### Spring Framework 是一个开源的Java／Java EE全功能栈（full-stack）的应用程序框架，提供了一个简易的开发式，这种开发方式，将避免那些可能致使底层代码变得繁杂混乱的大量的属性文件和帮助类。

### 核心技术
#### Bean管理、IOC/DI依赖注入、AOP切面编程

### 代理模式

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





