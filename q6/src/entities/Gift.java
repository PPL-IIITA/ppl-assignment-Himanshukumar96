package entities;

public class Gift {
				public	String name;
				public	int price;
				public	int value;
				public	int Luxury_r;
				public	int utility_v;
				
				
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public int getPrice() {
					return price;
				}
				public void setPrice(int price) {
					this.price = price;
				}
				public int getValue() {
					return value;
				}
				public void setValue(int value) {
					this.value = value;
				}
				public int getLuxury_r() {
					return Luxury_r;
				}
				public void setLuxury_r(int luxury_r) {
					Luxury_r = luxury_r;
				}
				public int getUtility_v() {
					return utility_v;
				}
				public void setUtility_v(int utility_v) {
					this.utility_v = utility_v;
				}
				public Gift(String name, int price, int value, int luxury_r, int utility_v) {
					super();
					this.name = name;
					this.price = price;
					this.value = value;
					Luxury_r = luxury_r;
					this.utility_v = utility_v;
				}
				public Gift() {
					super();
				}

}
