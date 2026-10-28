package javaClass.array;

public class BookArray {
    public static void main(String[] args) {
        Book[] book = new Book[5];
        Book[] bookCopy = new Book[5];


        book[0] = new Book("데미안", "헤르만 헤세");
        book[1] = new Book("태백산맥", "조정태");
        book[2] = new Book("연을 쫒는 아이", "할메드 호세이니");
        book[3] = new Book("토지", "조정태");
        book[4] = new Book("어린왕자", "생텍쥐페리");

        System.arraycopy(book,0,bookCopy,0,book.length);

        System.out.println("Book");
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].showInfo())
            ;
        }

        System.out.println();

        book[0].setBookName("니코마코스 윤리");
        book[0].setAuthor("아리스토텔레스");

        System.out.println("bookCopy");
        for (int i = 0; i < book.length; i++) {
            System.out.println(bookCopy[i].showInfo())
            ;
        }
    }

}
