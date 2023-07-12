import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class MyEntity {
    
    private Long id;

    private String name;
    private int age;

    public MyEntity() {
        // Default constructor required by JPA
    }

    public MyEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters for all instance variables

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
