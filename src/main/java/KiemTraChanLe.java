public class KiemTraChanLe {
    public String ChanLe(int so){
        if(so<0||so>1000) {
            throw new IllegalArgumentException("Chỉ kiểm tra số chẵn lẻ từ 0 đến 1000");
        }
            if(so%2==0){
                return "Chan";
            }else{
                return "le";
            }

    }
}
