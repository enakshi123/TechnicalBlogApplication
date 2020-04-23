package TechnicalBlog.respository;

import TechnicalBlog.model.Post;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PostRepository {
    @PersistenceUnit(unitName = "techblog")
    private EntityManagerFactory emf;

    public List<Post> getAllPosts(){
        EntityManager em=emf.createEntityManager();
        TypedQuery<Post>query=em.createQuery("Select p from Post p",Post.class);
         List<Post> resultList=query.getResultList();
        return resultList;
    }

    public Post getLatestPost(){
        EntityManager em=emf.createEntityManager();
        return em.find(Post.class,3);
    }
}
