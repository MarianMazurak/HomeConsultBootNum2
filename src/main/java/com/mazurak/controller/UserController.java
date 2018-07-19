package com.mazurak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mazurak.cloudinary.CloudinaryService;
import com.mazurak.dto.UserDto;
import com.mazurak.entity.User;
import com.mazurak.mapper.UserMapper;
import com.mazurak.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired CloudinaryService cloudinaryService;

	@GetMapping("/register")
	public String showRegister(Model model) {
		model.addAttribute("userModel", new UserDto());
		return "user/register";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute UserDto userDto) {
		userService.saveUser(UserMapper.userDtoToUser(userDto));
		return "redirect:/";
	}

	@GetMapping("/verify")
	public String verifyAccount(
			@RequestParam("token") String token,
			@RequestParam("id") String userIdStr) {
		userService.verifyAccount(token, userIdStr);
		return "redirect:/";
	}
	
	@GetMapping("/users")
	public  String showUsers(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "user/users";
	}

	@GetMapping("/profile/{userId}")
	public String showProfile(@PathVariable int userId, Model model) {
		model.addAttribute("userModel", userService.findUserById(userId));
		return"user/user";
	}
	
	@GetMapping("/{userId}/image")
	public String showLoadImage(@PathVariable int userId,Model model) {
		model.addAttribute("userId", userId);
		return "user/upload";
		
	}
	
	@PostMapping("/image/upload")
	public String uploadImage(@RequestParam("user_id") String  userIdStr,
			@RequestParam("profileImage") MultipartFile file
			) {
		String imageUrl = cloudinaryService.uploadFile(file, "");
		User user = userService.findUserById(Integer.valueOf(userIdStr));
		user.setProfileImageUrl(imageUrl);
		userService.update(user);
		
		return "redirect:/user/profile/" + userIdStr;
		
	}
}

