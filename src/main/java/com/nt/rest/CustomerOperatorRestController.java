package com.nt.rest;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperatorRestController {

	@GetMapping("/home")
	public String home() {
		return "MVCCore";
	}

	@GetMapping("/report")
	public ResponseEntity<String> report() {

		return new ResponseEntity<String>("welcome to REST API ", HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<String> saveustomer() {
		System.out.println("CustomerOperatorRestController.saveustomer()");

		return new ResponseEntity<String>("Customer info saved ", HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateCustomer() {
		System.out.println("CustomerOperatorRestController.updateCustomer()");

		return new ResponseEntity<String>("Customer info updated ", HttpStatus.OK);
	}

	@PatchMapping("/patch")
	public ResponseEntity<String> patchCustomer() {
		System.out.println("CustomerOperatorRestController.patchCustomer()");

		return new ResponseEntity<String>("Customer info patched ", HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer() {
		System.out.println("CustomerOperatorRestController.deleteCustomer()");

		return new ResponseEntity<String>("Customer info deleted ", HttpStatus.OK);
	}

}
