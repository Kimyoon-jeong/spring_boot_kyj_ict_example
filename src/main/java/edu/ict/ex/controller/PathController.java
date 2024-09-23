package edu.ict.ex.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



/*상대경로와 절대경로*/


@Controller
public class PathController {

	
	@GetMapping("/path")
	public String path(Model model) {

		return "path/path";
	}
	
	@GetMapping("/path/img")
	public String path2(Model model) {

		return "path/path";
	}
	
}
