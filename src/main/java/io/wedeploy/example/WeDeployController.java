package io.wedeploy.example;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ivan Santos
 */
@Controller
@EnableAutoConfiguration
public class WeDeployController {

	public WeDeployController() {

	}

	@RequestMapping("/")
	public ModelAndView hello() {
		return new ModelAndView("layout");
	}

	public static void main(String[] args) {
		SpringApplication.run(WeDeployController.class, args);
	}

}












