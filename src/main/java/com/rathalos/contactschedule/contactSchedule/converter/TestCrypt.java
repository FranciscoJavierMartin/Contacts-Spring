package com.rathalos.contactschedule.contactSchedule.converter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestCrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder pe=new BCryptPasswordEncoder();
		System.out.println(pe.encode("user"));
//		$2a$10$zpeUKh1Hh17.umMAAkx1juBbTeKMhFmlsTAd0BCfqV3h.HqAs1nAu

	}

}
