
import 'package:simuduck_dart/fly/FlyBehavior.dart';

class FlyNoWay implements FlyBehavior {
  @override
  void fly() {
    print('날 수 없음');
  }

}