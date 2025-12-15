public class HocLuc {
    public String hocLuc(double diem){
        if(diem<0.0||diem>10.0){
            throw new IllegalArgumentException("Điểm phải lớn hơn 0 va bé hơn 10");
        }
        if(diem>=9.0){
            return "Xuất sắc";
        }else if(diem >=7.0){
            return "Giỏi";
        }else if(diem>=5.0){
            return "Trung Bình";
        }else{
            return "yếu";
        }
    }
}
