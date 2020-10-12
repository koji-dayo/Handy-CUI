import java.util.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
頼まれたメニューをリストに保存し、送信しそれをキューしていく。
料金についても同様にキューしていく(送信されるたびに料金の合計値を求めキューしていく)
サーバー側がハンディとなる
 */
class Command{
    static List<String> list_name = new ArrayList<>();//頼まれたメニューの名前
    static List<Integer> list_price = new ArrayList<>();//頼まれたメニューの値段
    static List<String> a = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    

    //メニューの名前をリストに格納する
    static List<String> name_list(String menu_name,int num_menu){
	String menu_num = String.valueOf(num_menu);
	String menu_name_num = menu_name + "×" + menu_num;
	list_name.add(menu_name_num);
	return list_name;
    }
    
    //メニューの料金をリストに格納する
    static List<Integer> price_list(int calt_menu_price){
	list_price.add(calt_menu_price);
	return list_price;
    }
    
    //料金を返す
    static String price_define(String menu_command){
	Menu menu = new Menu();
	String calt_price = menu.menu_data(menu_command);
	return calt_price;
    }

    //6番目のコマンドであり送信するのかどうかを選択する
    static void socket_command(List<Integer> menu_price,List<String> menu_name,int tab_num){
	System.out.println("送信しますか? はい/いいえ");
	String def = scanner.next();
	if(def.equals("はい")){
	    System.out.println("送信しました");
	    System.out.println(menu_name);
	    System.out.println(menu_price);
	    Server server = new Server();
	    List<String> a = server.server_handy(menu_name);
	}else if(def.equals("いいえ")){
	    System.out.println("続けます");
	    table_detail(tab_num);
	    
	}
    }

    //5番目のコマンドでありListに格納するための処理
    static void list_command(String menu_command,int tab_num){
	System.out.println("個数を入力してください");
	int num_menu = scanner.nextInt();
	//メニューの料金を入手
	String menu_price = price_define(menu_command);
	//料金を文字列から整数に変換する
	int calt_menu_price_ = Integer.parseInt(menu_price);
	calt_menu_price_ = calt_menu_price_ * num_menu;
	List<Integer> calt_menu_price = price_list(calt_menu_price_);
	//メニューの名前を入手するための処理
	List<String> calt_menu_name = name_list(menu_command,num_menu);
	socket_command(calt_menu_price,calt_menu_name,tab_num);


    }
    //4番目の入力コマンドであり料理のメニュー選択(2*)
    static void food_menu(int tab_num,String drink_command){
	if(drink_command.equals("焼き鳥")){
	   System.out.println("塩つくね ５本盛り塩 ５本盛りタレ");
	   String menu_map = scanner.next();
	   list_command(menu_map,tab_num);
	}else if(drink_command.equals("一品物")){
	    System.out.println("よだれ鶏 ねぎまみれ鶏皮ポン酢 梅なんこつ");
	    String menu_map = scanner.next();
	    list_command(menu_map,tab_num);
	}else if(drink_command.equals("締め")){
	    System.out.println("焼きそば ラーメン 雑炊");
	    String menu_map = scanner.next();
	    list_command(menu_map,tab_num);
	}
    }
	   
	
	

    //4番目の入力コマンドでありドリンクのメニュー選択(2)
    static void drink_menu(int tab_num,String drink_command){
	if(drink_command.equals("ビール")){
	    System.out.println("ビール 瓶ビール ホッピー白 ホッピー黒");
	    String menu_map = scanner.next();
	    list_command(menu_map,tab_num);
	}else if(drink_command.equals("ハイボール")){
	    System.out.println("角ハイボール マルスハイボール 知多ハイボール");
	    String menu_map = scanner.next();
	    list_command(menu_map,tab_num);
	}else if(drink_command.equals("サワー")){
	    System.out.println("トマトサワー 梅干しサワー レモンサワー");
	    String menu_map = scanner.next();
	    list_command(menu_map,tab_num);
	}
    }
	

    //3番目の入力コマンドでありFoodの種類(焼き鳥 一品物 締め)選択メニュー(1*)
    static void tab_fcommand(int tab_num){
	System.out.println("Food操作を行う");
	System.out.println("焼き鳥 一品物 締め");
	String food_command = scanner.next();
	food_menu(tab_num,food_command);
    }
    
    //3番目の入力コマンドでありDrinkの種類(ビール ハイボール サワー)選択メニュー(1)
    static void tab_dcommand(int tab_num){
	System.out.println("Drink操作を行います");
	System.out.println("ビール ハイボール サワー");
	String drink_command = scanner.next();
	drink_menu(tab_num,drink_command);
    }
	
    
    //2番めの入力コマンド
    static void table_detail(int tab_num){
	System.out.println("Drink Food お会計 中止 と入力してください");
	String df_command = scanner.next();
	if(df_command.equals("Drink")){
	    tab_dcommand(tab_num);
	}else if(df_command.equals("Food")){
	    tab_fcommand(tab_num);
	}else if(df_command.equals("お会計")){
	    System.out.println("お会計します");
	}else if(df_command.equals("中止")){
	    table_number();
	}
    }
		

    //最初の入力コマンド
    static void table_number(){
	System.out.println("---------ホールハンディ----------");
	System.out.println("卓番を入力してください");
	int tab_num = scanner.nextInt();
	System.out.println("人数を入力してください");
	int pe_num = scanner.nextInt();
	System.out.println("次へ/戻ると入力してください");
	String next_num = scanner.next();
	if(next_num.equals("次へ")){
	    table_detail(tab_num);
	}else if(next_num.equals("戻る")){
	    table_number();
	}
    }      
		
    static void table_command(){
	table_number();
    }
	    
}
