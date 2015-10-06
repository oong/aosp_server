package com.android.aosp.dao;

public class DAOFactory implements Factory{

	public static final String NAME_DEVICE_INFO_DAO = "DeviceInfoDAO"; 
	
	private static DAOFactory DAO_FACTORY;
	
	public static synchronized Factory getInstance() {
		if(DAO_FACTORY == null) 
			DAO_FACTORY = new DAOFactory();
		return DAO_FACTORY;
	}
	
	
	@Override
	public Object getObject(String daoName) {
		// TODO Auto-generated method stub
		switch(daoName) {
		case NAME_DEVICE_INFO_DAO : 
			return createDeviceInfoDAO();
		default : 
			return null;
		}
	}
	
	private DeviceInfoDAO createDeviceInfoDAO() {
		return new DeviceInfoDAOImpl();
	}
	

}
