import java.util.Scanner;
import java.util.*;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Customor{
    static List<String> menu_one;
    static List<String> menu_three;
    static List<String> menu_five;
    static List<String> menu_seven;
    static List<String> menu_ten;
    static List<String> menu_otwo;
    static List<String> menu_othree;
    static List<String> menu_ofour;
    static List<String> menu_osix;
    static List<String> menu_oseven;

    static String price_one;
    static String price_three;
    static String price_five;
    static String price_seven;
    static String price_ten;
    static String price_otwo;
    static String price_othree;
    static String price_ofour;
    static String price_osix;
    static String price_oseven;

    static List<String> def;
    public static List<String> customor_data(List<String> list,List<Integer> list_price,int table_num){
	switch(table_num){    
	    case 1:		
		menu_one = list;
		//System.out.println(Arrays.toString(menu_one));
	        return menu_one; 
	    case 3:
		menu_three = list;
		return menu_three;
	    case 5:
		menu_five = list;
		return menu_five;
	    case 7:
		menu_seven = list;
		return menu_seven;
	    case 10:
		menu_ten = list;
		return menu_ten;
	    case 12:
		menu_otwo = list;
		return menu_otwo;
	    case 13:
	        menu_othree = list;
		return menu_othree;
	    case 14:
		menu_ofour = list;
		return menu_ofour;
	    case 16:
		menu_osix = list;
		return menu_osix;
	    case 17:
		menu_oseven = list;
		return menu_oseven;
	    
	}
        
	return def;
    }
}
