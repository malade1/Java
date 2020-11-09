package com.moses.demo.controller;

import javax.inject.Inject;

import org.mockito.InjectMocks;
import org.springframework.web.bind.annotation.RestController;

import com.moses.demo.repo.PollRepository;

@RestController
public class PollController {

	@Inject
	private PollRepository pollRepository;
}
