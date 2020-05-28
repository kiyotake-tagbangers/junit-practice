package junit.examples;

public class Author {
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // 呼び出されたインスタンスのハッシュ値を返すメソッド
    // ここで得られた数字は、データ構造の HashTable(HashMap,HashSet) で使われる
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    // オブジェクトの同値性を比較するメソッド
    // 以下の3つのインスタンスは同一ではないオブジェクトを参照している
    // が、内部状態を比較した場合、user3,5 はIDが同値、user4,5はnameが同値
    // User user3 = new User(1, "田中");
    // User user4 = new User(2, "鈴木");
    // User user5 = new User(1, "鈴木");
    // .equals メソッドがIDを比較条件にしている場合、
    // user3.equals(user5) は true になる
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Author other = (Author) obj;
        if (firstName == null) {
            if (other.firstName != null) return false;
        } else if (!firstName.equals(other.firstName)) return false;
        if (lastName == null) {
            if (other.lastName != null) return false;
        } else if (!lastName.equals(other.lastName)) return false;
        return true;
    }
}
