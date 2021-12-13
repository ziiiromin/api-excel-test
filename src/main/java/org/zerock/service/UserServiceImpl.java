package org.zerock.service;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.UserVO;
import org.zerock.mapper.UserMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	public UserMapper mapper;

	public List<UserVO> list() {
		System.out.println("error@@@@@@@@"+mapper.list());
		
		return mapper.list();
	}
}
