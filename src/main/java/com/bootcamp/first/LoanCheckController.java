package com.bootcamp.first;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class LoanCheckController {

	@GetMapping("/loancheckbc/{cs}/{loanamt}/{salary}")
	public ResponseEntity<LoanResponse> checkLoanLimit(@PathVariable("cs") int cs, @PathVariable("loanamt") int loanamt,
			@PathVariable("salary") int salary) {

		System.out.println("In check loan limit " + loanamt);

		int status = 0;
		int approvedAmt = 0;

		if (salary > 50000 && cs > 700) {
			status = 1;
			if (loanamt > 1000000) {
				approvedAmt = loanamt;
			} else {
				approvedAmt = loanamt;
			}
		}
		LoanResponse lr = new LoanResponse(approvedAmt, status);

		return ResponseEntity.ok(lr);
	}

	@GetMapping("/posts/{id}")
	public ResponseEntity<PostResponse> getPostTest(@PathVariable("id") String id) {

		String url = "https://jsonplaceholder.typicode.com/posts/";

		PostResponse pr = RestClient.create().get().uri(url + id).retrieve().body(PostResponse.class);

		System.out.println("Post Response " + pr);

		return ResponseEntity.ok(pr);

	}

}
