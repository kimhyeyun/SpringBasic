package yun.hellospring.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import yun.hellospring.domain.Member;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    // class 단위로 test를 진행할때는 순서가 마음대로로 진행되므로
    // test가 하나 끝나고 나면 data를 clear 해줘야함

    //method가 끝날때마다 동작하는 콜백 메서드
    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("Yun");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
//        System.out.println("result = "+(result==member));
//         매번 이렇게 출력하기는 어려움
//        Assertions.assertEquals(member,result);
//        ↑ 다르면 에러
        assertThat(member).isEqualTo(result);
//        junit이 아님 다른거 쉽게 사용가능
    }

    @Test
    public void  findByName(){
        Member member1 = new Member();
        member1.setName("YUN");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("HYE");
        repository.save(member2);

        Member result = repository.findByName("YUN").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("YUN");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("HYE");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }
}
