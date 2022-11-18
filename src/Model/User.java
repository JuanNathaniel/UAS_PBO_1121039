/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author TUF GAMING
 */
public class User {

    int userid;
    String username;
    String useremail;
    String userpass;
    String usergender;
    int usercategory;
    int userfollowers;

    public User() {
    }

    public User(String username, String useremail, String userpass, String usergender, int usercategory) {
        this.username = username;
        this.useremail = useremail;
        this.userpass = userpass;
        this.usergender = usergender;
        this.usercategory = usercategory;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUsergender() {
        return usergender;
    }

    public void setUsergender(String usergender) {
        this.usergender = usergender;
    }

    public int getUserfollowers() {
        return userfollowers;
    }

    public void setUserfollowers(int userfollowers) {
        this.userfollowers = userfollowers;
    }

    public int getUsercategory() {
        return usercategory;
    }

    public void setUsercategory(int usercategory) {
        this.usercategory = usercategory;
    }

    public String toString() {
        return "userid : " + userid + ", name : " + username + ", email : " + useremail + ", gender : " + usergender + "followers : " + userfollowers;
    }
}
