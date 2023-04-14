import 'package:simuduck_dart/duck/MallardDuck.dart';
import 'package:simuduck_dart/duck/ModelDuck.dart';
import 'package:simuduck_dart/fly/FlyRocketPowered.dart';

void main(List<String> arguments) {
  final mallard = MallardDuck();
  mallard.display();
  mallard.performFly();
  mallard.performQuack();

  final model = ModelDuck();
  model.display();
  model.performFly();
  model.flyBehavior = FlyRocketPowered();
  model.performFly();
  model.performQuack();
}
