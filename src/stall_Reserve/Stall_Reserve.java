package stall_Reserve;

import java.time.LocalDateTime;
import org.json.JSONObject;

public class Stall_Reserve {
    private int seller_ID;
    private boolean stall_Success; //��ܬO�_���\�w���u��
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
        // ��l�Ƭ����ާ@
    }

    public JSONObject ger_Stall_Date() {
        // ���o�u����������T�A��^�@�� JSON ����
        JSONObject dateInfo = new JSONObject();
        // ���]���o�u����������T���޿�
        // dateInfo.put("key", value);
        return dateInfo;
    }

    public JSONObject get_Stall_Reserve_Data() {
        // ���o�u��w��������T�A��^�@�� JSON ����
        JSONObject reserveInfo = new JSONObject();
        // ���]���o�u��w��������T���޿�
        // reserveInfo.put("key", value);
        return reserveInfo;
    }

    public void reserve_Stall(int seller_ID, int stall_ID, LocalDateTime reserve_Time, byte[] stall_Design) {
        // �w���u�쪺�޿�
        // �i�H�i��������ҩM�ާ@
        this.seller_ID = seller_ID;
        this.stall_ID = stall_ID;
        this.reserve_Time = reserve_Time;
        this.stall_Design = stall_Design;
        this.stall_Success = true; // ���]�w�����\
    }

    public void delete_Reserve(int stall_ID) {
        // �R���w�����޿�
        // �i�H�i��������ҩM�ާ@
        this.seller_ID = 0;
        this.stall_ID = 0;
        this.reserve_Time = null;
        this.stall_Design = null;
        this.stall_Success = false;
    }

    public JSONObject modify_Reserve(int seller_ID, int stall_ID, byte[] stall_Design) {
        // �ק�w�����޿�
        // �i�H�i��������ҩM�ާ@
        this.seller_ID = seller_ID;
        this.stall_ID = stall_ID;
        this.stall_Design = stall_Design;
        
        // ��^�ק�᪺��T
        JSONObject modifiedInfo = new JSONObject();
        // ���]��^�����ק�᪺��T
        // modifiedInfo.put("key", value);
        return modifiedInfo;
    }
}
