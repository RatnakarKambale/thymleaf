package in.kasmoprav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.kasmoprav.binding.Product;
import jakarta.validation.Valid;

@Controller
public class ProductController {

	@GetMapping("/product")
	public String showForm(Model model) {
	    model.addAttribute("product", new Product());
	    return "index.html";
	}

	@PostMapping("/product")
	public String saveProduct(
	        @Valid @ModelAttribute("product") Product product,
	        BindingResult result,
	        Model model) {

	    if (result.hasErrors()) {
	        return "index.html"; // redisplay form
	    }
	    model.addAttribute("message", "Product saved successfully!");
	    return "index2.html";
	}
}