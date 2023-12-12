package stall_Reserve;

import org.json.*;

public class Stall {
    private int stall_ID;
    private int Market_ID;
    private String stall_Position;

    public int get_Stall_ID() {
        return stall_ID;
    }

    public int get_Market_ID() {
        return Market_ID;
    }

    public String get_Stall_Position() {
        return stall_Position;
    }

    public Stall(int stall_ID) {
        this.stall_ID = stall_ID;

        this.Market_ID = fetchMarketIDFromDatabase(stall_ID);
        this.stall_Position = fetchStallPositionFromDatabase(stall_ID);
    }

    public JSONObject get_Stall_Data(int stall_ID) {

        JSONObject stallData = new JSONObject();
        stallData.put("stall_ID", stall_ID);
        stallData.put("market_ID", fetchMarketIDFromDatabase(stall_ID));
        stallData.put("stall_Position", fetchStallPositionFromDatabase(stall_ID));
        return stallData;
    }

    private int fetchMarketIDFromDatabase(int stall_ID) {
        return stall_ID * 2;
    }

    private String fetchStallPositionFromDatabase(int stall_ID) {
        return "Position_" + stall_ID;
    }
}

