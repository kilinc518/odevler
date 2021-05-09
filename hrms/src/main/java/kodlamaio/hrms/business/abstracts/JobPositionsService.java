package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.JobPositions;

import java.util.List;

public interface JobPositionsService {
    List<JobPositions> getAll();
}
