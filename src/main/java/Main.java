import edu.hillel.dao.ProductDao;
import edu.hillel.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by HillelNew8 on 16.12.2016.
 */
public class Main {

    public static void main(String[] args){
        Product prod1 = new Product();
        prod1.setName("Iphone123123");
        prod1.setDesc("галимый теелфон");
        prod1.setCost(0.2);

        EntityManager manager = Persistence.createEntityManagerFactory("product-unit").createEntityManager();
        ProductDao dao = new ProductDao(manager);

        dao.insert(prod1);
        System.out.println(dao.get(1));
        manager.close();

    }
}
