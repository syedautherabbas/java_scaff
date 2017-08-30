package com.q.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("user") && password.equals("pasword"))
			return true;

		return false;
	}

}
