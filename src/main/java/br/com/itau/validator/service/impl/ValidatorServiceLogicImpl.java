package br.com.itau.validator.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.itau.validator.service.ValidatorService;

@Service
public class ValidatorServiceLogicImpl implements ValidatorService {

	public boolean validate(String password) {

		// Logic validater
		List<String> specialChars = Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+");
		char caracter;
		boolean validateNumber = false;
		boolean validateUpperCase = false;
		boolean validateLowerCase = false;
		boolean characterSpecial = false;
		boolean emptyField = false;

		if (password.length() < 9) {
			return false;
		}

		for (int i = 0; i < password.length(); i++) {
			caracter = password.charAt(i);
			if (Character.isDigit(caracter)) {
				validateNumber = true;
			} else if (Character.isUpperCase(caracter)) {
				validateUpperCase = true;
			} else if (Character.isLowerCase(caracter)) {
				validateLowerCase = true;
			} else if (specialChars.contains(String.valueOf(caracter))) {
				characterSpecial = true;
			} else if (Character.isWhitespace(caracter)) {
				emptyField = true;
			}
		}

		return validateNumber && validateUpperCase && validateLowerCase && characterSpecial && !emptyField
				&& !caracteresRepetidos(password);
	}

	// Logic repeated characters
	private boolean caracteresRepetidos(String password) {

		char[] passwords = password.toLowerCase().toCharArray();
		int result = 0;

		for (Character i : passwords) {
			for (Character j : passwords) {
				if (i.equals(j)) {
					result++;
				}
			}
			if (result >= 2) {
				return true;
			}
			result = 0;
		}
		return false;
	}

}
