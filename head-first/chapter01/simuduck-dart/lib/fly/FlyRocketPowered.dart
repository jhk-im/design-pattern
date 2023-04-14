
import 'package:simuduck_dart/fly/FlyBehavior.dart';

class FlyRocketPowered implements FlyBehavior {
  @override
  void fly() {
    print('로켓 추진으로 날 수 있음');
  }

}