# challenge_java

javaのアプリを二つ作りました！
一つは自己紹介アプリ、もう一つは車と自転車を走らせるアプリです。
 
# DEMO
 
 java 自己紹介
コード
 <img width="1440" alt="スクリーンショット 2020-05-23 22 33 50" src="https://user-images.githubusercontent.com/59189641/82732025-98cb8380-9d45-11ea-81ea-8cb50a81cd96.png">
 <img width="1440" alt="スクリーンショット 2020-05-23 22 35 03" src="https://user-images.githubusercontent.com/59189641/82732034-a84acc80-9d45-11ea-8d2b-5ee0da452c62.png">
実行
 <img width="509" alt="スクリーンショット 2020-05-23 22 38 36" src="https://user-images.githubusercontent.com/59189641/82732112-28713200-9d46-11ea-8b94-32966de693ec.png">

# Features
・java 自己紹介
java言語を用いて作った自己紹介アプリ、名前、年齢、身長などを入力できます。
さらには計算要素を用いて、bmiを出すことができます。そのほかにもfor文を用いて人数分データを入力し、最高年齢、平均年齢を出すことができます。

java:scanner,for,if,method,class

・java 自転車と車を走らせるプログラミング

距離をユーザーに入力させ、それに基づきどのくらいの距離を走るのかを表示するプログラミングです。
自転車はそのまま表示されますが、車は、入力した距離がガソリンを上回ると走ることができません。
また、給油させることもできます。自転車と車で異なる指示を書いています。

Vehicleというスーパークラスから継承し、Carクラスやbicycleクラスを記述しました。
java: super、abstract、extends、if文、メソッド、private、scanner、セッター、ゲッター
 
# Requirement
java version "14" 2020-03-17
  
# Usage 
```bash
git clone https://github.com/stamander/challenge_java
~自転車と車を走らせるプログラミング~
javac Main.java
java Main

~自己紹介〜
javac java.Introduction.java
java Introduction
```
 
# Note
２つのアプリが入っています。コマンドによって動くアプリが異なります。
 
# Author
* 飯田集志
* iida.atsushi.fh@gmail.com
 
