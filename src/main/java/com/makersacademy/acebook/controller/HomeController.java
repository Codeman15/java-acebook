package com.makersacademy.acebook.controller;

import com.makersacademy.acebook.model.Post;
import com.makersacademy.acebook.model.PostForm;
import com.makersacademy.acebook.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {


	private final PostRepository postRepository;

	@Autowired
	public HomeController(PostRepository postRepository) {
		this.postRepository = postRepository; 											//allows you to access the postRepository
	}



	@RequestMapping(value = "/")
	public String index() { 															//a method whereby going to the homepage returns index.html file, which is linked to react j/s file

		return "index";
	}

	@GetMapping(value = "/post")
	public String post(Model model) { 													//new model object. to provide a view (templates) with usable data you add it to a model object
		model.addAttribute("newPost", new PostForm("Enter Post")); 	//adds PostForm called "newPost" to the model object. PostForm contains text "Enter Post"
		return "post"; 																	//returns post.html file, which is linked to react j/s file
	}

	@PostMapping(value = "/post")
	public RedirectView post(@ModelAttribute Post newPost) { 							//RedirectView as we want to redirect. @ModelAttribute takes the attribute from above, it binds a method parameter to a model attribute then exposes to web view
		postRepository.save(newPost); 													//saves the post to the postRepository database
		return new RedirectView("/"); 												//redirects to the homepage
	}

}


