package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(); //returns the interface type, but internally instance the implementation. This way implementation is not exposed. 
	}
}
