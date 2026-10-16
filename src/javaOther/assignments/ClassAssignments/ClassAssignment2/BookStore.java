package javaOther.assignments.ClassAssignments.ClassAssignment2;

public class BookStore {
    public static void main(String[] args) {
        Book bookA = new Book();
        bookA.setTitle("연을 쫒는 아이");
        bookA.setAuthor("할레드 호세이니");
        bookA.setPrice(18000);

        bookA.getInfo();

        Book bookB = new Book();
        bookB.setTitle("오디세이아");
        bookB.setAuthor("호메로스");
        bookB.setPrice(27000);

        bookB.getInfo();
    }
}
