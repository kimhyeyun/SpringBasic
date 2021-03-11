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

  
- Proxy : a person who has been given the authority to represent somebody else
  1.  누군가를 대신해서 무언가를 대신 수행해주는 사람, 대리인이라는 뜻을 가지며 주로 네트워크와 디자인 패턴에서 많이 언급되고, 스프링은 AOP를 위해서 Proxy 패턴을 사용
  2. 스프링 AOP가 Proxy 기반으로 동작한다는 것은, AOP를 적용을 원하는 기능을 수행하는 타켓 오브젝트 그 앞에 Proxy 오브젝트를 하나 더 세워 그 Proxy가 부가 기능을 수행하고 실제 오브젝트로의 호출까지 담당하는 것.
