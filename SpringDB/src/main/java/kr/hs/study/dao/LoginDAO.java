package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dio.LoginDTO;

@Component
public class LoginDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	//Ãß°¡
	public void insert_data(LoginDTO dto) {
		String sql="insert into login values(?,?)";
		jdbcTemplate.update(sql,dto.getUserID(),dto.getUserPass());
	}
}
