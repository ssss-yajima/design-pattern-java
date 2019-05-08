# Java言語で学ぶデザインパターン入門

## 01.Iterator  
対象に依存せずIterateできる。  
Iterateの順序などカスタムできる。

## 02.Adapter
既存Adapteeに一切手を加えずに流用できる。  
既存クラスの使用さえ分かれば作れるし、再テストせずに済む。

## 03.Template Method
親クラスで処理の枠組みを定め、サブクラスで実装する。

## 04.Factory Method
直接インスタンス生成せずFactoryのメソッドによってインスタンスを生成して返す。
インスタンス生成にTemplate Methodを使う。
