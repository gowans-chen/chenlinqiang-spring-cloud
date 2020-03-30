package cn.net.com.entity;





public class Menu  {
    private long id;
    private String name;
    private double price;
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	private String flavor;
    private Type type;
    
	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", price=" + price + ", flavor=" + flavor + ", type=" + type + "]";
	}


	
	
}
