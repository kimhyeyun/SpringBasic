package yun.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yun.hellospring.repository.JdbcMemberRepository;
import yun.hellospring.repository.MemberRepository;
import yun.hellospring.repository.MemoryMemberRepository;
import yun.hellospring.service.MemberService;

import javax.sql.DataSource;

/*Annotation 없이 직접 Spring Bean 등록*/
@Configuration
public class SpringConfig {

    private DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new JdbcMemberRepository(dataSource);
    }
}
