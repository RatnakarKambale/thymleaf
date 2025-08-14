package in.kasmoprav.binding;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Product {
	
	@NotNull(message = "Product ID is required")
    @Min(value = 1, message = "Product ID must be greater than 0")
	private Integer pid;
	
    @NotBlank(message = "Product name is required")
	private String pname;
	  
    @NotNull(message = "Price is required")
    @Min(value = 1, message = "Price must be greater than 0")
	private Double price;
    
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
		
}
