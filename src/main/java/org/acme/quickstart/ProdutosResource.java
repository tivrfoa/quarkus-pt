package org.acme.quickstart;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.quickstart.hibernate.Produto;

/**
 * ProdutosResource
 */
@Path("produtos")
public class ProdutosResource {

    @Inject
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Produto> getProdutos() {
        return entityManager
            .createQuery("select p from produto p", Produto.class)
            .getResultList();
    }

    /**
     * curl --header "Content-Type: application/json" \
  --request POST --data '{"id":28,"nome":"Leo"}' \
  http://localhost:8080/produtos

     * @param p
     */
    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addProduto(Produto p) {
        entityManager.persist(p);
    }
    
}