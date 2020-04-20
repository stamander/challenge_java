let number = 7;
console.log(number);

// 変数numberの値に3を加えてください


console.log(number+=3);

// 変数numberの値を2で割ってください


console.log(number/2);


const language= "フランス語";

// 定数languageの値を出力してください
console.log(language);

// 定数languageを用いて、「〇〇を話せます」と出力してください

console.log(language + "を話せます");


const level = 12;

// 条件式を「level > 10」とするif文を作ってください
if (level>10){
  console.log('レベルが10より大きいです');
}



const age = 24;

// 「age >= 20」を出力してください
console.log(age>= 20);

// 「age < 20」を出力してください
console.log(age<20);

// ageの値が20以上の場合に、「私は20歳以上です」と出力してください
if (age>20){
  console.log("私は20際以上です");
}



const password = "ninjawanko";

// passwordの値が"ninjawanko"の場合、「ログインに成功しました」と出力してください
if (password == "ninjawanko"){
  console.log("ログインに成功しました");
}



// passwordの値が"ninjawanko"でない場合、「パスワードが間違っています」と出力してください
if (password != "ninjawanko"){
  console.log("パスワードが間違っています");
}



const age = 17;

// 条件式が成り立たない場合に「私は20歳未満です」と出力してください
if (age >= 20) {
  console.log("私は20歳以上です");
} else{
  console.log("私は20歳未満です");
}

const age = 17;

// ageの値が10以上20未満のとき、「私は20歳未満ですが、10歳以上です」と出力してください
if (age >= 20) {
  console.log("私は20歳以上です");
} else if(age >=10){
  console.log("私は20歳未満ですが、10歳以上です");
}

 else {
  console.log("私は10歳未満です");
}


const age = 24;

// 指定された条件のif文を作成してください
if (age>=20 && age<30){
  console.log("私は20代です");
}
