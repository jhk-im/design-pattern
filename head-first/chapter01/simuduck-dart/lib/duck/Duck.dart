
import 'package:simuduck_dart/fly/FlyBehavior.dart';
import 'package:simuduck_dart/quack/QuackBehavior.dart';

abstract class Duck {
  // 행동 인터페이스 형식의 레퍼런스 선언
  // 패키지에 속한 모든 서브 클래스에서 이 변수를 상속 받음
  FlyBehavior? flyBehavior;
  QuackBehavior? quackBehavior;

  void display() {}

  void performFly() {
    flyBehavior?.fly(); // 행동클래스에 위임
  }

  void performQuack() {
    quackBehavior?.quack(); // 행동클래스에 위임
  }

  void swim() {
    print("모든 오리는 물에 뜸");
  }

}