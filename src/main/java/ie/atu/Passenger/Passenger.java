package ie.atu.Passenger;

public class Passenger {

    private String title;
    private String name;
    private String id;
    private int phone;
    private int age;

    public String title(String t) {
        String title = t;
        if (title == "Mr" || title == "Mrs" || title == "Ms") {
            System.out.println(title);
        } else {
            throw new IllegalArgumentException("Must be addressed by a title");
        }
        return title;
    }

    public String name(String n) {
        String name = n;
        if (name.length() > 3) {
            System.out.println(name);
        } else {
            throw new IllegalArgumentException("Name must be a minimum 3 characters");
        }
        return name;

    }

    public String id(String i) {
        String id = i;
        if (id.length() >= 10) {
            System.out.println(id);
        } else {
            throw new IllegalArgumentException("ID must be 10 characters");
        }
        return id;
    }

    public String phone(String p) {
        String phone = p;
        if (phone.length() > 7) {
            System.out.println(phone);
        } else {
            throw new IllegalArgumentException("Phone Number must be a minimum of seven");
        } return phone;
    }

    public int age(int a) {
        int age = a;
        if (age > 16) {
            System.out.println(age);
       } else {
           throw new IllegalArgumentException("Must be over 16");
      }
      return age;
  }
}