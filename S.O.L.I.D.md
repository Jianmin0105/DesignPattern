## S -- Single responsibility principle
```
一个类或者一个模块只完成一个职责。这个原则是为了避免产生又大又功能齐全的类，
避免将不相干的功能耦合在一起，从而提高了内聚性。如果的类的职责单一，
此类的依赖的和被依赖的类会很少，从而实现了代码的高内聚低耦合。但是代码也不能被分的太细，
这样会造成过分细分，反噬内聚性。
```

## O -- Open Close Principle
```
Open to extension, close to modification
扩展性是代码质量最重要的衡量标准之一，23种设计模式大部分都是为了提高扩展性，主要遵从开闭原则。
什么是扩展， 什么是修改？ 当我们要添加一个功能的时候，最好是在已有代码的基础上扩展代码，而不是修改已有代码。
在编写代码时要保持扩展意识，抽象意识和封装意识。
```

## L -- Liskov substitution principle 
```
里式替换原理
一个子类或者派生类应该可以替换她们的基类或者父类，同时不会影响代码逻辑性为。当你碰到一个类， 其中有一个
@Override function什么也没做或者只是throw exception，那么很有可能违反了里式替换原理。

里式替换原理原则和polymorphysim是一回事儿吗？
最重要的区别在于逻辑行为是否保持一致。在@Override function里面把逻辑改成throw exception，这个function仍然
属于多态的应用，但是却违反了里式替换原理。

```

## I -- Interface segragation principle
```
不应该强迫一个类implement它用不上的接口。这个原则可以避免产生又大又全的interface。
```

## D -- Dependency inversion principle
```
依赖反转原则。High level的实体不应该依赖于low level的实体。抽象体不应该依赖于具体实现细节。
这个概念看起来很难，但是实际很容易理解。
```
