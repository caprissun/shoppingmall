package com.product.dto;




import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class ShoppingVO {
	private int productKey;
	private String productCategory;
	private String productName;
	private int productPrice;
	private int productStock;
	private String productDescription;
	private java.sql.Timestamp productdate;

}
	
	
	
	


