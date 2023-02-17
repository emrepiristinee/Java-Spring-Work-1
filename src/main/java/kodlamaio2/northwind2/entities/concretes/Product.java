package kodlamaio2.northwind2.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Entity demek sen bir veritabanı nesnesisin demek
@Table(name = "products") // veritabanın da hangi tablo?
public class Product {

	@Id // hangi id'ye göre yapılıyor
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) // id'yi otomatik arttırmak için
	@Column(name = "product_id")
	private int id;

	@Column(name = "category_id")
	private int categoryId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "unit_price")
	private double unitPrice;

	@Column(name = "units_in_stock")
	private short unitsInStock;

	@Column(name = "quantity_per_unit")
	private String quantityPerUnity;

	public Product() {
	}

	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnity) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnity = quantityPerUnity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public short getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getQuantityPerUnity() {
		return quantityPerUnity;
	}

	public void setQuantityPerUnity(String quantityPerUnity) {
		this.quantityPerUnity = quantityPerUnity;
	}

}
