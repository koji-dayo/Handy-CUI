//package handy32;
//import handy.Command;
import java.util.Scanner;
import java.util.*;
import java.util.Objects;

//カルトメニュー
class Menu{
    //メンバ変数に宴会メニューを設定
    private static int beer = 520;
    private static int bottle_beer = 650;
    private static int hoppy_white = 450;
    private static int hoppy_blach = 450;
    
    public String menu_data(String menu_map){
	Map<String,String>prefs = new HashMap<String,String>();
	//ドリンクメニュー
	prefs.put("ビール","520");
	prefs.put("瓶ビール","650");
	prefs.put("ホッピー白","450");
	prefs.put("ホッピー黒","450");
	prefs.put("角ハイボール","400");
	prefs.put("マルスハイボール","380");
	prefs.put("知多ハイボール","580");
	prefs.put("トマトサワー","420");
	prefs.put("梅干しサワー","400");
	prefs.put("レモンサワー","400");       
	//フードメニュー
	//焼き物
	prefs.put("塩つくね","190");
	prefs.put("五本盛り 塩","900");
	prefs.put("５本盛り タレ","900");
	//一品物
	prefs.put("よだれ鶏","480");
	prefs.put("ねぎまみれ鶏皮ポン酢","350");
	prefs.put("梅なんこつ","430");
	//締め
	prefs.put("焼きそば","580");
	prefs.put("ラーメン","550");
	prefs.put("雑炊","450");
	
	
	String a = prefs.get(menu_map);
	return a;
	//return calt_menu;
	
    }
}
    
