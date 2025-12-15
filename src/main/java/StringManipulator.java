public class StringManipulator {
    public String CongChuoi(String str1, String str2){
        if( str1==null || str2 == null){
            throw new NullPointerException("Chuỗi không được null");
        }
        return str1+str2;
    }
}
