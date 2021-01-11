package Prac;

public class DisabledMember extends Member{
	int type;
	int degree;
	char service;
	
	
	public DisabledMember(String name, String birth, String phnum, String addr, String email, char disabled,
			String memberNum, int type, int degree, char service) {
		super(name, birth, phnum, addr, email, disabled, memberNum);
		this.type = type;
		this.degree = degree;
		this.service = service;
	}

	
}
