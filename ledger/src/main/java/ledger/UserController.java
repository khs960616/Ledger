package ledger;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
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
	private  UserService userService;
	
	@ApiOperation(value = "사용자 추가", notes = "사용자를 추가한다.")
	@PutMapping(value = "/user")
	public User saveUser(@ModelAttribute User userParam) {
		return userService.createUser(userParam);
	}
}