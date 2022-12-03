package s01_cats;

public class Cats {

	   // Cat 클래스의 속성을 멤버 변수로 선언하고 메서드를 구현한다
	
		public int catId;
		public String catName;
		public String address;
		
		public void showCatInfo() {
			System.out.println(catName + "," + address);
		} // end catInfo
		
		public String getCatName() {
			return catName;
		} // end getCatName
		
	
} // end class
     
      // 클래스 : 객체의 속성을 정의
      // 인스턴스 : 클래스 기반으로 생성하여 각각의 인스턴스는
      //                   다른 멤버 변수 값을 가지게 됨
      // new 키워드를 사용하여 인스턴스 생성

