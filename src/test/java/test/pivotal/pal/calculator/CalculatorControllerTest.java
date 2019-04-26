package test.pivotal.pal.calculator;

import io.pivotal.pal.calculator.Calculator;
import io.pivotal.pal.calculator.CalculatorController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;



public class CalculatorControllerTest {
    private CalculatorController controller;

    @Before
    public void setUp() throws Exception {
        controller = new CalculatorController();
    }

    @Test
    public void testAdd() {
        int expected = 3;
        Calculator calc = new Calculator(1, 2);
        ResponseEntity response = this.controller.add(calc);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(expected);
    }

    @Test
    public void testAddInvalid() {
        int expected = 3;
        Calculator calc = new Calculator(1, 2);
        ResponseEntity response = this.controller.add(calc);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(expected);
    }

    @Test
    public void testSub() {
        int expected = 8;
        Calculator calc = new Calculator(10, 2);
        ResponseEntity response = this.controller.sub(calc);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(expected);
    }

    @Test
    public void testMul() {
        int expected = 81;
        Calculator calc = new Calculator(9, 9);
        ResponseEntity response = this.controller.mul(calc);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(expected);
    }

    @Test
    public void testDiv() {
        int expected = 9;
        Calculator calc = new Calculator(81, 9);
        ResponseEntity response = this.controller.div(calc);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(expected);
    }

    @Test(expected = ArithmeticException.class)
    public void test() {
        Calculator calc = new Calculator(10, 0);
        ResponseEntity response = this.controller.div(calc);
    }
}
