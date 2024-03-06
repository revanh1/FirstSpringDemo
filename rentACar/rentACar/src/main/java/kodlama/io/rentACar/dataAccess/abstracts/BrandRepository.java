package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository //bunun bir data access oldugunu qeyd edirik
public interface BrandRepository {
    List<Brand> getAll();
}
