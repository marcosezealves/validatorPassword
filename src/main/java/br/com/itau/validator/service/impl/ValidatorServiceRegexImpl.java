package br.com.itau.validator.service.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import br.com.itau.validator.service.ValidatorService;

@Service
public class ValidatorServiceRegexImpl implements ValidatorService {

	public boolean validate(String password) {

		// Logic Regex - Regular Expression

		Pattern filderA = Pattern
				.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?:([0-9a-zA-Z$*&@#])(?!\\1)){9,}$");
		Matcher filderb = filderA.matcher(password);
		return filderb.matches();
	}

}
