package kodlamaio2.northwind2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio2.northwind2.business.abstracts.ProductService;
import kodlamaio2.northwind2.core.utilities.results.DataResult;
import kodlamaio2.northwind2.core.utilities.results.Result;
import kodlamaio2.northwind2.core.utilities.results.SuccesDataResult;
import kodlamaio2.northwind2.core.utilities.results.SuccessResult;
import kodlamaio2.northwind2.dataAccess.abstracts.ProductDao;
import kodlamaio2.northwind2.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired // onun karşılığı olan productDao'yu buluyor new yapıp yeni bir nesne
				// oluşturuyor
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccesDataResult<List<Product>>(this.productDao.findAll(), "Data Listelendi.");

	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi.");
	}


}
