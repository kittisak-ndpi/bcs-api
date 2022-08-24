package com.buu.bcs.configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Application {
    private EntityManagerFactory entitymanagerFactory;
    private EntityManagerFactory secondEntitymanagerFactory;

    private static Application instance;

    public static Application getInstance() {
        if (instance == null) {
            instance = new Application();

        }
        return instance;

    }

    public EntityManagerFactory getEntitymanagerFactory() {
        return entitymanagerFactory;
    }

    public void setEntitymanagerFactory(EntityManagerFactory entitymanagerFactory) {
        this.entitymanagerFactory = entitymanagerFactory;
    }

    public EntityManager getEntityManager() {
        return Application.getInstance().getEntitymanagerFactory().createEntityManager();
    }

    public EntityManagerFactory getSecondEntitymanagerFactory() {
        return secondEntitymanagerFactory;
    }

    public void setSecondEntitymanagerFactory(EntityManagerFactory secondEntitymanagerFactory) {
        this.secondEntitymanagerFactory = secondEntitymanagerFactory;
    }

    public EntityManager getSecondEntityManager() {
        return Application.getInstance().getSecondEntitymanagerFactory().createEntityManager();
    }
}
