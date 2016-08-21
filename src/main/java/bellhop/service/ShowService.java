package bellhop.service;

import bellhop.domain.Show;

/**
 * Created by RAM0N on 8/16/16.
 */

public interface ShowService {

    // list
    Iterable<Show> list();

    // CRUD
    Show create(Show show);
    Show read(Long id);
    Show update(long id, Show show);
    void delete(long id);

}
