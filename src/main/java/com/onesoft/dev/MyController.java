package com.onesoft.dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("get")
	public String get() {
		return "Hi Hello Vanakkam Makkaley this my docker Project this hosted Aws EC2 Intance\r\n"
				+ "------>> This Is For You <<--------\r\n" + "நம்பிக்கைதான் நமக்கு வில்லை\r\n"
				+ "நாளைக்குத் தான் நமது வில்லை\r\n" + "தோல்விகளைத் தாண்டிப் போவது\r\n"
				+ "துன்பங்களுக்குப் போகும் முறை\r\n" + "வாழ்க்கை ஓர் மாறுபட்ட பாடம்\r\n"
				+ "விடைத் தரும் முயற்சி இல்லையே\r\n" + "தோல்வியை வென்றால் துயரம் போம்\r\n"
				+ "தோல்வியால் வெற்றி வரும் வழியே\r\n";
	}

}
