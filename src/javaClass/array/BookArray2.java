package javaClass.array;

public class BookArray2 {
    public static void main(String[] args) {
        Book bookA = new Book("태백산맥", "조정태");
        Book bookB = new Book("데미안", "헤르만 헤세");
        Book bookC = new Book("연을 쫒는 아이", "할메드 호세이니");
        Book bookD = new Book("토지", "조정태");
        Book bookE = new Book("어린왕자", "생텍쥐페리");

        System.out.println(bookA.showInfo());
        System.out.println(bookB.showInfo());
        System.out.println(bookC.showInfo());
        System.out.println(bookD.showInfo());
        System.out.println(bookE.showInfo());
    }
}
