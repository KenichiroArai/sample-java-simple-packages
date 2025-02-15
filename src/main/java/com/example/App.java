package com.example;

/**
 * サンプルコード
 */
public class App {

    /** 名前 */
    private String name;

    /**
     * 名前を設定する
     *
     * @param name 名前
     */
    public void set(String name) {
        this.name = name;
    }

    /**
     * 名前を取得する
     *
     * @param arg 引数
     * @return 名前
     */
    public String get(String arg) {
        return String.format("%s, %s!", this.name, arg);
    }

    /**
     * メインメソッド
     *
     * @param args 引数
     */
    public static void main(String[] args) {
        System.out.println("Hello, Sample Simple Java Packages!");
        App app = new App();
        app.set("名前の設定");
        System.out.println(app.get("テスト"));
    }
}
