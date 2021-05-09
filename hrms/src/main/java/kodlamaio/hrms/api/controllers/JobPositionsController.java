package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobPositionsService;
import kodlamaio.hrms.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
    private JobPositionsService jobPositionsService;

    @Autowired
    public JobPositionsController(JobPositionsService jobPositionsService) {
        this.jobPositionsService = jobPositionsService;
    }

    @GetMapping("/getall")
    public List<JobPositions> getAll(){
        return this.jobPositionsService.getAll();
    }


}
