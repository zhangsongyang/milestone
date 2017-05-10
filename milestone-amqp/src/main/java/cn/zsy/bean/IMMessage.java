package cn.zsy.bean;

public class IMMessage {
    private String area;

    private String msgId;            // 整形，消息ID
    private long senderId;                // 长整形，发送者ID
    private int senderType;                // 整形，发送者类型，查看用户类型
    private String senderName;
    private String senderThumb;        // 字符串，发送者头像小图地址
    private int messageType;            // 整形，消息类型
    private String title;                // 字符串，消息标题，适配消息类型为链接时使用
    private String url;            // 字符串，消息链接，适配消息类型为链接时使用
    private String content;        // 字符串，消息内容，如果消息类型为链接时，可放描述信息
    private long dt;
    private long schoolId;

    private String groupId;       //
    private String groupName;//群组名称”,
    private int groupType;                // 群组类型，查看用户类型
    private String groupThumb;        // 群组头像


    private long tid;//消息来源编号
    private int sendType;    // 整形，消息发送类型 ： 1普通消息 2短信消息 3群组聊天 4群发消息 5作业消息
    private int subSendType;// 子模块类型

    private long receiverId;            // 整形，接收者ID
    /**
     * 1	教师
     * 2	家长
     * 3	学生
     * 20	班级群组
     * 21	自定义群组
     */
    private int receiverType;            // 整形，接收者用户类型

    private long pushRecordId;//批量消息推送编号，仅服务端使用 IMSERVER_PUSH_RECORD

    private String ext;


    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public int getSenderType() {
        return senderType;
    }

    public void setSenderType(int senderType) {
        this.senderType = senderType;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderThumb() {
        return senderThumb;
    }

    public void setSenderThumb(String senderThumb) {
        this.senderThumb = senderThumb;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public int getSendType() {
        return sendType;
    }

    public void setSendType(int sendType) {
        this.sendType = sendType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupType() {
        return groupType;
    }

    public void setGroupType(int groupType) {
        this.groupType = groupType;
    }

    public String getGroupThumb() {
        return groupThumb;
    }

    public void setGroupThumb(String groupThumb) {
        this.groupThumb = groupThumb;
    }

    public int getSubSendType() {
        return subSendType;
    }

    public void setSubSendType(int subSendType) {
        this.subSendType = subSendType;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(long receiverId) {
        this.receiverId = receiverId;
    }

    public int getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(int receiverType) {
        this.receiverType = receiverType;
    }

    public long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
    }

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    public long getPushRecordId() {
        return pushRecordId;
    }

    public void setPushRecordId(long pushRecordId) {
        this.pushRecordId = pushRecordId;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }
}
