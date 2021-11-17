package voip.telecom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import voip.telecom.model.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

  //  Article findById(long id);

}
