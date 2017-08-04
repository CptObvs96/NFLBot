package paket_nflbot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GameRestController {


    private GameDao gameDao;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public  Map<String, Object> findAllGames() throws Exception {
        List<Game> games = this.gameDao.findAllGames();
        return buildModel(games);
    }

    @RequestMapping(value = "/{year}", method = RequestMethod.GET, produces = "application/json")
    public  Map<String, Object> findAllGamesInYear(@PathVariable Integer year) throws Exception {
        List<Game> games = this.gameDao.findAllGamesInYear(year);
        return buildModel(games);
    }

    @RequestMapping(value = "/{year}/{week}", method = RequestMethod.GET, produces = "application/json")
    public  Map<String, Object> findAllGamesInWeekAndYear(@PathVariable Integer year, @PathVariable String week) throws Exception {
        List<Game> games = this.gameDao.findAllGamesInWeekAndYear(week, year);
        return buildModel(games);
    }

    private Map<String, Object> buildModel(List<Game> games) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("league", "NFL");
        model.put("games-size", games.size());
        model.put("games", games);
        return model;
    }
}