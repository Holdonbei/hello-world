package Day08.Demo02;

import java.util.Objects;

public class Fu {
    private String name;
    private int age;

    public Fu(){}
    public Fu(String name,int age ){
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fu fu = (Fu) o;
        return age == fu.age &&
                Objects.equals(name, fu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
