package q29;

public class Pojo {
	String name;
	float contact;
	float mobile;
	String gender;
	String city;
	String comment;
	@Override
	public String toString() {
		return "Pojo [name=" + name + ", contact=" + contact + ", mobile=" + mobile + ", gender=" + gender + ", city="
				+ city + ", comment=" + comment + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getContact() {
		return contact;
	}
	public void setContact(float contact) {
		this.contact = contact;
	}
	public float getMobile() {
		return mobile;
	}
	public void setMobile(float mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}