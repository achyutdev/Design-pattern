##Design Pattern 

I have coded this design pattern while taking the course **Foundations of Programming: Design Patterns** from **Lynda.com** . 

###Decorator Pattern

This pattern attaches additional responsibilities to object dynamically. Decorators provide a flixible alternative to sub classing for extending functionality.

![decorator](https://github.com/achyutdev/Design-pattern/blob/master/decorator.jpg)

###Factory Pattern

Factory Method Pattern defines an interface for creating an object but lets sub classes decide which class to instantiate. Factory Method lets a class defer instantiation to sub class.
![Factory](https://github.com/achyutdev/Design-pattern/blob/master/factory.jpg)

###Iterator Pattern
It provides a way to access the elements of an aggregate object squencetially without exposing its underlying representation.

![Iterator](https://github.com/achyutdev/Design-pattern/blob/master/iterator.jpg)

###Observer Pattern
The observer pattern defines a one to many dependency between objects so that when one object changes state, all of its dependent are notidied and updated automatically.

![Observer](https://github.com/achyutdev/Design-pattern/blob/master/observer.jpg)

###Singleton Pattern
This pattern ensure a class has only one instance and provides a global access point to it.
####classic way of creating singleton
This singleton class is not thread safe. 

```Java
public Singleton{
  private static Singleton instance;
  
  private Singleton(){}
  
  public static Singleton getInstance(){
    if(instance == null){
      instance =new Singleton();
      }
    return instance;
  }
}
```
There is two other way to make above singleton class thread save. 

#### Static singleton instance method
The is one way to creating singleton. This way of singleton creation is good for those application which use singleton object always. The singleton class always create singleton instance while loading class because the singleton object is in static field. If the application does not need to use singleton object often, this method will be costly. But this is alway thread safe. 
```Java
public Singleton{
  private static Singleton instance = new Singleton();
  
  private Singleton(){}
  
  public static Singleton getInstance(){
    return instance;
  }
}
```

#### Using synchronizer


```Java
public Singleton{
  private static Singleton instance;
  
  private Singleton(){}
  
  public static synchronizer  Singleton getInstance(){
    if(instance == null){
      instance =new Singleton();
      }
    return instance;
  }
}
```



