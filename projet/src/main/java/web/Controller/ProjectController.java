package web.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Model.Project;
import web.service.ProjectService;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/list")
    public String listProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "project/list_project";
    }

    @GetMapping("/add")
    public String showAddProjectForm(Model model) {
        model.addAttribute("project", new Project());
        return "project/add_project";
    }

    @PostMapping("/add")
    public String addProject(@ModelAttribute("project") Project project) {
        projectService.saveProject(project);
        return "redirect:/projects/list";
    }

    @PostMapping("/remove")
    public String removeProject(@RequestParam("projectId") Long projectId) {
        projectService.deleteProject(projectId);
        return "redirect:/projects/list";
    }
}

