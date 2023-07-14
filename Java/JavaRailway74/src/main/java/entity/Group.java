package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    public int groupId;
    public String groupName;
    public Account creatorId;
    public LocalDate createDate;
    public Account[] accounts;

    public Group(int groupId, String groupName, Account account) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public Group(int groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creatorId=" + creatorId +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
