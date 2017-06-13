package com.performgroup;

import java.util.Arrays;
import java.util.List;

import com.performgroup.dto.Duty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ClockFaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClockFaceApplication.class, args);
	}

	@RequestMapping
	public List<Duty> getDuties() {
		Duty.Person pl = new Duty.Person();
		pl.setFirstName("Piotr");
		pl.setLastName("Larysz");

		Duty grooming = new Duty();
		grooming.setName("grooming");
		grooming.setPerson(pl);

		Duty.Person lk = new Duty.Person();
		lk.setFirstName("Łukasz");
		lk.setLastName("Kopicki");

		Duty technicalSession = new Duty();
		technicalSession.setName("technical_session");
		technicalSession.setPerson(lk);
		return Arrays.asList(grooming, technicalSession);
	}
}
