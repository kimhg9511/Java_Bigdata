package chap05;

public class Member { // DTO(Data Transfer Object) & VO(Value Object)
	private String name;
	private int height;
	private int weight;
	private String nation;
	private boolean isSearch;
	
	public Member(String name, int height, int weight, String nation) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.nation = nation;
	}
	
	public Member(){ }

	// getter, setter - name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getter, setter - height
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height <= 0) {
			this.height = 0;
			System.out.println("0보단 커야겠지..");
		}else
		this.height = height;
	}

	// getter, setter - weight
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// getter, setter - nation
	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public boolean isSearch() {
		return isSearch;
	}

	public void setSearch(boolean isSearch) {
		this.isSearch = isSearch;
	}
}
