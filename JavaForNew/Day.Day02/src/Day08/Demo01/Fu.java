package Day08.Demo01;

import java.util.Objects;

public class Fu {

    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public Fu(String name, int age) {
        this.name = name;
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
