public class DemChuTrongMang {
    public int Dem(String str){
        if(str==null){
            throw new NullPointerException("Mảng không được null");
        }
        int count=0;
        for(char c: str.toCharArray()){
            if(Character.isLetter(c)){
                count++;
            }
        }
        return count;
    }
}
