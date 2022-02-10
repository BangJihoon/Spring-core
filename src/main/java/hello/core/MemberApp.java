package hello.core;

import hello.core.member.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        MemberService memberService = new MemberServiceImpl();

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", hello.core.member.MemberService.class);

        Member member1 = new Member(1L, "member1", Grade.VIP);
        memberService.join(member1);

        Member findMember = memberService.findMember(member1.getId());
        System.out.println("findMember = " + findMember.getName());
        System.out.println("member1 = " + member1.getName());
    }
}
