package jp.ac.uryukyu.ie.e205712;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try{
            //nullを変数strに代入
            String str = null;
            //変数が"null"なら4が出力されるが今はnullなので、、
            System.out.println(str.length());
        }catch(NullPointerException e){
            //nullがcatchされるとここの処理を行う
            //println()に自由に文字を入れればメッセージを自由に出力可能 
            System.out.println("ぬるぽえらー");
            //e.getMessage()で定型のエラーメッセージを出力
            System.out.println(e.getMessage());
        }
    }
}
