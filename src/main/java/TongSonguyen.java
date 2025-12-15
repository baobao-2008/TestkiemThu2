public class TongSonguyen {
    public int tinhTong(int[] so){
        int sum =0;
        for(int i=0; i<so.length; i++){
            if(so[i]<0 || so[i]>100){
                throw new IllegalArgumentException("Đây không phải số nguyên");
            }
            sum+=so[i];
        }
        return sum;
    }
}
