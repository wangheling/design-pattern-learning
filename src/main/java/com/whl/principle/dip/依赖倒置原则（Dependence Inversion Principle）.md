# 依赖倒置原则
## 定义
依赖倒置原则（Dependence Inversion Principle,DIP）是指设计代码结构时，高层模块不应该依赖低层模块，二者都应该依赖其抽象。抽象不应该依赖细节；细节应该依赖抽象。通过依赖倒置，可以 减少类与类之间的耦合性，提高系统的稳定性，提高代码的可读性和可维护性，并能够降低修改程序所 造成的风险。

这个原则描述的是一个现实当中的事实，即实现都是易变的，而只有抽象是稳定的，所以当依赖于抽象时，实现的变化并不会影响客户端的调用。