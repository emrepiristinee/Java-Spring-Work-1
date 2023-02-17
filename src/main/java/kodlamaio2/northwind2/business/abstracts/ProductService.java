package kodlamaio2.northwind2.business.abstracts;

import java.util.List;

import kodlamaio2.northwind2.core.utilities.results.DataResult;
import kodlamaio2.northwind2.core.utilities.results.Result;
import kodlamaio2.northwind2.entities.concretes.Product;

public interface ProductService {
	// servisimizin operasyonlarını yazdık
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
