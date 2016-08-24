package moviemonster.service;

import moviemonster.domain.Show;
import moviemonster.repositories.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by RAM0N on 8/16/16.
 */
@Service
public class ShowServiceImpl implements ShowService {

    private ShowRepository mShowRepository;

    @Autowired
    public ShowServiceImpl(ShowRepository showRepository) {
        this.mShowRepository = showRepository;
    }


    @Override
    public Iterable<Show> list() {
        return mShowRepository.findAll();
    }

    @Override
    public Show create(Show show) {
        return mShowRepository.save(show);
    }

    @Override
    public Show read(Long id) {
        return mShowRepository.findOne(id);
    }

    @Override
    public Show update(long id, Show show) {
        Show showToUpdate = mShowRepository.findOne(id);

        // UPDATE THESE FIELDS
        showToUpdate.setMediaType(show.getMediaType());
        showToUpdate.setName(show.getName());
        showToUpdate.setDescription(show.getDescription());
        showToUpdate.setImageURL(show.getImageURL());

        return mShowRepository.save(showToUpdate);
    }

    @Override
    public void delete(long id) {
        mShowRepository.delete(id);
    }
}
