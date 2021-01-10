package _0110.member__.run;

import _0110.member__.controller.MemberManager;
import _0110.member__.vo.Gold;
import _0110.member__.vo.Silver;
import _0110.member__.vo.Vip;
import _0110.member__.vo.Vvip;

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
        mgr.insertMember(new Vvip("신사임당", "VVip",100000));
        mgr.printData();
    }
}
