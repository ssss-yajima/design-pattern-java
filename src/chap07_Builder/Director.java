package chap07_Builder;

public class Director {
    private Builder builder;
    // 実際にはBuilderのサブクラスを引数にとる。
    // Builderは抽象クラスなのでインスタンス作られない。
    public Director(Builder builder){
        this.builder = builder;
    }
    // constructが使うのはBuilderのメソッドだけ
    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("朝から昼にかけて");
        builder.makeItems(new String[]{"おはようございます", "こんにちは"});
        builder.makeString("夜に");
        builder.makeItems(new String[]{"こんばんは", "おやすみなさい","さようなら"});
        builder.close();
    }
}
