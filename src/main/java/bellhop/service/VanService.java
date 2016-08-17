package bellhop.service;

import bellhop.domain.Van;

import java.util.Iterator;

/**
 * Created by RAM0N on 8/16/16.
 */
public interface VanService {

    // list
    Iterable<Van> list();

    // CRUD
    Van create(Van van);
    Van read(Long id);
    Van update(long id, Van van);
    void delete(long id);

}
