package com.example.demo.fizzBuzz.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzBuzz.service.FizzBuzzService;

@Controller
public class FizzBuzzController {
	private final FizzBuzzService fizzBuzzService;
	//コンストラクタにより、サービスクラスのインスタンスを初期化する。
	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}
	@GetMapping("fizzBuzz")
	public String fizzBuzzController(Model model) {
		List<String> numbers = fizzBuzzService.fizzBuzzList();
		model.addAttribute("numbers",numbers);
		System.out.println(Arrays.asList(numbers));
		return "fizzBuzz.html";
	}
}
