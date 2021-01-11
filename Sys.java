package Prac;

import java.util.*;

public class Sys {
	Scanner s = new Scanner(System.in);
	ArrayList<Member> mem = new ArrayList<Member>();
	ArrayList<DisabledMember> disabledMem = new ArrayList<DisabledMember>();

	public void SignUp() {
		System.out.print("- �̸�: ");
		String name = s.next();
		
		System.out.print("- �������(980112): ");
		String birth = s.next();
		
		System.out.print("- ����ó(010-0000-0000): ");
		String phnum = s.next();
		
		s.nextLine();

		System.out.print("- �ּ�: ");
		String addr = s.nextLine();

		
		System.out.print("- �����ּ�: ");
		String email = s.next();
		
		
		System.out.print("- ��ֿ���(y/n): ");
		char disabled = s.next().charAt(0);
		
//		if(disabled != 'y' || disabled != 'Y' || disabled != 'n' || disabled != 'N') {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
			
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			System.out.println("ȸ������ ȸ����ȣ�� '" + memberNum + "' �Դϴ�.");
			
		}
		
		else if(disabled == 'y' || disabled == 'Y') {
			tempNum01 = "1";
			memberNum = tempNum01 + tempNum02 + tempNum03;
			
			typeOfDisabled();
			System.out.print("- ��� ����: ");
			int type = s.nextInt();
			
			degreeOfDisabled();
			System.out.print("- ��� ����: ");
			int degree = s.nextInt();
			
			System.out.print("�α��ν� ����� ����ȭ�� ���񽺸� �̿��Ͻðڽ��ϱ�?(y/n) ");
			char service = s.next().charAt(0);
			
			disabledMem.add(new DisabledMember(name, birth, phnum, addr, email, disabled, memberNum, type, degree, service));
			
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			System.out.println("ȸ������ ȸ����ȣ�� '" + memberNum + "' �Դϴ�.");
			
		}
		
		
		
		
		
	}
	
	
	public void typeOfDisabled() {
		System.out.println("1. �ð����");
		System.out.println("2. û�����");
		System.out.println("3. ��ü���");
		System.out.println("4. ���������");
		System.out.println("5. ������");
		System.out.println("6. �ȸ����");
		System.out.println("7. �������");
		System.out.println("8. �������");
		System.out.println("9. �����");
		System.out.println("10. ȣ������");
		System.out.println("11. ���,������");
		System.out.println("12. ������(����)���");
		System.out.println("13. �������");
		System.out.println("14. �������");
		System.out.println("15. �������");
		System.out.println("16. ��������������");
		System.out.println("17. �����");
	}
	
	
	
	public void degreeOfDisabled() {
		System.out.println("1. ���� ���");
		System.out.println("2. ������ ���� ���");
	}
}
