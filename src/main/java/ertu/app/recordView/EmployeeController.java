package ertu.app.recordView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping(path = "/all")
	public @ResponseBody
	Iterable<Employee> getAllEmployees() {
		// This returns a JSON or XML with the users
		return employeeRepository.findAll();
	}
}
