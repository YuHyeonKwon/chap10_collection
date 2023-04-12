package com.javalab.collection.pkg10;

import java.util.ArrayList;
import java.util.List;

public class MemberMain { // class s

	public static void main(String[] args) { // main s

		// 기본데이터
		String[] member = new String[10];
		member[0] = "임재,20190509,20190510,8,남,30대후반";
		member[1] = "성열,20190509,20190510,1,남,30대중반";
		member[2] = "천재,20190509,20190510,3,남,30대초반";
		member[3] = "현수,20190509,20190509,1,남,20대후반";
		member[4] = "진우,20190509,20190510,2,남,30대초반";
		member[5] = "영수,20190509,20190510,2,여,40대후반";
		member[6] = "종화,20190509,20190509,0,남,20대후반";
		member[7] = "윤정,20190509,20190510,3,여,40대후반";
		member[8] = "종호,20190509,20190510,3,남,20대중반";
		member[9] = "동현,20190509,20190510,5,남,20대중반";

		// 1. 기본 데이터를 가공하여 Member 객체로 만들고 저장할 ArrayList 생성
		List<Member> memberlist = new ArrayList<>();

		// 기본 데이터를 반복문을 통해서 Member 객체로 생성
		for (int i = 0; i < member.length; i++) {
			String[] arr = member[i].split(","); // 콤머로 구분해서 자르고 배열에 넣어줌
			int numVisit = Integer.parseInt(arr[3]);
			char gender = arr[4].charAt(0); // charAt() 캐릭터타입으로 변환
			memberlist.add(new Member(arr[0], arr[1], arr[2], numVisit, gender, arr[5]));
		}
		for (Member member2 : memberlist) {
			System.out.println(member2.getName() + "\t" + member2.getJoinDate() + "\t" + member2.getLastVisiDate()
					+ "\t" + member2.getNumVisit() + "\t" + member2.getGender() + "\t" + member2.getAge());
		}
		System.out.println();
		// 2. 이름이 "천재"인 회원을 찾고 별도의 메소드를 통해서 해당 회원을 출력하세요.
		printMember(memberlist);
		System.out.println();

		// 3. 전체 회원을 출력해주는 메소드를 만드세요.
		printList(memberlist);
		System.out.println();
		// 4. 30대인 회원들을 찾아주는 메소드를 만들고 ArrayList에 담아서 반환하세요.
		// 반환받은 리스트를 main 메소드에서 출력하세요.
		System.out.println("문제4.");
		List<Member> member30 = getMember30(memberlist);
		for (Member member2 : member30) {
			System.out.println(member2.getName() + "\t" + member2.getJoinDate() + "\t" + member2.getLastVisiDate()
					+ "\t" + member2.getNumVisit() + "\t" + member2.getGender() + "\t" + member2.getAge());
		}
		System.out.println();

//		String name = getList30(memberlist);
//		System.out.println(name);

		// 5. 20대 후반들의 방문 회수를 구해주는 메소드를 만들어서 값을 반환받고 출력하세요.
		int count = getCount20(memberlist);
		System.out.println("20대 후반들의 방문 횟수:" + count);
	} // main e

	// 4. 30대인 회원들을 찾아주는 메소드를 만들고 ArrayList에 담아서 반환하세요.
	// 반환받은 리스트를 main 메소드에서 출력하세요.
	private static List<Member> getMember30(List<Member> memberlist) {
		List<Member> member30 = new ArrayList<>();
		for (Member mb : member30) {
			String ageTest = mb.getAge().substring(0, 2);
			if (Integer.parseInt(ageTest) == 30) {
				member30.add(mb);
			}
		}
		return member30;
	}

	private static int getCount20(List<Member> memberlist) {
		int count = 0;
		for (Member mb : memberlist) {
			if (mb.getAge().contains("20대후반")) {
				count += mb.getNumVisit();
			}
		}
//		System.out.println(count);
		return count;
	}

//	private static String getList30(List<Member> memberlist) {
//		int count = 0;
//		String name = "";
//		for (Member mb : memberlist) {
//			if(mb.getAge().contains("30대")) {
//				count++;
//				name += mb.getName() + "\t" + mb.getJoinDate() + "\t" + mb.getLastVisiDate() + "\t"
//						+ mb.getNumVisit() + "\t" + mb.getGender() + "\t" + mb.getAge()+"\n";
//			}
//		}
//		return name;
//}

	// 3. 전체 회원을 출력해주는 메소드를 만드세요.
	private static void printList(List<Member> memberlist) {
		for (Member mb : memberlist) {
			System.out.println(mb.getName() + "\t" + mb.getJoinDate() + "\t" + mb.getLastVisiDate() + "\t"
					+ mb.getNumVisit() + "\t" + mb.getGender() + "\t" + mb.getAge());
		}
	}

	// 2. 이름이 "천재"인 회원을 찾고 별도의 메소드를 통해서 해당 회원을 출력하세요.
	private static void printMember(List<Member> memberlist) {
		for (Member mb : memberlist) {
			if (mb.getName().equals("천재")) {
				System.out.println(mb.getName() + "\t" + mb.getJoinDate() + "\t" + mb.getLastVisiDate() + "\t"
						+ mb.getNumVisit() + "\t" + mb.getGender() + "\t" + mb.getAge());
			} // end if

		} // end for

	}

} // class e
