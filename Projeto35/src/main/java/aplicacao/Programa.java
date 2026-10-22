package aplicacao;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        //Cadastrando registros utilizando o Em
        /*
        Pessoa p1 = new Pessoa(null,"Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null,"Joaquim Torres","joaquim@gmail.com");
        Pessoa p3 = new Pessoa(null,"Ana Maria","ana@gmail.com");
        */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        /*
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        em.close();
        System.out.println("Pessoa Criada com sucesso!");
  
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());*/

        /*Consultando um registro utilizando EM*/
        Pessoa pessoa = em.find(Pessoa.class, 2);

        System.out.println(pessoa);

        em.close();
        emf.close();

    }
}
