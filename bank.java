package bankapplication;

class bank {
	private int id;
	private String name;
	private int bal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "bank [id=" + id + ", name=" + name + ", bal=" + bal + "]";
	}
	
	
}
