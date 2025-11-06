package easyPayouts;


public class Account {
	private String id;
	private String companyId;
	private String name;

	public Account(String id, String companyId, String name) {
		this.id = id;
		this.companyId = companyId;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
