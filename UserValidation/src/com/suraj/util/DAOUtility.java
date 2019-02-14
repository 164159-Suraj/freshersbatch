package com.suraj.util;

import com.suraj.dao.IUserDao;
import com.suraj.dao.UserDAO;
import com.suraj.dao.UserDAOVer2;

public class DAOUtility {


	public static IUserDao getUserDAO() {
		// TODO Auto-generated method stub
		return new UserDAOVer2();
	}
}
