package com.example.Jwellery.Shop;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("jwelleryshop")
	String homePage() {
		return "index";
	}
	
	@RequestMapping("/necklacePage")
	String necklacePage() {
		return "DiamondNecklace";
	}
	
	@RequestMapping("/goldnecklace")
	String goldnecklace() {
		return "GoldNecklace";
	}
	
	@RequestMapping("/goldbraslet")
	String goldbraslet() {
		return "GoldEarings";
	}

	@RequestMapping("/goldbangels")
	String goldbangels() {
		return "GoldBangels";
	}
	@RequestMapping("/diamondring")
	String diamondring() {
		return "DiamondRing";
	}
	@RequestMapping("/goldring")
	String goldring() {
		return "GoldRing";
	}
	
	@RequestMapping("/contactpage")
	String contactpage() {
		return "contact";
	}
	

}
