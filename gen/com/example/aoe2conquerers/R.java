/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.example.aoe2conquerers;

public final class R {
    public static final class attr {
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarButtonStyle=0x7f010001;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int buttonBarStyle=0x7f010000;
    }
    public static final class color {
        public static final int black_overlay=0x7f040000;
    }
    public static final class drawable {
        public static final int bg1068x649_blank=0x7f020000;
        public static final int castle=0x7f020001;
        public static final int count_icon=0x7f020002;
        public static final int cross_brown=0x7f020003;
        public static final int ic_launcher=0x7f020004;
        public static final int icon_attack=0x7f020005;
        public static final int icon_food=0x7f020006;
        public static final int icon_gold=0x7f020007;
        public static final int icon_range=0x7f020008;
        public static final int icon_stone=0x7f020009;
        public static final int icon_unit_menu_tc=0x7f02000a;
        public static final int icon_villager_menu=0x7f02000b;
        public static final int icon_wood=0x7f02000c;
        public static final int tc=0x7f02000d;
        public static final int top_panel=0x7f02000e;
        public static final int unit_menu=0x7f02000f;
        public static final int unit_menu_subunit_bg=0x7f020010;
        public static final int villager_button_ui=0x7f020011;
        public static final int villager_on_map=0x7f020012;
    }
    public static final class id {
        public static final int attack=0x7f070016;
        public static final int background=0x7f070006;
        public static final int castleFrame=0x7f07000d;
        public static final int castle_icon=0x7f07000e;
        public static final int count_villager_icon=0x7f070008;
        public static final int creatableUnitsPane=0x7f070018;
        public static final int createVillager=0x7f070019;
        public static final int cross_unitMenu=0x7f070011;
        public static final int food=0x7f070003;
        public static final int gold=0x7f070004;
        public static final int iconAndName=0x7f070012;
        public static final int iconUnitMenu=0x7f070014;
        public static final int layout_villager=0x7f070007;
        public static final int leftPanel=0x7f070000;
        public static final int range=0x7f070017;
        public static final int resources=0x7f070001;
        public static final int rightPanel=0x7f07000f;
        public static final int statsLayout=0x7f070015;
        public static final int stone=0x7f070005;
        public static final int tc=0x7f07000a;
        public static final int tc_icon=0x7f07000b;
        public static final int tc_icon_text=0x7f07000c;
        public static final int unitMenu=0x7f070010;
        public static final int unitName=0x7f070013;
        public static final int villager_icon_text=0x7f070009;
        public static final int wood=0x7f070002;
    }
    public static final class layout {
        public static final int activity_game=0x7f030000;
    }
    public static final class string {
        public static final int app_name=0x7f050000;
        public static final int dummy_button=0x7f050002;
        public static final int dummy_content=0x7f050001;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.

    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.

        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.

    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f060000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f060001;
        public static final int ButtonBar=0x7f060003;
        public static final int ButtonBarButton=0x7f060002;
        public static final int FullscreenActionBarStyle=0x7f060005;
        public static final int FullscreenTheme=0x7f060004;
    }
    public static final class styleable {
        /** 
         Declare custom theme attributes that allow changing which styles are
         used for button bars depending on the API level.
         ?android:attr/buttonBarStyle is new as of API 11 so this is
         necessary to support previous API levels.
    
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarButtonStyle com.example.aoe2conquerers:buttonBarButtonStyle}</code></td><td></td></tr>
           <tr><td><code>{@link #ButtonBarContainerTheme_buttonBarStyle com.example.aoe2conquerers:buttonBarStyle}</code></td><td></td></tr>
           </table>
           @see #ButtonBarContainerTheme_buttonBarButtonStyle
           @see #ButtonBarContainerTheme_buttonBarStyle
         */
        public static final int[] ButtonBarContainerTheme = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link com.example.aoe2conquerers.R.attr#buttonBarButtonStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name android:buttonBarButtonStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarButtonStyle = 1;
        /**
          <p>This symbol is the offset where the {@link com.example.aoe2conquerers.R.attr#buttonBarStyle}
          attribute's value can be found in the {@link #ButtonBarContainerTheme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name android:buttonBarStyle
        */
        public static final int ButtonBarContainerTheme_buttonBarStyle = 0;
    };
}
