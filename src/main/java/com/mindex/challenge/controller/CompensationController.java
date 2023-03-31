package com.mindex.challenge.controller;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompensationController {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private CompensationService compensationService;

    @PostMapping("/compensation")
    public Compensation create(@RequestBody Compensation compensation) {
        LOG.debug("Received request to create compensation for id [{}]", compensation.getEmployee().getEmployeeId());
        return compensationService.create(compensation);
    }

    @GetMapping("/compensation/{id}")
    public Compensation read(@PathVariable String id) {
        LOG.debug("Received request to read compensation for id [{}]");
        return compensationService.read(id);
    }

}
