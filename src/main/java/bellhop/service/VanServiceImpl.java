package bellhop.service;

import bellhop.domain.Van;
import bellhop.repository.VanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by RAM0N on 8/16/16.
 */
@Service
public class VanServiceImpl implements VanService {

    private VanRepository mVanRepository;

    @Autowired
    public VanServiceImpl(VanRepository vanRepository) {
        this.mVanRepository = vanRepository;
    }


    @Override
    public Iterable<Van> list() {
        return mVanRepository.findAll();
    }

    @Override
    public Van create(Van van) {
        return mVanRepository.save(van);
    }

    @Override
    public Van read(Long id) {
        return mVanRepository.findOne(id);
    }

    @Override
    public Van update(long id, Van van) {
        Van vanToUpdate = mVanRepository.findOne(id);

        vanToUpdate.setMake(van.getMake());
        vanToUpdate.setName(van.getName());
        vanToUpdate.setDescription(van.getDescription());
        vanToUpdate.setImgurl(van.getImgurl());

        return mVanRepository.save(vanToUpdate);
    }

    @Override
    public void delete(long id) {
        mVanRepository.delete(id);
    }
}
