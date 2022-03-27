package GroupProject2.CodingTask4;

public class CodingTask4 {
    /*
    4. Create Registration Class in which you would have variables as email, userName and password
    that have an access scope only within its own class.
    After creating an object of the class user should be able to call methods
    and in each method separately pass values to set users email, username and password.
    Requirements:
    A. Valid email consider to be only yahoo
    B. Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.
     */
}

/*
Create Registration Class in which you would have variables as email, userName and password
that have an access scope only within its own class.
 */
class Registration {
    private String email;
    private String userName;
    private String password;

    /*
    After creating an object of the class user should be able to call methods
    and in each method separately pass values to set users email, username and password.
    Requirements:
     */

    /*
    Requirements:
    A. Valid email consider to be only yahoo
     */
    public void setEmail(String email) {
        if (email.contains("yahoo")) {
            this.email = email;
            System.out.println("Your email is " + this.email);
        } else {
            System.out.println("Invalid email. Email must be a yahoo email");
        }
    }

    /*
    Requirements:
    B. Valid userName and password cannot be empty and should be of length larger than 6 characters.
     */
    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Your username is " + this.userName);
        } else if (userName.isEmpty()) {
            System.out.println("Invalid username. Username cannot be empty");
        } else if (!userName.isEmpty() && userName.length() < 7) {
            System.out.println("Invalid username. Username must be 7 or more characters long");
        }
    }

    /*
    Requirements:
    B. Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.
     */
    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
            System.out.println("Your password has been saved");
        } else if (password.isEmpty()) {
            System.out.println("Invalid password. Password cannot be empty.");
        } else if (!password.isEmpty() && password.length() < 7 && !password.contains(userName)) {
            System.out.println("Invalid password. Password must be 7 or more characters.");
        } else if (!password.isEmpty() && password.contains(userName)) {
            System.out.println("Invalid password. Password cannot contain username.");
        }
    }
}

// Test code.
class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("Michael@yahoo.com");
        registration.setEmail("Mike@gmail.com");
        System.out.println("----------------------------------------------------------");

        registration.setUserName("Michael");
        registration.setUserName("");
        registration.setUserName("Mike");
        System.out.println("----------------------------------------------------------");

        registration.setPassword("1234567");
        registration.setPassword("");
        registration.setPassword("Michae");
        registration.setPassword("Michael12");
    }
}
