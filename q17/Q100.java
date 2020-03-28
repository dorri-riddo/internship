package q17;

import java.text.ParseException;

public class Q100 {
	public static void main(String[] args) throws ParseException {
		String[][] data  = {
				{"구분=공동주택", "이름=양우내안애퍼스트힐", "세대수=780", "주소=울산광역시 남구 봉월로 55", "투표날짜=2018-01-01", "선거인수=770", "투표명=동대표선거"},
				{"구분=공동주택", "이름=불당지웰푸르지오", "세대수=682", "주소=충청남도 천안시 서북구 불당24로 38", "투표날짜=2017-05-01", "선거인수=682", "투표명=동별대표자 선출 및 관리규약개정 투표"},
				{"구분=공동주택", "이름=새뜸마을4단지", "세대수=1267", "주소=충청남도 서산시 안견로 457", "투표날짜=2018-07-21", "선거인수=1267", "투표명=입주자대표회의 임원(감사) 선거"},
				{"구분=공동주택", "세대수=1126", "이름=한신더휴센트럴파크", "주소=충청북도 청주시 청원구 오창공원로 96", "투표날짜=2018-05-11", "선거인수=1126", "투표명=입대회장, 감사, 동별대표자 보궐 선거"},
				{"구분=기타", "이름=신용회복위원회노동조합", "세대수=145", "주소=서울특별시 중구 세종대로 124", "투표날짜=2018-09-09", "선거인수=105", "투표명=신용회복위원회노동조합 2기 대의원 선출"},
				{"구분=공동주택", "이름=롯데캐슬 파크타운", "세대수=1200", "주소=경기도 파주시 파주리 521번지", "투표날짜=2018-11-12", "선거인수=1111", "투표명=관리규약 (일부) 개정 및 입주자대표회의 재선거/보궐선거"},
				{"구분=기타", "이름=한국경영학회", "주소=서울특별시 광진구 뚝섬로34길 67", "세대수=3060",  "투표날짜=2017-06-08", "선거인수=3058", "투표명=한국경영학회 2020년도 회장선거"},
				{"구분=공동주택", "이름=해운대아이파크", "세대수=1234", "투표날짜=2017-12-28", "선거인수=1234", "투표명=동별대표자선출", "주소=부산광역시 해운대구 마린시티2로 38"},
				{"구분=기타", "이름=국방과학연구소", "세대수=567", "주소=대전광역시 유성구 북유성대로488번길", "투표날짜=2018-03-02", "선거인수=566", "투표명=연구활동진흥비 등 지급방침 개정안"},
				{"구분=공동주택", "이름=문지효성해링턴플레이스아파트", "세대수=890", "투표날짜=2018-04-03", "주소=대전광역시 유성구 문지로 300", "선거인수=890", "투표명=동별 대표자 재(보궐)선출 선거"},
				{"구분=학교", "이름=수완초등학교", "세대수=1515", "주소=광주광역시 광산구 장덕로 143", "투표날짜=2018-07-11", "선거인수=1515", "투표명=2018년 2학기 전교임원선거"},
				{"구분=학교", "이름=서울교대부설초등학교", "주소=서울특별시 서초구 서초중앙로 96", "투표날짜=2018-11-11", "세대수=226", "선거인수=226", "투표명=2018학년도 2학기 서울교대부설초등학교 학생자치회 전교임원선거"},
				{"이름=원광정보예술고등학교", "세대수=30", "주소=전라북도 익산시 선화로13길 72", "투표날짜=2017-08-09", "선거인수=29", "투표명=원광정보예술고등학교 학생회장 및 부회장 선거(2018.2학기 - 2019.1학기)", "구분=학교"}
			 };
		
		Parse p = new Parse(data);
		p.parseData();
		p.print();
	}
}
