public class TongLe {
    public int tongLe(int[] so){
int sum =0;
        for(int i=0 ; i < so.length;i++){
            if(so[i]<0 || so[i] > 1000){
                throw new IllegalArgumentException("Số nằm trong khoảng từ 1 đến 1000");
            }
            if(so[i]%2!=0){
                sum+=so[i];
            }
        }
        return sum;
    }
}
