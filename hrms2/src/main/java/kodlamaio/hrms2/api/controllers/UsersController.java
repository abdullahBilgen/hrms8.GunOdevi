package kodlamaio.hrms2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.UserService;
import kodlamaio.hrms2.core.entities.User;
import kodlamaio.hrms2.core.utilities.DataResult;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/gelAll")
	public DataResult<List<User>> getAll() {
		return this.userService.getAll();
	}
}
