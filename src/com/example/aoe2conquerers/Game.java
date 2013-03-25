package com.example.aoe2conquerers;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import units.ObjectCreator;
import units.TownCenter;

import com.example.aoe2conquerers.util.SystemUiHider;

import android.R.xml;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class Game extends Activity {
	Button unitMenuCloseButton, createVillager;
	
	View viewTc;
	
	FrameLayout villagerFrameLayout;
	
	TextView viewTcTextView, unitName, attack, range, villager_icon_text;
	
	Map<String, Integer> liveUnits= new HashMap<String, Integer>();
	Map<String, Integer> resources = new HashMap<String, Integer>();
	
	int count_tc=0, villager_count;
	
	boolean toggleUnitMenu=false;
	
	ImageView iconUnitMenu;
	
	RelativeLayout unitMenu;
	//FrameLayout villagerFrameLayout;
	
	public TownCenter tc;
	ProgressBar health;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_game);
		//Create the town center
		createTownCenter();
		//Create the first 3 villagers
		
		//Initialize the resources
		initializeResources();
		
		//Set Resources for the first time
		updateResources(resources.get("wood"), resources.get("food"), resources.get("gold"), resources.get("stone"));
		//The onClick listener for the TC, we open unit menu when clicked on the TC
		viewTc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				unitMenu = (RelativeLayout) findViewById(R.id.unitMenu);		//finding the respective layouts/views of the unit menu
				iconUnitMenu = (ImageView) findViewById(R.id.iconUnitMenu);
				unitName = (TextView)findViewById(R.id.unitName);
				attack = (TextView)findViewById(R.id.attack);
				range = (TextView)findViewById(R.id.range);
				createVillager = (Button) findViewById(R.id.createVillager);
				if(toggleUnitMenu == false) //We use this toggle variable to show/hide the unit menu UI
				{
					unitMenu.setVisibility(View.VISIBLE);
					toggleUnitMenu = true;
					iconUnitMenu.setBackgroundResource(R.drawable.icon_unit_menu_tc);
					unitName.setText("Town Center");
					attack.setText(Integer.toString(tc.attack));
					range.setText(Integer.toString(tc.rangeMax));
				}
				else
				{
					unitMenu.setVisibility(View.INVISIBLE);
					toggleUnitMenu = false;
				}
				//Now, inside the unit menu, we have a villager icon. onClick listener for that:
				createVillager.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						//We find the Villager icon's FramyLayout View first
						createVillager = (Button)findViewById(R.id.createVillager);		//This got initiated twice
						villagerFrameLayout = (FrameLayout)findViewById(R.id.layout_villager);
						int villagerCount=searchFor("villager"); //Declare an var to fetch current count of villagers from the HM
						Log.i("VC", Integer.toString(villagerCount));
						//Create an inputStream with XML doc in it and pass it on to the Object Creator. This is the first time when I created the ObjectCreator class.
						//We will use this class hence forth when we create any object for this game.
						AssetManager assetManager = getAssets();
						InputStream in = null;
						try {
							in = assetManager.open("civilizations.xml");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						// TODO Auto-generated method stub
						ObjectCreator oc = new ObjectCreator("villager", in);
						//Now close the input stream so it could be opened again from start.
						try {
							in.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//If the searchFor() function returns 0 that means no object called "villager" was NOT created before, thus, we create the first entry:
						if(villagerCount==0)
						{
							liveUnits.put("villager", 1);
						}
						else 
						{//If it does return something, then we simply increment the count.
							villagerCount++;
							liveUnits.put("villager", villagerCount);
						}
						//Find and set the count icon of villager in the map to the total number of villagers.
						villager_icon_text = (TextView) findViewById(R.id.villager_icon_text);
						//We again call the searchFor() function to get the most updated value.
						villager_icon_text.setText(Integer.toString(searchFor("villager")));
						Log.i("VFL", "just before this statement");
						villagerFrameLayout.setVisibility(View.VISIBLE);//Making the villager icon visible
						//the following is a hashMap created in the TownCenter.java class, not sure if I would use it.
						tc.TC.put("villager", Integer.toString((oc.v.count_villager)));
					
					}
				});
				
			}
		});
		//The close button on the top right corner of the unit menu. It simply makes the unit menu disappear.
		unitMenuCloseButton = (Button) findViewById(R.id.cross_unitMenu);
		unitMenuCloseButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				unitMenu = (RelativeLayout) findViewById(R.id.unitMenu);
				unitMenu.setVisibility(View.INVISIBLE);
				toggleUnitMenu = false;
			}
		});


	}

//This function is called once when the game starts, however, we may call it again if the user wishes to build one more.
public void createTownCenter(){
		
		AssetManager assetManager = getAssets();
		InputStream in = null;
		try {
			in = assetManager.open("civilizations.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Log.i("Parikksit", "Before Creating Object of TC");
		tc = new TownCenter("Spanish", in, "");
		if(tc!=null){//If TC is created, make the view containing it visible, make the count icon text = 1
			viewTc = findViewById(R.id.tc);
			viewTcTextView = (TextView) findViewById(R.id.tc_icon_text);
			viewTc.setVisibility(View.VISIBLE);
			count_tc++;
			viewTcTextView.setText(Integer.toString(count_tc));			
		}
		//Closing the input stream
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}


//This method will basically search: IF a particular unit created exists or not?
public int searchFor(String attributeName)
{
	int count = 0;
	if(liveUnits.get(attributeName)!=null)
	{
		count = liveUnits.get(attributeName);
	}
	Log.i("SFC", Integer.toString(count));
	return count;	
}

//This function is called once when the game starts. It basically allocates basic resources. These could change later in the game settings.	
public void initializeResources()
{
	resources.put("wood", 200);
	resources.put("food", 200);
	resources.put("gold", 100);
	resources.put("stone", 100);
}


//This function is called everytime game resources are used, basically, everytime one needs to update resources.
public void updateResources(int wood, int food, int gold, int stone)
{
	TextView w, f, g, s;
	w = (TextView) findViewById(R.id.wood);
	f = (TextView) findViewById(R.id.food);
	g = (TextView) findViewById(R.id.gold);
	s = (TextView) findViewById(R.id.stone);
	w.setText(Integer.toString(wood));
	f.setText(Integer.toString(food));
	g.setText(Integer.toString(gold));
	s.setText(Integer.toString(stone));
}
	
}
