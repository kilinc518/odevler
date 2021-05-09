package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobPositionsService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionsDao;
import kodlamaio.hrms.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionsManager implements JobPositionsService {
    private JobPositionsDao jobPositionsDao;

    @Autowired
    public JobPositionsManager(JobPositionsDao jobPositionsDao) {
        super();
        this.jobPositionsDao = jobPositionsDao;
    }


    @Override
    public List<JobPositions> getAll() {
        return this.jobPositionsDao.findAll();
    }
}
