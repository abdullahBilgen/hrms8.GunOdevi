package kodlamaio.hrms2.business.abstracts;

import java.util.List;

import kodlamaio.hrms2.core.entities.User;
import kodlamaio.hrms2.core.utilities.DataResult;

public interface UserService {
	DataResult<List<User>> getAll();
}
