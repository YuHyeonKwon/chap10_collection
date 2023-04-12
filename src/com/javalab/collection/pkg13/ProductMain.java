package com.javalab.collection.pkg13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductMain { // class s

	public static void main(String[] args) { // main s

		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1, "자전거", 250000));
		list.add(new Product(2, "노트북", 1250000));
		list.add(new Product(3, "쌀", 150000));
		list.add(new Product(4, "세탁기", 800000));
		list.add(new Product(5, "시금치", 2500));
		list.add(new Product(6, "대파", 10000));
		list.add(new Product(7, "에어컨", 3500000));
		list.add(new Product(8, "쇼파", 3000000));
		list.add(new Product(9, "우유", 2500));
		list.add(new Product(10, "운동화", 600000));
		
		// [문제1.] 전체 상품 목록 출력 메소드 호출
		System.out.println("==========전체상품 조회==========");
		printAllProduct(list);
		
		// [문제2.] 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드를 만들고
		// 해당 상품 가격을 main() 메소드에서 출력하세요
		System.out.println("==========원하는 상품 조회==========");
		String name = "자전거";
		List<Product> strName = getProductprice(name,list);
		for (Product product : strName) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}
		System.out.println();
		// [문제3.] 구매한 제품의 평균 구매 가격을 조회해서 main 메소드에서 출력
		System.out.println("==========평균가격==========");
		double priceAvg = getAverange(list);
		System.out.println(priceAvg);
		System.out.println();
		
		// [문제4.] 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로
		// 반환해주는 메소드를 만들고 main()메소드에서 출력
		System.out.println("==========100만원 넘는 제품==========");
		List<Product> list100 = product100List(list);
		System.out.println(list100);
		System.out.println();
		
		// [문제5.] HashMap을 통한 제품 출력 메소드 만들기
		Map<Integer, Product> productMap = new HashMap<>();
		System.out.println("==========Map전체상품 조회==========");
		productMap.put(1,new Product(1, "자전거", 250000));
		productMap.put(2,new Product(2, "노트북", 1250000));
		productMap.put(3,new Product(3, "쌀", 150000));
		productMap.put(4,new Product(4, "세탁기", 800000));
		productMap.put(5,new Product(5, "시금치", 2500));
		productMap.put(6,new Product(6, "대파", 10000));
		productMap.put(7,new Product(7, "에어컨", 3500000));
		productMap.put(8,new Product(8, "쇼파", 3000000));
		productMap.put(9,new Product(9, "우유", 2500));
		productMap.put(10,new Product(10, "운동화", 600000));
		printProductMap(productMap);
		// 전체상품 조회
	} // main e
	
	/**
	 * [문제5.] HashMap을 통한 제품 출력 메소드 만들기
	 * @param productMap
	 */
	public static void printProductMap(Map<Integer, Product> productMap) {
//		for(Integer id : productMap.keySet()) {
//			System.out.println(productMap.get(id).getId() + "\t" + productMap.get(id).getName() + "\t" + productMap.get(id).getPrice());
//		}
		
		Set<Integer> keSet = productMap.keySet();
		Iterator<Integer> iter = keSet.iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			Product product = productMap.get(key);
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}
	}
	
	/**
	 * [문제4.] 제품 중에서 100만원이 넘는 제품들을 찾아서 ArrayList로
	        반환해주는 메소드를 만들고 main()메소드에서 출력
	 * @param list
	 * @return
	 */
	private static List<Product> product100List(List<Product> list) {
		List<Product> price100 = new ArrayList<>();
		for (Product pd : list) {
			if(pd.getPrice() >= 1000000) {
				price100.add(pd);
			}
		}
		return price100;
	}
	/**
	 * // [문제3.] 구매한 제품의 평균 구매 가격을 조회해서 main 메소드에서 출력
	 * @param list
	 * @return
	 */
	public static double getAverange(List<Product> list){
		int sum = 0;
		for (Product pd : list) {
			sum += pd.getPrice();
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	/**
	 * 
	 * d[문제2.] 원하는 상품을 파라미터로 전달받아서 검색해주는 메소드를 만들고
	      해당 상품 가격을 main() 메소드에서 출력하세요
	 * @param list
	 * @return
	 */
	public static List<Product> getProductprice(String name, List<Product> list){
		List<Product> products = new ArrayList<>();
		for (Product pd : list) {
			if(pd.getName().equals(name)) {
				products.add(pd);
			}
		}
		return products;
	}
	/**
	 * [문제1.] 전체 상품 목록 출력 메소드 호출
	 * @param list
	 */
	public static void printAllProduct(List<Product> list) {
		for (Product pd : list) {
			System.out.println(pd.getId() + "\t" + pd.getName() + "\t" + pd.getPrice());
		}
		System.out.println();
	}
} // class e
