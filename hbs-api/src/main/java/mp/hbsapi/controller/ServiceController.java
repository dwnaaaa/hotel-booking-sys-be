package mp.hbsapi.controller;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Service;
import mp.hbsapi.service.ServicesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/service")
public class ServiceController {

    private final ServicesService servicesService;

    @GetMapping(path = "/{employeeType}")
    public ResponseEntity<List<Service>> getServicesByEmployeeType(@PathVariable char employeeType) {
        return new ResponseEntity<>(servicesService.getServicesByEmployeeType(employeeType), HttpStatus.OK);
    }

    @GetMapping(path = "/price/{code}")
    public ResponseEntity<Integer> getPriceByServiceCode(@PathVariable int code) {
        return new ResponseEntity<>(servicesService.getPriceByServiceCode(code), HttpStatus.OK);
    }
}
