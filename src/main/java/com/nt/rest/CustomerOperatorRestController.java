package com.nt.rest;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nt.model.Employee;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperatorRestController {
	
	HttpStatus HTTP_STATUS_OK=HttpStatus.OK;

	@GetMapping("/home")
	public String home() {
		return "MVCCore";
	}

	@GetMapping("/report")
	public ResponseEntity<String> report() {

		return new ResponseEntity<String>("welcome to REST API ", HTTP_STATUS_OK);
	}

	@PostMapping("/save")
	public ResponseEntity<String> saveustomer() {
		System.out.println("CustomerOperatorRestController.saveustomer()");

		return new ResponseEntity<String>("Customer info saved ",HTTP_STATUS_OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateCustomer() {
		System.out.println("CustomerOperatorRestController.updateCustomer()");

		return new ResponseEntity<String>("Customer info updated ", HTTP_STATUS_OK);
	}

	@PatchMapping("/patch")
	public ResponseEntity<String> patchCustomer() {
		System.out.println("CustomerOperatorRestController.patchCustomer()");

		return new ResponseEntity<String>("Customer info patched ", HTTP_STATUS_OK);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer() {
		System.out.println("CustomerOperatorRestController.deleteCustomer()");

		return new ResponseEntity<String>("Customer info deleted ", HTTP_STATUS_OK);
	}
	@PostMapping("/employee")
	public ResponseEntity<Employee> readEmployee(Employee employee) {
		
		System.out.println("CustomerOperatorRestController.readEmployee()");
		Employee e  = new Employee(1,"Java","Programming");
		
		return new ResponseEntity<Employee>(e,HTTP_STATUS_OK);
		
	}
}
