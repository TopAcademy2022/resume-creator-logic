package resume.creator.logic.infrastructure.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import resume.creator.logic.infrastructure.data.orm.HibernateFactory;

public class AppDbContext {
    private static SessionFactory sessionFactory;

    static {
        sessionFactory = HibernateFactory.getSessionFactory();
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public Transaction beginTransaction(Session session) {
        return session.beginTransaction();
    }

    public void saveObject(Object entity) {
        try (Session session = getSession()) {
            Transaction transaction = beginTransaction(session);
            session.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public <T> T getObjectById(Class<T> clazz, Long id) {
        try (Session session = getSession()) {
            return session.get(clazz, id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}