public class TrungBinhCong {
    public double tinhDiem(int toan, int ly, int hoa){
        if(toan <0 || toan > 10){
            throw new IllegalArgumentException("Diểm toán phảo bé hơn 10 và lớn hơn 0");
        }
        if(ly <0 || ly > 10){
            throw new IllegalArgumentException("Diểm Lý phải bé hơn 10 và lớn hơn 0");
        }
        if(hoa <0 || hoa > 10){
            throw new IllegalArgumentException("Diểm hóa phải bé hơn 10 và lớn hơn 0");
        }
        int avg=3;
        if( avg ==0){
            throw new ArithmeticException("Avg không thể chia cho 0");
        }
        avg = (toan+ly+hoa) /avg;

        return avg;
    }
}
