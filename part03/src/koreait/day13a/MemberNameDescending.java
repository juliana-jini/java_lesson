package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

public class MemberNameDescending implements Comparator<Member> {

	@Override
	public int compare(Member o1, Member o2) {
	//name �ʵ� ��
		
		return o2.getName().compareTo(o1.getName());
	}

	
	
	
	
}
