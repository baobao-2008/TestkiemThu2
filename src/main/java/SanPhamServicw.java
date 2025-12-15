import java.util.ArrayList;
import java.util.List;

public class SanPhamServicw {
    private List<SanPham> spl = new ArrayList<>();
    public boolean them(SanPham s ){
     if(s.getSoLuong()<1|| s.getSoLuong()>100){
         throw new IllegalArgumentException("Số lượng phải nằm trong khoảng từ 0 đến 100");
     }
     if(s.getDanhMuc().isEmpty()||s.getMa().isEmpty()||s.getTen().isEmpty()){
         throw new IllegalArgumentException("Các trường không được rỗng");
     }
        if (!s.getTen().matches("^[a-zA-Z\\s]+$")) {
            throw new IllegalArgumentException("Tên không được chứa ký tự đặc biệt");
        }
     for(SanPham sp : spl){
         if(sp.getMa().equals(s.getMa())){
             throw new IllegalArgumentException("Id này đã tồn tại rồi"+s.getMa());
         }
     }
        spl.add(s);
        return true;
    }
    public boolean sua(SanPham s,String ma ){
        if(s.getSoLuong()<1|| s.getSoLuong()>100){
            throw new IllegalArgumentException("Số lượng phải nằm trong khoảng từ 0 đến 100");
        }
        if (!s.getTen().matches("^[a-zA-Z\\s]+$")) {
            throw new IllegalArgumentException("Tên không hợp lệ");
        }
        if(s.getDanhMuc().isEmpty()||s.getMa().isEmpty()||s.getTen().isEmpty()){
            throw new IllegalArgumentException("Các trường không được rỗng");
        }
        for(SanPham sp : spl){
            if(sp.getMa().equals(s.getMa())&&!sp.getMa().equals(ma)){
                throw new IllegalArgumentException("Id này đã tồn tại rồi"+s.getMa());
            }
        }
        spl.add(s);
        return true;
    }
public List<SanPham> getAll(){
        return spl;
    }
}
