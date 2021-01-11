package Prac;

import java.util.*;

public class Sys {
	Scanner s = new Scanner(System.in);
	ArrayList<Member> mem = new ArrayList<Member>();
	ArrayList<DisabledMember> disabledMem = new ArrayList<DisabledMember>();

	public void SignUp() {
		System.out.print("- 이름: ");
		String name = s.next();
		
		System.out.print("- 생년월일(980112): ");
		String birth = s.next();
		
		System.out.print("- 연락처(010-0000-0000): ");
		String phnum = s.next();
		
		s.nextLine();

		System.out.print("- 주소: ");
		String addr = s.nextLine();

		
		System.out.print("- 메일주소: ");
		String email = s.next();
		
		
		System.out.print("- 장애여부(y/n): ");
		char disabled = s.next().charAt(0);
		
//		if(disabled != 'y' || disabled != 'Y' || disabled != 'n' || disabled != 'N') {
//			System.out.println("잘못 입력하셨습니다.");
//			disabled = s.next().charAt(0);
//		}
		
		String memberNum;
		String tempNum01;
		String tempNum02 = birth.substring(2);
		String tempNum03 = phnum.substring(9);
		
		if(disabled == 'n' || disabled == 'N') {
			tempNum01 = "0";
			memberNum = tempNum01 + tempNum02 + tempNum03;
			
			mem.add(new Member(name, birth, phnum, addr, email, disabled, memberNum));
			
			System.out.println("가입이 완료되었습니다.");
			System.out.println("회원님의 회원번호는 '" + memberNum + "' 입니다.");
			
		}
		
		else if(disabled == 'y' || disabled == 'Y') {
			tempNum01 = "1";
			memberNum = tempNum01 + tempNum02 + tempNum03;
			
			typeOfDisabled();
			System.out.print("- 장애 유형: ");
			int type = s.nextInt();
			
			degreeOfDisabled();
			System.out.print("- 장애 정도: ");
			int degree = s.nextInt();
			
			System.out.print("로그인시 장애인 전용화면 서비스를 이용하시겠습니까?(y/n) ");
			char service = s.next().charAt(0);
			
			disabledMem.add(new DisabledMember(name, birth, phnum, addr, email, disabled, memberNum, type, degree, service));
			
			System.out.println("가입이 완료되었습니다.");
			System.out.println("회원님의 회원번호는 '" + memberNum + "' 입니다.");
			
		}
		
		
		
		
		
	}
	
	
	public void typeOfDisabled() {
		System.out.println("1. 시각장애");
		System.out.println("2. 청각장애");
		System.out.println("3. 지체장애");
		System.out.println("4. 뇌병변장애");
		System.out.println("5. 언어장애");
		System.out.println("6. 안면장애");
		System.out.println("7. 신장장애");
		System.out.println("8. 심장장애");
		System.out.println("9. 간장애");
		System.out.println("10. 호흡기장애");
		System.out.println("11. 장루,요루장애");
		System.out.println("12. 뇌전증(간질)장애");
		System.out.println("13. 지적장애");
		System.out.println("14. 자폐성장애");
		System.out.println("15. 정신장애");
		System.out.println("16. 국가유공상이자");
		System.out.println("17. 장기요양");
	}
	
	
	
	public void degreeOfDisabled() {
		System.out.println("1. 심한 장애");
		System.out.println("2. 심하지 않은 장애");
	}
}
