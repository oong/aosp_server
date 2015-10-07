package com.android.aosp.servlet;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.android.aosp.manager.EquivalentDeviceInfoManager;
import com.android.aosp.vo.InputProtocol;


public class MainServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6409875791265821135L;
	static final String PARAM_MODELNAME = "model_name";
	static final String PARAM_MANUFACTURERNAME = "manufacturer_name";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String modelName = req.getParameter(PARAM_MODELNAME);
		String manufacturerName = req.getParameter(PARAM_MANUFACTURERNAME);
		PrintWriter printWriter = null;
		try {
			Hashtable<String, Hashtable<String, InputProtocol>> resultTable = new EquivalentDeviceInfoManager().getEQDeviceInfo(manufacturerName, modelName);
			JSONObject json = makeJSON(manufacturerName, modelName, resultTable);
			printWriter = resp.getWriter();
			printWriter.write(json	.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			printWriter.close();
		}
	}
	
	private JSONObject makeJSON(String manufacturerName, String modelName, Hashtable<String, Hashtable<String, InputProtocol>> resultTable) throws JSONException {
		JSONObject json = new JSONObject();
		json.put("modelName", modelName);
		json.put("manufacturerName", manufacturerName);
		
		Set<String> keySet = resultTable.keySet();
		
		Iterator<String> iter = keySet.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			json.put(key, resultTable.get(key));
		}
		return json;
	}
}
