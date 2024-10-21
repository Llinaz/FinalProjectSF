package org.example.finalprojectsf.controller;


import jdk.jfr.Timestamp;
import org.example.finalprojectsf.operation.Operation;
import org.example.finalprojectsf.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/operations")
public class OperationController {
    @Autowired
    private OperationService operationService;

    @GetMapping("/{userId}")
    public List<Operation> getOperationList(
            @PathVariable int userId,
            @RequestParam(required = false) LocalDateTime startDate,
            @RequestParam(required = false) LocalDateTime endDate
    ) {
        return operationService.getOperationList(userId, startDate, endDate);
    }
}
