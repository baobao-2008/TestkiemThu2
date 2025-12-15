public class TimViTriChuoikyTuSo {
    public int findString ( String[] arr, String target){
        if(arr==null|| target==null){
            throw  new NullPointerException("mảng và target không được null");
        }
        for (int i = 0; i<arr.length;i++){
            if (arr[i].equalsIgnoreCase(target)){
                return i;
            }
        }
        return -1;
    }
    public int findSo(int[] so, int target){
        if(so==null){
            throw new NullPointerException("Mảng so không được null");
        }
        for(int i=0; i<so.length;i++){
            if(so[i]==target){
              return i;
            }
        }
        return -1;
    }
    public int findChuoi(char[] arr,char target){
        if(arr==null){
            throw new NullPointerException("Mảng arr không được null");
        }
        for (int i=0; i<arr.length;i++){
            if(arr[i]==target){
                return 1;
            }
        }
        return -1;
    }
}
