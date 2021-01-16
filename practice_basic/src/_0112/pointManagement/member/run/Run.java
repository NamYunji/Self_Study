package _0112.pointManagement.member.run;

import _0112.pointManagement.member.controller.MemberManager;
import _0112.pointManagement.member.model.vo.Gold;
import _0112.pointManagement.member.model.vo.Silver;
import _0112.pointManagement.member.model.vo.Vip;

public class Run {
    public static void main(String[] args)
    {
        MemberManager mgr = new MemberManager();
        mgr.insertMember(new Silver("홍길동", "Silver",1000));
        mgr.insertMember(new Silver("고길동", "Silver",2000));
        mgr.insertMember(new Silver("홍동민", "Silver",3000));
        mgr.insertMember(new Gold("김회장", "Gold",1000));
        mgr.insertMember(new Gold("이회장", "Gold",2000));
        mgr.insertMember(new Gold("오회장", "Gold",3000));
        mgr.insertMember(new Vip("이순신", "Vip",10000));
        mgr.insertMember(new Vip("신사임당", "VVip",100000));
        mgr.printData();
    }

}
