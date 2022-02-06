package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

import java.util.Arrays;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member1 = new Member(1L, "member1", Grade.VIP);
        memberService.join(member1);

        Member findMember = memberService.findMember(member1.getId());
        System.out.println("findMember = " + findMember.getName());
        System.out.println("member1 = " + member1.getName());
    }
}
