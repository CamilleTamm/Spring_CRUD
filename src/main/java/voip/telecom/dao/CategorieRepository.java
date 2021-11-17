package voip.telecom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import voip.telecom.model.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
