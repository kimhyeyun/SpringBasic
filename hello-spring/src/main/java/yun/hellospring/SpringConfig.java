package yun.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yun.hellospring.repository.MemberRepository;
import yun.hellospring.repository.MemoryMemberRepository;
import yun.hellospring.service.MemberService;

/*Annotation 없이 직접 Spring Bean 등록*/
@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
