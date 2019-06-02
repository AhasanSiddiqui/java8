package com.ahasan.java8;

import com.ahasan.java8.beans.DisplayFeatures;
import com.ahasan.java8.beans.Mobile;
import com.ahasan.java8.beans.ScreenResolution;

public class MobileService {
	
	public int getMobileScreenWidth(Mobile mobile){

		if(mobile != null){
			DisplayFeatures dfeatures = mobile.getDisplayFeatures();
			if(dfeatures != null){
				ScreenResolution resolution = dfeatures.getResolution();
				if(resolution != null){
					return resolution.getWidth();
				}
			}
		}
		return 0;

	}

}
