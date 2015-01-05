package org.saarang.qmshelper;
import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Application;
public class Singleton extends Application{
	JSONObject events;
	private String data,admin_token;
    private String[] bulk_bcode;
    private boolean[] used;
	public Singleton() {
        bulk_bcode= new String[]{};
        used=new boolean[]{};
		admin_token="e72f92c95ae0d6c3d3cb21f3a799fa9143649e29";
		// TODO Auto-generated constructor stub
	}

	  public String getData() {return data;}
      public String[] getBulk() {return bulk_bcode;}
	  public String getadmintoken() {return admin_token;}
	  public JSONObject getJSON() {return events;}
      public boolean[] getUsed() {return used;}

	  public void setData(JSONObject data) {this.events = data;}
      public void setBulk(String[] bulk) {this.bulk_bcode = bulk;}
      public void setUsed(boolean[] bulk) {this.used = bulk;}



}
