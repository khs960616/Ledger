package ledger.user;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import lombok.RequiredArgsConstructor;

@Api(tags= {"1. 사용자 관리"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value ="/v1")
public class UserController {
	private final UserService userService;
	
	@ApiOperation(value = "사용자 추가", notes = "사용자를 추가한다.")
	@PostMapping(value = "/user")
	public User saveUser(@ModelAttribute User userParam) {
		return userService.createUser(userParam);
	}
}