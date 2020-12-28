package br.com.itau.validador.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.itau.validator.ValidatorPasswordApplication;
import br.com.itau.validator.service.ValidatorService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ValidatorPasswordApplication.class)
public class ValidadorServiceTests {

	@Autowired
	private ValidatorService validatorService;

	@Test
	public void validateCharacterSpecial() {
		String password = "AbTp9!fok";
		Assert.assertTrue(validatorService.validate(password));
	}

	@Test
	public void validateBlankSpace() {
		String password = "AbTp9 fok!";
		Assert.assertFalse(validatorService.validate(password));
	}

	@Test
	public void validateRepeatedCharacters() {
		String password = "AAAbbbCc";
		Assert.assertFalse(validatorService.validate(password));
	}

	@Test
	public void validateEmptyField() {
		String password = "";
		Assert.assertFalse(validatorService.validate(password));

	}

	@Test
	public void validateSmallerQuantity() {
		String password = "ATp9!fok";
		Assert.assertFalse(validatorService.validate(password));
	}

}
