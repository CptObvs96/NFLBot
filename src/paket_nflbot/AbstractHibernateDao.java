package paket_nflbot;


import javax.persistence.EntityManagerFactory;


@Transactional
public abstract class AbstractHibernateDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected EntityManagerFactory getEntityManagerFactory() {
        return getSession().getEntityManagerFactory();
    }

    public void update(Object entity) {
        getSession().update(entity);
    }

    public Object create(Object entity) {
        return getSession().save(entity);
    }

    public void delete(Object entity) {
        getSession().delete(entity);
    }

    public void createOrUpdate(Object entity) {
        getSession().saveOrUpdate(entity);
    }
}