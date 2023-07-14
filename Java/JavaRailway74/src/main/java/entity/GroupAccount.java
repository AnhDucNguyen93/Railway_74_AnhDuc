package entity;

import java.time.LocalDate;

public class GroupAccount {
    public int groupId;
    public int accountId;
    public LocalDate joinDate;
//    public Account[] accounts;

    public GroupAccount(int groupId, int accountId) {
        this.groupId = groupId;
        this.accountId = accountId;
    }
}
