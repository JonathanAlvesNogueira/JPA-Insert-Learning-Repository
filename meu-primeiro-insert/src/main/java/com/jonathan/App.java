package com.jonathan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	 // Configuração do EntityManagerFactory
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Nome que você deu no arquivo persistence no caso desse exemplo (teste-jpa)");

        // Criação do EntityManager
        EntityManager em = emf.createEntityManager();

        // Criação da pessoa
        Usuario pessoa = new Usuario();
        pessoa.setNome("João da Silva");
        pessoa.setCpf("12345678901");

        // Início da transação
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // Adição da pessoa ao banco de dados
        em.persist(pessoa);

        // Fim da transação
        tx.commit();

        // Fechamento do EntityManager
        em.close();

        // Fechamento do EntityManagerFactory
        emf.close();
    	
    	
    	System.out.println("Fim processo");
    	
    	
    	
        
        
        
        
        
        
    }
}
