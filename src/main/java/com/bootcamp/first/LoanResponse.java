package com.bootcamp.first;

public class LoanResponse {

	int status;

	int amount;

	LoanResponse(int status, int amount) {
		this.status = status;
		this.amount = amount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoanResponse [status=" + status + ", amount=" + amount + "]";
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
