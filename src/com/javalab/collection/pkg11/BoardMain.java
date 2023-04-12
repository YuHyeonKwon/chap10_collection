package com.javalab.collection.pkg11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoardMain { // class s

	public static void main(String[] args) { // main s

		Board[] board = new Board[15];
		board[0] = new Board(100, "객체 배열을 통하여 학생명단 평균점수 최고점수 최고점 학생을 출력하세요", "김정희", "2023.03.03", 84);
		board[1] = new Board(101, "객체지향 프로그래밍 - 인스턴스 멤버와 정적멤버", "최윤희", "2021.07.21", 99);
		board[2] = new Board(102, "클래스와 객체지향 프로그래밍(Object Oriented Programming)", "우성민", "2020.06.10", 264);
		board[3] = new Board(103, "[정렬] 선택 정렬(Selection Sort)", "정민태", "2023.01.02", 77);
		board[4] = new Board(104, "Math.random() 메소드를 통한 난수 발생시키기", "김갑철", "2022.10.12", 94);
		board[5] = new Board(105, "배열을 통한 사원 정보 관리 #2", "이수영", "2021.07.25", 70);
		board[6] = new Board(106, "배열을 통한 학생 정보 관리 #1", "박영준", "2023.02.01", 80);
		board[7] = new Board(107, "문자열(장문) 처리하기", "성수정", "2019.12.30", 56);
		board[8] = new Board(108, "[과제] 주말과제 - 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2020.05.17", 84);
		board[9] = new Board(109, "[모듈화] 최고 점수와 최고 점수 학생명 구하기", "홍세나", "2023.03.03", 64);
		board[10] = new Board(110, "다차원 배열 자료 저장 구조와 인덱스", "서동욱", "2022.07.010", 94);
		board[11] = new Board(111, "제어문 반복문", "정연남", "2022.08.03", 84);
		board[12] = new Board(112, "연산자(Operator)", "최정빈", "2020.01.01", 64);
		board[13] = new Board(113, "키보드를 통해서 데이터 읽어들이기", "오민희", "2022.09.12", 984);
		board[14] = new Board(114, "변수와 자료형 #1", "이의정", "2022.09.03", 164);

		// 1. 기본데이터를 Board 객체로 생성한 후에 ArrayList에 추가(add)하고 출력해주는 메소드를 만드세요.
		System.out.println("1. 일반for문, 향상된for문 전체 게시물 출력");
		List<Board> list = new ArrayList<>();

		for (int i = 0; i < board.length; i++) {
			list.add(board[i]);
		}

		printAllBoard(list);
		
		// 2. 게시물 중에서 우성민, 홍세나가 작성한 게시물을 찾아서 반환해주는 메소드를 만드세요
		System.out.println("2. 우성민, 홍세나가 작성한 게시물의 목록을 출력");
		List<Board> bdName = getBoardByName(list);
		for (Board bd : bdName) {
			System.out.println(bd.getId() + "\t" + bd.getTitle() + "\t" + bd.getWriter() + "\t" + bd.getDate() + "\t" + bd.getHitcount());
		}
		System.out.println();
		
		// 3. 배열과 관련된 게시물을 출력해주는 메소드를 만드세요.
		System.out.println("3. 배열과 관련된 게시물 출력");
		printBoard(list);
		
		// 4. 조회수가 가장 큰 게시물을 출력해주는 메소드를 만드세요.
		System.out.println("4. 조회수가 가장 큰 게시물 출력");
		printHitCountBoard(list);
		
		// 5. 게시물 객체를 Set 컬렉션에 저장하고 출력해주는 메소드를 만드세요.
		System.out.println("5. HashSet 전체출력");
		Set<Board> boards = new HashSet<>();
		boards.add(board[0]);
		boards.add(board[1]);
		boards.add(board[2]);
		boards.add(board[3]);
		boards.add(board[4]);
		boards.add(board[5]);
		boards.add(board[6]);
		boards.add(board[7]);
		boards.add(board[8]);
		boards.add(board[9]);
		boards.add(board[10]);
		boards.add(board[11]);
		boards.add(board[12]);
		boards.add(board[13]);
		boards.add(board[14]);
		printSetBoard(boards);
		
		// 6. 게시물번호를 키(key)로 하여 HashMap에 학생 객체를 저장하고 출력해주는 메소드를 통해서 출력하세요.
		System.out.println("6. HashMap 전체출력");
		Map<Integer, Board> boardMap = new HashMap<>();
		boardMap.put(board[0].getId(), board[0]);
		boardMap.put(board[1].getId(), board[1]);
		boardMap.put(board[2].getId(), board[2]);
		boardMap.put(board[3].getId(), board[3]);
		boardMap.put(board[4].getId(), board[4]);
		boardMap.put(board[5].getId(), board[5]);
		boardMap.put(board[6].getId(), board[6]);
		boardMap.put(board[7].getId(), board[7]);
		boardMap.put(board[8].getId(), board[8]);
		boardMap.put(board[9].getId(), board[9]);
		boardMap.put(board[10].getId(), board[10]);
		boardMap.put(board[11].getId(), board[11]);
		boardMap.put(board[12].getId(), board[12]);
		boardMap.put(board[13].getId(), board[13]);
		boardMap.put(board[14].getId(), board[14]);
		printMapBoard(boardMap);
	} // main e

	// 6. 게시물번호를 키(key)로 하여 HashMap에 학생 객체를 저장하고 출력해주는 메소드를 통해서 출력하세요.
	
	private static void printMapBoard(Map<Integer, Board> boardMap) {
		Set<Integer> keySet = boardMap.keySet();
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			Board bd = boardMap.get(key);
			System.out.println(bd.getId() + "\t" + bd.getTitle() + "\t" + bd.getWriter() + "\t" + bd.getDate() + "\t" + bd.getHitcount());
		}
}

	// 5. 게시물 객체를 Set 컬렉션에 저장하고 출력해주는 메소드를 만드세요.
	private static void printSetBoard(Set<Board> boards) {
		for (Board bd : boards) {
			System.out.println(bd.getId() + "\t" + bd.getTitle() + "\t" + bd.getWriter() + "\t" + bd.getDate() + "\t" + bd.getHitcount());
		}
		System.out.println();
}

	// 4. 조회수가 가장 큰 게시물을 출력해주는 메소드를 만드세요.
	private static void printHitCountBoard(List<Board> list) {
		int max = 0;
		String strName = "";
		for (Board bd : list) {
			if ( bd.getHitcount() > max) {
				max = bd.getHitcount();
				strName = bd.getWriter();
			}
		}
		System.out.println(strName + "\t" + max);
		System.out.println();
}

	// 3. 배열과 관련된 게시물을 출력해주는 메소드를 만드세요.
	private static void printBoard(List<Board> list) {
		for (Board bd : list) {
			if ( bd.getTitle().contains("배열")) {
				System.out.println(bd.getId() + "\t" + bd.getTitle() + "\t" + bd.getWriter() + "\t" + bd.getDate() + "\t" + bd.getHitcount());
			}
		}
		System.out.println();
}

	// 2. 게시물 중에서 우성민, 홍세나가 작성한 게시물을 찾아서 반환해주는 메소드를 만드세요
	private static List<Board> getBoardByName(List<Board> list) {
		List<Board> bdName = new ArrayList<>();
		for (Board bd : list) {
			if (bd.getWriter().equals("우성민") || bd.getWriter().equals("홍세나")) {
				bdName.add(bd);
			}
		}
		return bdName;
}

	// 1. 기본데이터를 Board 객체로 생성한 후에 ArrayList에 추가(add)하고 출력해주는 메소드를 만드세요.
	private static void printAllBoard(List<Board> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId() + "\t" + list.get(i).getTitle() + "\t" + list.get(i).getWriter()
					+ "\t" + list.get(i).getDate() + "\t" + list.get(i).getHitcount());
		}
		System.out.println();
		
		for (Board bd : list) {
			System.out.println(bd.getId() + "\t" + bd.getTitle() + "\t" + bd.getWriter() + "\t" + bd.getDate() + "\t" + bd.getHitcount());
		}
		System.out.println();
	}

} // class e
