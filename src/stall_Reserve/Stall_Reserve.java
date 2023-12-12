package stall_Reserve;

import java.time.LocalDateTime;
import org.json.JSONObject;

public class Stall_Reserve {
    private int seller_ID;
    private boolean stall_Success; //顯示是否成功預約攤位
    private int stall_ID;
    private LocalDateTime reserve_Time;
    private byte[] stall_Design;
    private Stall stall;

    public int get_Stall_ID() {
        return stall_ID;
    }

    public int get_Seller_ID() {
        return seller_ID;
    }

    public int get_Market_ID() {
        return stall.get_Market_ID();
    }

    public String get_Stall_Position() {
        return stall.get_Stall_Position();
    }

    public void Stall_Reserve() {
        // 初始化相關操作
    }

    public JSONObject ger_Stall_Date() {
        // 取得攤位日期相關資訊，返回一個 JSON 物件
        JSONObject dateInfo = new JSONObject();
        // 假設取得攤位日期相關資訊的邏輯
        // dateInfo.put("key", value);
        return dateInfo;
    }

    public JSONObject get_Stall_Reserve_Data() {
        // 取得攤位預約相關資訊，返回一個 JSON 物件
        JSONObject reserveInfo = new JSONObject();
        // 假設取得攤位預約相關資訊的邏輯
        // reserveInfo.put("key", value);
        return reserveInfo;
    }

    public void reserve_Stall(int seller_ID, int stall_ID, LocalDateTime reserve_Time, byte[] stall_Design) {
        // 預約攤位的邏輯
        // 可以進行相關驗證和操作
        this.seller_ID = seller_ID;
        this.stall_ID = stall_ID;
        this.reserve_Time = reserve_Time;
        this.stall_Design = stall_Design;
        this.stall_Success = true; // 假設預約成功
    }

    public void delete_Reserve(int stall_ID) {
        // 刪除預約的邏輯
        // 可以進行相關驗證和操作
        this.seller_ID = 0;
        this.stall_ID = 0;
        this.reserve_Time = null;
        this.stall_Design = null;
        this.stall_Success = false;
    }

    public JSONObject modify_Reserve(int seller_ID, int stall_ID, byte[] stall_Design) {
        // 修改預約的邏輯
        // 可以進行相關驗證和操作
        this.seller_ID = seller_ID;
        this.stall_ID = stall_ID;
        this.stall_Design = stall_Design;
        
        // 返回修改後的資訊
        JSONObject modifiedInfo = new JSONObject();
        // 假設返回相關修改後的資訊
        // modifiedInfo.put("key", value);
        return modifiedInfo;
    }
}
