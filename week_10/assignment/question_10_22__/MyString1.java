package week_10.assignment.question_10_22__;

public class MyString1 {
    private int size;
    char[]chars=new char[size];

    public MyString1(char[]chars){
this.chars=chars;
    }
    public char charAt(int index){
return chars[index];
    }
    public int length(){
        return size;

    }
    public MyString1 substring(int begin,int end){
        StringBuilder str = new StringBuilder();

        for (int i = begin; i < end; i++) {
            if (i < chars.length) {
                str.append(chars[i]);
            }
        }

        return new MyString1(str.toString().toCharArray());
    }
    public MyString1 toLowerCase(){
        char[] resultChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                resultChars[i] = (char) (chars[i] + ('a' - 'A'));
            } else {
                resultChars[i] = chars[i];
            }
        }

        return new MyString1(resultChars);
    }
    public boolean equals(MyString1 s){
        if (s == null) {
            return false;
        }

        if (this.chars.length != s.chars.length) {
            return false;
        }

        for (int i = 0; i < this.chars.length; i++) {
            if (this.chars[i] != s.chars[i]) {
                return false;
            }
        }

        return true;
    }



    public static MyString1 valueOf(int i){
        char[] ch = new char[4];
return new MyString1(ch);//tekrar yazzz
    }
}
