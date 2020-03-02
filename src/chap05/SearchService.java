package chap05;

public class SearchService {
	Member[] members = new Member[5];
	public SearchService() {
		members[0] = new Member("오정원",167,77,"대한민국");
		members[1] = new Member("James",187,67,"미국");
		members[2] = new Member("가루상",166,57,"일본");
		members[3] = new Member("홍금보",177,80,"중국");
		members[4] = new Member("인도인",199,77,"인도");
	}
	
	Member searchMember(String name) {
		Member retMem = new Member();
		for(Member member : members) {
			if(member.getName().equals(name)) {
				member.setSearch(true);
				retMem = member;
			}
			//System.out.println(member.getName());
		}
		return retMem;
	}
	public void printInfo(Member member) {
		System.out.println("Name:" + member.getName());
		System.out.println("Height:" + member.getHeight());
		System.out.println("Weight:" + member.getWeight());
		System.out.println("Nation:" + member.getNation());		
	}
}
