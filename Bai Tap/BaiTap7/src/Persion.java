import java.util.Date;

public class Persion implements Comparable<Persion> {
    private String name;
    private int age;
    private Date studentBirtDate;
    public Boolean sex;

    public Persion() {
    }

    public Persion(String name, int age, Date studentBirtDate, Boolean sex) {
        this.name = name;
        this.age = age;
        this.studentBirtDate = studentBirtDate;
        this.sex = sex;
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

    public Date getDate() {
        return studentBirtDate;
    }

    public void setStudentBirtDateDate(Date date) {
        this.studentBirtDate = studentBirtDate;
    }

    public Boolean getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + studentBirtDate +
                ", sex=" + sex +
                '}';
    }

    @Override
    public int compareTo(Persion o) {
        return getDate().compareTo(o.getDate());
    }
}
