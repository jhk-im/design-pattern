
import 'package:simuduck_dart/fly/FlyWithWings.dart';
import 'package:simuduck_dart/quack/Quack.dart';

import 'Duck.dart';

class MallardDuck extends Duck {

  MallardDuck() {
    flyBehavior = FlyWithWings();
    quackBehavior = Quack();
  }

  @override
  void display() {
    print('물오리');
  }
}