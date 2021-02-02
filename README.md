# SpringBasic
2021.02.02
- 컴포넌트 스캔과 자동 의존관계 설정
  -> 스프링 빈(Spring Bean)이란? Spring IoC 컨테이너가 관리하는 자바 객체를 빈(Bean)이라는 용어로 부른다.
    우리가 new 연산자로 어떤 객체를 생성했을 때 그 객체는 빈이 아니다.
  -> 스프링 빈을 등록하는 2가지 방법 
    1. 컴포넌트 스캔과 자동 의존관계 설정: @Component 애노테이션이 있으면 스프링 빈으로 자동 등록된다.(@Controller, @Service, @Repository 또한 @Component를 포함하기에 가능')
    2. 자바 코드로 직접 스프링 빈 등록하기 : SpringConfiguration.java(@Configuration) 에 Service와 Repository의 생성자를 작성해준다. 
  
  * 생성자 주입(권장), 필드 주입(중간에 변경이 어렵다), setter 주입(public 이므로 노출이됨, 잘못바꾸면 문제가 발생한다.)이 있음 *
  * 정형화 되지 않거나, 상황에 따라 구현 클래스를 변경해야 하면 설정을 통해 스프링 빈으로 등록한다. *

  
