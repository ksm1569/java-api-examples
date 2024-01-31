package com.smsoft.blogsamplecode;

import java.util.ArrayList;
public class Exam {
    public void exam1() {
        ArrayList<User> userList = new ArrayList<User>();

        User user1 = new User("user01", "1234", "유저1", 23, "01022478875");
        User user2 = new User("user02", "1357", "유저2", 27, "01095887774");
        User user3 = new User("user03", "2468", "유저3", 34, "01036425456");

        // userList.put(user1) -> userList.add(user1) 변경
        userList.add(user1);
        // userList.put(user2) -> userList.add(user2) 변경
        userList.add(user2);
        // userList.put(user3) -> userList.add(user3) 변경
        userList.add(user3);

        System.out.println("아이디\t비밀번호\t이름\t나이\t전화번호");

        // userList.length -> userList.size() 로 변경
        for (int i = 0; i < userList.size(); i++) {
        User u = userList.get(i);
        System.out.println(u.getId() + "\t" + u.getPw() + "\t" + u.getName() + "\t" + u.getAge() + "\t" + u.getPhone());
        }
    }
}
