package kodlamaio2.northwind2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio2.northwind2.business.abstracts.ProductService;
import kodlamaio2.northwind2.core.utilities.results.DataResult;
import kodlamaio2.northwind2.core.utilities.results.Result;
import kodlamaio2.northwind2.entities.concretes.Product;

//controller aslında isteği karşılayan yer
@RestController // android'de ios'da sana istekde bulunabilir
@RequestMapping("/api/products") // dış dünyadan /api/products diye bir istek gelirse bu controller karşılayacak
public class ProductsController {

	private ProductService productService;

	@Autowired // bize productService parametresini new'leyip verir
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	// frontend ve backend arasında 2 tane veri alışveriş çeşidi vardır.
	// Birisi frontend veri ister (getmapping) ve backend verir,
	// ikincisi frontend al bu veriyi değiştir der ve backend değiştirir.

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll() {
		return this.productService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) { // aldığı parametreleri veritabanında eşleştirip yerlerine yazmak
														// için RequestBody kullanıyoruz
		return this.productService.add(product);
	}
}
