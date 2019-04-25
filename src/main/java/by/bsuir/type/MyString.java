package by.bsuir.type;

import java.util.Objects;

public class MyString {

    private String data ;

    public MyString(String data) {
        this.data = data;
    }

    public MyString() {
    }

    @Override
    public String toString() {
        return data;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MyString) {
            return ((MyString) obj).data.equals(data);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }



    public static MyString concat(MyString s1, MyString s2) {

        MyString out = new MyString();

        out.data = s1.data.concat(s2.data);


        return out;
    }

    public static MyString join(MyString s1, MyString s2) {

        MyString out = new MyString();

        out.data = String.join(" ",s1.data,s2.data);


        return out;
    }

    public static MyString replace(MyString s1, MyString s2) {

        MyString out = new MyString();

        out.data = s1.data.replace(s1.data.charAt(0),s2.data.charAt(0));


        return out;
    }

    public static MyString substring(MyString s1, MyString s2) {

        MyString s3 = new MyString();


        MyString out = new MyString();

        s3.data = s1.data.concat(s2.data);

        out.data = s3.data.substring(1,s3.data.length()-1);


        return out;
    }




}
