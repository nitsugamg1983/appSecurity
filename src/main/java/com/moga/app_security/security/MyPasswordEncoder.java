package com.moga.app_security.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

//@Component
public class MyPasswordEncoder /*implements PasswordEncoder*/{

/*	@Override
	public String encode(CharSequence rawPassword) {
		// TODO Auto-generated method stub
		return String.valueOf(rawPassword.toString().hashCode());
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		// TODO Auto-generated method stub
		var passwordAsString=String.valueOf(rawPassword.toString().hashCode());
		return encodedPassword.equals(passwordAsString);
	}
*/
}
