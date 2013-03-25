package units;

import java.io.InputStream;

import android.util.Log;


public class ObjectCreator{
	
	public Villager v;
	
	public enum switchAt {
        townCenter,
        villager
    }
	
	switchAt type = switchAt.villager;
	
public ObjectCreator(String objectName, InputStream in){
	switch(type){
	case villager:{
		v = new Villager("Spanish", in, "unit");
		v.count_villager++;
		break;
		
	}
	
	}
}
	
	
}
