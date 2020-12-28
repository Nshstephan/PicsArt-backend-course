package com.service.loginService;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginManager {
    public boolean isState() {
        return state;
    }

    private static class Entry {
        private String name;
        private String username;
        private String email;
        private String password;
    }

    private boolean state;

    public static void run() throws IOException {
        Scanner sc = new Scanner(System.in);
        LoginManager loginManager = new LoginManager();
        while (!loginManager.isState()) {
            System.out.println("To log in press 1");
            System.out.println("For registration press 0");
            if (sc.nextInt() == 1) {
                System.out.println("Enter username and password.");
                String userName = sc.next();
                String password = sc.next();
                loginManager.login(userName, password);
                if (loginManager.isState()) {
                    System.out.println("Success ^_^");
                } else {
                    System.out.println("Invalid input :(");
                }
            } else {
                System.out.println("Enter full name, username, email address and password.");
                String first = sc.next();
                String last = sc.next();
                String fullName = first + last;
                String userName = sc.next();
                String email = sc.next();
                String password = sc.next();
                if (loginManager.register(fullName, userName, email, password)) {
                    System.out.println("Registered successfully ^_^");
                } else {
                    System.out.println("Registration failed :(");
                }
            }

        }
    }

    public void login(String nick, String pass) throws FileNotFoundException {
        List<Entry> list = data();
        for (Entry i : list) {
            if (i.username.equals(nick) && i.password.equals(md5(pass))) {
                state = true;
                break;
            }

        }

    }

    public ArrayList<Entry> data() throws FileNotFoundException {
        ArrayList<Entry> entries = new ArrayList<>();
        Scanner sc = new Scanner(new FileInputStream("D:\\IntelIiJ\\PicsArt\\src\\com\\service\\loginService\\database.txt"));
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] arr = s.split(",");
            Entry newest = new Entry();
            newest.name = arr[0];
            newest.username = arr[1];
            newest.email = arr[2];
            newest.password = arr[3];
            entries.add(newest);
        }
        return entries;
    }

    public boolean register(String name, String username, String email, String password) throws IOException {
        if (!checkValid(username, email, password)) return false;
        FileWriter fStream = new FileWriter("D:\\IntelIiJ\\PicsArt\\src\\com\\service\\loginService\\database.txt", true);
        BufferedWriter out = new BufferedWriter(fStream);
        out.write(name + "," + username + "," + email + "," + md5(password) + "\n");
        out.close();
        return true;
    }

    private boolean checkValid(String username, String email, String password) throws FileNotFoundException {
        if (!isValidEmail(email)) {
            System.out.println("Invalid email");
            return false;
        }
        if (!isValidPassword(password)) {
            System.out.println("Invalid password");
            return false;
        }
        if (!isValidUserName(username)) {

            return false;
        }
        return true;
    }

    private boolean isValidUserName(String userName) throws FileNotFoundException {
        if (userName.length() <= 10) {
            System.out.println("Username length must be > 10");
            return false;
        }

        HashSet<String> set = new HashSet<String>();
        ArrayList<Entry> data = data();
        for (Entry i : data) {
            set.add(i.username);
        }
        if (set.contains(userName)) {
            System.out.println("Username repetition");
            return false;
        }
        return true;
    }

    private boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(
                "^(?=.*[0-9]{3,})(?=.*[a-z])(?=.*[A-Z]{2,}).{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static String md5(String message) {
        StringBuilder sb = new StringBuilder();
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(message.getBytes());
            byte[] digest = md.digest();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
