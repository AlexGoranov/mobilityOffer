package datatypes;

public class PersonalData {

	private String name;
	private String telephone;
	private AddressData address;
	private String email;
	private int age;

	public PersonalData(String name, String telephone, AddressData address, String email, int age) {
		this.name = name;
		this.telephone = telephone;
		this.address = address;
		this.email = email;
		this.age = age;
	}

	public String getTelephone() {
		return telephone;
	}

	public AddressData getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}
	
}
