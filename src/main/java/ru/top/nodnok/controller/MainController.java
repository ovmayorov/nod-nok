package ru.top.nodnok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.top.nodnok.message.ErrorMessage;
import ru.top.nodnok.message.InputDataMessage;
import ru.top.nodnok.message.InterfaceMessage;
import ru.top.nodnok.message.StringMessage;
import ru.top.nodnok.service.Calculations;
import ru.top.nodnok.message.ResultDataMessage;

//основной контроллер приложения (единственный)
@RestController
public class MainController {

    private final Calculations solver;
    public MainController(Calculations solver){
        this.solver = solver;
    }

    @GetMapping("ping")
    public InterfaceMessage ping(){
        return new StringMessage("PONG");
    }

    @GetMapping("")
    public InterfaceMessage index(){
        return new StringMessage("Application to find the Greatest Common Divisor and the Least Common Multiple ");
    }

    @GetMapping("status")
    public InterfaceMessage status(){
        return new StringMessage("Server is running... ");
    }

    @PostMapping("solve")
    public InterfaceMessage solve(@RequestBody InputDataMessage inputData){
        try {
            System.out.println("received: " + inputData);
            ResultDataMessage result = solver.solve(inputData.getA(), inputData.getB());
            System.out.println("Result: " + result);
            return result;
        }catch (Exception ex){
            return new ErrorMessage("Error: " + ex.getMessage());
        }
    }
}
