package org.rk.java.knowledge.singleton;

//懒汉式，线程不安全
public class Singleton {
  private static Singleton instance;

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}

// 懒汉式，线程安全（慎用）
class Singleton1 {
  private static Singleton1 instance;

  private Singleton1() {
  }

  public static synchronized Singleton1 getInstance() {
    if (instance == null) {
      instance = new Singleton1();
    }
    return instance;
  }
}

// 常用方式
class Singleton2 {
  private static Singleton2 instance = new Singleton2();

  private Singleton2() {
  }

  public static Singleton2 getInstance() {
    return instance;
  }
}

// 双检锁
class Singleton3 {
  private volatile static Singleton3 instance;

  private Singleton3() {
  }

  public static Singleton3 getInstance() {
    if (instance == null) {
      synchronized (Singleton3.class) {
        if (instance == null) {
          instance = new Singleton3();
        }
      }
    }
    return instance;
  }
}

// 内部类
class Singleton4 {
  private static class Singleton {
    private static Singleton4 instance = new Singleton4();
  }

  private Singleton4() {
  }

  public static Singleton4 getInstance() {
    return Singleton.instance;
  }
}