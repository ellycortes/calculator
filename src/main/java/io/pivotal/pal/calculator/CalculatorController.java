package io.pivotal.pal.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    @GetMapping("add")
    public ResponseEntity add(@RequestBody Calculator calculator) {
        int result = calculator.add();
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping("sub")
    public ResponseEntity sub(@RequestBody Calculator calculator) {
        int result = calculator.sub();
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping("mul")
    public ResponseEntity mul(@RequestBody Calculator calculator) {
        int result = calculator.mul();
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping("div")
    public ResponseEntity div(@RequestBody Calculator calculator) {
        int result = calculator.div();
        return new ResponseEntity(result, HttpStatus.OK);
    }
}

