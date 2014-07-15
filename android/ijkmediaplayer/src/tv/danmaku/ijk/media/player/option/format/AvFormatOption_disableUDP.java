package tv.danmaku.ijk.media.player.option.format;

import tv.danmaku.ijk.media.player.option.AvFormatOption;

// some video servers do not accept "Range: bytes=0-"
public final class AvFormatOption_disableUDP implements
        AvFormatOption {
    public static AvFormatOption_disableUDP Enable = new AvFormatOption_disableUDP(
            "tcp");
    public static AvFormatOption_disableUDP Disable = new AvFormatOption_disableUDP(
            "tcp");
    private final String mValue;

    public AvFormatOption_disableUDP(String value) {
        mValue = value;
    }

    public String getName() {
        return "rtsp_transport";
    }

    public String getValue() {
        return mValue;
    }
}
