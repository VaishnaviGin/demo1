
public class Employee {

	int id;
	String name;
	String Address;

	public Employee(int id, String name) {

		super();
		this.id = id;
		this.name = name;

	}


	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}
	
	


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	void show() {
		// TODO Auto-generated method stub
		System.out.println("Id="+id+" Name="+name);
	}

	

	
}
