package ex1;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String firstName;
    private String lastName;
    private int followerCount;
    private int followingCount;
    private List<User> following = new ArrayList<>();
    private List<User> followers = new ArrayList<>();
    
    //this makes our users of twitter
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    } 
    
    //this is following other users
    public void follow(User u) {
        if(!following.contains(u)) {
            following.add(u);
            followingCount++;
            u.followerCount++;
        }
    }
    
    //unfollowing users
    public void unfollow(User u) {
        if(following.contains(u) {
            following.remove(u);
            followingCount--;
            u.followerCount--;
        }
    }
    
    //removing a follower
    public void removeFollower(User u) {
        if(followers.contains(u)) {
            followers.remove(u);
            u.unfollow(this);
        } 
    }
    //has a certain follower
    public boolean doesFollow(User u) {
        return following.contains(u);
    }

    public boolean hasFollower(User u) {
        return followers.contains(u);
    }

    public int getNumFollowers() {
        return followerCount;
    }

    public int getNumFollowing() {
        return followingCount;
    }
    
    public String toString() {
        return String.format("First name is %s, last name is %s, follower count is %d, and following count is %d", this.firstName, this.lastName, followerCount, followingCount);
    }
}
    
