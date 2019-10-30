package task.controller;

import task.service.Service;
import task.util.*;

import java.util.List;

public class Controller {
    Input input = new Input();
    OutPut outPut = new OutPut();
    Validator validator = new Validator();
    Service service = new Service();

    public void run() {
        outPut.startInfo();
        String[] values = validator.inputContent(input.getString());
        int border0;
        int border1;
        if (values.length == 2) {
            border0 = Integer.parseInt(values[0]);
            border1 = Integer.parseInt(values[1]);
            outPut.outNumbers(service.getFibonacciNumbersToDiapason(border0, border1));
        } else {
            int length = Integer.parseInt(values[0]);
            List<Integer> borders = service.findBorders(length);
            border0 = borders.get(0);
            border1 = borders.get(1);
            outPut.outNumbers(service.getFibonacciNumbersToDiapason(border0, border1));
        }


    }
}
