package com.android.aosp.dao;

public class DAOFactory implements Factory{

	public static final String NAME_EQDEVICE_INFO_DAO = "EquivalentDeviceInfoDAO"; 
	public static final String NAME_AVAILABLE_ACION_DAO = "AvailableActionDAO";
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
		case NAME_EQDEVICE_INFO_DAO : 
			return createEQDeviceInfoDAO();
		case NAME_AVAILABLE_ACION_DAO : 
			return createAvailableActionDAO();
		default : 
			return null;
		}
	}
	private AvailableActionDAO createAvailableActionDAO() {
		return new AvailableActionDAOImpl();
	}
	private EquivalentDeviceInfoDAO createEQDeviceInfoDAO() {
		return new EquivalentDeviceInfoDAOImpl();
	}
	

}
