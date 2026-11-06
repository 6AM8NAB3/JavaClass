package javaOther.goormTest.Test2;
import java.util.Scanner;

class Notebook {
    private int totalCount;
    private int rentalCount;

    public Notebook() {
        this.totalCount = 5;
        this.rentalCount = 0;
    }

    public void rentNotebook(int cnt) {
        if (cnt > 0 && cnt <= totalCount - rentalCount) {
            rentalCount += cnt;
        } else {
            System.out.println("노트북을 대여할 수 없습니다.");
        }
    }

    public void returnNotebook(int cnt) {
        if (cnt > 0 && cnt <= rentalCount) {
            rentalCount -= cnt;
        } else {
            System.out.println("노트북을 반납할 수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("==노트북 대여 현황==");
        System.out.println("전체 노트북: " + totalCount + "대");
        System.out.println("대여 중: " + rentalCount + "대");
        System.out.println("남은 노트북: " + (totalCount - rentalCount) + "대");
    }
}

class NotebookManager {
    private Notebook notebook;
    private static NotebookManager instance = new NotebookManager();

    private NotebookManager() {
        notebook = new Notebook();
    }

    public static NotebookManager getInstance() {
        return instance;
    }

    public void rentNotebook(int cnt) {
        notebook.rentNotebook(cnt);
    }

    public void returnNotebook(int cnt) {
        notebook.returnNotebook(cnt);
    }

    public void showInfo() {
        notebook.showInfo();
    }
}

public class NotebookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotebookManager mgr = NotebookManager.getInstance();

        int rent = sc.nextInt();
        int back = sc.nextInt();

        mgr.rentNotebook(rent);
        mgr.returnNotebook(back);
        mgr.showInfo();
    }
}