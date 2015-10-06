package com.android.aosp.servlet;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.android.aosp.action.GetDeviceInfoAction;
import com.android.aosp.vo.DeviceInfoVO;


public class MainServlet extends HttpServlet{
	
	static final String PARAM_MODELNAME = "model_name";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String modelName = req.getParameter("model_name");
		
		PrintWriter printWriter = resp.getWriter();
		if(modelName == null || modelName.equals("")) {
			printWriter.write("parameter is wrong");
			return;
		}
		try {
			DeviceInfoVO info = new GetDeviceInfoAction().getDeviceInfo(modelName);
			JSONObject json = new JSONObject();
			json.put("model_name", info.getModelName());
			json.put("has_HW_navi_bar", info.isHasHWNaviBar());
			json.put("touchscreen_device", info.getTouchDevice());
			json.put("homebutton_device", info.getHomebuttonDevice());
			json.put("backbutton_device", info.getBackButtonDevice());
			json.put("menubutton_device", info.getMenuButtonDevice());
			System.out.println("["+json.toString()+"]");
			printWriter.write(json.toString());
			return;
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

	
}
