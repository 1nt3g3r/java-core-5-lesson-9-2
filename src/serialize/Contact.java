package serialize;

import java.io.Serializable;

public class Contact implements Serializable {
    private static final long serialVersionUID = 100;

    private String name;
    private String email;
    private int age;
    private String phone;

    /*
    {
        "name": "John",
        "email": "john.doe@gmail.com",
        "age": 29,
        "phone": "38093934543543"
    }
     */

    private transient String searchQuery;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

        searchQuery = name + email + age + phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", searchQuery='" + searchQuery + '\'' +
                '}';
    }
}
