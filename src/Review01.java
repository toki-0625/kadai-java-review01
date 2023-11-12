public class Review01 {

    public static void main(String[] args) {
        int productPrice = 1500;    //商品価格（税別）を入力
        int tax = 51;               //消費税率（％）を入力
        int taxPrice;               //関数で消費税額の宣言
        taxPrice = tax(productPrice, tax);
        int taxIncludedPrice = productPrice + taxPrice;     //税込金額を商品価格と消費税額の合計から求める
        System.out.println(productPrice + "円の商品の税込価格は" + taxIncludedPrice + "円(消費税は" + taxPrice + "円)です。");
    }

    public static int tax(int productPrice, int tax) {
        int taxPrice = productPrice * tax / 100;      //消費税額の計算
        return taxPrice;
    }

}
