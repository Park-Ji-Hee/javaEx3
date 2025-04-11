package ch12.addr;


// 이름, 전화번호, 생년월일, 주소, 등록일
public class AddressVO {
	private String name;
	private String tel;
	private String birth;
	private String addr;
	private int regis;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getRegis() {
		return regis;
	}
	public void setRegis(int regis) {
		this.regis = regis;
	}
	
	
}
