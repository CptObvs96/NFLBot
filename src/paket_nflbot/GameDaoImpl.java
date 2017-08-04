package paket_nflbot;


import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;


public class GameDaoImpl extends AbstractHibernateDao implements GameDao {



    @Override
    public void createGame(Game game) {
        Integer id = (Integer) super.create(game);

    }

    @Override
    public void deleteGame(Game game) {
        super.delete(game);

    }

    @Override
    public void updateGame(Game game) {
        super.update(game);

    }

    @Override
    public void createOrUpdateGame(Game game) {
        super.createOrUpdate(game);

    }

    @Override
    public Game findById(Integer id) {
        CriteriaBuilder builder = getEntityManagerFactory().getCriteriaBuilder();
        CriteriaQuery<Game> criteria = builder.createQuery(Game.class);
        Root<Game> gameRoot = criteria.from( Game.class );
        criteria.where(builder.equal(gameRoot.get(Game_.gameId), id ));
        Game result = null;
        try {
            result = getEntityManagerFactory().createEntityManager().createQuery(criteria).getSingleResult();
        }
        catch(NoResultException nre) {
            return null; // nothing to do here
        }
        return result;
    }

    @Override
    public List<Game> findAllGames() {
        return getSession().createQuery("FROM " + Game.class.getSimpleName()).list();
    }

    @Override
    public List<Game> findAllGamesInYear(Integer year) {
        CriteriaBuilder builder = getEntityManagerFactory().getCriteriaBuilder();
        CriteriaQuery<Game> criteria = builder.createQuery(Game.class);
        Root<Game> gameRoot = criteria.from( Game.class );
        criteria.where(builder.equal(gameRoot.get(Game_.year), year ));
        List<Game> results;
        try {
            results = getEntityManagerFactory().createEntityManager().createQuery(criteria).getResultList();
        }
        catch(NoResultException nre) {
            return new ArrayList<Game>();
        }
        return results;
    }

    @Override
    public List<Game> findAllGamesInWeekAndYear(String week, Integer year) {
        CriteriaBuilder builder = getEntityManagerFactory().getCriteriaBuilder();
        CriteriaQuery<Game> criteria = builder.createQuery(Game.class);
        Root<Game> gameRoot = criteria.from(Game.class);
        Predicate restrictions = builder.and(
                builder.equal( gameRoot.get(Game_.week), week ),
                builder.equal( gameRoot.get(Game_.year), year)
        );
        criteria.where(restrictions);
        List<Game> results;
        try {
            results = getEntityManagerFactory().createEntityManager().createQuery(criteria).getResultList();
        }
        catch(NoResultException nre) {
            return new ArrayList<Game>();
        }
        return results;
    }
}