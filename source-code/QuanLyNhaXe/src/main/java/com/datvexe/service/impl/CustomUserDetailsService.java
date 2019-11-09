package com.datvexe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.datvexe.constant.SystemConstant;
import com.datvexe.dto.MyUser;
import com.datvexe.entity.UserAccountEntity;
import com.datvexe.entity.UserRoleEntity;
import com.datvexe.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserAccountEntity userAccountEntity = userRepository.findOneByTenTaiKhoanAndActive(username, SystemConstant.ACTIVE);
		if (userAccountEntity == null)
		{
			throw new UsernameNotFoundException("Không tồn tại tài khoản");
		}
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (UserRoleEntity role : userAccountEntity.getRoles())
		{
			authorities.add(new SimpleGrantedAuthority(role.getCode()));
		}
		// put thông tin vào security duy trì thông báo  khi user login vào hệ thống
//		User user  = new User(userAccountEntity.getTenTaiKhoan(), userAccountEntity.getMatKhau(),
//								true, true, true, true, authorities);
		MyUser myuser  = new MyUser(userAccountEntity.getTenTaiKhoan(), userAccountEntity.getMatKhau(),
				true, true, true, true, authorities);
		
		myuser.setActive(userAccountEntity.getActive());
		return myuser;
	}
	

}
