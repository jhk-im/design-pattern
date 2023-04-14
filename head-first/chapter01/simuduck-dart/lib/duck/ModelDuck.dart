
import 'package:simuduck_dart/fly/FlyNoWay.dart';
import 'package:simuduck_dart/quack/Squeak.dart';

import 'Duck.dart';

class ModelDuck extends Duck {

  ModelDuck() {
    flyBehavior = FlyNoWay();
    quackBehavior = Squeak();
  }

  @override
  void display() {
    print('모형오리');
  }
}