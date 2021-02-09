package ru.zettai.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.zettai.spring.mvc.models.Employee;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

//    @RequestMapping("/askDetails")
//    public String askEmployeeDetails() {
//        return "ask-emp-details-view";
//    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        Employee employee = new Employee();
//        employee.setName("Ivan");
//        employee.setSurName("Ivanov");
//        employee.setSalary(1200);
        model.addAttribute("employee", employee);
        return "ask-emp-details-view";
    }


//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String employeeName = request.getParameter("employeeName");
//        String employeeSurname = request.getParameter("employeeSurname");
//        String fullEmployeeName = "Mr. " + employeeName + " " + employeeSurname;
//        String ageEmployee = request.getParameter("employeeAge");
//        model.addAttribute("fullNameAttribute", fullEmployeeName);
//        model.addAttribute("ageEmpAttribute", ageEmployee);
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@RequestParam("employeeName") String employeeName
//            , @RequestParam("employeeSurname") String employeeSurname
//            , @RequestParam("employeeAge") String ageEmployee, Model model) {
//        String fullEmployeeName = "Mr. " + employeeName + " " + employeeSurname;
//        model.addAttribute("fullNameAttribute", fullEmployeeName);
//        model.addAttribute("ageEmpAttribute", ageEmployee);
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
                                      BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "ask-emp-details-view";
        }else
            return "show-emp-details-view";
    }

}
