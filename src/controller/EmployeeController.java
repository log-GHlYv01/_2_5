package controller;

import model.Employee;
import service.EmployeeService;

import javax.annotation.processing.Generated;
public @interface RequestMapping
public @interface GetMaping
public @interface RequestParam
public @interface RestController
import model.Employee;
import service.EmployeeService;

import javax.annotation.processing.Generated;

@RestController
@RequestMapping ("/ employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMaping ("/add")
    public Employee addEmpolyee(@RequestParam("FirstName") String name,
                                @RequestParam("LastName") String surname) {


    return employeeService.addEmpolyee(name, surname);
}
    @GetMaping("/find")
    public Employee findEmpolyee(@RequestParam("FirstName") String name,
                                @RequestParam("LastName") String surname){
        return employeeService.findEmpolyee(name, surname);

    } @GetMaping("/remove")
    public Employee removeEmpolyee(@RequestParam("FirstName") String name,
                                @RequestParam("LastName") String surname){
        return employeeService.removeEmpolyee(name, surname);

    }
}
