package com.whl.pattern.adapter.classadpter.demo01;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * @Desc：类适配器
 * @Author: heling
 * @Date: 2020/11/3 10:10
 */

//即如果一个现有的类没有实现Observer接口，那么我们就无法将这个类作为观察者加入到被观察者的观察者列表中了，这实在太遗憾了。
//在这个问题中，我们需要得到一个Observer接口的类，但是又想用原有的类的功能，但是我们又改不了这个原来的类的代码，或者原来的类有一个完整的类体系，我们不希望破坏它，那么适配器模式就是你的不二之选了。
//我们举个具体的例子，比如我们希望将HashMap这个类加到观察者列表里，在被观察者产生变化时，假设我们要清空整个MAP。但是现在加不进去啊，为什么呢？
//因为Observable的观察者列表只认识Observer这个接口，它不认识HashMap，怎么办呢？
//这种情况下，我们就可以使用类适配器的方式将我们的HashMap做点手脚，刚才已经说了，类适配器采用继承的方式，那么我们写出如下适配器。
public class HashMapObserverAdapter extends HashMap implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        //被观察者变化时，清空Map
        super.clear();
    }
}
