package zoho;

import java.util.*;

class DB {
    protected static HashMap<String, User> db = new HashMap<>();
}

class User {
    String name, email;
    ArrayList<Mail> sent = new ArrayList<>();
    ArrayList<Mail> inbox = new ArrayList<>();

    User(String name, String email) {
        this.email = email;
        this.name = name;
        createUser(this, email);
    }

    private boolean createUser(User user, String email) {
        if (email != null && user != null) {
            DB.db.put(email, user);
            System.out.println("User Created Successfully .");
            return true;
        }
        return false;


    }

    public static boolean sendMail(Mail mail) {
        DB db = new DB();
        if (db.db.containsKey(mail.from)) {
            User receiver = db.db.get(mail.to);
            User sender = db.db.get(mail.from);
            receiver.inbox.add(mail);
            sender.sent.add(mail);
            return true;
        }
        return false;
    }
    public static void ReadMail(User user){
        for(Mail mail : user.inbox) {
            System.out.print("From : " + mail.from + "\n" +
                    "To : " + mail.to + "\n" +
                    "subject : " + mail.subject + "\n" +
                    "content : " + mail.content);
        }
        }

}

class Mail {
    String from, to, subject, content;
    User sender, receiver;

    Mail(String from, String to, String subject, String content, User sender, User receiver) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
    }
}

public class Email {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("1.create account\n2.send mail\n3.read mail");
        DB db = new DB();
        while (true) {

            System.out.println("Enter your choice : ");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice){
                case 1:
                    System.out.println("name : ");
                    String name = s.nextLine();
                    System.out.println("email : ");
                    String email = s.nextLine();
                    new User(name,email);
                    break;
                case 2:
                    System.out.println("from : ");
                     String from = s.nextLine();
                    System.out.println("to : ");
                     String to =s.nextLine();
                    System.out.println("subject : ");
                     String subject = s.nextLine();
                    System.out.println("content : ");
                     String content = s.nextLine();
                     Mail mail = new Mail(from,to,subject,content,db.db.get(from),db.db.get(to));
                     db.db.get(from).sendMail(mail);
                     break;
                case 3:
                    System.out.println("email : ");
                    User.ReadMail(db.db.get(s.nextLine()));


            }
        }
    }

}
