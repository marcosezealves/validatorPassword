package br.com.itau.validator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.validator.dto.InputDTO;
import br.com.itau.validator.dto.OutPutDTO;
import br.com.itau.validator.service.ValidatorService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("validator")
@Api("API validator of password")
public class ValidatorController {

	@Autowired
	private ValidatorService validatorService;

	@PostMapping
	public ResponseEntity<OutPutDTO> validate(@RequestBody InputDTO input) {
		Boolean isvalid = validatorService.validate(input.getPassword());
		return new ResponseEntity<OutPutDTO>(new OutPutDTO(isvalid), isvalid ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
	}

}
