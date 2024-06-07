package web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Model.Employee;
import web.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employee/list_employee";
    }

    @GetMapping("/add") // Utiliser GET pour afficher le formulaire d'ajout
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee()); // Ajouter un nouvel employé à l'attribut "employee"
        return "employee/add_employee"; // Afficher la vue pour ajouter un employé
    }

    @PostMapping("/add") // Utiliser POST pour soumettre le formulaire d'ajout
    public String addEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees/list";
    }

    @PostMapping("/remove")
    public String removeEmployee(@RequestParam("employeeId") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return "redirect:/employees/list";
    }
}
