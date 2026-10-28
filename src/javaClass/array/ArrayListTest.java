package javaClass.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book("태백산맥", "조경례"));
        bookList.add(new Book("소년이 온다", "한강"));
        bookList.add(new Book("홀로서기 심리학", "라라 E. 필딩"));
        bookList.add(new Book("나오미와 가나코", "오쿠다 히데오"));
        bookList.add(new Book("스위치", "칩 히스, 댄 히스"));

        for (Book book : bookList) {
            System.out.println(book.showInfo());
        }

        bookList.remove(0);

        System.out.println("첫번째 요소 제거 후 ");
        for (Book book : bookList) {
            System.out.println(book.showInfo());
        }

        bookList.removeAll(bookList);
        for (Book book : bookList) {
            System.out.println(book.showInfo());
        }

        System.out.println(bookList.isEmpty());
    }
}
