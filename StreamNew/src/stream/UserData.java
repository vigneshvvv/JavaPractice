package stream;

public class UserData {
	


	String userName;
	String lastName;
	String Experience;
	String role;
	String mobileNo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	Integer id;
	@Override
	public String toString() {
		return "UserData [id=" + id + ", userName=" + userName + ", lastName=" + lastName + ", Experience=" + Experience
				+ ", role=" + role + ", mobileNo=" + mobileNo + "]";
	}

}
