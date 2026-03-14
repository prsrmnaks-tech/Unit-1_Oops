import java.util.*;

class PersonalInfo {
    String name;
    int age;
    String email;
    long mobileno;
    String workinfo;
    String educationinfo;

    PersonalInfo(String name, int age, String email, long mobileno,
                 String workinfo, String educationinfo) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.mobileno = mobileno;
        this.workinfo = workinfo;
        this.educationinfo = educationinfo;
    }

    void personalDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Email : " + email);
        System.out.println("Mobile Number : " + mobileno);
        System.out.println("Working Detail : " + workinfo);
        System.out.println("Educational Details : " + educationinfo);
    }
}

class ApplicationForm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<PersonalInfo> list = new ArrayList<>();

        System.out.println("Enter Your Name:");
        String name = s.nextLine();

        System.out.println("Enter Your Age:");
        int age = s.nextInt();
        s.nextLine();

        System.out.println("Enter Your Email:");
        String email = s.nextLine();

        System.out.println("Enter Your Mobile Number:");
        long mobileno = s.nextLong();
        s.nextLine();

        System.out.println("Enter Your Working Details:");
        String workinfo = s.nextLine();

        System.out.println("Enter Your Educational Details:");
        String educationinfo = s.nextLine();

        PersonalInfo info = new PersonalInfo(
                name, age, email, mobileno, workinfo, educationinfo
        );

        list.add(info);

        System.out.println("\nSearch by Name:");
        String searchName = s.nextLine();

        if (list.get(0).name.equalsIgnoreCase(searchName)) {
            list.get(0).personalDetails();
        } else {
            System.out.println("No details found");
        }

        s.close();
    }
}