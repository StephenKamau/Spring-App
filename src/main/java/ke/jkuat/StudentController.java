package ke.jkuat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentDAO studentDAO;

    /*It displays a form to input data, here "command" is a reserved request attribute
     *which is used to display object data into form
     */
    @RequestMapping("/studentform")
    public String showForm(Model model) {
        model.addAttribute("command", new Student());
        return "studentform";
    }

    /*It saves object into database. The @ModelAttribute puts request data
     *  into model object. You need to mention RequestMethod.POST method
     *  because default request is GET*/
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("student") Student student) {
        studentDAO.insert(student);
        return "redirect:/viewstudents"; //will redirect to view-students request mapping
    }

    /* It provides list of students in model object */
    @RequestMapping(value = "/viewstudents")
    public String viewStudents(Model model) {
        List<Student> listStudents = studentDAO.getStudents();
        model.addAttribute("listStudents", listStudents);
        return "viewstudents";
    }

    /* It displays object data into form for the given id.
     * The @PathVariable puts URL data into variable.*/
    @RequestMapping(value = "/editstudent/{id}")
    public String editStudent(@PathVariable int id, Model model) {
        Student student = studentDAO.getStudentById(id);
        student.setId(id);
        model.addAttribute("command", student);
        return "editstudentform";
    }

    /* It updates model object. */
    @RequestMapping(value = "/editsave", method = RequestMethod.POST)
    public String update(@ModelAttribute("student") Student student) {
        studentDAO.update(student);
        return "redirect:/viewstudents";
    }

    /* It deletes record for the given id in URL and redirects to /viewstudents */
    @RequestMapping(value = "/deletestudent/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        studentDAO.delete(id);
        return "redirect:/viewstudents";
    }
}
