package monastery.controller;

import monastery.model.Entity;
import monastery.util.HibernateUtil;
import monastery.util.MonasteryException;
import org.hibernate.Session;

import java.util.List;

public abstract class Process <T extends Entity> {
    protected T entity;
    protected Session session;
    public abstract List<T> read();
    protected abstract void controlCreate() throws MonasteryException;
    protected abstract void controlUpdate() throws MonasteryException;
    protected abstract void controlDelete();

    public Process(){
        session = HibernateUtil.getSession();
    }

    public Process(T entity){
        this();
        this.entity = entity;
    }

    public void create() throws MonasteryException{
        controlNull();
        entity.setId(null);
        controlCreate();
        persist();
    }

    public void update() throws MonasteryException{
        controlNull();
        controlUpdate();
        persist();
    }

    public void delete() throws MonasteryException{
        controlNull();
        controlDelete();
        session.beginTransaction();
        session.remove(entity);
        session.getTransaction().commit();
    }

    private void controlNull() throws MonasteryException{
        if (entity==null){
            throw new MonasteryException("Entity is null");
        }
    }

    private void persist() throws MonasteryException{
        session.beginTransaction();
        session.persist(entity);
        session.getTransaction().commit();
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
