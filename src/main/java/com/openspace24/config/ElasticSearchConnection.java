package com.openspace24.config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ElasticSearchConnection {
	
	 public  List<EmActionLog> getLogInfo() {

	    	Connection con = null;
	    	List<EmActionLog> list = new ArrayList<EmActionLog>();
			try {
				
				long startTimeConnection = new Date().getTime();
				con = DBCPDataSource.getConnection();
				
				long endTimeConnection = new Date().getTime();
				
				long Connectionduration = endTimeConnection-startTimeConnection;
				
				System.out.println("startTimeConnection ++++++++++++ "+Connectionduration);
				System.out.println("************************************************************************************************* ");
				
				long startTimeQuary = new Date().getTime();
				PreparedStatement st = con.prepareStatement("SELECT instituteId,moduleName,COUNT(*) action  FROM eduman where logDate between '2019-01-10' and '2020-01-10' GROUP BY moduleName");
						
				long endTimeQuary = new Date().getTime();
				long durationQuary = startTimeQuary-endTimeQuary;
				System.out.println("startTimeQuary ++++++++++++ "+durationQuary);
				
				ResultSet rs =  st.executeQuery();
								
				while (rs.next()) {
					
					EmActionLog emActionLog = new EmActionLog();
					emActionLog.setModuleName(rs.getString(1));		
					emActionLog.setNoOfAction(rs.getInt(2));
					System.out.println();
					
					list.add(emActionLog);
				}
				
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
						
			 return list;
		}
	 
	 
	 
	 
	/*
	 * public void getEdumanLog() {
	 * 
	 * 
	 * try { HttpResponse<String> response = Unirest.post(
	 * "https://search-eduman6-es-ekmj5u3tgt7nn4zdfi7twocilm.ap-northeast-1.es.amazonaws.com/_opendistro/_sql?format=json")
	 * .header("content-type", "application/json")
	 * .body("{\n    \"query\": \"SELECT instituteId,moduleName,COUNT(*) action  FROM eduman where logDate between '2019-12-10' and '2020-01-10' GROUP BY moduleName \"\n    \n}"
	 * ) .asString();
	 * 
	 * List<String> logInfo = Arrays.asList(response.getBody());
	 * 
	 * 
	 * for (int i = 0; i < logInfo.size(); i++) {
	 * 
	 * System.out.println("xxxxxxxxxxxxxxxxxxx "+logInfo.get(i));
	 * 
	 * }
	 * 
	 * 
	 * 
	 * for (String string : logInfo) {
	 * 
	 * JSONObject jsonObject = new JSONObject(string);
	 * 
	 * System.out.println("++++++++++++ "+jsonObject);
	 * 
	 * }
	 * 
	 * 
	 * //
	 * System.out.println("++++++++++++ "+response.getBody().toString().length());
	 * 
	 * 
	 * 
	 * } catch (UnirestException e) { e.printStackTrace(); }
	 * 
	 * 
	 * }
	 */	

}
