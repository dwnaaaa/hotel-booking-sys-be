package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Service;
import mp.hbsapi.service.ServicesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/service")
public class ServiceController {

    private final ServicesService servicesService;

    @GetMapping(path = "/{employeeType}")
    public ResponseEntity<List<Service>> getServicesByEmployeeType(@PathVariable char employeeType) {
        return new ResponseEntity<>(servicesService.getServicesByEmployeeType(employeeType), HttpStatus.OK);
    }
}
