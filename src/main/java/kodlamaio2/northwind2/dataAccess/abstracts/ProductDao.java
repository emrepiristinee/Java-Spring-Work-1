package kodlamaio2.northwind2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio2.northwind2.entities.concretes.Product;

//jpa'nın hibernate implementasyonuyla işleri kolaylaştırdık,
//repository hangi tablo için çalışacak? (Product tablosu için)
//ve oradaki primary key'in veri türü nedir? (Integer) 
public interface ProductDao extends JpaRepository<Product, Integer> {

}
