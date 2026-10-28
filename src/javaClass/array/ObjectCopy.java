package javaClass.array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] book = new Book[5];
        Book[] bookCopy = new Book[5];


        book[0] = new Book("데미안","헤르만 헤세");
        book[1] = new Book("태백산맥","조정래");
        book[2] = new Book("신곡 지옥편","단테 알리기에리");
        book[3] = new Book("연을 쫓는 아이","할레드 호세이니");
        book[4] = new Book("해리포터","J.K 롤링");


        for (int i = 0; i < book.length; i++){
            bookCopy[i] = new Book();
            bookCopy[i].setBookName(book[i].getBookName());
            bookCopy[i].setAuthor(book[i].getAuthor());
        }


        System.out.println("book");
        for (int i = 0; i < book.length; i++){
            book[i].showInfo();
        }

        book[0].setBookName("니코마코스 윤리학");
        book[0].setAuthor("아리스토텔레스");

        System.out.println("book 수정");
        for (int i = 0; i < book.length; i++){
            book[i].showInfo();
        }


        System.out.println("\nbookCopy");
        for (int i = 0; i < book.length; i++){
            bookCopy[i].showInfo();
        }


    }
}