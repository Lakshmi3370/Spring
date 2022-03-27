package com.xworkz.springWithHibernate.dao;

import java.util.List;

import com.xworkz.springWithHibernate.dto.CafeDTO;

public interface CafeDAO {
	
	public void save(CafeDTO dto);
	public List<CafeDTO> list();

}
